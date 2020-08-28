// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupInstancesRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    @NameInMap("Instances")
    @Validation(required = true)
    public java.util.List<ModifyMonitorGroupInstancesRequestInstances> instances;

    public static ModifyMonitorGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMonitorGroupInstancesRequest self = new ModifyMonitorGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

    public static class ModifyMonitorGroupInstancesRequestInstances extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        public static ModifyMonitorGroupInstancesRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            ModifyMonitorGroupInstancesRequestInstances self = new ModifyMonitorGroupInstancesRequestInstances();
            return TeaModel.build(map, self);
        }

    }

}
