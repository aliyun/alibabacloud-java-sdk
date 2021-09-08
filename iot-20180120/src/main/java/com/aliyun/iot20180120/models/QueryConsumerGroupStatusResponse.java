// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("AccumulationCount")
    @Validation(required = true)
    public Integer accumulationCount;

    @NameInMap("ConsumerSpeed")
    @Validation(required = true)
    public Integer consumerSpeed;

    @NameInMap("LastConsumerTime")
    @Validation(required = true)
    public String lastConsumerTime;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("AccumulatedConsumeCountPerMinute")
    @Validation(required = true)
    public Integer accumulatedConsumeCountPerMinute;

    @NameInMap("RealTimeConsumeCountPerMinute")
    @Validation(required = true)
    public Integer realTimeConsumeCountPerMinute;

    @NameInMap("ClientConnectionStatusList")
    @Validation(required = true)
    public QueryConsumerGroupStatusResponseClientConnectionStatusList clientConnectionStatusList;

    public static QueryConsumerGroupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupStatusResponse self = new QueryConsumerGroupStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConsumerGroupStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryConsumerGroupStatusResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryConsumerGroupStatusResponse setAccumulationCount(Integer accumulationCount) {
        this.accumulationCount = accumulationCount;
        return this;
    }
    public Integer getAccumulationCount() {
        return this.accumulationCount;
    }

    public QueryConsumerGroupStatusResponse setConsumerSpeed(Integer consumerSpeed) {
        this.consumerSpeed = consumerSpeed;
        return this;
    }
    public Integer getConsumerSpeed() {
        return this.consumerSpeed;
    }

    public QueryConsumerGroupStatusResponse setLastConsumerTime(String lastConsumerTime) {
        this.lastConsumerTime = lastConsumerTime;
        return this;
    }
    public String getLastConsumerTime() {
        return this.lastConsumerTime;
    }

    public QueryConsumerGroupStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConsumerGroupStatusResponse setAccumulatedConsumeCountPerMinute(Integer accumulatedConsumeCountPerMinute) {
        this.accumulatedConsumeCountPerMinute = accumulatedConsumeCountPerMinute;
        return this;
    }
    public Integer getAccumulatedConsumeCountPerMinute() {
        return this.accumulatedConsumeCountPerMinute;
    }

    public QueryConsumerGroupStatusResponse setRealTimeConsumeCountPerMinute(Integer realTimeConsumeCountPerMinute) {
        this.realTimeConsumeCountPerMinute = realTimeConsumeCountPerMinute;
        return this;
    }
    public Integer getRealTimeConsumeCountPerMinute() {
        return this.realTimeConsumeCountPerMinute;
    }

    public QueryConsumerGroupStatusResponse setClientConnectionStatusList(QueryConsumerGroupStatusResponseClientConnectionStatusList clientConnectionStatusList) {
        this.clientConnectionStatusList = clientConnectionStatusList;
        return this;
    }
    public QueryConsumerGroupStatusResponseClientConnectionStatusList getClientConnectionStatusList() {
        return this.clientConnectionStatusList;
    }

    public static class QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo extends TeaModel {
        @NameInMap("ClientId")
        @Validation(required = true)
        public String clientId;

        @NameInMap("ClientIpPort")
        @Validation(required = true)
        public String clientIpPort;

        @NameInMap("OnlineTime")
        @Validation(required = true)
        public Long onlineTime;

        @NameInMap("RealTimeConsumeCountPerMinute")
        @Validation(required = true)
        public Integer realTimeConsumeCountPerMinute;

        @NameInMap("AccumulatedConsumeCountPerMinute")
        @Validation(required = true)
        public Integer accumulatedConsumeCountPerMinute;

        public static QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo self = new QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo();
            return TeaModel.build(map, self);
        }

        public QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo setClientIpPort(String clientIpPort) {
            this.clientIpPort = clientIpPort;
            return this;
        }
        public String getClientIpPort() {
            return this.clientIpPort;
        }

        public QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo setOnlineTime(Long onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public Long getOnlineTime() {
            return this.onlineTime;
        }

        public QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo setRealTimeConsumeCountPerMinute(Integer realTimeConsumeCountPerMinute) {
            this.realTimeConsumeCountPerMinute = realTimeConsumeCountPerMinute;
            return this;
        }
        public Integer getRealTimeConsumeCountPerMinute() {
            return this.realTimeConsumeCountPerMinute;
        }

        public QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo setAccumulatedConsumeCountPerMinute(Integer accumulatedConsumeCountPerMinute) {
            this.accumulatedConsumeCountPerMinute = accumulatedConsumeCountPerMinute;
            return this;
        }
        public Integer getAccumulatedConsumeCountPerMinute() {
            return this.accumulatedConsumeCountPerMinute;
        }

    }

    public static class QueryConsumerGroupStatusResponseClientConnectionStatusList extends TeaModel {
        @NameInMap("ConsumerGroupClientConnectionInfo")
        @Validation(required = true)
        public java.util.List<QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo> consumerGroupClientConnectionInfo;

        public static QueryConsumerGroupStatusResponseClientConnectionStatusList build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerGroupStatusResponseClientConnectionStatusList self = new QueryConsumerGroupStatusResponseClientConnectionStatusList();
            return TeaModel.build(map, self);
        }

        public QueryConsumerGroupStatusResponseClientConnectionStatusList setConsumerGroupClientConnectionInfo(java.util.List<QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo> consumerGroupClientConnectionInfo) {
            this.consumerGroupClientConnectionInfo = consumerGroupClientConnectionInfo;
            return this;
        }
        public java.util.List<QueryConsumerGroupStatusResponseClientConnectionStatusListConsumerGroupClientConnectionInfo> getConsumerGroupClientConnectionInfo() {
            return this.consumerGroupClientConnectionInfo;
        }

    }

}
