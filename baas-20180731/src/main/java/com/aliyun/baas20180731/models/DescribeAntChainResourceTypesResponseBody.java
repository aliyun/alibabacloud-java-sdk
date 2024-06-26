// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainResourceTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeAntChainResourceTypesResponseBodyResult> result;

    public static DescribeAntChainResourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainResourceTypesResponseBody self = new DescribeAntChainResourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainResourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainResourceTypesResponseBody setResult(java.util.List<DescribeAntChainResourceTypesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAntChainResourceTypesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeAntChainResourceTypesResponseBodyResult extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("Disk")
        public Integer disk;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("TypeId")
        public Integer typeId;

        public static DescribeAntChainResourceTypesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainResourceTypesResponseBodyResult self = new DescribeAntChainResourceTypesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainResourceTypesResponseBodyResult setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeAntChainResourceTypesResponseBodyResult setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeAntChainResourceTypesResponseBodyResult setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeAntChainResourceTypesResponseBodyResult setTypeId(Integer typeId) {
            this.typeId = typeId;
            return this;
        }
        public Integer getTypeId() {
            return this.typeId;
        }

    }

}
