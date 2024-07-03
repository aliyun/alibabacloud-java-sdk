// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>videoDetection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;taskId\&quot;:\&quot;au_f_8PoWiZKoLbczp5HRn69VdT-1y8@U5\&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static VideoModerationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoModerationResultRequest self = new VideoModerationResultRequest();
        return TeaModel.build(map, self);
    }

    public VideoModerationResultRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public VideoModerationResultRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
