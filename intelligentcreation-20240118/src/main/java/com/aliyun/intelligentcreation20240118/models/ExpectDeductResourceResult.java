// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class ExpectDeductResourceResult extends TeaModel {
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("errorcode")
    public String errorcode;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("taskId")
    public String taskId;

    public static ExpectDeductResourceResult build(java.util.Map<String, ?> map) throws Exception {
        ExpectDeductResourceResult self = new ExpectDeductResourceResult();
        return TeaModel.build(map, self);
    }

    public ExpectDeductResourceResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExpectDeductResourceResult setErrorcode(String errorcode) {
        this.errorcode = errorcode;
        return this;
    }
    public String getErrorcode() {
        return this.errorcode;
    }

    public ExpectDeductResourceResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExpectDeductResourceResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExpectDeductResourceResult setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
