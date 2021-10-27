// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateVerifySettingResponseBody extends TeaModel {
    @NameInMap("BizName")
    public String bizName;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Solution")
    public String solution;

    @NameInMap("StepList")
    public java.util.List<String> stepList;

    public static UpdateVerifySettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVerifySettingResponseBody self = new UpdateVerifySettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVerifySettingResponseBody setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public UpdateVerifySettingResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateVerifySettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVerifySettingResponseBody setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

    public UpdateVerifySettingResponseBody setStepList(java.util.List<String> stepList) {
        this.stepList = stepList;
        return this;
    }
    public java.util.List<String> getStepList() {
        return this.stepList;
    }

}
