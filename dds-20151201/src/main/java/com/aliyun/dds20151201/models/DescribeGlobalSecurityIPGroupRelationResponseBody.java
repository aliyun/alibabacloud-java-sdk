// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeGlobalSecurityIPGroupRelationResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("GlobalSecurityIPGroupRel")
    public java.util.List<DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel> globalSecurityIPGroupRel;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGlobalSecurityIPGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalSecurityIPGroupRelationResponseBody self = new DescribeGlobalSecurityIPGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalSecurityIPGroupRelationResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeGlobalSecurityIPGroupRelationResponseBody setGlobalSecurityIPGroupRel(java.util.List<DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel> globalSecurityIPGroupRel) {
        this.globalSecurityIPGroupRel = globalSecurityIPGroupRel;
        return this;
    }
    public java.util.List<DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel> getGlobalSecurityIPGroupRel() {
        return this.globalSecurityIPGroupRel;
    }

    public DescribeGlobalSecurityIPGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel extends TeaModel {
        @NameInMap("GIpList")
        public String GIpList;

        @NameInMap("GlobalIgName")
        public String globalIgName;

        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel self = new DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public DescribeGlobalSecurityIPGroupRelationResponseBodyGlobalSecurityIPGroupRel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
