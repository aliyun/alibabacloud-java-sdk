// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The list of instances. You can specify up to 2,000 instances.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The cloud service to which the resource instance belongs. The following cloud services are supported:</p>
         * <ul>
         * <li><p>ECS (including Alibaba Cloud and third-party hosts)</p>
         * </li>
         * <li><p>ApsaraDB RDS</p>
         * </li>
         * <li><p>AnalyticDB</p>
         * </li>
         * <li><p>SLB</p>
         * </li>
         * <li><p>VPC (Elastic IP)</p>
         * </li>
         * <li><p>API Gateway</p>
         * </li>
         * <li><p>Alibaba Cloud CDN</p>
         * </li>
         * <li><p>Container Service for Swarm</p>
         * </li>
         * <li><p>DCDN</p>
         * </li>
         * <li><p>Anti-DDoS</p>
         * </li>
         * <li><p>EIP</p>
         * </li>
         * <li><p>Elasticsearch</p>
         * </li>
         * <li><p>E-MapReduce</p>
         * </li>
         * <li><p>Auto Scaling</p>
         * </li>
         * <li><p>ApsaraDB for HBase</p>
         * </li>
         * <li><p>IoT Edge</p>
         * </li>
         * <li><p>Kubernetes pod</p>
         * </li>
         * <li><p>ApsaraDB for Redis (sharded cluster)</p>
         * </li>
         * <li><p>ApsaraDB for Redis (read/write splitting)</p>
         * </li>
         * <li><p>ApsaraDB for Redis (Standard Edition)</p>
         * </li>
         * <li><p>ApsaraDB for Memcache</p>
         * </li>
         * <li><p>MNS</p>
         * </li>
         * <li><p>ApsaraDB for MongoDB (replica set)</p>
         * </li>
         * <li><p>ApsaraDB for MongoDB (sharded cluster)</p>
         * </li>
         * <li><p>ApsaraDB for MongoDB (sharded cluster)</p>
         * </li>
         * <li><p>MNS topic</p>
         * </li>
         * <li><p>OCS (ApsaraDB for Memcache of earlier versions)</p>
         * </li>
         * <li><p>OpenSearch</p>
         * </li>
         * <li><p>OSS</p>
         * </li>
         * <li><p>PolarDB</p>
         * </li>
         * <li><p>HybridDB for MySQL</p>
         * </li>
         * <li><p>Internet Shared Bandwidth</p>
         * </li>
         * <li><p>SLS</p>
         * </li>
         * <li><p>VPN Gateway</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The ID of the resource instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-a2d5q7pm12****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HostName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
