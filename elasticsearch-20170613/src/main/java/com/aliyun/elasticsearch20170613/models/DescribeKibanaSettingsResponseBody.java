// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeKibanaSettingsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6D*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;map.includeElasticMapsService&quot;: &quot;false&quot;, &quot;server.ssl.cert&quot;: &quot;/home/admin/packages/kibana/config/cert/client.crt&quot;, &quot;server.ssl.enabled&quot;: &quot;true&quot;, &quot;server.ssl.key&quot;: &quot;/home/admin/packages/kibana/config/cert/client.key&quot;, &quot;xpack.reporting.capture.browser.chromium.disableSandbox&quot;: &quot;true&quot;}</p>
     */
    @NameInMap("Result")
    public java.util.Map<String, ?> result;

    public static DescribeKibanaSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKibanaSettingsResponseBody self = new DescribeKibanaSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKibanaSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKibanaSettingsResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
