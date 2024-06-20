// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeCertsResponseBody extends TeaModel {
    /**
     * <p>The certificate information about the website.</p>
     */
    @NameInMap("Certs")
    public java.util.List<DescribeCertsResponseBodyCerts> certs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertsResponseBody self = new DescribeCertsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertsResponseBody setCerts(java.util.List<DescribeCertsResponseBodyCerts> certs) {
        this.certs = certs;
        return this;
    }
    public java.util.List<DescribeCertsResponseBodyCerts> getCerts() {
        return this.certs;
    }

    public DescribeCertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCertsResponseBodyCerts extends TeaModel {
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The domain name that is associated with the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Common")
        public String common;

        /**
         * <p>Indicates whether the certificate is associated with the domain name. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The certificate is associated with the domain name.</li>
         * <li><strong>false</strong>: The certificate is not associated with the domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DomainRelated")
        public Boolean domainRelated;

        /**
         * <p>The expiration date of the certificate. string</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-12</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Symantec</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>testcert</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The issuance date of the certificate. string</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-12</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        public static DescribeCertsResponseBodyCerts build(java.util.Map<String, ?> map) throws Exception {
            DescribeCertsResponseBodyCerts self = new DescribeCertsResponseBodyCerts();
            return TeaModel.build(map, self);
        }

        public DescribeCertsResponseBodyCerts setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public DescribeCertsResponseBodyCerts setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeCertsResponseBodyCerts setDomainRelated(Boolean domainRelated) {
            this.domainRelated = domainRelated;
            return this;
        }
        public Boolean getDomainRelated() {
            return this.domainRelated;
        }

        public DescribeCertsResponseBodyCerts setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeCertsResponseBodyCerts setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeCertsResponseBodyCerts setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeCertsResponseBodyCerts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCertsResponseBodyCerts setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

}
