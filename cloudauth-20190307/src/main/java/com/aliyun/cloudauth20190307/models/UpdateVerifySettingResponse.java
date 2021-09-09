// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateVerifySettingResponse extends TeaModel {
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

    public static UpdateVerifySettingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVerifySettingResponse self = new UpdateVerifySettingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVerifySettingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVerifySettingResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateVerifySettingResponse setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public UpdateVerifySettingResponse setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

    public UpdateVerifySettingResponse setStepList(java.util.List<String> stepList) {
        this.stepList = stepList;
        return this;
    }
    public java.util.List<String> getStepList() {
        return this.stepList;
    }

}
