// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityLevelResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The deletion result.</p>
     */
    @NameInMap("DeleteResult")
    public DeleteSecurityLevelResponseBodyDeleteResult deleteResult;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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

    public static DeleteSecurityLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityLevelResponseBody self = new DeleteSecurityLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityLevelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSecurityLevelResponseBody setDeleteResult(DeleteSecurityLevelResponseBodyDeleteResult deleteResult) {
        this.deleteResult = deleteResult;
        return this;
    }
    public DeleteSecurityLevelResponseBodyDeleteResult getDeleteResult() {
        return this.deleteResult;
    }

    public DeleteSecurityLevelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteSecurityLevelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSecurityLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSecurityLevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteSecurityLevelResponseBodyDeleteResult extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>E10012011</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The list of data classification IDs that are associated with the current classification level. This parameter is returned only when this error is triggered.</p>
         */
        @NameInMap("RelatedClassifyIdList")
        public java.util.List<Long> relatedClassifyIdList;

        /**
         * <p>Indicates whether the deletion was successful.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteSecurityLevelResponseBodyDeleteResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecurityLevelResponseBodyDeleteResult self = new DeleteSecurityLevelResponseBodyDeleteResult();
            return TeaModel.build(map, self);
        }

        public DeleteSecurityLevelResponseBodyDeleteResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteSecurityLevelResponseBodyDeleteResult setRelatedClassifyIdList(java.util.List<Long> relatedClassifyIdList) {
            this.relatedClassifyIdList = relatedClassifyIdList;
            return this;
        }
        public java.util.List<Long> getRelatedClassifyIdList() {
            return this.relatedClassifyIdList;
        }

        public DeleteSecurityLevelResponseBodyDeleteResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
