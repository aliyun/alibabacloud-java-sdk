// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeResourceTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeResourceTypesResponseBodyResult> result;

    public static DescribeResourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTypesResponseBody self = new DescribeResourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceTypesResponseBody setResult(java.util.List<DescribeResourceTypesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeResourceTypesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeResourceTypesResponseBodyResult extends TeaModel {
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

        public static DescribeResourceTypesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceTypesResponseBodyResult self = new DescribeResourceTypesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeResourceTypesResponseBodyResult setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeResourceTypesResponseBodyResult setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeResourceTypesResponseBodyResult setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeResourceTypesResponseBodyResult setTypeId(Integer typeId) {
            this.typeId = typeId;
            return this;
        }
        public Integer getTypeId() {
            return this.typeId;
        }

        public DescribeResourceTypesResponseBodyResult setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
