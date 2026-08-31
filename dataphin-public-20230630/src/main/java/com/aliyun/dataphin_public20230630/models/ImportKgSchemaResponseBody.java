// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ImportKgSchemaResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The import result.</p>
     */
    @NameInMap("ImportResult")
    public ImportKgSchemaResponseBodyImportResult importResult;

    /**
     * <p>The details of the backend exception.</p>
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

    public static ImportKgSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportKgSchemaResponseBody self = new ImportKgSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportKgSchemaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportKgSchemaResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportKgSchemaResponseBody setImportResult(ImportKgSchemaResponseBodyImportResult importResult) {
        this.importResult = importResult;
        return this;
    }
    public ImportKgSchemaResponseBodyImportResult getImportResult() {
        return this.importResult;
    }

    public ImportKgSchemaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportKgSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportKgSchemaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportKgSchemaResponseBodyImportResult extends TeaModel {
        /**
         * <p>The number of entity types that were changed.</p>
         * 
         * <strong>example:</strong>
         * <p>1032591</p>
         */
        @NameInMap("EntityTypeCount")
        public Integer entityTypeCount;

        /**
         * <p>The number of relation types that were changed.</p>
         * 
         * <strong>example:</strong>
         * <p>3380766</p>
         */
        @NameInMap("RelationTypeCount")
        public Integer relationTypeCount;

        public static ImportKgSchemaResponseBodyImportResult build(java.util.Map<String, ?> map) throws Exception {
            ImportKgSchemaResponseBodyImportResult self = new ImportKgSchemaResponseBodyImportResult();
            return TeaModel.build(map, self);
        }

        public ImportKgSchemaResponseBodyImportResult setEntityTypeCount(Integer entityTypeCount) {
            this.entityTypeCount = entityTypeCount;
            return this;
        }
        public Integer getEntityTypeCount() {
            return this.entityTypeCount;
        }

        public ImportKgSchemaResponseBodyImportResult setRelationTypeCount(Integer relationTypeCount) {
            this.relationTypeCount = relationTypeCount;
            return this;
        }
        public Integer getRelationTypeCount() {
            return this.relationTypeCount;
        }

    }

}
