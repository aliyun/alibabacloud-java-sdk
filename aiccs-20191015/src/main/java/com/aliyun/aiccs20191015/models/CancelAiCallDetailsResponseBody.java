// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CancelAiCallDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Access Denied</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CancelAiCallDetailsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>46C98E28-9239-5D95-AC76-648B8FD4889A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CancelAiCallDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelAiCallDetailsResponseBody self = new CancelAiCallDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelAiCallDetailsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CancelAiCallDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelAiCallDetailsResponseBody setData(CancelAiCallDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelAiCallDetailsResponseBodyData getData() {
        return this.data;
    }

    public CancelAiCallDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelAiCallDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelAiCallDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelAiCallDetailsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        @NameInMap("FailedDetails")
        public java.util.Map<String, ?> failedDetails;

        /**
         * <strong>example:</strong>
         * <p>ALL_SUCCEED</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("SucceedCount")
        public Long succeedCount;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static CancelAiCallDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelAiCallDetailsResponseBodyData self = new CancelAiCallDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelAiCallDetailsResponseBodyData setFailedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Long getFailedCount() {
            return this.failedCount;
        }

        public CancelAiCallDetailsResponseBodyData setFailedDetails(java.util.Map<String, ?> failedDetails) {
            this.failedDetails = failedDetails;
            return this;
        }
        public java.util.Map<String, ?> getFailedDetails() {
            return this.failedDetails;
        }

        public CancelAiCallDetailsResponseBodyData setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public CancelAiCallDetailsResponseBodyData setSucceedCount(Long succeedCount) {
            this.succeedCount = succeedCount;
            return this;
        }
        public Long getSucceedCount() {
            return this.succeedCount;
        }

        public CancelAiCallDetailsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
