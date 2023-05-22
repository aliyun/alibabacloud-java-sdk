// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnHttpsDomainListResponseBody extends TeaModel {
    /**
     * <p>The time when the certificate became effective.</p>
     */
    @NameInMap("CertInfos")
    public DescribeDcdnHttpsDomainListResponseBodyCertInfos certInfos;

    /**
     * <p>The returned primary domain name of the certificate.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries to return on each page. Valid values: **1 to 500**. Default value: **20**.</p>
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
         * <p>The certificate information about the domain name.</p>
         */
        @NameInMap("CertCommonName")
        public String certCommonName;

        /**
         * <p>The name of the certificate.</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>The accelerated domain name for which the certificate information was queried.</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The time when the certificate expires.</p>
         */
        @NameInMap("CertStartTime")
        public String certStartTime;

        /**
         * <p>The number of pages to return. Valid values: **1 to 100000**.</p>
         */
        @NameInMap("CertStatus")
        public String certStatus;

        /**
         * <p>The operation that you want to perform. Set the value to **DescribeDcdnHttpsDomainList**.</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The keyword used for search.</p>
         */
        @NameInMap("CertUpdateTime")
        public String certUpdateTime;

        /**
         * <p>The time when the certificate was updated.</p>
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
