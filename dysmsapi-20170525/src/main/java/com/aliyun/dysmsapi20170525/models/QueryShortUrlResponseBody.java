// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryShortUrlResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>A successful request returns <code>OK</code>.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the short link.</p>
     */
    @NameInMap("Data")
    public QueryShortUrlResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>819BE656-D2E0-4858-8B21-B2E477085AAF</p>
     */
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
        /**
         * <p>The creation date and time of the short link.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-08 16:44:13</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The expiration date and time of the short link.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-22 11:21:11</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>The page view (PV) count for the short link.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("PageViewCount")
        public String pageViewCount;

        /**
         * <p>The generated short link.</p>
         * 
         * <strong>example:</strong>
         * <p>http://****.cn/6y8uy7</p>
         */
        @NameInMap("ShortUrl")
        public String shortUrl;

        /**
         * <p>The name of the service that generated the short link.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里短链测试</p>
         */
        @NameInMap("ShortUrlName")
        public String shortUrlName;

        /**
         * <p>The short link status. Valid values:</p>
         * <ul>
         * <li><p><strong>expired</strong>: The short link has expired.</p>
         * </li>
         * <li><p><strong>effective</strong>: The short link is active.</p>
         * </li>
         * <li><p><strong>audit</strong>: The short link is under review.</p>
         * </li>
         * <li><p><strong>reject</strong>: The short link was rejected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>expired</p>
         */
        @NameInMap("ShortUrlStatus")
        public String shortUrlStatus;

        /**
         * <p>The source URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.****.com/product/sms">https://www.****.com/product/sms</a></p>
         */
        @NameInMap("SourceUrl")
        public String sourceUrl;

        /**
         * <p>The unique visitor (UV) count for the short link.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
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
