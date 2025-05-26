// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryReceiverByParamResponseBody extends TeaModel {
    /**
     * <p>Used for pagination. If there are more results, set this returned value to the NextStart in the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>6aec200853#102#1638894326#<a href="mailto:test@example.com">test@example.com</a></p>
     */
    @NameInMap("NextStart")
    public String nextStart;

    /**
     * <p>Number of items displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total count</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Detailed information of the recipient list</p>
     */
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
        /**
         * <p>Total number of recipient addresses</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-29T13:28Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>Recipient list ID</p>
         * 
         * <strong>example:</strong>
         * <p>0c910a7143044b1e116719eb678907b3</p>
         */
        @NameInMap("ReceiverId")
        public String receiverId;

        /**
         * <p>Recipient list alias</p>
         * 
         * <strong>example:</strong>
         * <p>10***@example.com</p>
         */
        @NameInMap("ReceiversAlias")
        public String receiversAlias;

        /**
         * <p>Recipient list name</p>
         * 
         * <strong>example:</strong>
         * <p>TKP000442-333</p>
         */
        @NameInMap("ReceiversName")
        public String receiversName;

        /**
         * <p>List status. Values:</p>
         * <ul>
         * <li>0: Uploading</li>
         * <li>1: Upload completed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReceiversStatus")
        public String receiversStatus;

        /**
         * <p>UTC formatted creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1569734892</p>
         */
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
