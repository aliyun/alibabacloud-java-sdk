// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CancelAiCallDetailsResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why the access was denied.</p>
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
     * <p>The message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
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
         * <p>The number of calls that could not be canceled.</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("FailedCount")
        public Long failedCount;

        /**
         * <p>Details about the failed cancellations. This is a map where the key is the failed detail ID or phone number, and the value is the reason for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;176********&quot;: &quot;明细记录当前状态不可取消&quot;
         * }</p>
         */
        @NameInMap("FailedDetails")
        public java.util.Map<String, ?> failedDetails;

        /**
         * <p>The result code of the cancellation. Valid values:</p>
         * <ul>
         * <li><p>ALL_FAILED: All cancellations failed.</p>
         * </li>
         * <li><p>ALL_SUCCEED: All cancellations succeeded.</p>
         * </li>
         * <li><p>PART_FAILED: Some cancellations failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PART_FAILED</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>The number of calls that were successfully canceled.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("SucceedCount")
        public Long succeedCount;

        /**
         * <p>The total number of items.</p>
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
