// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DescribeEaisResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeEaisResponseBodyInstances instances;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

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

    public DescribeEaisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeEaisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEaisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEaisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeEaisResponseBodyInstancesInstanceTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeEaisResponseBodyInstancesInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeEaisResponseBodyInstancesInstanceTagsTag self = new DescribeEaisResponseBodyInstancesInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeEaisResponseBodyInstancesInstanceTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeEaisResponseBodyInstancesInstanceTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
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
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ClientInstanceType")
        public String clientInstanceType;

        @NameInMap("ClientInstanceId")
        public String clientInstanceId;

        @NameInMap("Tags")
        public DescribeEaisResponseBodyInstancesInstanceTags tags;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ClientInstanceName")
        public String clientInstanceName;

        @NameInMap("Description")
        public String description;

        @NameInMap("ElasticAcceleratedInstanceId")
        public String elasticAcceleratedInstanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeEaisResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeEaisResponseBodyInstancesInstance self = new DescribeEaisResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeEaisResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEaisResponseBodyInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeEaisResponseBodyInstancesInstance setClientInstanceType(String clientInstanceType) {
            this.clientInstanceType = clientInstanceType;
            return this;
        }
        public String getClientInstanceType() {
            return this.clientInstanceType;
        }

        public DescribeEaisResponseBodyInstancesInstance setClientInstanceId(String clientInstanceId) {
            this.clientInstanceId = clientInstanceId;
            return this;
        }
        public String getClientInstanceId() {
            return this.clientInstanceId;
        }

        public DescribeEaisResponseBodyInstancesInstance setTags(DescribeEaisResponseBodyInstancesInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeEaisResponseBodyInstancesInstanceTags getTags() {
            return this.tags;
        }

        public DescribeEaisResponseBodyInstancesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeEaisResponseBodyInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeEaisResponseBodyInstancesInstance setClientInstanceName(String clientInstanceName) {
            this.clientInstanceName = clientInstanceName;
            return this;
        }
        public String getClientInstanceName() {
            return this.clientInstanceName;
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
