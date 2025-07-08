// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryShortUrlDetailNewResponseBody extends TeaModel {
    @NameInMap("EventName")
    public String eventName;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtInvalidTime")
    public String gmtInvalidTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("Record")
    public java.util.List<QueryShortUrlDetailNewResponseBodyRecord> record;

    @NameInMap("RequestId")
    public String requestId;

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

    public static QueryShortUrlDetailNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryShortUrlDetailNewResponseBody self = new QueryShortUrlDetailNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryShortUrlDetailNewResponseBody setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public QueryShortUrlDetailNewResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public QueryShortUrlDetailNewResponseBody setGmtInvalidTime(String gmtInvalidTime) {
        this.gmtInvalidTime = gmtInvalidTime;
        return this;
    }
    public String getGmtInvalidTime() {
        return this.gmtInvalidTime;
    }

    public QueryShortUrlDetailNewResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryShortUrlDetailNewResponseBody setRecord(java.util.List<QueryShortUrlDetailNewResponseBodyRecord> record) {
        this.record = record;
        return this;
    }
    public java.util.List<QueryShortUrlDetailNewResponseBodyRecord> getRecord() {
        return this.record;
    }

    public QueryShortUrlDetailNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryShortUrlDetailNewResponseBody setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }
    public String getShortUrl() {
        return this.shortUrl;
    }

    public QueryShortUrlDetailNewResponseBody setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public QueryShortUrlDetailNewResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryShortUrlDetailNewResponseBody setTotalPv(String totalPv) {
        this.totalPv = totalPv;
        return this;
    }
    public String getTotalPv() {
        return this.totalPv;
    }

    public QueryShortUrlDetailNewResponseBody setTotalUv(String totalUv) {
        this.totalUv = totalUv;
        return this;
    }
    public String getTotalUv() {
        return this.totalUv;
    }

    public static class QueryShortUrlDetailNewResponseBodyRecord extends TeaModel {
        @NameInMap("EventName")
        public String eventName;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtInvalidTime")
        public String gmtInvalidTime;

        @NameInMap("Id")
        public String id;

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

        public static QueryShortUrlDetailNewResponseBodyRecord build(java.util.Map<String, ?> map) throws Exception {
            QueryShortUrlDetailNewResponseBodyRecord self = new QueryShortUrlDetailNewResponseBodyRecord();
            return TeaModel.build(map, self);
        }

        public QueryShortUrlDetailNewResponseBodyRecord setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public QueryShortUrlDetailNewResponseBodyRecord setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public QueryShortUrlDetailNewResponseBodyRecord setGmtInvalidTime(String gmtInvalidTime) {
            this.gmtInvalidTime = gmtInvalidTime;
            return this;
        }
        public String getGmtInvalidTime() {
            return this.gmtInvalidTime;
        }

        public QueryShortUrlDetailNewResponseBodyRecord setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryShortUrlDetailNewResponseBodyRecord setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

        public QueryShortUrlDetailNewResponseBodyRecord setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public QueryShortUrlDetailNewResponseBodyRecord setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryShortUrlDetailNewResponseBodyRecord setTotalPv(String totalPv) {
            this.totalPv = totalPv;
            return this;
        }
        public String getTotalPv() {
            return this.totalPv;
        }

        public QueryShortUrlDetailNewResponseBodyRecord setTotalUv(String totalUv) {
            this.totalUv = totalUv;
            return this;
        }
        public String getTotalUv() {
            return this.totalUv;
        }

    }

}
