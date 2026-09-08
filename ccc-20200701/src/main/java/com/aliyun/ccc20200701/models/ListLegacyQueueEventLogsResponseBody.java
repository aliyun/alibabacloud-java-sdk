// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListLegacyQueueEventLogsResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public ListLegacyQueueEventLogsResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1A5A8998-41F9-5F85-BFCF-EB2B6E376812</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the invocation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>456328****</p>
         */
        @NameInMap("Acid")
        public String acid;

        /**
         * <p>Calling party</p>
         * 
         * <strong>example:</strong>
         * <p>8012****</p>
         */
        @NameInMap("Ani")
        public String ani;

        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("AnswerPhone")
        public String answerPhone;

        /**
         * <p>Acknowledgement duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("AnswerTime")
        public Long answerTime;

        /**
         * <p>Hang-up reason.</p>
         * 
         * <strong>example:</strong>
         * <p>正常</p>
         */
        @NameInMap("Cause")
        public String cause;

        /**
         * <p>Dialed number.</p>
         * 
         * <strong>example:</strong>
         * <p>1312211****</p>
         */
        @NameInMap("Dnis")
        public String dnis;

        /**
         * <p>Primary key</p>
         * 
         * <strong>example:</strong>
         * <p>109160</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Queue duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("QueueTime")
        public Long queueTime;

        /**
         * <p>Statistics date.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-03T10:15:30</p>
         */
        @NameInMap("StatisticDate")
        public String statisticDate;

        /**
         * <p>Tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acc3733</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
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

        public ListLegacyQueueEventLogsResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
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
        /**
         * <p>List of queue event logs.</p>
         */
        @NameInMap("List")
        public java.util.List<ListLegacyQueueEventLogsResponseBodyDataList> list;

        /**
         * <p>Page number, ranging from 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size, ranging from 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
