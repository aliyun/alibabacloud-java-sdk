// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class QueryMpsSchedulerListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryMpsSchedulerListResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryMpsSchedulerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMpsSchedulerListResponseBody self = new QueryMpsSchedulerListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMpsSchedulerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMpsSchedulerListResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMpsSchedulerListResponseBody setResultContent(QueryMpsSchedulerListResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryMpsSchedulerListResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryMpsSchedulerListResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryMpsSchedulerListResponseBodyResultContentDataList extends TeaModel {
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

        public static QueryMpsSchedulerListResponseBodyResultContentDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryMpsSchedulerListResponseBodyResultContentDataList self = new QueryMpsSchedulerListResponseBodyResultContentDataList();
            return TeaModel.build(map, self);
        }

        public QueryMpsSchedulerListResponseBodyResultContentDataList setCreateType(Integer createType) {
            this.createType = createType;
            return this;
        }
        public Integer getCreateType() {
            return this.createType;
        }

        public QueryMpsSchedulerListResponseBodyResultContentDataList setDeliveryType(Integer deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public Integer getDeliveryType() {
            return this.deliveryType;
        }

        public QueryMpsSchedulerListResponseBodyResultContentDataList setExecutedStatus(String executedStatus) {
            this.executedStatus = executedStatus;
            return this;
        }
        public String getExecutedStatus() {
            return this.executedStatus;
        }

        public QueryMpsSchedulerListResponseBodyResultContentDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMpsSchedulerListResponseBodyResultContentDataList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public QueryMpsSchedulerListResponseBodyResultContentDataList setPushContent(String pushContent) {
            this.pushContent = pushContent;
            return this;
        }
        public String getPushContent() {
            return this.pushContent;
        }

        public QueryMpsSchedulerListResponseBodyResultContentDataList setPushTime(Long pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public Long getPushTime() {
            return this.pushTime;
        }

        public QueryMpsSchedulerListResponseBodyResultContentDataList setPushTitle(String pushTitle) {
            this.pushTitle = pushTitle;
            return this;
        }
        public String getPushTitle() {
            return this.pushTitle;
        }

        public QueryMpsSchedulerListResponseBodyResultContentDataList setStrategyType(Integer strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public Integer getStrategyType() {
            return this.strategyType;
        }

        public QueryMpsSchedulerListResponseBodyResultContentDataList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryMpsSchedulerListResponseBodyResultContentDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

    public static class QueryMpsSchedulerListResponseBodyResultContentData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryMpsSchedulerListResponseBodyResultContentDataList> list;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryMpsSchedulerListResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryMpsSchedulerListResponseBodyResultContentData self = new QueryMpsSchedulerListResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryMpsSchedulerListResponseBodyResultContentData setList(java.util.List<QueryMpsSchedulerListResponseBodyResultContentDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryMpsSchedulerListResponseBodyResultContentDataList> getList() {
            return this.list;
        }

        public QueryMpsSchedulerListResponseBodyResultContentData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class QueryMpsSchedulerListResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public QueryMpsSchedulerListResponseBodyResultContentData data;

        public static QueryMpsSchedulerListResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMpsSchedulerListResponseBodyResultContent self = new QueryMpsSchedulerListResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryMpsSchedulerListResponseBodyResultContent setData(QueryMpsSchedulerListResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryMpsSchedulerListResponseBodyResultContentData getData() {
            return this.data;
        }

    }

}
