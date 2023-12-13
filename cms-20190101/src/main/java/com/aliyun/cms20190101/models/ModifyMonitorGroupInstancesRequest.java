// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     */
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
        /**
         * <p>The abbreviation of the name of the service to which the instances to be added to the application group belong. Valid values:</p>
         * <br>
         * <p>*   ECS: Elastic Compute Service (ECS) instances provided by Alibaba Cloud and hosts not provided by Alibaba Cloud</p>
         * <br>
         * <p>*   RDS: ApsaraDB for RDS</p>
         * <br>
         * <p>*   ADS: AnalyticDB</p>
         * <br>
         * <p>*   SLB: Server Load Balancer (SLB)</p>
         * <br>
         * <p>*   VPC: Virtual Private Cloud (VPC)</p>
         * <br>
         * <p>*   APIGATEWAY: API Gateway</p>
         * <br>
         * <p>*   CDN: Alibaba Cloud Content Delivery Network (CDN)</p>
         * <br>
         * <p>*   CS: Container Service for Swarm</p>
         * <br>
         * <p>*   DCDN: Dynamic Route for CDN</p>
         * <br>
         * <p>*   DDoS: Anti-DDoS Pro</p>
         * <br>
         * <p>*   EIP: Elastic IP Address (EIP)</p>
         * <br>
         * <p>*   ELASTICSEARCH: Elasticsearch</p>
         * <br>
         * <p>*   EMR: E-MapReduce</p>
         * <br>
         * <p>*   ESS: Auto Scaling</p>
         * <br>
         * <p>*   HBASE: ApsaraDB for Hbase</p>
         * <br>
         * <p>*   IOT_EDGE: IoT Edge</p>
         * <br>
         * <p>*   K8S_POD: pods in Container Service for Kubernetes</p>
         * <br>
         * <p>*   KVSTORE_SHARDING: ApsaraDB for Redis of the cluster architecture</p>
         * <br>
         * <p>*   KVSTORE_SPLITRW: ApsaraDB for Redis of the read/write splitting architecture</p>
         * <br>
         * <p>*   KVSTORE_STANDARD: ApsaraDB for Redis of the standard architecture</p>
         * <br>
         * <p>*   MEMCACHE: ApsaraDB for Memcache</p>
         * <br>
         * <p>*   MNS: Message Service (MNS)</p>
         * <br>
         * <p>*   MONGODB: ApsaraDB for MongoDB of the replica set architecture</p>
         * <br>
         * <p>*   MONGODB_CLUSTER: ApsaraDB for MongoDB of the cluster architecture</p>
         * <br>
         * <p>*   MONGODB_SHARDING: ApsaraDB for MongoDB of the sharded cluster architecture</p>
         * <br>
         * <p>*   MQ_TOPIC: MNS topics</p>
         * <br>
         * <p>*   OCS: ApsaraDB for Memcache of earlier versions</p>
         * <br>
         * <p>*   OPENSEARCH: Open Search</p>
         * <br>
         * <p>*   OSS: Object Storage Service (OSS)</p>
         * <br>
         * <p>*   POLARDB: PolarDB</p>
         * <br>
         * <p>*   PETADATA: HybridDB for MySQL</p>
         * <br>
         * <p>*   SCDN: Secure Content Delivery Network (SCDN)</p>
         * <br>
         * <p>*   SHAREBANDWIDTHPACKAGES: EIP Bandwidth Plan</p>
         * <br>
         * <p>*   SLS: Log Service</p>
         * <br>
         * <p>*   VPN: VPN Gateway</p>
         * <br>
         * <p>    Valid values of N: 1 to 2000.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The ID of the instance. Valid values of N: 1 to 2000.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance. Valid values of N: 1 to 2000.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the region where the instance resides. Valid values of N: 1 to 2000.</p>
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
