// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitAssetsOnShelveResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the asset listing submission.</p>
     */
    @NameInMap("Data")
    public SubmitAssetsOnShelveResponseBodyData data;

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

    public static SubmitAssetsOnShelveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAssetsOnShelveResponseBody self = new SubmitAssetsOnShelveResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAssetsOnShelveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitAssetsOnShelveResponseBody setData(SubmitAssetsOnShelveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitAssetsOnShelveResponseBodyData getData() {
        return this.data;
    }

    public SubmitAssetsOnShelveResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitAssetsOnShelveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitAssetsOnShelveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAssetsOnShelveResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitAssetsOnShelveResponseBodyDataResultList extends TeaModel {
        /**
         * <p>The error code returned when the listing fails. This parameter is empty if the listing succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>OnShelveFailed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the listing fails. This parameter is empty if the listing succeeds.</p>
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
         * <p>Indicates whether the asset was successfully listed.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static SubmitAssetsOnShelveResponseBodyDataResultList build(java.util.Map<String, ?> map) throws Exception {
            SubmitAssetsOnShelveResponseBodyDataResultList self = new SubmitAssetsOnShelveResponseBodyDataResultList();
            return TeaModel.build(map, self);
        }

        public SubmitAssetsOnShelveResponseBodyDataResultList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SubmitAssetsOnShelveResponseBodyDataResultList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitAssetsOnShelveResponseBodyDataResultList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public SubmitAssetsOnShelveResponseBodyDataResultList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class SubmitAssetsOnShelveResponseBodyData extends TeaModel {
        /**
         * <p>The number of assets that failed to be listed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The listing results for each asset.</p>
         */
        @NameInMap("ResultList")
        public java.util.List<SubmitAssetsOnShelveResponseBodyDataResultList> resultList;

        /**
         * <p>The number of assets that were successfully listed.</p>
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

        public static SubmitAssetsOnShelveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitAssetsOnShelveResponseBodyData self = new SubmitAssetsOnShelveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitAssetsOnShelveResponseBodyData setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public SubmitAssetsOnShelveResponseBodyData setResultList(java.util.List<SubmitAssetsOnShelveResponseBodyDataResultList> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<SubmitAssetsOnShelveResponseBodyDataResultList> getResultList() {
            return this.resultList;
        }

        public SubmitAssetsOnShelveResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public SubmitAssetsOnShelveResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
