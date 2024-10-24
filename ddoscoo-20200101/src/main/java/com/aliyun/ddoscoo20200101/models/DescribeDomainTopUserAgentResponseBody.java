// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopUserAgentResponseBody extends TeaModel {
    @NameInMap("DomainTopUa")
    public java.util.List<DescribeDomainTopUserAgentResponseBodyDomainTopUa> domainTopUa;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainTopUserAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopUserAgentResponseBody self = new DescribeDomainTopUserAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopUserAgentResponseBody setDomainTopUa(java.util.List<DescribeDomainTopUserAgentResponseBodyDomainTopUa> domainTopUa) {
        this.domainTopUa = domainTopUa;
        return this;
    }
    public java.util.List<DescribeDomainTopUserAgentResponseBodyDomainTopUa> getDomainTopUa() {
        return this.domainTopUa;
    }

    public DescribeDomainTopUserAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainTopUserAgentResponseBodyDomainTopUa extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>22121</p>
         */
        @NameInMap("Pv")
        public Long pv;

        /**
         * <strong>example:</strong>
         * <p>TW96aWxsYS81LjAgKFgxMTsgTGludXggeDg2XzY0KSBBcHBsZVdlYktpdC81MzcuMzYgKEtIVE1MLCBsaWtlIEdlY2tvKSBDaHJvbWUvOTYuMC40NjY0LjExMCACYWZhcmkvNTM3LjM2</p>
         */
        @NameInMap("UserAgent")
        public String userAgent;

        public static DescribeDomainTopUserAgentResponseBodyDomainTopUa build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopUserAgentResponseBodyDomainTopUa self = new DescribeDomainTopUserAgentResponseBodyDomainTopUa();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopUserAgentResponseBodyDomainTopUa setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainTopUserAgentResponseBodyDomainTopUa setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public DescribeDomainTopUserAgentResponseBodyDomainTopUa setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }
        public String getUserAgent() {
            return this.userAgent;
        }

    }

}
