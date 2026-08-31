// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateAssetAttributesResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of updating asset property values.</p>
     */
    @NameInMap("Data")
    public UpdateAssetAttributesResponseBodyData data;

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

    public static UpdateAssetAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssetAttributesResponseBody self = new UpdateAssetAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAssetAttributesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAssetAttributesResponseBody setData(UpdateAssetAttributesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAssetAttributesResponseBodyData getData() {
        return this.data;
    }

    public UpdateAssetAttributesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateAssetAttributesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAssetAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAssetAttributesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateAssetAttributesResponseBodyDataResultList extends TeaModel {
        /**
         * <p>The error code returned when the update fails. This value is empty when the update succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>AssetNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the update fails. This value is empty when the update succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>Asset does not exist: odps.project_a.table_not_exist</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The globally unique identifier (GUID) of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.project_a.table_orders</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <p>Indicates whether the asset was updated successfully.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static UpdateAssetAttributesResponseBodyDataResultList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAssetAttributesResponseBodyDataResultList self = new UpdateAssetAttributesResponseBodyDataResultList();
            return TeaModel.build(map, self);
        }

        public UpdateAssetAttributesResponseBodyDataResultList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public UpdateAssetAttributesResponseBodyDataResultList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public UpdateAssetAttributesResponseBodyDataResultList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public UpdateAssetAttributesResponseBodyDataResultList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class UpdateAssetAttributesResponseBodyData extends TeaModel {
        /**
         * <p>The number of assets that failed to be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The update results for each asset.</p>
         */
        @NameInMap("ResultList")
        public java.util.List<UpdateAssetAttributesResponseBodyDataResultList> resultList;

        /**
         * <p>The number of assets that were updated successfully.</p>
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

        public static UpdateAssetAttributesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAssetAttributesResponseBodyData self = new UpdateAssetAttributesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAssetAttributesResponseBodyData setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public UpdateAssetAttributesResponseBodyData setResultList(java.util.List<UpdateAssetAttributesResponseBodyDataResultList> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<UpdateAssetAttributesResponseBodyDataResultList> getResultList() {
            return this.resultList;
        }

        public UpdateAssetAttributesResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public UpdateAssetAttributesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
