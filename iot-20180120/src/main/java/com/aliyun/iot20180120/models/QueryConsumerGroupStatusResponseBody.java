// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("AccumulationCount")
    public Integer accumulationCount;

    @NameInMap("ConsumerSpeed")
    public Integer consumerSpeed;

    @NameInMap("LastConsumerTime")
    public String lastConsumerTime;

    @NameInMap("Code")
    public String code;

    @NameInMap("ClientConnectionStatusList")
    public QueryConsumerGroupStatusResponseBodyClientConnectionStatusList clientConnectionStatusList;

    public static QueryConsumerGroupStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupStatusResponseBody self = new QueryConsumerGroupStatusResponseBody();
        return TeaModel.build(map, self);
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

    public QueryConsumerGroupStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryConsumerGroupStatusResponseBody setAccumulationCount(Integer accumulationCount) {
        this.accumulationCount = accumulationCount;
        return this;
    }
    public Integer getAccumulationCount() {
        return this.accumulationCount;
    }

    public QueryConsumerGroupStatusResponseBody setConsumerSpeed(Integer consumerSpeed) {
        this.consumerSpeed = consumerSpeed;
        return this;
    }
    public Integer getConsumerSpeed() {
        return this.consumerSpeed;
    }

    public QueryConsumerGroupStatusResponseBody setLastConsumerTime(String lastConsumerTime) {
        this.lastConsumerTime = lastConsumerTime;
        return this;
    }
    public String getLastConsumerTime() {
        return this.lastConsumerTime;
    }

    public QueryConsumerGroupStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConsumerGroupStatusResponseBody setClientConnectionStatusList(QueryConsumerGroupStatusResponseBodyClientConnectionStatusList clientConnectionStatusList) {
        this.clientConnectionStatusList = clientConnectionStatusList;
        return this;
    }
    public QueryConsumerGroupStatusResponseBodyClientConnectionStatusList getClientConnectionStatusList() {
        return this.clientConnectionStatusList;
    }

    public static class QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClientIpPort")
        public String clientIpPort;

        @NameInMap("OnlineTime")
        public Long onlineTime;

        public static QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo self = new QueryConsumerGroupStatusResponseBodyClientConnectionStatusListConsumerGroupClientConnectionInfo();
            return TeaModel.build(map, self);
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
