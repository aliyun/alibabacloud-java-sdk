// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnHttpsDomainListResponseBody extends TeaModel {
    @NameInMap("CertInfos")
    public DescribeDcdnHttpsDomainListResponseBodyCertInfos certInfos;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

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

    public DescribeDcdnHttpsDomainListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDcdnHttpsDomainListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo extends TeaModel {
        @NameInMap("CertStartTime")
        public String certStartTime;

        @NameInMap("CertExpireTime")
        public String certExpireTime;

        @NameInMap("CertUpdateTime")
        public String certUpdateTime;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CertStatus")
        public String certStatus;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("CertCommonName")
        public String certCommonName;

        public static DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo self = new DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertUpdateTime(String certUpdateTime) {
            this.certUpdateTime = certUpdateTime;
            return this;
        }
        public String getCertUpdateTime() {
            return this.certUpdateTime;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertStatus(String certStatus) {
            this.certStatus = certStatus;
            return this;
        }
        public String getCertStatus() {
            return this.certStatus;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnHttpsDomainListResponseBodyCertInfosCertInfo setCertCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }
        public String getCertCommonName() {
            return this.certCommonName;
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
