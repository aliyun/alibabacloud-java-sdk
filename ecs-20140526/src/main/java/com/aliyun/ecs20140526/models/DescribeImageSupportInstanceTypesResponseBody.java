// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageSupportInstanceTypesResponseBody extends TeaModel {
    /**
     * <p>The key of filter N. Only the image ID can be used to filter instance types. Valid values:</p>
     * <br>
     * <p>*   imagId: image ID</p>
     * <p>*   filter: image ID</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>{</p>
     * <p>    "RequestId": "CF661E2D-4AFE-4BCD-959A-A65E14416B44",</p>
     * <p>    "RegionId": "cn-hangzhou",</p>
     * <p>    "ImageId": "ubuntu_16_0402_64_20G_alibase_20180409.vhd",</p>
     * <p>    "InstanceTypes": {</p>
     * <p>        "InstanceType": [{</p>
     * <p>            "InstanceTypeId": "ecs.t1.xsmall",</p>
     * <p>            "CpuCoreCount": 1,</p>
     * <p>            "MemorySize": 0.5,</p>
     * <p>            "InstanceTypeFamily": "ecs.t1"</p>
     * <p>        },</p>
     * <p>        {</p>
     * <p>            "InstanceTypeId": "ecs.t1.small",</p>
     * <p>            "CpuCoreCount": 1,</p>
     * <p>            "MemorySize": 1,</p>
     * <p>            "InstanceTypeFamily": "ecs.t1"</p>
     * <p>        }]</p>
     * <p>    }</p>
     * <p>}</p>
     */
    @NameInMap("InstanceTypes")
    public DescribeImageSupportInstanceTypesResponseBodyInstanceTypes instanceTypes;

    /**
     * <p>{</p>
     * <p>    "RequestId": "CF661E2D-4AFE-4BCD-959A-A65E14416B44",</p>
     * <p>    "RegionId": "cn-hangzhou",</p>
     * <p>    "ImageId": "ubuntu_16_0402_64_20G_alibase_20180409.vhd",</p>
     * <p>    "InstanceTypes": {</p>
     * <p>        "InstanceType": [{</p>
     * <p>            "InstanceTypeId": "ecs.t1.xsmall",</p>
     * <p>            "CpuCoreCount": 1,</p>
     * <p>            "MemorySize": 0.5,</p>
     * <p>            "InstanceTypeFamily": "ecs.t1"</p>
     * <p>        },</p>
     * <p>        {</p>
     * <p>            "InstanceTypeId": "ecs.t1.small",</p>
     * <p>            "CpuCoreCount": 1,</p>
     * <p>            "MemorySize": 1,</p>
     * <p>            "InstanceTypeFamily": "ecs.t1"</p>
     * <p>        }]</p>
     * <p>    }</p>
     * <p>}</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The number of vCPUs of the instance type.</p>
         */
        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        /**
         * <p>DescribeImageSupportInstanceTypes</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>Queries the instance types supported by an image.</p>
         */
        @NameInMap("InstanceTypeId")
        public String instanceTypeId;

        /**
         * <p>The memory size of the instance type. Unit: GiB.</p>
         */
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
