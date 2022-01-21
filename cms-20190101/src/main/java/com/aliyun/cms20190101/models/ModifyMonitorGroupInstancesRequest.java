// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupInstancesRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Instances")
    public java.util.List<ModifyMonitorGroupInstancesRequestInstances> instances;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyMonitorGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMonitorGroupInstancesRequest self = new ModifyMonitorGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMonitorGroupInstancesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ModifyMonitorGroupInstancesRequest setInstances(java.util.List<ModifyMonitorGroupInstancesRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ModifyMonitorGroupInstancesRequestInstances> getInstances() {
        return this.instances;
    }

    public ModifyMonitorGroupInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyMonitorGroupInstancesRequestInstances extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("RegionId")
        public String regionId;

        public static ModifyMonitorGroupInstancesRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            ModifyMonitorGroupInstancesRequestInstances self = new ModifyMonitorGroupInstancesRequestInstances();
            return TeaModel.build(map, self);
        }

        public ModifyMonitorGroupInstancesRequestInstances setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyMonitorGroupInstancesRequestInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyMonitorGroupInstancesRequestInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ModifyMonitorGroupInstancesRequestInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
