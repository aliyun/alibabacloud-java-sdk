// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class CreateLabelTaskRequest extends TeaModel {
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

    public static CreateLabelTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelTaskRequest self = new CreateLabelTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLabelTaskRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLabelTaskRequest setVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }
    public String getVideoName() {
        return this.videoName;
    }

    public CreateLabelTaskRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public CreateLabelTaskRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CreateLabelTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

}
