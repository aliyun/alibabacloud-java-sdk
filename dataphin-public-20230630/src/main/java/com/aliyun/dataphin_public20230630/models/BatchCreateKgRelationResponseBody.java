// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class BatchCreateKgRelationResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of batch relationship record creation.</p>
     */
    @NameInMap("CreateResult")
    public BatchCreateKgRelationResponseBodyCreateResult createResult;

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

    public static BatchCreateKgRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateKgRelationResponseBody self = new BatchCreateKgRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateKgRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCreateKgRelationResponseBody setCreateResult(BatchCreateKgRelationResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public BatchCreateKgRelationResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public BatchCreateKgRelationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchCreateKgRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCreateKgRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateKgRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchCreateKgRelationResponseBodyCreateResultSuccessRelationList extends TeaModel {
        /**
         * <p>The relationship record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc-xxx</p>
         */
        @NameInMap("RelationId")
        public String relationId;

        /**
         * <p>The relationship type code.</p>
         * 
         * <strong>example:</strong>
         * <p>BELONG_TO</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        public static BatchCreateKgRelationResponseBodyCreateResultSuccessRelationList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateKgRelationResponseBodyCreateResultSuccessRelationList self = new BatchCreateKgRelationResponseBodyCreateResultSuccessRelationList();
            return TeaModel.build(map, self);
        }

        public BatchCreateKgRelationResponseBodyCreateResultSuccessRelationList setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

        public BatchCreateKgRelationResponseBodyCreateResultSuccessRelationList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

    }

    public static class BatchCreateKgRelationResponseBodyCreateResult extends TeaModel {
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
         * <p>The list of successfully created entity records.</p>
         */
        @NameInMap("SuccessRelationList")
        public java.util.List<BatchCreateKgRelationResponseBodyCreateResultSuccessRelationList> successRelationList;

        public static BatchCreateKgRelationResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateKgRelationResponseBodyCreateResult self = new BatchCreateKgRelationResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public BatchCreateKgRelationResponseBodyCreateResult setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public BatchCreateKgRelationResponseBodyCreateResult setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public BatchCreateKgRelationResponseBodyCreateResult setSuccessRelationList(java.util.List<BatchCreateKgRelationResponseBodyCreateResultSuccessRelationList> successRelationList) {
            this.successRelationList = successRelationList;
            return this;
        }
        public java.util.List<BatchCreateKgRelationResponseBodyCreateResultSuccessRelationList> getSuccessRelationList() {
            return this.successRelationList;
        }

    }

}
