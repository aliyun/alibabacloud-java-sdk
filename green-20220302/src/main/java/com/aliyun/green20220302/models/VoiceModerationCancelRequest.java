// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VoiceModerationCancelRequest extends TeaModel {
    /**
     * <p>The type of moderation service. Valid values include \<code>nickname_detection\\</code> for user nicknames. Other values are to be determined.</p>
     * 
     * <strong>example:</strong>
     * <p>nickname_detection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The ID of the task that you want to cancel.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;taskId&quot;: &quot;xxxxx-xxxx&quot;
     *     }</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static VoiceModerationCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceModerationCancelRequest self = new VoiceModerationCancelRequest();
        return TeaModel.build(map, self);
    }

    public VoiceModerationCancelRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public VoiceModerationCancelRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
