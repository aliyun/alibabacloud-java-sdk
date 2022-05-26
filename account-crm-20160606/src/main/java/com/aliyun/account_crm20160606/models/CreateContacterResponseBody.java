// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CreateContacterResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContacterId")
    public String contacterId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateContacterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContacterResponseBody self = new CreateContacterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContacterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateContacterResponseBody setContacterId(String contacterId) {
        this.contacterId = contacterId;
        return this;
    }
    public String getContacterId() {
        return this.contacterId;
    }

    public CreateContacterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateContacterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateContacterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
