// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeResourceTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeResourceTypeResponseBodyResult> result;

    public static DescribeResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTypeResponseBody self = new DescribeResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceTypeResponseBody setResult(java.util.List<DescribeResourceTypeResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeResourceTypeResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeResourceTypeResponseBodyResult extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Disk")
        public Integer disk;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("TypeId")
        public Integer typeId;

        @NameInMap("TypeName")
        public String typeName;

        public static DescribeResourceTypeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceTypeResponseBodyResult self = new DescribeResourceTypeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeResourceTypeResponseBodyResult setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeResourceTypeResponseBodyResult setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeResourceTypeResponseBodyResult setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeResourceTypeResponseBodyResult setTypeId(Integer typeId) {
            this.typeId = typeId;
            return this;
        }
        public Integer getTypeId() {
            return this.typeId;
        }

        public DescribeResourceTypeResponseBodyResult setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
