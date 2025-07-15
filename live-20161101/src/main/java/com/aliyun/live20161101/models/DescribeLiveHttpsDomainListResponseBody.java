// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveHttpsDomainListResponseBody extends TeaModel {
    /**
     * <p>The information about the certificates.</p>
     */
    @NameInMap("CertInfos")
    public DescribeLiveHttpsDomainListResponseBodyCertInfos certInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F5E8DF64-7175-4186-9B06-F002C0BBD0C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLiveHttpsDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveHttpsDomainListResponseBody self = new DescribeLiveHttpsDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveHttpsDomainListResponseBody setCertInfos(DescribeLiveHttpsDomainListResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeLiveHttpsDomainListResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeLiveHttpsDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveHttpsDomainListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo extends TeaModel {
        /**
         * <p>The primary domain name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>example.org</p>
         */
        @NameInMap("CertCommonName")
        public String certCommonName;

        /**
         * <p>The time when the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-26 14:45:09</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The time when the certificate became effective.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-26 14:45:09</p>
         */
        @NameInMap("CertStartTime")
        public String certStartTime;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>ok</strong>: The certificate is working as expected.</li>
         * <li><strong>mismatch</strong>: The certificate does not match the specified domain name.</li>
         * <li><strong>expired</strong>: The certificate has expired.</li>
         * <li><strong>expire_soon</strong>: The certificate will expire soon.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mismatch</p>
         */
        @NameInMap("CertStatus")
        public String certStatus;

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>cas</strong>: a certificate that you purchased from Certificate Management Service</li>
         * <li><strong>upload</strong>: a custom certificate that you uploaded</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cas</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The time when the certificate was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-08 18:33:16</p>
         */
        @NameInMap("CertUpdateTime")
        public String certUpdateTime;

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        public static DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo self = new DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo setCertCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }
        public String getCertCommonName() {
            return this.certCommonName;
        }

        public DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo setCertStatus(String certStatus) {
            this.certStatus = certStatus;
            return this;
        }
        public String getCertStatus() {
            return this.certStatus;
        }

        public DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo setCertUpdateTime(String certUpdateTime) {
            this.certUpdateTime = certUpdateTime;
            return this;
        }
        public String getCertUpdateTime() {
            return this.certUpdateTime;
        }

        public DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribeLiveHttpsDomainListResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeLiveHttpsDomainListResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveHttpsDomainListResponseBodyCertInfos self = new DescribeLiveHttpsDomainListResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveHttpsDomainListResponseBodyCertInfos setCertInfo(java.util.List<DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeLiveHttpsDomainListResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
