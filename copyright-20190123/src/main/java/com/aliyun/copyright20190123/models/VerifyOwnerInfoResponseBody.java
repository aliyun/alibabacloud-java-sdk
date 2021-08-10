// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class VerifyOwnerInfoResponseBody extends TeaModel {
    @NameInMap("BirthDate")
    public String birthDate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Message")
    public String message;

    @NameInMap("VerifyResult")
    public Boolean verifyResult;

    @NameInMap("Phone")
    public String phone;

    public static VerifyOwnerInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyOwnerInfoResponseBody self = new VerifyOwnerInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyOwnerInfoResponseBody setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }
    public String getBirthDate() {
        return this.birthDate;
    }

    public VerifyOwnerInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyOwnerInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public VerifyOwnerInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyOwnerInfoResponseBody setVerifyResult(Boolean verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public Boolean getVerifyResult() {
        return this.verifyResult;
    }

    public VerifyOwnerInfoResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
