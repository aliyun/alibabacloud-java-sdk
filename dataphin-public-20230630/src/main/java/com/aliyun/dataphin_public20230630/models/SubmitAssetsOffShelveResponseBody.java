// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitAssetsOffShelveResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the asset delisting submission.</p>
     */
    @NameInMap("Data")
    public SubmitAssetsOffShelveResponseBodyData data;

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

    public static SubmitAssetsOffShelveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAssetsOffShelveResponseBody self = new SubmitAssetsOffShelveResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAssetsOffShelveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitAssetsOffShelveResponseBody setData(SubmitAssetsOffShelveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitAssetsOffShelveResponseBodyData getData() {
        return this.data;
    }

    public SubmitAssetsOffShelveResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitAssetsOffShelveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitAssetsOffShelveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAssetsOffShelveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitAssetsOffShelveResponseBodyDataResultList extends TeaModel {
        /**
         * <p>The error code returned when the submission fails. This value is empty when the submission succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>OffShelveFailed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the submission fails. This value is empty when the submission succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>Asset does not exist: odps.project_a.table_not_exist</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The unique identifier of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.project_a.table_orders</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>Indicates whether the direct delisting or delisting approval was submitted successfully.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static SubmitAssetsOffShelveResponseBodyDataResultList build(java.util.Map<String, ?> map) throws Exception {
            SubmitAssetsOffShelveResponseBodyDataResultList self = new SubmitAssetsOffShelveResponseBodyDataResultList();
            return TeaModel.build(map, self);
        }

        public SubmitAssetsOffShelveResponseBodyDataResultList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SubmitAssetsOffShelveResponseBodyDataResultList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitAssetsOffShelveResponseBodyDataResultList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public SubmitAssetsOffShelveResponseBodyDataResultList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class SubmitAssetsOffShelveResponseBodyData extends TeaModel {
        /**
         * <p>The number of assets for which the delisting submission failed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The delisting submission results for each asset.</p>
         */
        @NameInMap("ResultList")
        public java.util.List<SubmitAssetsOffShelveResponseBodyDataResultList> resultList;

        /**
         * <p>The number of assets for which the delisting submission succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The total number of assets.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SubmitAssetsOffShelveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitAssetsOffShelveResponseBodyData self = new SubmitAssetsOffShelveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitAssetsOffShelveResponseBodyData setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public SubmitAssetsOffShelveResponseBodyData setResultList(java.util.List<SubmitAssetsOffShelveResponseBodyDataResultList> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<SubmitAssetsOffShelveResponseBodyDataResultList> getResultList() {
            return this.resultList;
        }

        public SubmitAssetsOffShelveResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public SubmitAssetsOffShelveResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
