// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VoiceModerationResultRequest extends TeaModel {
    /**
     * <p>The type of the moderation service. Valid values: nickname_detection: user nickname</p>
     * 
     * <strong>example:</strong>
     * <p>nickname_detection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameters of API requests that are sent from API Gateway to the backend service.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/43988.html">ServiceParameter</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;taskId&quot;:&quot;xxxxx-xxxx&quot;}</p>
     */
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
