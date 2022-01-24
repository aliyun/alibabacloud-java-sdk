// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySendStatisticsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySendStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySendStatisticsResponseBody self = new QuerySendStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySendStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySendStatisticsResponseBody setData(QuerySendStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySendStatisticsResponseBodyData getData() {
        return this.data;
    }

    public QuerySendStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySendStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySendStatisticsResponseBodyDataTargetList extends TeaModel {
        @NameInMap("NoRespondedCount")
        public Long noRespondedCount;

        @NameInMap("RespondedFailCount")
        public Long respondedFailCount;

        @NameInMap("RespondedSuccessCount")
        public Long respondedSuccessCount;

        @NameInMap("SendDate")
        public String sendDate;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static QuerySendStatisticsResponseBodyDataTargetList build(java.util.Map<String, ?> map) throws Exception {
            QuerySendStatisticsResponseBodyDataTargetList self = new QuerySendStatisticsResponseBodyDataTargetList();
            return TeaModel.build(map, self);
        }

        public QuerySendStatisticsResponseBodyDataTargetList setNoRespondedCount(Long noRespondedCount) {
            this.noRespondedCount = noRespondedCount;
            return this;
        }
        public Long getNoRespondedCount() {
            return this.noRespondedCount;
        }

        public QuerySendStatisticsResponseBodyDataTargetList setRespondedFailCount(Long respondedFailCount) {
            this.respondedFailCount = respondedFailCount;
            return this;
        }
        public Long getRespondedFailCount() {
            return this.respondedFailCount;
        }

        public QuerySendStatisticsResponseBodyDataTargetList setRespondedSuccessCount(Long respondedSuccessCount) {
            this.respondedSuccessCount = respondedSuccessCount;
            return this;
        }
        public Long getRespondedSuccessCount() {
            return this.respondedSuccessCount;
        }

        public QuerySendStatisticsResponseBodyDataTargetList setSendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }
        public String getSendDate() {
            return this.sendDate;
        }

        public QuerySendStatisticsResponseBodyDataTargetList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class QuerySendStatisticsResponseBodyData extends TeaModel {
        @NameInMap("TargetList")
        public java.util.List<QuerySendStatisticsResponseBodyDataTargetList> targetList;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static QuerySendStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySendStatisticsResponseBodyData self = new QuerySendStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySendStatisticsResponseBodyData setTargetList(java.util.List<QuerySendStatisticsResponseBodyDataTargetList> targetList) {
            this.targetList = targetList;
            return this;
        }
        public java.util.List<QuerySendStatisticsResponseBodyDataTargetList> getTargetList() {
            return this.targetList;
        }

        public QuerySendStatisticsResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
