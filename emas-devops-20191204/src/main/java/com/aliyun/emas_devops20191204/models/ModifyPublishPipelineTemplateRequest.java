// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ModifyPublishPipelineTemplateRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    @NameInMap("AndroidCertId")
    public String androidCertId;

    @NameInMap("IosCertId")
    public String iosCertId;

    @NameInMap("IosMobileProvisions")
    public String iosMobileProvisions;

    @NameInMap("EnvVariables")
    public String envVariables;

    @NameInMap("TaskParams")
    public String taskParams;

    public static ModifyPublishPipelineTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPublishPipelineTemplateRequest self = new ModifyPublishPipelineTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPublishPipelineTemplateRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ModifyPublishPipelineTemplateRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public ModifyPublishPipelineTemplateRequest setAndroidCertId(String androidCertId) {
        this.androidCertId = androidCertId;
        return this;
    }
    public String getAndroidCertId() {
        return this.androidCertId;
    }

    public ModifyPublishPipelineTemplateRequest setIosCertId(String iosCertId) {
        this.iosCertId = iosCertId;
        return this;
    }
    public String getIosCertId() {
        return this.iosCertId;
    }

    public ModifyPublishPipelineTemplateRequest setIosMobileProvisions(String iosMobileProvisions) {
        this.iosMobileProvisions = iosMobileProvisions;
        return this;
    }
    public String getIosMobileProvisions() {
        return this.iosMobileProvisions;
    }

    public ModifyPublishPipelineTemplateRequest setEnvVariables(String envVariables) {
        this.envVariables = envVariables;
        return this;
    }
    public String getEnvVariables() {
        return this.envVariables;
    }

    public ModifyPublishPipelineTemplateRequest setTaskParams(String taskParams) {
        this.taskParams = taskParams;
        return this;
    }
    public String getTaskParams() {
        return this.taskParams;
    }

}
