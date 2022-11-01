// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListNodeInstanceTypeResponseBody extends TeaModel {
    @NameInMap("NodeInstanceTypeModels")
    public java.util.List<ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels> nodeInstanceTypeModels;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNodeInstanceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInstanceTypeResponseBody self = new ListNodeInstanceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeInstanceTypeResponseBody setNodeInstanceTypeModels(java.util.List<ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels> nodeInstanceTypeModels) {
        this.nodeInstanceTypeModels = nodeInstanceTypeModels;
        return this;
    }
    public java.util.List<ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels> getNodeInstanceTypeModels() {
        return this.nodeInstanceTypeModels;
    }

    public ListNodeInstanceTypeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodeInstanceTypeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodeInstanceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeInstanceTypeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels extends TeaModel {
        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("Gpu")
        public String gpu;

        @NameInMap("GpuMemory")
        public Long gpuMemory;

        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        @NameInMap("NodeInstanceTypeFamily")
        public String nodeInstanceTypeFamily;

        @NameInMap("NodeTypeName")
        public String nodeTypeName;

        public static ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels build(java.util.Map<String, ?> map) throws Exception {
            ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels self = new ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels();
            return TeaModel.build(map, self);
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        public String getGpu() {
            return this.gpu;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setGpuMemory(Long gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }
        public Long getGpuMemory() {
            return this.gpuMemory;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setNodeInstanceType(String nodeInstanceType) {
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setNodeInstanceTypeFamily(String nodeInstanceTypeFamily) {
            this.nodeInstanceTypeFamily = nodeInstanceTypeFamily;
            return this;
        }
        public String getNodeInstanceTypeFamily() {
            return this.nodeInstanceTypeFamily;
        }

        public ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels setNodeTypeName(String nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
            return this;
        }
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

    }

}
