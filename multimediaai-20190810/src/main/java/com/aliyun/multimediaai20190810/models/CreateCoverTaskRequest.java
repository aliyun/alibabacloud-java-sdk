// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class CreateCoverTaskRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("VideoName")
    public String videoName;

    @NameInMap("VideoUrl")
    public String videoUrl;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("Scales")
    public String scales;

    public static CreateCoverTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCoverTaskRequest self = new CreateCoverTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCoverTaskRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateCoverTaskRequest setVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }
    public String getVideoName() {
        return this.videoName;
    }

    public CreateCoverTaskRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public CreateCoverTaskRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CreateCoverTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateCoverTaskRequest setScales(String scales) {
        this.scales = scales;
        return this;
    }
    public String getScales() {
        return this.scales;
    }

}
