// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewTopCostTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UrlList")
    public java.util.List<DescribeDomainViewTopCostTimeResponseBodyUrlList> urlList;

    public static DescribeDomainViewTopCostTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewTopCostTimeResponseBody self = new DescribeDomainViewTopCostTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewTopCostTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainViewTopCostTimeResponseBody setUrlList(java.util.List<DescribeDomainViewTopCostTimeResponseBodyUrlList> urlList) {
        this.urlList = urlList;
        return this;
    }
    public java.util.List<DescribeDomainViewTopCostTimeResponseBodyUrlList> getUrlList() {
        return this.urlList;
    }

    public static class DescribeDomainViewTopCostTimeResponseBodyUrlList extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("CostTime")
        public Float costTime;

        @NameInMap("Url")
        public String url;

        public static DescribeDomainViewTopCostTimeResponseBodyUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainViewTopCostTimeResponseBodyUrlList self = new DescribeDomainViewTopCostTimeResponseBodyUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainViewTopCostTimeResponseBodyUrlList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainViewTopCostTimeResponseBodyUrlList setCostTime(Float costTime) {
            this.costTime = costTime;
            return this;
        }
        public Float getCostTime() {
            return this.costTime;
        }

        public DescribeDomainViewTopCostTimeResponseBodyUrlList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
