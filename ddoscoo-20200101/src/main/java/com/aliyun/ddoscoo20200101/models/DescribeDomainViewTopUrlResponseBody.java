// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewTopUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Url")
        public String url;

        @NameInMap("Count")
        public Long count;

        public static DescribeDomainViewTopUrlResponseBodyUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainViewTopUrlResponseBodyUrlList self = new DescribeDomainViewTopUrlResponseBodyUrlList();
            return TeaModel.build(map, self);
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

        public DescribeDomainViewTopUrlResponseBodyUrlList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
