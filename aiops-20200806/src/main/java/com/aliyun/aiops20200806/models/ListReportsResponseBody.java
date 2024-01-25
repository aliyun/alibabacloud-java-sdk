// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListReportsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListReportsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageTotal")
    public Long pageTotal;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static ListReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReportsResponseBody self = new ListReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReportsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListReportsResponseBody setData(java.util.List<ListReportsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListReportsResponseBodyData> getData() {
        return this.data;
    }

    public ListReportsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListReportsResponseBody setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }
    public Long getPageTotal() {
        return this.pageTotal;
    }

    public ListReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListReportsResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListReportsResponseBodyData extends TeaModel {
        @NameInMap("bid")
        public String bid;

        @NameInMap("cid")
        public Long cid;

        @NameInMap("costCount")
        public Long costCount;

        @NameInMap("costCountTrendJson")
        public String costCountTrendJson;

        @NameInMap("criticalCount")
        public Long criticalCount;

        @NameInMap("criticalCountTrendJson")
        public String criticalCountTrendJson;

        @NameInMap("customerName")
        public String customerName;

        @NameInMap("gcLevel")
        public String gcLevel;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("normalCount")
        public Long normalCount;

        @NameInMap("normalCountTrendJson")
        public String normalCountTrendJson;

        @NameInMap("score")
        public Long score;

        @NameInMap("scoreTrendJson")
        public String scoreTrendJson;

        @NameInMap("trendJson")
        public String trendJson;

        @NameInMap("uid")
        public Long uid;

        @NameInMap("warningCount")
        public Long warningCount;

        @NameInMap("warningCountTrendJson")
        public String warningCountTrendJson;

        public static ListReportsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListReportsResponseBodyData self = new ListReportsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListReportsResponseBodyData setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public ListReportsResponseBodyData setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public ListReportsResponseBodyData setCostCount(Long costCount) {
            this.costCount = costCount;
            return this;
        }
        public Long getCostCount() {
            return this.costCount;
        }

        public ListReportsResponseBodyData setCostCountTrendJson(String costCountTrendJson) {
            this.costCountTrendJson = costCountTrendJson;
            return this;
        }
        public String getCostCountTrendJson() {
            return this.costCountTrendJson;
        }

        public ListReportsResponseBodyData setCriticalCount(Long criticalCount) {
            this.criticalCount = criticalCount;
            return this;
        }
        public Long getCriticalCount() {
            return this.criticalCount;
        }

        public ListReportsResponseBodyData setCriticalCountTrendJson(String criticalCountTrendJson) {
            this.criticalCountTrendJson = criticalCountTrendJson;
            return this;
        }
        public String getCriticalCountTrendJson() {
            return this.criticalCountTrendJson;
        }

        public ListReportsResponseBodyData setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public ListReportsResponseBodyData setGcLevel(String gcLevel) {
            this.gcLevel = gcLevel;
            return this;
        }
        public String getGcLevel() {
            return this.gcLevel;
        }

        public ListReportsResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListReportsResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListReportsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListReportsResponseBodyData setNormalCount(Long normalCount) {
            this.normalCount = normalCount;
            return this;
        }
        public Long getNormalCount() {
            return this.normalCount;
        }

        public ListReportsResponseBodyData setNormalCountTrendJson(String normalCountTrendJson) {
            this.normalCountTrendJson = normalCountTrendJson;
            return this;
        }
        public String getNormalCountTrendJson() {
            return this.normalCountTrendJson;
        }

        public ListReportsResponseBodyData setScore(Long score) {
            this.score = score;
            return this;
        }
        public Long getScore() {
            return this.score;
        }

        public ListReportsResponseBodyData setScoreTrendJson(String scoreTrendJson) {
            this.scoreTrendJson = scoreTrendJson;
            return this;
        }
        public String getScoreTrendJson() {
            return this.scoreTrendJson;
        }

        public ListReportsResponseBodyData setTrendJson(String trendJson) {
            this.trendJson = trendJson;
            return this;
        }
        public String getTrendJson() {
            return this.trendJson;
        }

        public ListReportsResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

        public ListReportsResponseBodyData setWarningCount(Long warningCount) {
            this.warningCount = warningCount;
            return this;
        }
        public Long getWarningCount() {
            return this.warningCount;
        }

        public ListReportsResponseBodyData setWarningCountTrendJson(String warningCountTrendJson) {
            this.warningCountTrendJson = warningCountTrendJson;
            return this;
        }
        public String getWarningCountTrendJson() {
            return this.warningCountTrendJson;
        }

    }

}
