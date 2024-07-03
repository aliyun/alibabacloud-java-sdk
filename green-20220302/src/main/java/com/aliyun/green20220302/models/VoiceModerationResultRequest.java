// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VoiceModerationResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>nickname_detection</p>
     */
    @NameInMap("Service")
    public String service;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static VoiceModerationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceModerationResultRequest self = new VoiceModerationResultRequest();
        return TeaModel.build(map, self);
    }

    public VoiceModerationResultRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public VoiceModerationResultRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
