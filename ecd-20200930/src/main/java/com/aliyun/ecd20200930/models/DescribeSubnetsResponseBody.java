// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSubnetsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Subnets")
    public java.util.List<DescribeSubnetsResponseBodySubnets> subnets;

    public static DescribeSubnetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubnetsResponseBody self = new DescribeSubnetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubnetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSubnetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubnetsResponseBody setSubnets(java.util.List<DescribeSubnetsResponseBodySubnets> subnets) {
        this.subnets = subnets;
        return this;
    }
    public java.util.List<DescribeSubnetsResponseBodySubnets> getSubnets() {
        return this.subnets;
    }

    public static class DescribeSubnetsResponseBodySubnets extends TeaModel {
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Name")
        public String name;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubnetId")
        public String subnetId;

        @NameInMap("TotalEdsCount")
        public Integer totalEdsCount;

        @NameInMap("TotalEdsCountForGroup")
        public Integer totalEdsCountForGroup;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeSubnetsResponseBodySubnets build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubnetsResponseBodySubnets self = new DescribeSubnetsResponseBodySubnets();
            return TeaModel.build(map, self);
        }

        public DescribeSubnetsResponseBodySubnets setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeSubnetsResponseBodySubnets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSubnetsResponseBodySubnets setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeSubnetsResponseBodySubnets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSubnetsResponseBodySubnets setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

        public DescribeSubnetsResponseBodySubnets setTotalEdsCount(Integer totalEdsCount) {
            this.totalEdsCount = totalEdsCount;
            return this;
        }
        public Integer getTotalEdsCount() {
            return this.totalEdsCount;
        }

        public DescribeSubnetsResponseBodySubnets setTotalEdsCountForGroup(Integer totalEdsCountForGroup) {
            this.totalEdsCountForGroup = totalEdsCountForGroup;
            return this;
        }
        public Integer getTotalEdsCountForGroup() {
            return this.totalEdsCountForGroup;
        }

        public DescribeSubnetsResponseBodySubnets setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
