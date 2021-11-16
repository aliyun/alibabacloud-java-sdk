// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateMetaCategoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateMetaCategoryResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateMetaCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCategoryResponseBody self = new CreateMetaCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMetaCategoryResponseBody setData(CreateMetaCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMetaCategoryResponseBodyData getData() {
        return this.data;
    }

    public CreateMetaCategoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateMetaCategoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateMetaCategoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateMetaCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMetaCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMetaCategoryResponseBodyData extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        public static CreateMetaCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMetaCategoryResponseBodyData self = new CreateMetaCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMetaCategoryResponseBodyData setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

    }

}
