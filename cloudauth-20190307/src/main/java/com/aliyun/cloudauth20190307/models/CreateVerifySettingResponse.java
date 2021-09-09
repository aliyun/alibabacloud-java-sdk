// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateVerifySettingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BizType")
    @Validation(required = true)
    public String bizType;

    @NameInMap("BizName")
    @Validation(required = true)
    public String bizName;

    @NameInMap("Solution")
    @Validation(required = true)
    public String solution;

    @NameInMap("StepList")
    @Validation(required = true)
    public java.util.List<String> stepList;

    public static CreateVerifySettingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySettingResponse self = new CreateVerifySettingResponse();
        return TeaModel.build(map, self);
    }

    public CreateVerifySettingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVerifySettingResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateVerifySettingResponse setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateVerifySettingResponse setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

    public CreateVerifySettingResponse setStepList(java.util.List<String> stepList) {
        this.stepList = stepList;
        return this;
    }
    public java.util.List<String> getStepList() {
        return this.stepList;
    }

}
