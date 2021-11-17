// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateVariableGroupResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    // 新建的变量组id
    @NameInMap("variableGroupId")
    public Long variableGroupId;

    public static CreateVariableGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVariableGroupResponseBody self = new CreateVariableGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVariableGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateVariableGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateVariableGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVariableGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateVariableGroupResponseBody setVariableGroupId(Long variableGroupId) {
        this.variableGroupId = variableGroupId;
        return this;
    }
    public Long getVariableGroupId() {
        return this.variableGroupId;
    }

}
