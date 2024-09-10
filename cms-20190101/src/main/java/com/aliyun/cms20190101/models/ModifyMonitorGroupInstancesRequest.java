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
         * <p>The abbreviation of the name of the service to which the instances to be added to the application group belong. Valid values:</p>
         * <ul>
         * <li><p>ECS: Elastic Compute Service (ECS) instances provided by Alibaba Cloud and hosts not provided by Alibaba Cloud</p>
         * </li>
         * <li><p>RDS: ApsaraDB for RDS</p>
         * </li>
         * <li><p>ADS: AnalyticDB</p>
         * </li>
         * <li><p>SLB: Server Load Balancer (SLB)</p>
         * </li>
         * <li><p>VPC: Virtual Private Cloud (VPC)</p>
         * </li>
         * <li><p>APIGATEWAY: API Gateway</p>
         * </li>
         * <li><p>CDN: Alibaba Cloud Content Delivery Network (CDN)</p>
         * </li>
         * <li><p>CS: Container Service for Swarm</p>
         * </li>
         * <li><p>DCDN: Dynamic Route for CDN</p>
         * </li>
         * <li><p>DDoS: Anti-DDoS Pro</p>
         * </li>
         * <li><p>EIP: Elastic IP Address (EIP)</p>
         * </li>
         * <li><p>ELASTICSEARCH: Elasticsearch</p>
         * </li>
         * <li><p>EMR: E-MapReduce</p>
         * </li>
         * <li><p>ESS: Auto Scaling</p>
         * </li>
         * <li><p>HBASE: ApsaraDB for Hbase</p>
         * </li>
         * <li><p>IOT_EDGE: IoT Edge</p>
         * </li>
         * <li><p>K8S_POD: pods in Container Service for Kubernetes</p>
         * </li>
         * <li><p>KVSTORE_SHARDING: ApsaraDB for Redis of the cluster architecture</p>
         * </li>
         * <li><p>KVSTORE_SPLITRW: ApsaraDB for Redis of the read/write splitting architecture</p>
         * </li>
         * <li><p>KVSTORE_STANDARD: ApsaraDB for Redis of the standard architecture</p>
         * </li>
         * <li><p>MEMCACHE: ApsaraDB for Memcache</p>
         * </li>
         * <li><p>MNS: Message Service (MNS)</p>
         * </li>
         * <li><p>MONGODB: ApsaraDB for MongoDB of the replica set architecture</p>
         * </li>
         * <li><p>MONGODB_CLUSTER: ApsaraDB for MongoDB of the cluster architecture</p>
         * </li>
         * <li><p>MONGODB_SHARDING: ApsaraDB for MongoDB of the sharded cluster architecture</p>
         * </li>
         * <li><p>MQ_TOPIC: MNS topics</p>
         * </li>
         * <li><p>OCS: ApsaraDB for Memcache of earlier versions</p>
         * </li>
         * <li><p>OPENSEARCH: Open Search</p>
         * </li>
         * <li><p>OSS: Object Storage Service (OSS)</p>
         * </li>
         * <li><p>POLARDB: PolarDB</p>
         * </li>
         * <li><p>PETADATA: HybridDB for MySQL</p>
         * </li>
         * <li><p>SCDN: Secure Content Delivery Network (SCDN)</p>
         * </li>
         * <li><p>SHAREBANDWIDTHPACKAGES: EIP Bandwidth Plan</p>
         * </li>
         * <li><p>SLS: Log Service</p>
         * </li>
         * <li><p>VPN: VPN Gateway</p>
         * <p>Valid values of N: 1 to 2000.</p>
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
         * <p>The ID of the instance. Valid values of N: 1 to 2000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-a2d5q7pm12****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance. Valid values of N: 1 to 2000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HostName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the region where the instance resides. Valid values of N: 1 to 2000.</p>
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
