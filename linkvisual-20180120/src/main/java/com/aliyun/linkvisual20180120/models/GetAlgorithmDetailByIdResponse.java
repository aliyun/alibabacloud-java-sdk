// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAlgorithmDetailByIdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.Map<String, ?> data;

    public static GetAlgorithmDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDetailByIdResponse self = new GetAlgorithmDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDetailByIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlgorithmDetailByIdResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAlgorithmDetailByIdResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAlgorithmDetailByIdResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAlgorithmDetailByIdResponse setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
