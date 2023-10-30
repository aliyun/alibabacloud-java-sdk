// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    @NameInMap("DescribeInstancesRequest")
    public DescribeInstancesRequestDescribeInstancesRequest describeInstancesRequest;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setDescribeInstancesRequest(DescribeInstancesRequestDescribeInstancesRequest describeInstancesRequest) {
        this.describeInstancesRequest = describeInstancesRequest;
        return this;
    }
    public DescribeInstancesRequestDescribeInstancesRequest getDescribeInstancesRequest() {
        return this.describeInstancesRequest;
    }

    public static class DescribeInstancesRequestDescribeInstancesRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeInstancesRequestDescribeInstancesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestDescribeInstancesRequestTags self = new DescribeInstancesRequestDescribeInstancesRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesRequestDescribeInstancesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesRequestDescribeInstancesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstancesRequestDescribeInstancesRequest extends TeaModel {
        @NameInMap("ArchitectureType")
        public String architectureType;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public java.util.List<DescribeInstancesRequestDescribeInstancesRequestTags> tags;

        public static DescribeInstancesRequestDescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestDescribeInstancesRequest self = new DescribeInstancesRequestDescribeInstancesRequest();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesRequestDescribeInstancesRequest setArchitectureType(String architectureType) {
            this.architectureType = architectureType;
            return this;
        }
        public String getArchitectureType() {
            return this.architectureType;
        }

        public DescribeInstancesRequestDescribeInstancesRequest setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeInstancesRequestDescribeInstancesRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesRequestDescribeInstancesRequest setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public DescribeInstancesRequestDescribeInstancesRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeInstancesRequestDescribeInstancesRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstancesRequestDescribeInstancesRequest setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesRequestDescribeInstancesRequest setTags(java.util.List<DescribeInstancesRequestDescribeInstancesRequestTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeInstancesRequestDescribeInstancesRequestTags> getTags() {
            return this.tags;
        }

    }

}
