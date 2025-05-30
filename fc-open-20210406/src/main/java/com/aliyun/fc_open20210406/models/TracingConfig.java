// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class TracingConfig extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("params")
    public java.util.Map<String, String> params;

    /**
     * <p>This parameter is required.</p>
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
