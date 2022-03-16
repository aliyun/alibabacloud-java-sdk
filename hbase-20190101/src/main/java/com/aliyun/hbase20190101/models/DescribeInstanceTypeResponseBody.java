// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeResponseBody extends TeaModel {
    @NameInMap("InstanceTypeSpecList")
    public DescribeInstanceTypeResponseBodyInstanceTypeSpecList instanceTypeSpecList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeResponseBody self = new DescribeInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeResponseBody setInstanceTypeSpecList(DescribeInstanceTypeResponseBodyInstanceTypeSpecList instanceTypeSpecList) {
        this.instanceTypeSpecList = instanceTypeSpecList;
        return this;
    }
    public DescribeInstanceTypeResponseBodyInstanceTypeSpecList getInstanceTypeSpecList() {
        return this.instanceTypeSpecList;
    }

    public DescribeInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceTypeResponseBodyInstanceTypeSpecListInstanceTypeSpec extends TeaModel {
        @NameInMap("CpuSize")
        public Long cpuSize;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MemSize")
        public Long memSize;

        public static DescribeInstanceTypeResponseBodyInstanceTypeSpecListInstanceTypeSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypeResponseBodyInstanceTypeSpecListInstanceTypeSpec self = new DescribeInstanceTypeResponseBodyInstanceTypeSpecListInstanceTypeSpec();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypeResponseBodyInstanceTypeSpecListInstanceTypeSpec setCpuSize(Long cpuSize) {
            this.cpuSize = cpuSize;
            return this;
        }
        public Long getCpuSize() {
            return this.cpuSize;
        }

        public DescribeInstanceTypeResponseBodyInstanceTypeSpecListInstanceTypeSpec setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceTypeResponseBodyInstanceTypeSpecListInstanceTypeSpec setMemSize(Long memSize) {
            this.memSize = memSize;
            return this;
        }
        public Long getMemSize() {
            return this.memSize;
        }

    }

    public static class DescribeInstanceTypeResponseBodyInstanceTypeSpecList extends TeaModel {
        @NameInMap("InstanceTypeSpec")
        public java.util.List<DescribeInstanceTypeResponseBodyInstanceTypeSpecListInstanceTypeSpec> instanceTypeSpec;

        public static DescribeInstanceTypeResponseBodyInstanceTypeSpecList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTypeResponseBodyInstanceTypeSpecList self = new DescribeInstanceTypeResponseBodyInstanceTypeSpecList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTypeResponseBodyInstanceTypeSpecList setInstanceTypeSpec(java.util.List<DescribeInstanceTypeResponseBodyInstanceTypeSpecListInstanceTypeSpec> instanceTypeSpec) {
            this.instanceTypeSpec = instanceTypeSpec;
            return this;
        }
        public java.util.List<DescribeInstanceTypeResponseBodyInstanceTypeSpecListInstanceTypeSpec> getInstanceTypeSpec() {
            return this.instanceTypeSpec;
        }

    }

}
