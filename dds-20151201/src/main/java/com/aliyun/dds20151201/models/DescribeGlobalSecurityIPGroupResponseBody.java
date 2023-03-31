// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeGlobalSecurityIPGroupResponseBody extends TeaModel {
    @NameInMap("GlobalSecurityIPGroup")
    public java.util.List<DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup> globalSecurityIPGroup;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGlobalSecurityIPGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalSecurityIPGroupResponseBody self = new DescribeGlobalSecurityIPGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalSecurityIPGroupResponseBody setGlobalSecurityIPGroup(java.util.List<DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup> globalSecurityIPGroup) {
        this.globalSecurityIPGroup = globalSecurityIPGroup;
        return this;
    }
    public java.util.List<DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup> getGlobalSecurityIPGroup() {
        return this.globalSecurityIPGroup;
    }

    public DescribeGlobalSecurityIPGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup extends TeaModel {
        @NameInMap("DBInstances")
        public java.util.List<String> DBInstances;

        @NameInMap("GIpList")
        public String GIpList;

        @NameInMap("GlobalIgName")
        public String globalIgName;

        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup self = new DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setDBInstances(java.util.List<String> DBInstances) {
            this.DBInstances = DBInstances;
            return this;
        }
        public java.util.List<String> getDBInstances() {
            return this.DBInstances;
        }

        public DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public DescribeGlobalSecurityIPGroupResponseBodyGlobalSecurityIPGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
