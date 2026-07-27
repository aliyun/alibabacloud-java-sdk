// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateKgEntityResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The entity record creation result.</p>
     */
    @NameInMap("CreateResult")
    public CreateKgEntityResponseBodyCreateResult createResult;

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

    public static CreateKgEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKgEntityResponseBody self = new CreateKgEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKgEntityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateKgEntityResponseBody setCreateResult(CreateKgEntityResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public CreateKgEntityResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public CreateKgEntityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateKgEntityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateKgEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKgEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateKgEntityResponseBodyCreateResult extends TeaModel {
        /**
         * <p>The entity record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        public static CreateKgEntityResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            CreateKgEntityResponseBodyCreateResult self = new CreateKgEntityResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public CreateKgEntityResponseBodyCreateResult setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

    }

}
