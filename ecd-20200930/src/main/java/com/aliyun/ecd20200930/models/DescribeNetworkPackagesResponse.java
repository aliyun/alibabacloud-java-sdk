// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNetworkPackagesResponse extends TeaModel {
    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NetworkPackages")
    @Validation(required = true)
    public java.util.List<DescribeNetworkPackagesResponseNetworkPackages> networkPackages;

    public static DescribeNetworkPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkPackagesResponse self = new DescribeNetworkPackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkPackagesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNetworkPackagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkPackagesResponse setNetworkPackages(java.util.List<DescribeNetworkPackagesResponseNetworkPackages> networkPackages) {
        this.networkPackages = networkPackages;
        return this;
    }
    public java.util.List<DescribeNetworkPackagesResponseNetworkPackages> getNetworkPackages() {
        return this.networkPackages;
    }

    public static class DescribeNetworkPackagesResponseNetworkPackages extends TeaModel {
        @NameInMap("NetworkPackageId")
        @Validation(required = true)
        public String networkPackageId;

        @NameInMap("OfficeSiteId")
        @Validation(required = true)
        public String officeSiteId;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Integer bandwidth;

        @NameInMap("NetworkPackageStatus")
        @Validation(required = true)
        public String networkPackageStatus;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static DescribeNetworkPackagesResponseNetworkPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkPackagesResponseNetworkPackages self = new DescribeNetworkPackagesResponseNetworkPackages();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkPackagesResponseNetworkPackages setNetworkPackageId(String networkPackageId) {
            this.networkPackageId = networkPackageId;
            return this;
        }
        public String getNetworkPackageId() {
            return this.networkPackageId;
        }

        public DescribeNetworkPackagesResponseNetworkPackages setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeNetworkPackagesResponseNetworkPackages setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeNetworkPackagesResponseNetworkPackages setNetworkPackageStatus(String networkPackageStatus) {
            this.networkPackageStatus = networkPackageStatus;
            return this;
        }
        public String getNetworkPackageStatus() {
            return this.networkPackageStatus;
        }

        public DescribeNetworkPackagesResponseNetworkPackages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
