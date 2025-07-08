// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardMessageQueueResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<QueryCardMessageQueueResponseBodyList> list;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCardMessageQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardMessageQueueResponseBody self = new QueryCardMessageQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardMessageQueueResponseBody setList(java.util.List<QueryCardMessageQueueResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryCardMessageQueueResponseBodyList> getList() {
        return this.list;
    }

    public QueryCardMessageQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCardMessageQueueResponseBodyList extends TeaModel {
        @NameInMap("IsCreated")
        public Boolean isCreated;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("QueueType")
        public String queueType;

        @NameInMap("Region")
        public String region;

        public static QueryCardMessageQueueResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryCardMessageQueueResponseBodyList self = new QueryCardMessageQueueResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryCardMessageQueueResponseBodyList setIsCreated(Boolean isCreated) {
            this.isCreated = isCreated;
            return this;
        }
        public Boolean getIsCreated() {
            return this.isCreated;
        }

        public QueryCardMessageQueueResponseBodyList setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public QueryCardMessageQueueResponseBodyList setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }
        public String getQueueType() {
            return this.queueType;
        }

        public QueryCardMessageQueueResponseBodyList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
