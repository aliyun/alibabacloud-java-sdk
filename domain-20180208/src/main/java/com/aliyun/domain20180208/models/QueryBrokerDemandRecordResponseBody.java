// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBrokerDemandRecordResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryBrokerDemandRecordResponseBodyData data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryBrokerDemandRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBrokerDemandRecordResponseBody self = new QueryBrokerDemandRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBrokerDemandRecordResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryBrokerDemandRecordResponseBody setData(QueryBrokerDemandRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBrokerDemandRecordResponseBodyData getData() {
        return this.data;
    }

    public QueryBrokerDemandRecordResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBrokerDemandRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBrokerDemandRecordResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryBrokerDemandRecordResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryBrokerDemandRecordResponseBodyDataBrokerDemandRecord extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        public static QueryBrokerDemandRecordResponseBodyDataBrokerDemandRecord build(java.util.Map<String, ?> map) throws Exception {
            QueryBrokerDemandRecordResponseBodyDataBrokerDemandRecord self = new QueryBrokerDemandRecordResponseBodyDataBrokerDemandRecord();
            return TeaModel.build(map, self);
        }

        public QueryBrokerDemandRecordResponseBodyDataBrokerDemandRecord setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryBrokerDemandRecordResponseBodyDataBrokerDemandRecord setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryBrokerDemandRecordResponseBodyDataBrokerDemandRecord setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class QueryBrokerDemandRecordResponseBodyData extends TeaModel {
        @NameInMap("BrokerDemandRecord")
        public java.util.List<QueryBrokerDemandRecordResponseBodyDataBrokerDemandRecord> brokerDemandRecord;

        public static QueryBrokerDemandRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBrokerDemandRecordResponseBodyData self = new QueryBrokerDemandRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBrokerDemandRecordResponseBodyData setBrokerDemandRecord(java.util.List<QueryBrokerDemandRecordResponseBodyDataBrokerDemandRecord> brokerDemandRecord) {
            this.brokerDemandRecord = brokerDemandRecord;
            return this;
        }
        public java.util.List<QueryBrokerDemandRecordResponseBodyDataBrokerDemandRecord> getBrokerDemandRecord() {
            return this.brokerDemandRecord;
        }

    }

}
