// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("InstanceTypes")
    @Validation(required = true)
    public DescribeInstanceTypesResponseInstanceTypes instanceTypes;

    public static DescribeInstanceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypesResponse self = new DescribeInstanceTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceTypesResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeInstanceTypesResponse setInstanceTypes(DescribeInstanceTypesResponseInstanceTypes instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public DescribeInstanceTypesResponseInstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    public static class DescribeInstanceTypesResponseInstanceTypesInstanceType extends TeaModel {
        @NameInMap("CpuCoreCount")
        @Validation(required = true)
        public Integer cpuCoreCount;

        @NameInMap("MemorySize")
        @Validation(required = true)
        public Integer memorySize;

        @NameInMap("InstanceTypeId")
        @Validation(required = true)
        public String instanceTypeId;

        @NameInMap("InstanceTypeName")
        @Validation(required = true)
        public String instanceTypeName;

        public static DescribeInstanceTypesResponseInstanceTypesInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseInstanceTypesInstanceType self = new DescribeInstanceTypesResponseInstanceTypesInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public DescribeInstanceTypesResponseInstanceTypesInstanceType setInstanceTypeName(String instanceTypeName) {
            this.instanceTypeName = instanceTypeName;
            return this;
        }
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

    }

    public static class DescribeInstanceTypesResponseInstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        @Validation(required = true)
        public java.util.List<DescribeInstanceTypesResponseInstanceTypesInstanceType> instanceType;

        public static DescribeInstanceTypesResponseInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypesResponseInstanceTypes self = new DescribeInstanceTypesResponseInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypesResponseInstanceTypes setInstanceType(java.util.List<DescribeInstanceTypesResponseInstanceTypesInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<DescribeInstanceTypesResponseInstanceTypesInstanceType> getInstanceType() {
            return this.instanceType;
        }

    }

}
