// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateVerifySettingRequest extends TeaModel {
    /**
     * <p>The name of the verification scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>用户注册</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The identifier of the verification scenario.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UserRegister</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>Specifies whether to use the default system guide page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GuideStep")
    public Boolean guideStep;

    /**
     * <p>Specifies whether to use the default system authorization page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PrivacyStep")
    public Boolean privacyStep;

    /**
     * <p>Specifies whether to use the default system result page.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ResultStep")
    public Boolean resultStep;

    /**
     * <p>The name of the verification solution.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RPBasic</p>
     */
    @NameInMap("Solution")
    public String solution;

    public static CreateVerifySettingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySettingRequest self = new CreateVerifySettingRequest();
        return TeaModel.build(map, self);
    }

    public CreateVerifySettingRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateVerifySettingRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
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

    public CreateVerifySettingRequest setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

}
