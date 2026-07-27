// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDevProdProjectResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The creation result.</p>
     */
    @NameInMap("CreateResult")
    public CreateDevProdProjectResponseBodyCreateResult createResult;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDevProdProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDevProdProjectResponseBody self = new CreateDevProdProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDevProdProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDevProdProjectResponseBody setCreateResult(CreateDevProdProjectResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public CreateDevProdProjectResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public CreateDevProdProjectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDevProdProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDevProdProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDevProdProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDevProdProjectResponseBodyCreateResult extends TeaModel {
        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102111</p>
         */
        @NameInMap("Id")
        public Long id;

        public static CreateDevProdProjectResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDevProdProjectResponseBodyCreateResult self = new CreateDevProdProjectResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public CreateDevProdProjectResponseBodyCreateResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
