// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSSLCertificateListResponseBody extends TeaModel {
    /**
     * <p>The list of certificates.</p>
     */
    @NameInMap("CertificateListModel")
    public DescribeCdnSSLCertificateListResponseBodyCertificateListModel certificateListModel;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E9D3257A-1B7C-414C-90C1-8D07AC47BCAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnSSLCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSSLCertificateListResponseBody self = new DescribeCdnSSLCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSSLCertificateListResponseBody setCertificateListModel(DescribeCdnSSLCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeCdnSSLCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public DescribeCdnSSLCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert extends TeaModel {
        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>9128192</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>yourCertName</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The region ID of the certificate. Valid values: <strong>cn-hangzhou</strong> and <strong>ap-southeast-1</strong>. Default value: <strong>cn-hangzhou</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("CertRegion")
        public String certRegion;

        /**
         * <p>The Common Name (CN) attribute of the certificate. In most cases, the CN is a domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Common")
        public String common;

        /**
         * <p>The fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>933c6ddee95c9c41a40f9f50493d82be03ad87bf</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>yourCertIssuer</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The time when the certificate was last modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1679896965</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        public static DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert setCertRegion(String certRegion) {
            this.certRegion = certRegion;
            return this;
        }
        public String getCertRegion() {
            return this.certRegion;
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

    }

    public static class DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        @NameInMap("Cert")
        public java.util.List<DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert> cert;

        public static DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertList self = new DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertList setCert(java.util.List<DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert> cert) {
            this.cert = cert;
            return this;
        }
        public java.util.List<DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertListCert> getCert() {
            return this.cert;
        }

    }

    public static class DescribeCdnSSLCertificateListResponseBodyCertificateListModel extends TeaModel {
        /**
         * <p>Details about each certificate.</p>
         */
        @NameInMap("CertList")
        public DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertList certList;

        /**
         * <p>The number of certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page. Valid values: an integer from 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        public static DescribeCdnSSLCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnSSLCertificateListResponseBodyCertificateListModel self = new DescribeCdnSSLCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModel setCertList(DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertList certList) {
            this.certList = certList;
            return this;
        }
        public DescribeCdnSSLCertificateListResponseBodyCertificateListModelCertList getCertList() {
            return this.certList;
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModel setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeCdnSSLCertificateListResponseBodyCertificateListModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
