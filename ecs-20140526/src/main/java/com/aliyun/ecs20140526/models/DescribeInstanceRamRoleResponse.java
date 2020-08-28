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

    }

    public static class DescribeInstanceRamRoleResponseInstanceRamRoleSets extends TeaModel {
        @NameInMap("InstanceRamRoleSet")
        @Validation(required = true)
        public java.util.List<DescribeInstanceRamRoleResponseInstanceRamRoleSetsInstanceRamRoleSet> instanceRamRoleSet;

        public static DescribeInstanceRamRoleResponseInstanceRamRoleSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRamRoleResponseInstanceRamRoleSets self = new DescribeInstanceRamRoleResponseInstanceRamRoleSets();
            return TeaModel.build(map, self);
        }

    }

}
