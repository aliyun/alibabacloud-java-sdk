// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopRefererResponseBody extends TeaModel {
    @NameInMap("DomainTopReferer")
    public java.util.List<DescribeDomainTopRefererResponseBodyDomainTopReferer> domainTopReferer;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainTopRefererResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopRefererResponseBody self = new DescribeDomainTopRefererResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopRefererResponseBody setDomainTopReferer(java.util.List<DescribeDomainTopRefererResponseBodyDomainTopReferer> domainTopReferer) {
        this.domainTopReferer = domainTopReferer;
        return this;
    }
    public java.util.List<DescribeDomainTopRefererResponseBodyDomainTopReferer> getDomainTopReferer() {
        return this.domainTopReferer;
    }

    public DescribeDomainTopRefererResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainTopRefererResponseBodyDomainTopReferer extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>257031</p>
         */
        @NameInMap("Pv")
        public Long pv;

        /**
         * <strong>example:</strong>
         * <p>aHR0cHM6Ly9zZXJ2aWNld2VjaGF0LmNvbS93eGY3ZDc5YWY0YzU4ZDH3NTEvNC9wYWdlLWZyYW1lLmh0bWw=</p>
         */
        @NameInMap("Referer")
        public String referer;

        public static DescribeDomainTopRefererResponseBodyDomainTopReferer build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopRefererResponseBodyDomainTopReferer self = new DescribeDomainTopRefererResponseBodyDomainTopReferer();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopRefererResponseBodyDomainTopReferer setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainTopRefererResponseBodyDomainTopReferer setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public DescribeDomainTopRefererResponseBodyDomainTopReferer setReferer(String referer) {
            this.referer = referer;
            return this;
        }
        public String getReferer() {
            return this.referer;
        }

    }

}
