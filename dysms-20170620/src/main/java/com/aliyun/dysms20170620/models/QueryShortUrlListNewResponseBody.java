// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryShortUrlListNewResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<QueryShortUrlListNewResponseBodyList> list;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static QueryShortUrlListNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryShortUrlListNewResponseBody self = new QueryShortUrlListNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryShortUrlListNewResponseBody setList(java.util.List<QueryShortUrlListNewResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryShortUrlListNewResponseBodyList> getList() {
        return this.list;
    }

    public QueryShortUrlListNewResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryShortUrlListNewResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryShortUrlListNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryShortUrlListNewResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class QueryShortUrlListNewResponseBodyListRecord extends TeaModel {
        @NameInMap("EventName")
        public String eventName;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtInvalidTime")
        public String gmtInvalidTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ShortUrl")
        public String shortUrl;

        @NameInMap("SourceUrl")
        public String sourceUrl;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TotalPv")
        public String totalPv;

        @NameInMap("TotalUv")
        public String totalUv;

        public static QueryShortUrlListNewResponseBodyListRecord build(java.util.Map<String, ?> map) throws Exception {
            QueryShortUrlListNewResponseBodyListRecord self = new QueryShortUrlListNewResponseBodyListRecord();
            return TeaModel.build(map, self);
        }

        public QueryShortUrlListNewResponseBodyListRecord setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public QueryShortUrlListNewResponseBodyListRecord setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public QueryShortUrlListNewResponseBodyListRecord setGmtInvalidTime(String gmtInvalidTime) {
            this.gmtInvalidTime = gmtInvalidTime;
            return this;
        }
        public String getGmtInvalidTime() {
            return this.gmtInvalidTime;
        }

        public QueryShortUrlListNewResponseBodyListRecord setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryShortUrlListNewResponseBodyListRecord setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryShortUrlListNewResponseBodyListRecord setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

        public QueryShortUrlListNewResponseBodyListRecord setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public QueryShortUrlListNewResponseBodyListRecord setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryShortUrlListNewResponseBodyListRecord setTotalPv(String totalPv) {
            this.totalPv = totalPv;
            return this;
        }
        public String getTotalPv() {
            return this.totalPv;
        }

        public QueryShortUrlListNewResponseBodyListRecord setTotalUv(String totalUv) {
            this.totalUv = totalUv;
            return this;
        }
        public String getTotalUv() {
            return this.totalUv;
        }

    }

    public static class QueryShortUrlListNewResponseBodyList extends TeaModel {
        @NameInMap("EventName")
        public String eventName;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtInvalidTime")
        public String gmtInvalidTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Record")
        public java.util.List<QueryShortUrlListNewResponseBodyListRecord> record;

        @NameInMap("ShortUrl")
        public String shortUrl;

        @NameInMap("SourceUrl")
        public String sourceUrl;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TotalPv")
        public String totalPv;

        @NameInMap("TotalUv")
        public String totalUv;

        public static QueryShortUrlListNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryShortUrlListNewResponseBodyList self = new QueryShortUrlListNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryShortUrlListNewResponseBodyList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public QueryShortUrlListNewResponseBodyList setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public QueryShortUrlListNewResponseBodyList setGmtInvalidTime(String gmtInvalidTime) {
            this.gmtInvalidTime = gmtInvalidTime;
            return this;
        }
        public String getGmtInvalidTime() {
            return this.gmtInvalidTime;
        }

        public QueryShortUrlListNewResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryShortUrlListNewResponseBodyList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryShortUrlListNewResponseBodyList setRecord(java.util.List<QueryShortUrlListNewResponseBodyListRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<QueryShortUrlListNewResponseBodyListRecord> getRecord() {
            return this.record;
        }

        public QueryShortUrlListNewResponseBodyList setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

        public QueryShortUrlListNewResponseBodyList setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public QueryShortUrlListNewResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryShortUrlListNewResponseBodyList setTotalPv(String totalPv) {
            this.totalPv = totalPv;
            return this;
        }
        public String getTotalPv() {
            return this.totalPv;
        }

        public QueryShortUrlListNewResponseBodyList setTotalUv(String totalUv) {
            this.totalUv = totalUv;
            return this;
        }
        public String getTotalUv() {
            return this.totalUv;
        }

    }

}
