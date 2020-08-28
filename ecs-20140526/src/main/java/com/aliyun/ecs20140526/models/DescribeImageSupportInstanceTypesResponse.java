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

    public static class DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType extends TeaModel {
        @NameInMap("InstanceTypeId")
        @Validation(required = true)
        public String instanceTypeId;

        @NameInMap("CpuCoreCount")
        @Validation(required = true)
        public Integer cpuCoreCount;

        @NameInMap("MemorySize")
        @Validation(required = true)
        public Double memorySize;

        @NameInMap("InstanceTypeFamily")
        @Validation(required = true)
        public String instanceTypeFamily;

        public static DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType self = new DescribeImageSupportInstanceTypesResponseInstanceTypesInstanceType();
            return TeaModel.build(map, self);
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

    }

}
