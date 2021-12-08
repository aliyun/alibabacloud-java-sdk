// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class CreateImageAmazonTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public Long data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessResponse")
    public Boolean successResponse;

    public static CreateImageAmazonTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageAmazonTaskResponseBody self = new CreateImageAmazonTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageAmazonTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateImageAmazonTaskResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateImageAmazonTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateImageAmazonTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageAmazonTaskResponseBody setSuccessResponse(Boolean successResponse) {
        this.successResponse = successResponse;
        return this;
    }
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

}
