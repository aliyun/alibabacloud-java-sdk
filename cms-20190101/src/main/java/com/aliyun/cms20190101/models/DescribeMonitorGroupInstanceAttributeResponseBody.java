// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Resources")
    public DescribeMonitorGroupInstanceAttributeResponseBodyResources resources;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMonitorGroupInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstanceAttributeResponseBody self = new DescribeMonitorGroupInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitorGroupInstanceAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitorGroupInstanceAttributeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMonitorGroupInstanceAttributeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMonitorGroupInstanceAttributeResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeMonitorGroupInstanceAttributeResponseBody setResources(DescribeMonitorGroupInstanceAttributeResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeMonitorGroupInstanceAttributeResponseBodyResources getResources() {
        return this.resources;
    }

    public DescribeMonitorGroupInstanceAttributeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMonitorGroupInstanceAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceRegion extends TeaModel {
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceRegion self = new DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceRegion();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceRegion setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceVpc extends TeaModel {
        @NameInMap("VswitchInstanceId")
        public String vswitchInstanceId;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceVpc self = new DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceVpc();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceVpc setVswitchInstanceId(String vswitchInstanceId) {
            this.vswitchInstanceId = vswitchInstanceId;
            return this;
        }
        public String getVswitchInstanceId() {
            return this.vswitchInstanceId;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceVpc setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTagsTag self = new DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTagsTag> tag;

        public static DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTags self = new DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTags();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTags setTag(java.util.List<DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource extends TeaModel {
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Region")
        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceRegion region;

        @NameInMap("Vpc")
        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceVpc vpc;

        @NameInMap("Dimension")
        public String dimension;

        @NameInMap("Tags")
        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTags tags;

        @NameInMap("Category")
        public String category;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Desc")
        public String desc;

        public static DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource self = new DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource setRegion(DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceRegion region) {
            this.region = region;
            return this;
        }
        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceRegion getRegion() {
            return this.region;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource setVpc(DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceVpc vpc) {
            this.vpc = vpc;
            return this;
        }
        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceVpc getVpc() {
            return this.vpc;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource setTags(DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResourceTags getTags() {
            return this.tags;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class DescribeMonitorGroupInstanceAttributeResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource> resource;

        public static DescribeMonitorGroupInstanceAttributeResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseBodyResources self = new DescribeMonitorGroupInstanceAttributeResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupInstanceAttributeResponseBodyResources setResource(java.util.List<DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeMonitorGroupInstanceAttributeResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
