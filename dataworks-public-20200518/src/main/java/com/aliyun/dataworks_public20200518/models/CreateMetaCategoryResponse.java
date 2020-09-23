// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateMetaCategoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateMetaCategoryResponseData data;

    public static CreateMetaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCategoryResponse self = new CreateMetaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetaCategoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMetaCategoryResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateMetaCategoryResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateMetaCategoryResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateMetaCategoryResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateMetaCategoryResponse setData(CreateMetaCategoryResponseData data) {
        this.data = data;
        return this;
    }
    public CreateMetaCategoryResponseData getData() {
        return this.data;
    }

    public static class CreateMetaCategoryResponseData extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

        public static CreateMetaCategoryResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateMetaCategoryResponseData self = new CreateMetaCategoryResponseData();
            return TeaModel.build(map, self);
        }

        public CreateMetaCategoryResponseData setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

    }

}
