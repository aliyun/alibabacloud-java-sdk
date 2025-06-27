// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>query_security_check</p>
     */
    @NameInMap("Service")
    public String service;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static MultiModalGuardRequest build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardRequest self = new MultiModalGuardRequest();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public MultiModalGuardRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
