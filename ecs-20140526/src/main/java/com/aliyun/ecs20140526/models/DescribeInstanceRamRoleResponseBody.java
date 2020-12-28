// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceRamRoleResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceRamRoleSets")
    public java.util.List<DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets> instanceRamRoleSets;

    public static DescribeInstanceRamRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRamRoleResponseBody self = new DescribeInstanceRamRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRamRoleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstanceRamRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceRamRoleResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceRamRoleResponseBody setInstanceRamRoleSets(java.util.List<DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets> instanceRamRoleSets) {
        this.instanceRamRoleSets = instanceRamRoleSets;
        return this;
    }
    public java.util.List<DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets> getInstanceRamRoleSets() {
        return this.instanceRamRoleSets;
    }

    public static class DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets extends TeaModel {
        @NameInMap("RamRoleName")
        public String ramRoleName;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets self = new DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
