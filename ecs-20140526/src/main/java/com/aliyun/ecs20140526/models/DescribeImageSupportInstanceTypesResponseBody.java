// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSupportInstanceTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceTypes")
    public java.util.List<DescribeImageSupportInstanceTypesResponseBodyInstanceTypes> instanceTypes;

    public static DescribeImageSupportInstanceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSupportInstanceTypesResponseBody self = new DescribeImageSupportInstanceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageSupportInstanceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageSupportInstanceTypesResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImageSupportInstanceTypesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageSupportInstanceTypesResponseBody setInstanceTypes(java.util.List<DescribeImageSupportInstanceTypesResponseBodyInstanceTypes> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<DescribeImageSupportInstanceTypesResponseBodyInstanceTypes> getInstanceTypes() {
        return this.instanceTypes;
    }

    public static class DescribeImageSupportInstanceTypesResponseBodyInstanceTypes extends TeaModel {
        @NameInMap("InstanceTypeId")
        public String instanceTypeId;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        @NameInMap("MemorySize")
        public Float memorySize;

        public static DescribeImageSupportInstanceTypesResponseBodyInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSupportInstanceTypesResponseBodyInstanceTypes self = new DescribeImageSupportInstanceTypesResponseBodyInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeImageSupportInstanceTypesResponseBodyInstanceTypes setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public DescribeImageSupportInstanceTypesResponseBodyInstanceTypes setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeImageSupportInstanceTypesResponseBodyInstanceTypes setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public DescribeImageSupportInstanceTypesResponseBodyInstanceTypes setMemorySize(Float memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Float getMemorySize() {
            return this.memorySize;
        }

    }

}
