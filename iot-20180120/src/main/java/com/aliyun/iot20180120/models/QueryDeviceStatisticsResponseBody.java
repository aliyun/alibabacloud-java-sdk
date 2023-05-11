// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceStatisticsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device statistics returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryDeviceStatisticsResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatisticsResponseBody self = new QueryDeviceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceStatisticsResponseBody setData(QueryDeviceStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceStatisticsResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceStatisticsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>The number of activated devices.</p>
         */
        @NameInMap("activeCount")
        public Long activeCount;

        /**
         * <p>The total number of devices.</p>
         */
        @NameInMap("deviceCount")
        public Long deviceCount;

        /**
         * <p>The number of online devices.</p>
         */
        @NameInMap("onlineCount")
        public Long onlineCount;

        public static QueryDeviceStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceStatisticsResponseBodyData self = new QueryDeviceStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceStatisticsResponseBodyData setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

        public QueryDeviceStatisticsResponseBodyData setDeviceCount(Long deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Long getDeviceCount() {
            return this.deviceCount;
        }

        public QueryDeviceStatisticsResponseBodyData setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

    }

}
