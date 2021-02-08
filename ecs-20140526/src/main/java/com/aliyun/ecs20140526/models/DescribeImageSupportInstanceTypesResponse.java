// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSupportInstanceTypesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("InstanceTypes")
    @Validation(required = true)
    public DescribeImageSupportInstanceTypesResponseInstanceTypes instanceTypes;

    public static DescribeImageSupportInstanceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageSupportInstanceTypesResponse self = new DescribeImageSupportInstanceTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageSupportInstanceTypesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageSupportInstanceTypesResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageSupportInstanceTypesResponse setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImageSupportInstanceTypesResponse setInstanceTypes(DescribeImageSupportInstanceTypesResponseInstanceTypes instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public DescribeImageSupportInstanceTypesResponseInstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    public static class DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType extends TeaModel {
        @NameInMap("InstanceTypeId")
        @Validation(required = true)
        public String instanceTypeId;

        @NameInMap("CpuCoreCount")
        @Validation(required = true)
        public Integer cpuCoreCount;

        @NameInMap("MemorySize")
        @Validation(required = true)
        public Float memorySize;

        @NameInMap("InstanceTypeFamily")
        @Validation(required = true)
        public String instanceTypeFamily;

        public static DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType self = new DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType setMemorySize(Float memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Float getMemorySize() {
            return this.memorySize;
        }

        public DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

    }

    public static class DescribeImageSupportInstanceTypesResponseInstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        @Validation(required = true)
        public java.util.List<DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType> instanceType;

        public static DescribeImageSupportInstanceTypesResponseInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSupportInstanceTypesResponseInstanceTypes self = new DescribeImageSupportInstanceTypesResponseInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeImageSupportInstanceTypesResponseInstanceTypes setInstanceType(java.util.List<DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType> getInstanceType() {
            return this.instanceType;
        }

    }

}
