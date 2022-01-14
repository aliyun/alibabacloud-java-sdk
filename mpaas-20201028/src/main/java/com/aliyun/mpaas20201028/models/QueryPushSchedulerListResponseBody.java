// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPushSchedulerListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryPushSchedulerListResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryPushSchedulerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPushSchedulerListResponseBody self = new QueryPushSchedulerListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPushSchedulerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPushSchedulerListResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPushSchedulerListResponseBody setResultContent(QueryPushSchedulerListResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryPushSchedulerListResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryPushSchedulerListResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryPushSchedulerListResponseBodyResultContentDataList extends TeaModel {
        @NameInMap("CreateType")
        public Integer createType;

        @NameInMap("DeliveryType")
        public Integer deliveryType;

        @NameInMap("ExecutedStatus")
        public String executedStatus;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("PushContent")
        public String pushContent;

        @NameInMap("PushTime")
        public Long pushTime;

        @NameInMap("PushTitle")
        public String pushTitle;

        @NameInMap("StrategyType")
        public Integer strategyType;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("UniqueId")
        public String uniqueId;

        public static QueryPushSchedulerListResponseBodyResultContentDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryPushSchedulerListResponseBodyResultContentDataList self = new QueryPushSchedulerListResponseBodyResultContentDataList();
            return TeaModel.build(map, self);
        }

        public QueryPushSchedulerListResponseBodyResultContentDataList setCreateType(Integer createType) {
            this.createType = createType;
            return this;
        }
        public Integer getCreateType() {
            return this.createType;
        }

        public QueryPushSchedulerListResponseBodyResultContentDataList setDeliveryType(Integer deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public Integer getDeliveryType() {
            return this.deliveryType;
        }

        public QueryPushSchedulerListResponseBodyResultContentDataList setExecutedStatus(String executedStatus) {
            this.executedStatus = executedStatus;
            return this;
        }
        public String getExecutedStatus() {
            return this.executedStatus;
        }

        public QueryPushSchedulerListResponseBodyResultContentDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryPushSchedulerListResponseBodyResultContentDataList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public QueryPushSchedulerListResponseBodyResultContentDataList setPushContent(String pushContent) {
            this.pushContent = pushContent;
            return this;
        }
        public String getPushContent() {
            return this.pushContent;
        }

        public QueryPushSchedulerListResponseBodyResultContentDataList setPushTime(Long pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public Long getPushTime() {
            return this.pushTime;
        }

        public QueryPushSchedulerListResponseBodyResultContentDataList setPushTitle(String pushTitle) {
            this.pushTitle = pushTitle;
            return this;
        }
        public String getPushTitle() {
            return this.pushTitle;
        }

        public QueryPushSchedulerListResponseBodyResultContentDataList setStrategyType(Integer strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public Integer getStrategyType() {
            return this.strategyType;
        }

        public QueryPushSchedulerListResponseBodyResultContentDataList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryPushSchedulerListResponseBodyResultContentDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

    public static class QueryPushSchedulerListResponseBodyResultContentData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryPushSchedulerListResponseBodyResultContentDataList> list;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryPushSchedulerListResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryPushSchedulerListResponseBodyResultContentData self = new QueryPushSchedulerListResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryPushSchedulerListResponseBodyResultContentData setList(java.util.List<QueryPushSchedulerListResponseBodyResultContentDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryPushSchedulerListResponseBodyResultContentDataList> getList() {
            return this.list;
        }

        public QueryPushSchedulerListResponseBodyResultContentData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class QueryPushSchedulerListResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public QueryPushSchedulerListResponseBodyResultContentData data;

        public static QueryPushSchedulerListResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryPushSchedulerListResponseBodyResultContent self = new QueryPushSchedulerListResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryPushSchedulerListResponseBodyResultContent setData(QueryPushSchedulerListResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryPushSchedulerListResponseBodyResultContentData getData() {
            return this.data;
        }

    }

}
