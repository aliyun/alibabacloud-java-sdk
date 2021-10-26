// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryShortUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryShortUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryShortUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryShortUrlResponseBody self = new QueryShortUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryShortUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryShortUrlResponseBody setData(QueryShortUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryShortUrlResponseBodyData getData() {
        return this.data;
    }

    public QueryShortUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryShortUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryShortUrlResponseBodyData extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("PageViewCount")
        public String pageViewCount;

        @NameInMap("ShortUrl")
        public String shortUrl;

        @NameInMap("ShortUrlName")
        public String shortUrlName;

        @NameInMap("ShortUrlStatus")
        public String shortUrlStatus;

        @NameInMap("SourceUrl")
        public String sourceUrl;

        @NameInMap("UniqueVisitorCount")
        public String uniqueVisitorCount;

        public static QueryShortUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryShortUrlResponseBodyData self = new QueryShortUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryShortUrlResponseBodyData setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryShortUrlResponseBodyData setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public QueryShortUrlResponseBodyData setPageViewCount(String pageViewCount) {
            this.pageViewCount = pageViewCount;
            return this;
        }
        public String getPageViewCount() {
            return this.pageViewCount;
        }

        public QueryShortUrlResponseBodyData setShortUrl(String shortUrl) {
            this.shortUrl = shortUrl;
            return this;
        }
        public String getShortUrl() {
            return this.shortUrl;
        }

        public QueryShortUrlResponseBodyData setShortUrlName(String shortUrlName) {
            this.shortUrlName = shortUrlName;
            return this;
        }
        public String getShortUrlName() {
            return this.shortUrlName;
        }

        public QueryShortUrlResponseBodyData setShortUrlStatus(String shortUrlStatus) {
            this.shortUrlStatus = shortUrlStatus;
            return this;
        }
        public String getShortUrlStatus() {
            return this.shortUrlStatus;
        }

        public QueryShortUrlResponseBodyData setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public QueryShortUrlResponseBodyData setUniqueVisitorCount(String uniqueVisitorCount) {
            this.uniqueVisitorCount = uniqueVisitorCount;
            return this;
        }
        public String getUniqueVisitorCount() {
            return this.uniqueVisitorCount;
        }

    }

}
