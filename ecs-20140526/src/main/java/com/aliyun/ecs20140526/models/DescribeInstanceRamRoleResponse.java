// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceRamRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("InstanceRamRoleSets")
    @Validation(required = true)
    public DescribeInstanceRamRoleResponseInstanceRamRoleSets instanceRamRoleSets;

    public static DescribeInstanceRamRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRamRoleResponse self = new DescribeInstanceRamRoleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRamRoleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceRamRoleResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceRamRoleResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstanceRamRoleResponse setInstanceRamRoleSets(DescribeInstanceRamRoleResponseInstanceRamRoleSets instanceRamRoleSets) {
        this.instanceRamRoleSets = instanceRamRoleSets;
        return this;
    }
    public DescribeInstanceRamRoleResponseInstanceRamRoleSets getInstanceRamRoleSets() {
        return this.instanceRamRoleSets;
    }

    public static class DescribeInstanceRamRoleResponseInstanceRamRoleSetsInstanceRamRoleSet extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("RamRoleName")
        @Validation(required = true)
        public String ramRoleName;

        public static DescribeInstanceRamRoleResponseInstanceRamRoleSetsInstanceRamRoleSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRamRoleResponseInstanceRamRoleSetsInstanceRamRoleSet self = new DescribeInstanceRamRoleResponseInstanceRamRoleSetsInstanceRamRoleSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRamRoleResponseInstanceRamRoleSetsInstanceRamRoleSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceRamRoleResponseInstanceRamRoleSetsInstanceRamRoleSet setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

    }

    public static class DescribeInstanceRamRoleResponseInstanceRamRoleSets extends TeaModel {
        @NameInMap("InstanceRamRoleSet")
        @Validation(required = true)
        public java.util.List<DescribeInstanceRamRoleResponseInstanceRamRoleSetsInstanceRamRoleSet> instanceRamRoleSet;

        public static DescribeInstanceRamRoleResponseInstanceRamRoleSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRamRoleResponseInstanceRamRoleSets self = new DescribeInstanceRamRoleResponseInstanceRamRoleSets();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRamRoleResponseInstanceRamRoleSets setInstanceRamRoleSet(java.util.List<DescribeInstanceRamRoleResponseInstanceRamRoleSetsInstanceRamRoleSet> instanceRamRoleSet) {
            this.instanceRamRoleSet = instanceRamRoleSet;
            return this;
        }
        public java.util.List<DescribeInstanceRamRoleResponseInstanceRamRoleSetsInstanceRamRoleSet> getInstanceRamRoleSet() {
            return this.instanceRamRoleSet;
        }

    }

}
