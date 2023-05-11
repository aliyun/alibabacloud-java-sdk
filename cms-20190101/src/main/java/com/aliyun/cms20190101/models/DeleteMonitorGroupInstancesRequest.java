// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupInstancesRequest extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The instances to be removed from the application group. Separate multiple instances with commas (,). You can remove a maximum of 20 instances from an application group at a time.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The abbreviation of the service name. Valid values:</p>
     * <br>
     * <p>*   ECS: Elastic Compute Service (ECS) instances provided by Alibaba Cloud and hosts not provided by Alibaba Cloud</p>
     * <p>*   RDS: ApsaraDB for RDS</p>
     * <p>*   ADS: AnalyticDB</p>
     * <p>*   SLB: Server Load Balancer (SLB)</p>
     * <p>*   VPC: Virtual Private Cloud (VPC)</p>
     * <p>*   APIGATEWAY: API Gateway</p>
     * <p>*   CDN: Alibaba Cloud Content Delivery Network (CDN)</p>
     * <p>*   CS: Container Service for Swarm</p>
     * <p>*   DCDN: Dynamic Route for CDN</p>
     * <p>*   DDoS: Anti-DDoS Pro</p>
     * <p>*   EIP: Elastic IP Address (EIP)</p>
     * <p>*   ELASTICSEARCH: Elasticsearch</p>
     * <p>*   EMR: E-MapReduce</p>
     * <p>*   ESS: Auto Scaling</p>
     * <p>*   HBASE: ApsaraDB for Hbase</p>
     * <p>*   IOT_EDGE: IoT Edge</p>
     * <p>*   K8S_POD: pods in Container Service for Kubernetes</p>
     * <p>*   KVSTORE_SHARDING: ApsaraDB for Redis of the cluster architecture</p>
     * <p>*   KVSTORE_SPLITRW: ApsaraDB for Redis of the read/write splitting architecture</p>
     * <p>*   KVSTORE_STANDARD: ApsaraDB for Redis of the standard architecture</p>
     * <p>*   MEMCACHE: ApsaraDB for Memcache</p>
     * <p>*   MNS: Message Service (MNS)</p>
     * <p>*   MONGODB: ApsaraDB for MongoDB of the replica set architecture</p>
     * <p>*   MONGODB_CLUSTER: ApsaraDB for MongoDB of the cluster architecture</p>
     * <p>*   MONGODB_SHARDING: ApsaraDB for MongoDB of the sharded cluster architecture</p>
     * <p>*   MQ_TOPIC: MNS topics</p>
     * <p>*   OCS: ApsaraDB for Memcache of earlier versions</p>
     * <p>*   OPENSEARCH: Open Search</p>
     * <p>*   OSS: Object Storage Service (OSS)</p>
     * <p>*   POLARDB: PolarDB</p>
     * <p>*   PETADATA: HybridDB for MySQL</p>
     * <p>*   SCDN: Secure Content Delivery Network (SCDN)</p>
     * <p>*   SHAREBANDWIDTHPACKAGES: EIP Bandwidth Plan</p>
     * <p>*   SLS: Log Service</p>
     * <p>*   VPN: VPN Gateway</p>
     */
    @NameInMap("InstanceIdList")
    public String instanceIdList;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteMonitorGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupInstancesRequest self = new DeleteMonitorGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupInstancesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DeleteMonitorGroupInstancesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteMonitorGroupInstancesRequest setInstanceIdList(String instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public DeleteMonitorGroupInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
