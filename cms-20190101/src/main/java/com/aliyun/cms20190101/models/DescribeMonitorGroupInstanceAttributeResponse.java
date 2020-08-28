// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstanceAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Resources")
    @Validation(required = true)
    public DescribeMonitorGroupInstanceAttributeResponseResources resources;

    public static DescribeMonitorGroupInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstanceAttributeResponse self = new DescribeMonitorGroupInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMonitorGroupInstanceAttributeResponseResourcesResourceTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeMonitorGroupInstanceAttributeResponseResourcesResourceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseResourcesResourceTagsTag self = new DescribeMonitorGroupInstanceAttributeResponseResourcesResourceTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupInstanceAttributeResponseResourcesResourceTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeMonitorGroupInstanceAttributeResponseResourcesResourceTagsTag> tag;

        public static DescribeMonitorGroupInstanceAttributeResponseResourcesResourceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseResourcesResourceTags self = new DescribeMonitorGroupInstanceAttributeResponseResourcesResourceTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupInstanceAttributeResponseResourcesResourceRegion extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("AvailabilityZone")
        @Validation(required = true)
        public String availabilityZone;

        public static DescribeMonitorGroupInstanceAttributeResponseResourcesResourceRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseResourcesResourceRegion self = new DescribeMonitorGroupInstanceAttributeResponseResourcesResourceRegion();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupInstanceAttributeResponseResourcesResourceVpc extends TeaModel {
        @NameInMap("VpcInstanceId")
        @Validation(required = true)
        public String vpcInstanceId;

        @NameInMap("VswitchInstanceId")
        @Validation(required = true)
        public String vswitchInstanceId;

        public static DescribeMonitorGroupInstanceAttributeResponseResourcesResourceVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseResourcesResourceVpc self = new DescribeMonitorGroupInstanceAttributeResponseResourcesResourceVpc();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupInstanceAttributeResponseResourcesResource extends TeaModel {
        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Dimension")
        @Validation(required = true)
        public String dimension;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeMonitorGroupInstanceAttributeResponseResourcesResourceTags tags;

        @NameInMap("Region")
        @Validation(required = true)
        public DescribeMonitorGroupInstanceAttributeResponseResourcesResourceRegion region;

        @NameInMap("Vpc")
        @Validation(required = true)
        public DescribeMonitorGroupInstanceAttributeResponseResourcesResourceVpc vpc;

        public static DescribeMonitorGroupInstanceAttributeResponseResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseResourcesResource self = new DescribeMonitorGroupInstanceAttributeResponseResourcesResource();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupInstanceAttributeResponseResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeMonitorGroupInstanceAttributeResponseResourcesResource> resource;

        public static DescribeMonitorGroupInstanceAttributeResponseResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupInstanceAttributeResponseResources self = new DescribeMonitorGroupInstanceAttributeResponseResources();
            return TeaModel.build(map, self);
        }

    }

}
