// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceStatisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceStatisticsResponseData data;

    public static QueryDeviceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatisticsResponse self = new QueryDeviceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceStatisticsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceStatisticsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceStatisticsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceStatisticsResponse setData(QueryDeviceStatisticsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceStatisticsResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceStatisticsResponseData extends TeaModel {
        @NameInMap("deviceCount")
        @Validation(required = true)
        public Long deviceCount;

        @NameInMap("onlineCount")
        @Validation(required = true)
        public Long onlineCount;

        @NameInMap("activeCount")
        @Validation(required = true)
        public Long activeCount;

        public static QueryDeviceStatisticsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceStatisticsResponseData self = new QueryDeviceStatisticsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceStatisticsResponseData setDeviceCount(Long deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Long getDeviceCount() {
            return this.deviceCount;
        }

        public QueryDeviceStatisticsResponseData setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public QueryDeviceStatisticsResponseData setActiveCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }
        public Long getActiveCount() {
            return this.activeCount;
        }

    }

}
