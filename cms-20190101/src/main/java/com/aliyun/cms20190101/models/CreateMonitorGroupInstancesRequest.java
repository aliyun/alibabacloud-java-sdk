// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The instances that you want to add to the application group.</p>
     */
    @NameInMap("Instances")
    public java.util.List<CreateMonitorGroupInstancesRequestInstances> instances;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateMonitorGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupInstancesRequest self = new CreateMonitorGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupInstancesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateMonitorGroupInstancesRequest setInstances(java.util.List<CreateMonitorGroupInstancesRequestInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<CreateMonitorGroupInstancesRequestInstances> getInstances() {
        return this.instances;
    }

    public CreateMonitorGroupInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateMonitorGroupInstancesRequestInstances extends TeaModel {
        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * <br>
         * <p>To obtain the abbreviation of an Alibaba Cloud service name, call the [DescribeProjectMeta](~~114916~~) operation. The `metricCategory` tag in the `Labels` response parameter indicates the abbreviation of the Alibaba Cloud service name.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static CreateMonitorGroupInstancesRequestInstances build(java.util.Map<String, ?> map) throws Exception {
            CreateMonitorGroupInstancesRequestInstances self = new CreateMonitorGroupInstancesRequestInstances();
            return TeaModel.build(map, self);
        }

        public CreateMonitorGroupInstancesRequestInstances setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateMonitorGroupInstancesRequestInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateMonitorGroupInstancesRequestInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateMonitorGroupInstancesRequestInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
