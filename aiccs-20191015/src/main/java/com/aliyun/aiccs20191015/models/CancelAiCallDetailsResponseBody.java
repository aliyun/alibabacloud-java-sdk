// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CancelAiCallDetailsResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CancelAiCallDetailsResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46C98E28-9239-5D95-AC76-648B8FD4889A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was called successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
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
         * <p>The number of unsuccessful cancellations.</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>The details of failed cancellations. This parameter is a map where the key is the ID or phone number of the failed detail record, and the value is the reason for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;176********&quot;: &quot;The detail record cannot be canceled in its current state&quot;
         * }</p>
         */
        @NameInMap("FailedDetails")
        public java.util.Map<String, ?> failedDetails;

        /**
         * <p>The cancellation result. Valid values:</p>
         * <ul>
         * <li>ALL_FAILED: All cancellations failed.</li>
         * <li>ALL_SUCCEED: All cancellations succeeded.</li>
         * <li>PART_FAILED: Some cancellations failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PART_FAILED</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>The number of successful cancellations.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("SucceedCount")
        public Long succeedCount;

        /**
         * <p>The total count.</p>
         * 
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
