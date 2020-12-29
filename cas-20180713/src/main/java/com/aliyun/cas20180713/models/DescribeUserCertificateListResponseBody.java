// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DescribeUserCertificateListResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("CertificateList")
    public java.util.List<DescribeUserCertificateListResponseBodyCertificateList> certificateList;

    @NameInMap("ShowSize")
    public Integer showSize;

    public static DescribeUserCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCertificateListResponseBody self = new DescribeUserCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserCertificateListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUserCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserCertificateListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUserCertificateListResponseBody setCertificateList(java.util.List<DescribeUserCertificateListResponseBodyCertificateList> certificateList) {
        this.certificateList = certificateList;
        return this;
    }
    public java.util.List<DescribeUserCertificateListResponseBodyCertificateList> getCertificateList() {
        return this.certificateList;
    }

    public DescribeUserCertificateListResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public static class DescribeUserCertificateListResponseBodyCertificateList extends TeaModel {
        @NameInMap("startDate")
        public String startDate;

        @NameInMap("province")
        public String province;

        @NameInMap("sans")
        public String sans;

        @NameInMap("common")
        public String common;

        @NameInMap("id")
        public Long id;

        @NameInMap("country")
        public String country;

        @NameInMap("issuer")
        public String issuer;

        @NameInMap("buyInAliyun")
        public Boolean buyInAliyun;

        @NameInMap("endDate")
        public String endDate;

        @NameInMap("expired")
        public Boolean expired;

        @NameInMap("fingerprint")
        public String fingerprint;

        @NameInMap("name")
        public String name;

        @NameInMap("city")
        public String city;

        @NameInMap("orgName")
        public String orgName;

        public static DescribeUserCertificateListResponseBodyCertificateList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserCertificateListResponseBodyCertificateList self = new DescribeUserCertificateListResponseBodyCertificateList();
            return TeaModel.build(map, self);
        }

        public DescribeUserCertificateListResponseBodyCertificateList setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setSans(String sans) {
            this.sans = sans;
            return this;
        }
        public String getSans() {
            return this.sans;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setBuyInAliyun(Boolean buyInAliyun) {
            this.buyInAliyun = buyInAliyun;
            return this;
        }
        public Boolean getBuyInAliyun() {
            return this.buyInAliyun;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribeUserCertificateListResponseBodyCertificateList setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

    }

}
