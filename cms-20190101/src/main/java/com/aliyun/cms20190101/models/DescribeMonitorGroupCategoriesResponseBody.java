// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupCategoriesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The cloud services to which the resources in the application group belong and the number of resources that belong to the cloud service.</p>
     */
    @NameInMap("MonitorGroupCategories")
    public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories monitorGroupCategories;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMonitorGroupCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupCategoriesResponseBody self = new DescribeMonitorGroupCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupCategoriesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMonitorGroupCategoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitorGroupCategoriesResponseBody setMonitorGroupCategories(DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories monitorGroupCategories) {
        this.monitorGroupCategories = monitorGroupCategories;
        return this;
    }
    public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories getMonitorGroupCategories() {
        return this.monitorGroupCategories;
    }

    public DescribeMonitorGroupCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitorGroupCategoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem extends TeaModel {
        /**
         * <p>The name of the cloud service. Valid values:</p>
         * <br>
         * <p>*   ecs: Elastic Compute Service (ECS) instances that are provided by Alibaba Cloud and hosts that are not provided by Alibaba Cloud</p>
         * <p>*   rds: ApsaraDB RDS</p>
         * <p>*   ads: AnalyticDB</p>
         * <p>*   slb: Server Load Balancer (SLB)</p>
         * <p>*   vpc: Virtual Private Cloud (VPC)</p>
         * <p>*   apigateway: API Gateway</p>
         * <p>*   cdn: Alibaba Cloud Content Delivery Network (CDN)</p>
         * <p>*   cs: Container Service for Swarm</p>
         * <p>*   dcdn: Dynamic Route for CDN (DCDN)</p>
         * <p>*   ddos: Anti-DDoS</p>
         * <p>*   eip: Elastic IP Address (EIP)</p>
         * <p>*   elasticsearch: Elasticsearch</p>
         * <p>*   emr: E-MapReduce</p>
         * <p>*   ess: Auto Scaling</p>
         * <p>*   hbase: ApsaraDB for HBase</p>
         * <p>*   iot_edge: IoT Edge</p>
         * <p>*   k8s_pod: pods in Container Service for Kubernetes (ACK)</p>
         * <p>*   kvstore_sharding: ApsaraDB for Redis of the cluster master-replica architecture</p>
         * <p>*   kvstore_splitrw: ApsaraDB for Redis of the read/write splitting architecture</p>
         * <p>*   kvstore_standard: ApsaraDB for Redis of the standard master-replica architecture</p>
         * <p>*   memcache: ApsaraDB for Memcache</p>
         * <p>*   mns: Message Service (MNS)</p>
         * <p>*   mongodb: ApsaraDB for MongoDB of the replica set architecture</p>
         * <p>*   mongodb_cluster: ApsaraDB for MongoDB of the cluster architecture</p>
         * <p>*   mongodb_sharding: ApsaraDB for MongoDB of the sharded cluster architecture</p>
         * <p>*   mq_topic: MNS topics</p>
         * <p>*   ocs: ApsaraDB for Memcache of earlier versions</p>
         * <p>*   opensearch: Open Search</p>
         * <p>*   oss: Object Storage Service (OSS)</p>
         * <p>*   polardb: PolarDB</p>
         * <p>*   petadata: HybridDB for MySQL</p>
         * <p>*   scdn: Secure CDN (SCDN)</p>
         * <p>*   sharebandwidthpackages: EIP Bandwidth Plan</p>
         * <p>*   sls: Log Service</p>
         * <p>*   vpn: VPN Gateway</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The number of resources that belong to the cloud service.</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem self = new DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory extends TeaModel {
        @NameInMap("CategoryItem")
        public java.util.List<DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem> categoryItem;

        public static DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory self = new DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory setCategoryItem(java.util.List<DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem> categoryItem) {
            this.categoryItem = categoryItem;
            return this;
        }
        public java.util.List<DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategoryCategoryItem> getCategoryItem() {
            return this.categoryItem;
        }

    }

    public static class DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories extends TeaModel {
        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>One of the cloud services to which the resources in the application group belong and the number of resources that belong to the cloud service.</p>
         */
        @NameInMap("MonitorGroupCategory")
        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory monitorGroupCategory;

        public static DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories self = new DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategories setMonitorGroupCategory(DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory monitorGroupCategory) {
            this.monitorGroupCategory = monitorGroupCategory;
            return this;
        }
        public DescribeMonitorGroupCategoriesResponseBodyMonitorGroupCategoriesMonitorGroupCategory getMonitorGroupCategory() {
            return this.monitorGroupCategory;
        }

    }

}
