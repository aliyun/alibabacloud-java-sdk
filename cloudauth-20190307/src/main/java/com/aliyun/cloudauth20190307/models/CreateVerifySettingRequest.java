// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateVerifySettingRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("Solution")
    public String solution;

    @NameInMap("GuideStep")
    public Boolean guideStep;

    @NameInMap("PrivacyStep")
    public Boolean privacyStep;

    @NameInMap("ResultStep")
    public Boolean resultStep;

    public static CreateVerifySettingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySettingRequest self = new CreateVerifySettingRequest();
        return TeaModel.build(map, self);
    }

    public CreateVerifySettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateVerifySettingRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateVerifySettingRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateVerifySettingRequest setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

    public CreateVerifySettingRequest setGuideStep(Boolean guideStep) {
        this.guideStep = guideStep;
        return this;
    }
    public Boolean getGuideStep() {
        return this.guideStep;
    }

    public CreateVerifySettingRequest setPrivacyStep(Boolean privacyStep) {
        this.privacyStep = privacyStep;
        return this;
    }
    public Boolean getPrivacyStep() {
        return this.privacyStep;
    }

    public CreateVerifySettingRequest setResultStep(Boolean resultStep) {
        this.resultStep = resultStep;
        return this;
    }
    public Boolean getResultStep() {
        return this.resultStep;
    }

}
