// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewTopUrlResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of the URLs that receive the most requests.</p>
     */
    @NameInMap("UrlList")
    public java.util.List<DescribeDomainViewTopUrlResponseBodyUrlList> urlList;

    public static DescribeDomainViewTopUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewTopUrlResponseBody self = new DescribeDomainViewTopUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewTopUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainViewTopUrlResponseBody setUrlList(java.util.List<DescribeDomainViewTopUrlResponseBodyUrlList> urlList) {
        this.urlList = urlList;
        return this;
    }
    public java.util.List<DescribeDomainViewTopUrlResponseBodyUrlList> getUrlList() {
        return this.urlList;
    }

    public static class DescribeDomainViewTopUrlResponseBodyUrlList extends TeaModel {
        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The domain name of the website.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The URL that is Base64-encoded.</p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeDomainViewTopUrlResponseBodyUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainViewTopUrlResponseBodyUrlList self = new DescribeDomainViewTopUrlResponseBodyUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainViewTopUrlResponseBodyUrlList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeDomainViewTopUrlResponseBodyUrlList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainViewTopUrlResponseBodyUrlList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
