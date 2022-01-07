// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceStatisticsResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("activeCount")
        public Long activeCount;

        @NameInMap("deviceCount")
        public Long deviceCount;

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
