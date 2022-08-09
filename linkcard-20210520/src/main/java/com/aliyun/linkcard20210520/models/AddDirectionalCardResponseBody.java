// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddDirectionalCardResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddDirectionalCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDirectionalCardResponseBody self = new AddDirectionalCardResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDirectionalCardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddDirectionalCardResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddDirectionalCardResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddDirectionalCardResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public AddDirectionalCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDirectionalCardResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
