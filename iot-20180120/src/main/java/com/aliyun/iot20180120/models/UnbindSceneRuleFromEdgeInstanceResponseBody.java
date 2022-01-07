// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindSceneRuleFromEdgeInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UnbindSceneRuleFromEdgeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindSceneRuleFromEdgeInstanceResponseBody self = new UnbindSceneRuleFromEdgeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindSceneRuleFromEdgeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindSceneRuleFromEdgeInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UnbindSceneRuleFromEdgeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindSceneRuleFromEdgeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
