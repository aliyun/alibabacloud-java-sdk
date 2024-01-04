// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class ActualDeductResourceResult extends TeaModel {
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("errorcode")
    public String errorcode;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ActualDeductResourceResult build(java.util.Map<String, ?> map) throws Exception {
        ActualDeductResourceResult self = new ActualDeductResourceResult();
        return TeaModel.build(map, self);
    }

    public ActualDeductResourceResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ActualDeductResourceResult setErrorcode(String errorcode) {
        this.errorcode = errorcode;
        return this;
    }
    public String getErrorcode() {
        return this.errorcode;
    }

    public ActualDeductResourceResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActualDeductResourceResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
