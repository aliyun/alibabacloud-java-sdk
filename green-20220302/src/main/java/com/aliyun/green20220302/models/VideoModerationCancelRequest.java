// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationCancelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>videoDetection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;taskId\&quot;:\&quot;vi_s_4O9gp7GfNQdx9GOqdekFmk-1z2RJT\&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static VideoModerationCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoModerationCancelRequest self = new VideoModerationCancelRequest();
        return TeaModel.build(map, self);
    }

    public VideoModerationCancelRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public VideoModerationCancelRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
