// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListLegacyQueueEventLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLegacyQueueEventLogsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLegacyQueueEventLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLegacyQueueEventLogsResponseBody self = new ListLegacyQueueEventLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLegacyQueueEventLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLegacyQueueEventLogsResponseBody setData(ListLegacyQueueEventLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLegacyQueueEventLogsResponseBodyData getData() {
        return this.data;
    }

    public ListLegacyQueueEventLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListLegacyQueueEventLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLegacyQueueEventLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLegacyQueueEventLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLegacyQueueEventLogsResponseBodyDataList extends TeaModel {
        @NameInMap("Acid")
        public String acid;

        @NameInMap("Ani")
        public String ani;

        @NameInMap("AnswerPhone")
        public String answerPhone;

        @NameInMap("AnswerTime")
        public Long answerTime;

        @NameInMap("Cause")
        public String cause;

        @NameInMap("Dnis")
        public String dnis;

        @NameInMap("QueueTime")
        public Long queueTime;

        @NameInMap("StatisticDate")
        public String statisticDate;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Vq")
        public String vq;

        public static ListLegacyQueueEventLogsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLegacyQueueEventLogsResponseBodyDataList self = new ListLegacyQueueEventLogsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListLegacyQueueEventLogsResponseBodyDataList setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

        public ListLegacyQueueEventLogsResponseBodyDataList setAni(String ani) {
            this.ani = ani;
            return this;
        }
        public String getAni() {
            return this.ani;
        }

        public ListLegacyQueueEventLogsResponseBodyDataList setAnswerPhone(String answerPhone) {
            this.answerPhone = answerPhone;
            return this;
        }
        public String getAnswerPhone() {
            return this.answerPhone;
        }

        public ListLegacyQueueEventLogsResponseBodyDataList setAnswerTime(Long answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public Long getAnswerTime() {
            return this.answerTime;
        }

        public ListLegacyQueueEventLogsResponseBodyDataList setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public ListLegacyQueueEventLogsResponseBodyDataList setDnis(String dnis) {
            this.dnis = dnis;
            return this;
        }
        public String getDnis() {
            return this.dnis;
        }

        public ListLegacyQueueEventLogsResponseBodyDataList setQueueTime(Long queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Long getQueueTime() {
            return this.queueTime;
        }

        public ListLegacyQueueEventLogsResponseBodyDataList setStatisticDate(String statisticDate) {
            this.statisticDate = statisticDate;
            return this;
        }
        public String getStatisticDate() {
            return this.statisticDate;
        }

        public ListLegacyQueueEventLogsResponseBodyDataList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListLegacyQueueEventLogsResponseBodyDataList setVq(String vq) {
            this.vq = vq;
            return this;
        }
        public String getVq() {
            return this.vq;
        }

    }

    public static class ListLegacyQueueEventLogsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListLegacyQueueEventLogsResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLegacyQueueEventLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLegacyQueueEventLogsResponseBodyData self = new ListLegacyQueueEventLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLegacyQueueEventLogsResponseBodyData setList(java.util.List<ListLegacyQueueEventLogsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListLegacyQueueEventLogsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListLegacyQueueEventLogsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListLegacyQueueEventLogsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListLegacyQueueEventLogsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
