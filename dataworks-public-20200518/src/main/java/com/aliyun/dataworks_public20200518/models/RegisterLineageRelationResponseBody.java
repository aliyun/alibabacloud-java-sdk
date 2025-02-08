// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RegisterLineageRelationResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1010210001</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The entity of lineage not exist, xxx</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The lineage.</p>
     */
    @NameInMap("LineageRelation")
    public RegisterLineageRelationResponseBodyLineageRelation lineageRelation;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE50E05E-028C-182B-9xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RegisterLineageRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterLineageRelationResponseBody self = new RegisterLineageRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterLineageRelationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RegisterLineageRelationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RegisterLineageRelationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RegisterLineageRelationResponseBody setLineageRelation(RegisterLineageRelationResponseBodyLineageRelation lineageRelation) {
        this.lineageRelation = lineageRelation;
        return this;
    }
    public RegisterLineageRelationResponseBodyLineageRelation getLineageRelation() {
        return this.lineageRelation;
    }

    public RegisterLineageRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterLineageRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RegisterLineageRelationResponseBodyLineageRelation extends TeaModel {
        /**
         * <p>The unique identifier of the destination entity.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-report.month_stat_user</p>
         */
        @NameInMap("DestEntityQualifiedName")
        public String destEntityQualifiedName;

        /**
         * <p>The ID of the lineage between entities.</p>
         * 
         * <strong>example:</strong>
         * <p>dfsldfdlsfdsaaaabbbb</p>
         */
        @NameInMap("RelationshipGuid")
        public String relationshipGuid;

        /**
         * <p>The unique identifier of the source entity.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table.project.table</p>
         */
        @NameInMap("SrcEntityQualifiedName")
        public String srcEntityQualifiedName;

        public static RegisterLineageRelationResponseBodyLineageRelation build(java.util.Map<String, ?> map) throws Exception {
            RegisterLineageRelationResponseBodyLineageRelation self = new RegisterLineageRelationResponseBodyLineageRelation();
            return TeaModel.build(map, self);
        }

        public RegisterLineageRelationResponseBodyLineageRelation setDestEntityQualifiedName(String destEntityQualifiedName) {
            this.destEntityQualifiedName = destEntityQualifiedName;
            return this;
        }
        public String getDestEntityQualifiedName() {
            return this.destEntityQualifiedName;
        }

        public RegisterLineageRelationResponseBodyLineageRelation setRelationshipGuid(String relationshipGuid) {
            this.relationshipGuid = relationshipGuid;
            return this;
        }
        public String getRelationshipGuid() {
            return this.relationshipGuid;
        }

        public RegisterLineageRelationResponseBodyLineageRelation setSrcEntityQualifiedName(String srcEntityQualifiedName) {
            this.srcEntityQualifiedName = srcEntityQualifiedName;
            return this;
        }
        public String getSrcEntityQualifiedName() {
            return this.srcEntityQualifiedName;
        }

    }

}
