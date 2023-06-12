// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RegisterLineageRelationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("LineageRelation")
    public RegisterLineageRelationResponseBodyLineageRelation lineageRelation;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DestEntityQualifiedName")
        public String destEntityQualifiedName;

        @NameInMap("RelationshipGuid")
        public String relationshipGuid;

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
