// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateVerifySettingResponseBody extends TeaModel {
    @NameInMap("BizName")
    public String bizName;

    /**
     * <strong>example:</strong>
     * <p>UserRegister</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>RPBasic</p>
     */
    @NameInMap("Solution")
    public String solution;

    @NameInMap("StepList")
    public java.util.List<String> stepList;

    public static CreateVerifySettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySettingResponseBody self = new CreateVerifySettingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVerifySettingResponseBody setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateVerifySettingResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateVerifySettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVerifySettingResponseBody setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

    public CreateVerifySettingResponseBody setStepList(java.util.List<String> stepList) {
        this.stepList = stepList;
        return this;
    }
    public java.util.List<String> getStepList() {
        return this.stepList;
    }

}
