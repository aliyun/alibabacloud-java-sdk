// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNetworkPackagesResponseBody extends TeaModel {
    @NameInMap("NetworkPackages")
    public java.util.List<DescribeNetworkPackagesResponseBodyNetworkPackages> networkPackages;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNetworkPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkPackagesResponseBody self = new DescribeNetworkPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkPackagesResponseBody setNetworkPackages(java.util.List<DescribeNetworkPackagesResponseBodyNetworkPackages> networkPackages) {
        this.networkPackages = networkPackages;
        return this;
    }
    public java.util.List<DescribeNetworkPackagesResponseBodyNetworkPackages> getNetworkPackages() {
        return this.networkPackages;
    }

    public DescribeNetworkPackagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNetworkPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNetworkPackagesResponseBodyNetworkPackages extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EipAddresses")
        public java.util.List<String> eipAddresses;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("NetworkPackageId")
        public String networkPackageId;

        @NameInMap("NetworkPackageStatus")
        public String networkPackageStatus;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        @NameInMap("OfficeSiteVpcType")
        public String officeSiteVpcType;

        public static DescribeNetworkPackagesResponseBodyNetworkPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkPackagesResponseBodyNetworkPackages self = new DescribeNetworkPackagesResponseBodyNetworkPackages();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setEipAddresses(java.util.List<String> eipAddresses) {
            this.eipAddresses = eipAddresses;
            return this;
        }
        public java.util.List<String> getEipAddresses() {
            return this.eipAddresses;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setNetworkPackageId(String networkPackageId) {
            this.networkPackageId = networkPackageId;
            return this;
        }
        public String getNetworkPackageId() {
            return this.networkPackageId;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setNetworkPackageStatus(String networkPackageStatus) {
            this.networkPackageStatus = networkPackageStatus;
            return this;
        }
        public String getNetworkPackageStatus() {
            return this.networkPackageStatus;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeNetworkPackagesResponseBodyNetworkPackages setOfficeSiteVpcType(String officeSiteVpcType) {
            this.officeSiteVpcType = officeSiteVpcType;
            return this;
        }
        public String getOfficeSiteVpcType() {
            return this.officeSiteVpcType;
        }

    }

}
