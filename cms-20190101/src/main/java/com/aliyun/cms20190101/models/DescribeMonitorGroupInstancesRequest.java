// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstancesRequest extends TeaModel {
    /**
     * <p>The abbreviation of the name of the service to which the instances in the application group belong. Valid values:</p>
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
     * <br>
     * <p>Valid values of N: 1 to 200.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the instance. You can query multiple instances by specifying multiple IDs.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The keyword used to search for instances. Fuzzy search based on instance name is supported.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMonitorGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstancesRequest self = new DescribeMonitorGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupInstancesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeMonitorGroupInstancesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeMonitorGroupInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeMonitorGroupInstancesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeMonitorGroupInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMonitorGroupInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMonitorGroupInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
