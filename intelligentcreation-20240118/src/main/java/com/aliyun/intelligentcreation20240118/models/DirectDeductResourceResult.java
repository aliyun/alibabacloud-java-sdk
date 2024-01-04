// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class DirectDeductResourceResult extends TeaModel {
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("errorcode")
    public String errorcode;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static DirectDeductResourceResult build(java.util.Map<String, ?> map) throws Exception {
        DirectDeductResourceResult self = new DirectDeductResourceResult();
        return TeaModel.build(map, self);
    }

    public DirectDeductResourceResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DirectDeductResourceResult setErrorcode(String errorcode) {
        this.errorcode = errorcode;
        return this;
    }
    public String getErrorcode() {
        return this.errorcode;
    }

    public DirectDeductResourceResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DirectDeductResourceResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
