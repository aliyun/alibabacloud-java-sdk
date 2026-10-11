// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the egress proxy configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>epc-uf609a6a8fdf9f4d****</p>
     */
    @NameInMap("EgressProxyConfigurationId")
    public String egressProxyConfigurationId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C79118A9-CA6D-5359-B53E-111BE8A03DCF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEgressProxyConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyConfigurationResponseBody self = new CreateEgressProxyConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyConfigurationResponseBody setEgressProxyConfigurationId(String egressProxyConfigurationId) {
        this.egressProxyConfigurationId = egressProxyConfigurationId;
        return this;
    }
    public String getEgressProxyConfigurationId() {
        return this.egressProxyConfigurationId;
    }

    public CreateEgressProxyConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
