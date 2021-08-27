// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceRamRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceRamRoleSets")
    public DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets instanceRamRoleSets;

    public static DescribeInstanceRamRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRamRoleResponseBody self = new DescribeInstanceRamRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRamRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceRamRoleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstanceRamRoleResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceRamRoleResponseBody setInstanceRamRoleSets(DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets instanceRamRoleSets) {
        this.instanceRamRoleSets = instanceRamRoleSets;
        return this;
    }
    public DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets getInstanceRamRoleSets() {
        return this.instanceRamRoleSets;
    }

    public static class DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet extends TeaModel {
        @NameInMap("RamRoleName")
        public String ramRoleName;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet self = new DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets extends TeaModel {
        @NameInMap("InstanceRamRoleSet")
        public java.util.List<DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet> instanceRamRoleSet;

        public static DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets self = new DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets setInstanceRamRoleSet(java.util.List<DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet> instanceRamRoleSet) {
            this.instanceRamRoleSet = instanceRamRoleSet;
            return this;
        }
        public java.util.List<DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet> getInstanceRamRoleSet() {
            return this.instanceRamRoleSet;
        }

    }

}
