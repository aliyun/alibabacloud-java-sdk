// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryReceiverByParamResponseBody extends TeaModel {
    @NameInMap("NextStart")
    public String nextStart;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("data")
    public QueryReceiverByParamResponseBodyData data;

    public static QueryReceiverByParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReceiverByParamResponseBody self = new QueryReceiverByParamResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReceiverByParamResponseBody setNextStart(String nextStart) {
        this.nextStart = nextStart;
        return this;
    }
    public String getNextStart() {
        return this.nextStart;
    }

    public QueryReceiverByParamResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryReceiverByParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReceiverByParamResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryReceiverByParamResponseBody setData(QueryReceiverByParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryReceiverByParamResponseBodyData getData() {
        return this.data;
    }

    public static class QueryReceiverByParamResponseBodyDataReceiver extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("ReceiverId")
        public String receiverId;

        @NameInMap("ReceiversAlias")
        public String receiversAlias;

        @NameInMap("ReceiversName")
        public String receiversName;

        @NameInMap("ReceiversStatus")
        public String receiversStatus;

        @NameInMap("UtcCreateTime")
        public Long utcCreateTime;

        public static QueryReceiverByParamResponseBodyDataReceiver build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiverByParamResponseBodyDataReceiver self = new QueryReceiverByParamResponseBodyDataReceiver();
            return TeaModel.build(map, self);
        }

        public QueryReceiverByParamResponseBodyDataReceiver setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public QueryReceiverByParamResponseBodyDataReceiver setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryReceiverByParamResponseBodyDataReceiver setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryReceiverByParamResponseBodyDataReceiver setReceiverId(String receiverId) {
            this.receiverId = receiverId;
            return this;
        }
        public String getReceiverId() {
            return this.receiverId;
        }

        public QueryReceiverByParamResponseBodyDataReceiver setReceiversAlias(String receiversAlias) {
            this.receiversAlias = receiversAlias;
            return this;
        }
        public String getReceiversAlias() {
            return this.receiversAlias;
        }

        public QueryReceiverByParamResponseBodyDataReceiver setReceiversName(String receiversName) {
            this.receiversName = receiversName;
            return this;
        }
        public String getReceiversName() {
            return this.receiversName;
        }

        public QueryReceiverByParamResponseBodyDataReceiver setReceiversStatus(String receiversStatus) {
            this.receiversStatus = receiversStatus;
            return this;
        }
        public String getReceiversStatus() {
            return this.receiversStatus;
        }

        public QueryReceiverByParamResponseBodyDataReceiver setUtcCreateTime(Long utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

    }

    public static class QueryReceiverByParamResponseBodyData extends TeaModel {
        @NameInMap("receiver")
        public java.util.List<QueryReceiverByParamResponseBodyDataReceiver> receiver;

        public static QueryReceiverByParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiverByParamResponseBodyData self = new QueryReceiverByParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryReceiverByParamResponseBodyData setReceiver(java.util.List<QueryReceiverByParamResponseBodyDataReceiver> receiver) {
            this.receiver = receiver;
            return this;
        }
        public java.util.List<QueryReceiverByParamResponseBodyDataReceiver> getReceiver() {
            return this.receiver;
        }

    }

}
