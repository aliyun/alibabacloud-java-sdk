// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopFingerprintResponseBody extends TeaModel {
    /**
     * <p>The information about the fingerprints of the clients.</p>
     */
    @NameInMap("DomainTopFp")
    public java.util.List<DescribeDomainTopFingerprintResponseBodyDomainTopFp> domainTopFp;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainTopFingerprintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopFingerprintResponseBody self = new DescribeDomainTopFingerprintResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopFingerprintResponseBody setDomainTopFp(java.util.List<DescribeDomainTopFingerprintResponseBodyDomainTopFp> domainTopFp) {
        this.domainTopFp = domainTopFp;
        return this;
    }
    public java.util.List<DescribeDomainTopFingerprintResponseBodyDomainTopFp> getDomainTopFp() {
        return this.domainTopFp;
    }

    public DescribeDomainTopFingerprintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainTopFingerprintResponseBodyDomainTopFp extends TeaModel {
        /**
         * <p>The domain name of the website.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The fingerprint of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>8a374c9724582b14a4cfa58c8c9fb2bc</p>
         */
        @NameInMap("Fingerprinting")
        public String fingerprinting;

        /**
         * <p>The page views.</p>
         * 
         * <strong>example:</strong>
         * <p>22121</p>
         */
        @NameInMap("Pv")
        public Long pv;

        public static DescribeDomainTopFingerprintResponseBodyDomainTopFp build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopFingerprintResponseBodyDomainTopFp self = new DescribeDomainTopFingerprintResponseBodyDomainTopFp();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopFingerprintResponseBodyDomainTopFp setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainTopFingerprintResponseBodyDomainTopFp setFingerprinting(String fingerprinting) {
            this.fingerprinting = fingerprinting;
            return this;
        }
        public String getFingerprinting() {
            return this.fingerprinting;
        }

        public DescribeDomainTopFingerprintResponseBodyDomainTopFp setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

    }

}
