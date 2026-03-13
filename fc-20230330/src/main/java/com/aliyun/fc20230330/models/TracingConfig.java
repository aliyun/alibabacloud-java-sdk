// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TracingConfig extends TeaModel {
    /**
     * <p>The parameters of Managed Service for OpenTelemetry. Specify the value in the map[string]string format, where the key is &quot;endpoint&quot;, and the value is the internal endpoint of Tracing Analysis. Example: endpoint: <a href="http://tracing-analysis-dc-hz.aliyuncs.com/adapt_xxx/api/otlp/traces">http://tracing-analysis-dc-hz.aliyuncs.com/adapt_xxx/api/otlp/traces</a>.</p>
     */
    @NameInMap("params")
    public java.util.Map<String, String> params;

    /**
     * <p>The type of protocol for Managed Service for OpenTelemetry. Only Jaeger is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Jaeger</p>
     */
    @NameInMap("type")
    public String type;

    public static TracingConfig build(java.util.Map<String, ?> map) throws Exception {
        TracingConfig self = new TracingConfig();
        return TeaModel.build(map, self);
    }

    public TracingConfig setParams(java.util.Map<String, String> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, String> getParams() {
        return this.params;
    }

    public TracingConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
