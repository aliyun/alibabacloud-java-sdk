// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceRamRoleResponseBody extends TeaModel {
    /**
     * <p>The IDs of the ECS instances and the names of the corresponding instance RAM roles.</p>
     */
    @NameInMap("InstanceRamRoleSets")
    public DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets instanceRamRoleSets;

    /**
     * <p>The region ID of the ECS instances.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of ECS instances returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceRamRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRamRoleResponseBody self = new DescribeInstanceRamRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRamRoleResponseBody setInstanceRamRoleSets(DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets instanceRamRoleSets) {
        this.instanceRamRoleSets = instanceRamRoleSets;
        return this;
    }
    public DescribeInstanceRamRoleResponseBodyInstanceRamRoleSets getInstanceRamRoleSets() {
        return this.instanceRamRoleSets;
    }

    public DescribeInstanceRamRoleResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public static class DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet extends TeaModel {
        /**
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>EcsServiceRole-EcsDocGuideTest</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        public static DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet self = new DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceRamRoleResponseBodyInstanceRamRoleSetsInstanceRamRoleSet setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
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
