// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewTopCostTimeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The URLs which require the longest time to respond to requests.</p>
     */
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
        /**
         * <p>The response duration. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("CostTime")
        public Float costTime;

        /**
         * <p>The domain name of the website.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The URL that is Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>Lw==</p>
         */
        @NameInMap("Url")
        public String url;

        public static DescribeDomainViewTopCostTimeResponseBodyUrlList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainViewTopCostTimeResponseBodyUrlList self = new DescribeDomainViewTopCostTimeResponseBodyUrlList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainViewTopCostTimeResponseBodyUrlList setCostTime(Float costTime) {
            this.costTime = costTime;
            return this;
        }
        public Float getCostTime() {
            return this.costTime;
        }

        public DescribeDomainViewTopCostTimeResponseBodyUrlList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
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
