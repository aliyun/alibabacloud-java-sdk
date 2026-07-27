// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class BatchCreateKgEntityResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of creating entity records in batches.</p>
     */
    @NameInMap("CreateResult")
    public BatchCreateKgEntityResponseBodyCreateResult createResult;

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

    public static BatchCreateKgEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateKgEntityResponseBody self = new BatchCreateKgEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateKgEntityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCreateKgEntityResponseBody setCreateResult(BatchCreateKgEntityResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public BatchCreateKgEntityResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public BatchCreateKgEntityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchCreateKgEntityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCreateKgEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateKgEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchCreateKgEntityResponseBodyCreateResultSuccessEntityList extends TeaModel {
        /**
         * <p>The entity record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("EntityId")
        public String entityId;

        /**
         * <p>The entity type code.</p>
         * 
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        public static BatchCreateKgEntityResponseBodyCreateResultSuccessEntityList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateKgEntityResponseBodyCreateResultSuccessEntityList self = new BatchCreateKgEntityResponseBodyCreateResultSuccessEntityList();
            return TeaModel.build(map, self);
        }

        public BatchCreateKgEntityResponseBodyCreateResultSuccessEntityList setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public BatchCreateKgEntityResponseBodyCreateResultSuccessEntityList setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

    }

    public static class BatchCreateKgEntityResponseBodyCreateResult extends TeaModel {
        /**
         * <p>The number of failed records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The number of successfully created records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The list of IDs of successfully created entity records.</p>
         */
        @NameInMap("SuccessEntityList")
        public java.util.List<BatchCreateKgEntityResponseBodyCreateResultSuccessEntityList> successEntityList;

        public static BatchCreateKgEntityResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateKgEntityResponseBodyCreateResult self = new BatchCreateKgEntityResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public BatchCreateKgEntityResponseBodyCreateResult setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public BatchCreateKgEntityResponseBodyCreateResult setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public BatchCreateKgEntityResponseBodyCreateResult setSuccessEntityList(java.util.List<BatchCreateKgEntityResponseBodyCreateResultSuccessEntityList> successEntityList) {
            this.successEntityList = successEntityList;
            return this;
        }
        public java.util.List<BatchCreateKgEntityResponseBodyCreateResultSuccessEntityList> getSuccessEntityList() {
            return this.successEntityList;
        }

    }

}
