// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnHttpsDomainListResponseBody extends TeaModel {
    /**
     * <p>The information about the certificate.</p>
     */
    @NameInMap("CertInfos")
    public DescribeDcdnHttpsDomainListResponseBodyCertInfos certInfos;

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

    public static DescribeDcdnHttpsDomainListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnHttpsDomainListResponseBody self = new DescribeDcdnHttpsDomainListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnHttpsDomainListResponseBody setCertInfos(DescribeDcdnHttpsDomainListResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeDcdnHttpsDomainListResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeDcdnHttpsDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnHttpsDomainListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo extends TeaModel {
        /**
         * <p>The returned primary domain name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>*.com</p>
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
         * <p>cert</p>
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
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>ok</strong>: The certificate is working as expected.</li>
         * <li><strong>mismatch</strong>: The certificate does not match the specified domain name.</li>
         * <li><strong>expired</strong>: The certificate has expired.</li>
         * <li><strong>expire_soon</strong>: The certificate is about to expire.</li>
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
         * <li><strong>cas</strong>: a certificate that is purchased by using Certificate Management Service</li>
         * <li><strong>upload</strong>: a custom certificate that you upload</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>upload</p>
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
         * <p>*.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        public static DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo self = new DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }
        public String getCertCommonName() {
            return this.certCommonName;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertStatus(String certStatus) {
            this.certStatus = certStatus;
            return this;
        }
        public String getCertStatus() {
            return this.certStatus;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertUpdateTime(String certUpdateTime) {
            this.certUpdateTime = certUpdateTime;
            return this;
        }
        public String getCertUpdateTime() {
            return this.certUpdateTime;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribeDcdnHttpsDomainListResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeDcdnHttpsDomainListResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnHttpsDomainListResponseBodyCertInfos self = new DescribeDcdnHttpsDomainListResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfos setCertInfo(java.util.List<DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
