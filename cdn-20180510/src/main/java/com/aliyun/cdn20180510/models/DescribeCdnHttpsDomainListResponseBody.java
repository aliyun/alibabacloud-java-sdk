// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnHttpsDomainListResponseBody extends TeaModel {
    // The information about the SSL certificate.
    @NameInMap("CertInfos")
    public DescribeCdnHttpsDomainListResponseBodyCertInfos certInfos;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
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
        // The Common Name on the SSL certificate.
        @NameInMap("CertCommonName")
        public String certCommonName;

        // The time when the SSL certificate expires.
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        // The name of the SSL certificate.
        @NameInMap("CertName")
        public String certName;

        // The time when the SSL certificate became effective.
        @NameInMap("CertStartTime")
        public String certStartTime;

        // The status of the SSL certificate. Valid values:
        // 
        // *   **ok**: The SSL certificate is working as expected.
        // *   **mismatch**: The SSL certificate does not match the specified domain name.
        // *   **expired**: The SSL certificate has expired.
        // *   **expire_soon**: The SSL certificate will expire soon.
        @NameInMap("CertStatus")
        public String certStatus;

        // The type of the SSL certificate. Valid values:
        // 
        // *   **free**: a free SSL certificate.
        // *   **cas**: an SSL certificate purchased from Alibaba Cloud SSL Certificates Service.
        // *   **upload**: a user uploaded certificate.
        @NameInMap("CertType")
        public String certType;

        // The time when the certificate was renewed.
        @NameInMap("CertUpdateTime")
        public String certUpdateTime;

        // The accelerated domain name.
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
