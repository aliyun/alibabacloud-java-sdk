// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSupportInstanceTypesResponseBody extends TeaModel {
    // The ID of the image.
    @NameInMap("ImageId")
    public String imageId;

    // Details about the instance types that are supported by the image.
    @NameInMap("InstanceTypes")
    public DescribeImageSupportInstanceTypesResponseBodyInstanceTypes instanceTypes;

    // The region ID of the image.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageSupportInstanceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSupportInstanceTypesResponseBody self = new DescribeImageSupportInstanceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageSupportInstanceTypesResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImageSupportInstanceTypesResponseBody setInstanceTypes(DescribeImageSupportInstanceTypesResponseBodyInstanceTypes instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public DescribeImageSupportInstanceTypesResponseBodyInstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeImageSupportInstanceTypesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageSupportInstanceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageSupportInstanceTypesResponseBodyInstanceTypesInstanceType extends TeaModel {
        // The number of vCPUs of the instance type.
        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        // The instance family.
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        // The ID of the instance type.
        @NameInMap("InstanceTypeId")
        public String instanceTypeId;

        // The memory size of the instance type. Unit: GiB.
        @NameInMap("MemorySize")
        public Float memorySize;

        public static DescribeImageSupportInstanceTypesResponseBodyInstanceTypesInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSupportInstanceTypesResponseBodyInstanceTypesInstanceType self = new DescribeImageSupportInstanceTypesResponseBodyInstanceTypesInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeImageSupportInstanceTypesResponseBodyInstanceTypesInstanceType setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public DescribeImageSupportInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeImageSupportInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public DescribeImageSupportInstanceTypesResponseBodyInstanceTypesInstanceType setMemorySize(Float memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Float getMemorySize() {
            return this.memorySize;
        }

    }

    public static class DescribeImageSupportInstanceTypesResponseBodyInstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        public java.util.List<DescribeImageSupportInstanceTypesResponseBodyInstanceTypesInstanceType> instanceType;

        public static DescribeImageSupportInstanceTypesResponseBodyInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSupportInstanceTypesResponseBodyInstanceTypes self = new DescribeImageSupportInstanceTypesResponseBodyInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeImageSupportInstanceTypesResponseBodyInstanceTypes setInstanceType(java.util.List<DescribeImageSupportInstanceTypesResponseBodyInstanceTypesInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<DescribeImageSupportInstanceTypesResponseBodyInstanceTypesInstanceType> getInstanceType() {
            return this.instanceType;
        }

    }

}
