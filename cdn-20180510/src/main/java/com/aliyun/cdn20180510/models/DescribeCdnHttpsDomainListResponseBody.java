// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnHttpsDomainListResponseBody extends TeaModel {
    /**
     * <p>The information about the certificate.</p>
     */
    @NameInMap("CertInfos")
    public DescribeCdnHttpsDomainListResponseBodyCertInfos certInfos;

    /**
     * <p>The ID of the request.</p>
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

    public static DescribeCdnHttpsDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnHttpsDomainListResponseBody self = new DescribeCdnHttpsDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnHttpsDomainListResponseBody setCertInfos(DescribeCdnHttpsDomainListResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeCdnHttpsDomainListResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeCdnHttpsDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnHttpsDomainListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo extends TeaModel {
        /**
         * <p>The returned primary domain name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>example.org</p>
         */
        @NameInMap("CertCommonName")
        public String certCommonName;

        /**
         * <p>The time at which the certificate expires.</p>
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
         * <p>The time at which the certificate became effective.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-26 14:45:09</p>
         */
        @NameInMap("CertStartTime")
        public String certStartTime;

        /**
         * <p>The status of the certificate.</p>
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
         * <p>The type of the certificate.</p>
         * <ul>
         * <li><strong>free</strong>: a free certificate.</li>
         * <li><strong>cas</strong>: a certificate that is purchased from Alibaba Cloud SSL Certificates Service.</li>
         * <li><strong>upload</strong>: a certificate that is uploaded by the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The time at which the certificate was updated.</p>
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

        public static DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo self = new DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo setCertCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }
        public String getCertCommonName() {
            return this.certCommonName;
        }

        public DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo setCertStatus(String certStatus) {
            this.certStatus = certStatus;
            return this;
        }
        public String getCertStatus() {
            return this.certStatus;
        }

        public DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo setCertUpdateTime(String certUpdateTime) {
            this.certUpdateTime = certUpdateTime;
            return this;
        }
        public String getCertUpdateTime() {
            return this.certUpdateTime;
        }

        public DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribeCdnHttpsDomainListResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeCdnHttpsDomainListResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnHttpsDomainListResponseBodyCertInfos self = new DescribeCdnHttpsDomainListResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCdnHttpsDomainListResponseBodyCertInfos setCertInfo(java.util.List<DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeCdnHttpsDomainListResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
