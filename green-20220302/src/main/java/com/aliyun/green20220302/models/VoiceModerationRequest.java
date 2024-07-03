// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VoiceModerationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>nickname_detection</p>
     */
    @NameInMap("Service")
    public String service;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static VoiceModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceModerationRequest self = new VoiceModerationRequest();
        return TeaModel.build(map, self);
    }

    public VoiceModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public VoiceModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
