// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupStatusResponseBody extends TeaModel {
    /**
     * <p>The message consumption rate. Unit: messages/minute.</p>
     */
    @NameInMap("AccumulatedConsumeCountPerMinute")
    public Integer accumulatedConsumeCountPerMinute;

    /**
     * <p>The number of accumulated messages.</p>
     */
    @NameInMap("AccumulationCount")
    public Integer accumulationCount;

    /**
     * <p>The details about the client. For more information, see **ConsumerGroupClientConnectionInfo**.</p>
     */
    @NameInMap("ClientConnectionStatusList")
    public QueryConsumerGroupStatusResponseBodyClientConnectionStatusList clientConnectionStatusList;

    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](/help/en/iot-platform/latest/bce100).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message consumption rate of the consumer group. Unit: messages/minute.</p>
     */
    @NameInMap("ConsumerSpeed")
    public Integer consumerSpeed;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The time when the last message was consumed. The time is in the yyyy-MM-dd\"T\"HH:mm:ss.SSSZ format. The time is displayed in UTC and accurate to milliseconds.</p>
     */
    @NameInMap("LastConsumerTime")
    public String lastConsumerTime;

    /**
     * <p>The consumption rate of real-time messages in the consumer group. Unit: messages/minute.</p>
     */
    @NameInMap("RealTimeConsumeCountPerMinute")
    public Integer realTimeConsumeCountPerMinute;

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

    public static QueryConsumerGroupStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupStatusResponseBody self = new QueryConsumerGroupStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupStatusResponseBody setAccumulatedConsumeCountPerMinute(Integer accumulatedConsumeCountPerMinute) {
        this.accumulatedConsumeCountPerMinute = accumulatedConsumeCountPerMinute;
        return this;
    }
    public Integer getAccumulatedConsumeCountPerMinute() {
        return this.accumulatedConsumeCountPerMinute;
    }

    public QueryConsumerGroupStatusResponseBody setAccumulationCount(Integer accumulationCount) {
        this.accumulationCount = accumulationCount;
        return this;
    }
    public Integer getAccumulationCount() {
        return this.accumulationCount;
    }

    public QueryConsumerGroupStatusResponseBody setClientConnectionStatusList(QueryConsumerGroupStatusResponseBodyClientConnectionStatusList clientConnectionStatusList) {
        this.clientConnectionStatusList = clientConnectionStatusList;
        return this;
    }
    public QueryConsumerGroupStatusResponseBodyClientConnectionStatusList getClientConnectionStatusList() {
        return this.clientConnectionStatusList;
    }

    public QueryConsumerGroupStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConsumerGroupStatusResponseBody setConsumerSpeed(Integer consumerSpeed) {
        this.consumerSpeed = consumerSpeed;
        return this;
    }
    public Integer getConsumerSpeed() {
        return this.consumerSpeed;
    }

    public QueryConsumerGroupStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryConsumerGroupStatusResponseBody setLastConsumerTime(String lastConsumerTime) {
        this.lastConsumerTime = lastConsumerTime;
        return this;
    }
    public String getLastConsumerTime() {
        return this.lastConsumerTime;
    }

    public QueryConsumerGroupStatusResponseBody setRealTimeConsumeCountPerMinute(Integer realTimeConsumeCountPerMinute) {
        this.realTimeConsumeCountPerMinute = realTimeConsumeCountPerMinute;
        return this;
    }
    public Integer getRealTimeConsumeCountPerMinute() {
        return this.realTimeConsumeCountPerMinute;
    }

    public QueryConsumerGroupStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConsumerGroupStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo extends TeaModel {
        /**
         * <p>The consumption rate of accumulated messages on a single client of the consumer group. Unit: messages/minute.</p>
         */
        @NameInMap("AccumulatedConsumeCountPerMinute")
        public Integer accumulatedConsumeCountPerMinute;

        /**
         * <p>The ID of the client.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The IP address and port of the client.</p>
         */
        @NameInMap("ClientIpPort")
        public String clientIpPort;

        /**
         * <p>The last time when the client was online. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("OnlineTime")
        public Long onlineTime;

        /**
         * <p>The consumption rate of real-time messages on a single client of the consumer group. Unit: messages/minute.</p>
         */
        @NameInMap("RealTimeConsumeCountPerMinute")
        public Integer realTimeConsumeCountPerMinute;

        public static QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo self = new QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo();
            return TeaModel.build(map, self);
        }

        public QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo setAccumulatedConsumeCountPerMinute(Integer accumulatedConsumeCountPerMinute) {
            this.accumulatedConsumeCountPerMinute = accumulatedConsumeCountPerMinute;
            return this;
        }
        public Integer getAccumulatedConsumeCountPerMinute() {
            return this.accumulatedConsumeCountPerMinute;
        }

        public QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo setClientIpPort(String clientIpPort) {
            this.clientIpPort = clientIpPort;
            return this;
        }
        public String getClientIpPort() {
            return this.clientIpPort;
        }

        public QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo setOnlineTime(Long onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public Long getOnlineTime() {
            return this.onlineTime;
        }

        public QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo setRealTimeConsumeCountPerMinute(Integer realTimeConsumeCountPerMinute) {
            this.realTimeConsumeCountPerMinute = realTimeConsumeCountPerMinute;
            return this;
        }
        public Integer getRealTimeConsumeCountPerMinute() {
            return this.realTimeConsumeCountPerMinute;
        }

    }

    public static class QueryConsumerGroupStatusResponseBodyClientConnectionStatusList extends TeaModel {
        @NameInMap("ConsumerGroupClientConnectionInfo")
        public java.util.List<QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo> consumerGroupClientConnectionInfo;

        public static QueryConsumerGroupStatusResponseBodyClientConnectionStatusList build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerGroupStatusResponseBodyClientConnectionStatusList self = new QueryConsumerGroupStatusResponseBodyClientConnectionStatusList();
            return TeaModel.build(map, self);
        }

        public QueryConsumerGroupStatusResponseBodyClientConnectionStatusList setConsumerGroupClientConnectionInfo(java.util.List<QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo> consumerGroupClientConnectionInfo) {
            this.consumerGroupClientConnectionInfo = consumerGroupClientConnectionInfo;
            return this;
        }
        public java.util.List<QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo> getConsumerGroupClientConnectionInfo() {
            return this.consumerGroupClientConnectionInfo;
        }

    }

}
