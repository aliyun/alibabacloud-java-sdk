// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class VerifyIotCardResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static VerifyIotCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyIotCardResponseBody self = new VerifyIotCardResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyIotCardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyIotCardResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public VerifyIotCardResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public VerifyIotCardResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public VerifyIotCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyIotCardResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
