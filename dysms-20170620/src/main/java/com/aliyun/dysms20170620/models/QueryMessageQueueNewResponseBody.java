// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMessageQueueNewResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<QueryMessageQueueNewResponseBodyList> list;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryMessageQueueNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageQueueNewResponseBody self = new QueryMessageQueueNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMessageQueueNewResponseBody setList(java.util.List<QueryMessageQueueNewResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryMessageQueueNewResponseBodyList> getList() {
        return this.list;
    }

    public QueryMessageQueueNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMessageQueueNewResponseBodyList extends TeaModel {
        @NameInMap("IsCreated")
        public Boolean isCreated;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("QueueType")
        public String queueType;

        @NameInMap("Region")
        public String region;

        public static QueryMessageQueueNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageQueueNewResponseBodyList self = new QueryMessageQueueNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryMessageQueueNewResponseBodyList setIsCreated(Boolean isCreated) {
            this.isCreated = isCreated;
            return this;
        }
        public Boolean getIsCreated() {
            return this.isCreated;
        }

        public QueryMessageQueueNewResponseBodyList setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public QueryMessageQueueNewResponseBodyList setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }
        public String getQueueType() {
            return this.queueType;
        }

        public QueryMessageQueueNewResponseBodyList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
