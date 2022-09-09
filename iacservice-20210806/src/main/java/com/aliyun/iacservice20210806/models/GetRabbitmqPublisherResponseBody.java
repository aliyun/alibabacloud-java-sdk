// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRabbitmqPublisherResponseBody extends TeaModel {
    @NameInMap("publisher")
    public GetRabbitmqPublisherResponseBodyPublisher publisher;

    @NameInMap("requestId")
    public String requestId;

    public static GetRabbitmqPublisherResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRabbitmqPublisherResponseBody self = new GetRabbitmqPublisherResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRabbitmqPublisherResponseBody setPublisher(GetRabbitmqPublisherResponseBodyPublisher publisher) {
        this.publisher = publisher;
        return this;
    }
    public GetRabbitmqPublisherResponseBodyPublisher getPublisher() {
        return this.publisher;
    }

    public GetRabbitmqPublisherResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRabbitmqPublisherResponseBodyPublisher extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("exchangeName")
        public String exchangeName;

        @NameInMap("exchangeType")
        public String exchangeType;

        @NameInMap("hostName")
        public String hostName;

        @NameInMap("name")
        public String name;

        @NameInMap("port")
        public Long port;

        @NameInMap("publisherId")
        public String publisherId;

        @NameInMap("taskIds")
        public java.util.List<String> taskIds;

        @NameInMap("userName")
        public String userName;

        @NameInMap("virtualHost")
        public String virtualHost;

        public static GetRabbitmqPublisherResponseBodyPublisher build(java.util.Map<String, ?> map) throws Exception {
            GetRabbitmqPublisherResponseBodyPublisher self = new GetRabbitmqPublisherResponseBodyPublisher();
            return TeaModel.build(map, self);
        }

        public GetRabbitmqPublisherResponseBodyPublisher setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRabbitmqPublisherResponseBodyPublisher setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRabbitmqPublisherResponseBodyPublisher setExchangeName(String exchangeName) {
            this.exchangeName = exchangeName;
            return this;
        }
        public String getExchangeName() {
            return this.exchangeName;
        }

        public GetRabbitmqPublisherResponseBodyPublisher setExchangeType(String exchangeType) {
            this.exchangeType = exchangeType;
            return this;
        }
        public String getExchangeType() {
            return this.exchangeType;
        }

        public GetRabbitmqPublisherResponseBodyPublisher setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetRabbitmqPublisherResponseBodyPublisher setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRabbitmqPublisherResponseBodyPublisher setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetRabbitmqPublisherResponseBodyPublisher setPublisherId(String publisherId) {
            this.publisherId = publisherId;
            return this;
        }
        public String getPublisherId() {
            return this.publisherId;
        }

        public GetRabbitmqPublisherResponseBodyPublisher setTaskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

        public GetRabbitmqPublisherResponseBodyPublisher setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetRabbitmqPublisherResponseBodyPublisher setVirtualHost(String virtualHost) {
            this.virtualHost = virtualHost;
            return this;
        }
        public String getVirtualHost() {
            return this.virtualHost;
        }

    }

}
