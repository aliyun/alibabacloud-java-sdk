// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DescribeEaisResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeEaisResponseBodyInstances instances;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1E23D585-BBD8-436F-9615-54CACD6*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEaisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEaisResponseBody self = new DescribeEaisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEaisResponseBody setInstances(DescribeEaisResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeEaisResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeEaisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEaisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEaisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEaisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEaisResponseBodyInstancesInstanceTagsTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeEaisResponseBodyInstancesInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeEaisResponseBodyInstancesInstanceTagsTag self = new DescribeEaisResponseBodyInstancesInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeEaisResponseBodyInstancesInstanceTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeEaisResponseBodyInstancesInstanceTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeEaisResponseBodyInstancesInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeEaisResponseBodyInstancesInstanceTagsTag> tag;

        public static DescribeEaisResponseBodyInstancesInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeEaisResponseBodyInstancesInstanceTags self = new DescribeEaisResponseBodyInstancesInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeEaisResponseBodyInstancesInstanceTags setTag(java.util.List<DescribeEaisResponseBodyInstancesInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeEaisResponseBodyInstancesInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeEaisResponseBodyInstancesInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>jupyter</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>i-wz93g6pyat2g****</p>
         */
        @NameInMap("ClientInstanceId")
        public String clientInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("ClientInstanceName")
        public String clientInstanceName;

        /**
         * <strong>example:</strong>
         * <p>ecs.g5ne.large</p>
         */
        @NameInMap("ClientInstanceType")
        public String clientInstanceType;

        /**
         * <strong>example:</strong>
         * <p>2020-11-11T03:11Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>eais-sz8t15a7gt7****</p>
         */
        @NameInMap("ElasticAcceleratedInstanceId")
        public String elasticAcceleratedInstanceId;

        /**
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>eais.ei-a6.2xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://121.41.**.24:8888">http://121.41.**.24:8888</a></p>
         */
        @NameInMap("JupyterUrl")
        public String jupyterUrl;

        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>sg-bp1gppir818lx4******</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>InUse</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public DescribeEaisResponseBodyInstancesInstanceTags tags;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1sd131hfmd76r******</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeEaisResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeEaisResponseBodyInstancesInstance self = new DescribeEaisResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeEaisResponseBodyInstancesInstance setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeEaisResponseBodyInstancesInstance setClientInstanceId(String clientInstanceId) {
            this.clientInstanceId = clientInstanceId;
            return this;
        }
        public String getClientInstanceId() {
            return this.clientInstanceId;
        }

        public DescribeEaisResponseBodyInstancesInstance setClientInstanceName(String clientInstanceName) {
            this.clientInstanceName = clientInstanceName;
            return this;
        }
        public String getClientInstanceName() {
            return this.clientInstanceName;
        }

        public DescribeEaisResponseBodyInstancesInstance setClientInstanceType(String clientInstanceType) {
            this.clientInstanceType = clientInstanceType;
            return this;
        }
        public String getClientInstanceType() {
            return this.clientInstanceType;
        }

        public DescribeEaisResponseBodyInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeEaisResponseBodyInstancesInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEaisResponseBodyInstancesInstance setElasticAcceleratedInstanceId(String elasticAcceleratedInstanceId) {
            this.elasticAcceleratedInstanceId = elasticAcceleratedInstanceId;
            return this;
        }
        public String getElasticAcceleratedInstanceId() {
            return this.elasticAcceleratedInstanceId;
        }

        public DescribeEaisResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeEaisResponseBodyInstancesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeEaisResponseBodyInstancesInstance setJupyterUrl(String jupyterUrl) {
            this.jupyterUrl = jupyterUrl;
            return this;
        }
        public String getJupyterUrl() {
            return this.jupyterUrl;
        }

        public DescribeEaisResponseBodyInstancesInstance setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public DescribeEaisResponseBodyInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEaisResponseBodyInstancesInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeEaisResponseBodyInstancesInstance setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeEaisResponseBodyInstancesInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeEaisResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEaisResponseBodyInstancesInstance setTags(DescribeEaisResponseBodyInstancesInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeEaisResponseBodyInstancesInstanceTags getTags() {
            return this.tags;
        }

        public DescribeEaisResponseBodyInstancesInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeEaisResponseBodyInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeEaisResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeEaisResponseBodyInstancesInstance> instance;

        public static DescribeEaisResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeEaisResponseBodyInstances self = new DescribeEaisResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeEaisResponseBodyInstances setInstance(java.util.List<DescribeEaisResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeEaisResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
