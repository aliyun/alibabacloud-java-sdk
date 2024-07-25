// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VoiceModerationRequest extends TeaModel {
    /**
     * <p>The type of the moderation service.</p>
     * 
     * <strong>example:</strong>
     * <p>nickname_detection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameters required by the moderation service. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;url&quot;: &quot;<a href="http://aliyundoc.com/test.flv">http://aliyundoc.com/test.flv</a>&quot;, &quot;dataId&quot;: &quot;data1234&quot;}</p>
     */
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
