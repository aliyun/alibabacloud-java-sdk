// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainH2FingerprintResponseBody extends TeaModel {
    @NameInMap("DomainH2Fp")
    public java.util.List<DescribeDomainH2FingerprintResponseBodyDomainH2Fp> domainH2Fp;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainH2FingerprintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainH2FingerprintResponseBody self = new DescribeDomainH2FingerprintResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainH2FingerprintResponseBody setDomainH2Fp(java.util.List<DescribeDomainH2FingerprintResponseBodyDomainH2Fp> domainH2Fp) {
        this.domainH2Fp = domainH2Fp;
        return this;
    }
    public java.util.List<DescribeDomainH2FingerprintResponseBodyDomainH2Fp> getDomainH2Fp() {
        return this.domainH2Fp;
    }

    public DescribeDomainH2FingerprintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainH2FingerprintResponseBodyDomainH2Fp extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("H2Fingerprint")
        public String h2Fingerprint;

        @NameInMap("Pv")
        public Long pv;

        public static DescribeDomainH2FingerprintResponseBodyDomainH2Fp build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainH2FingerprintResponseBodyDomainH2Fp self = new DescribeDomainH2FingerprintResponseBodyDomainH2Fp();
            return TeaModel.build(map, self);
        }

        public DescribeDomainH2FingerprintResponseBodyDomainH2Fp setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainH2FingerprintResponseBodyDomainH2Fp setH2Fingerprint(String h2Fingerprint) {
            this.h2Fingerprint = h2Fingerprint;
            return this;
        }
        public String getH2Fingerprint() {
            return this.h2Fingerprint;
        }

        public DescribeDomainH2FingerprintResponseBodyDomainH2Fp setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

    }

}
