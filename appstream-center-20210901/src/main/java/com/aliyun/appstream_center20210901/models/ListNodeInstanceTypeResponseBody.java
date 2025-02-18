// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListNodeInstanceTypeResponseBody extends TeaModel {
    /**
     * <p>The resource types.</p>
     */
    @NameInMap("NodeInstanceTypeModels")
    public java.util.List<ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels> nodeInstanceTypeModels;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
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
        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Gpu")
        public String gpu;

        /**
         * <p>The GPU size. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("GpuMemory")
        public Long gpuMemory;

        /**
         * <p>The maximum number of sessions to which a resource can connect at the same time. If a resource connects to a large number of sessions at the same time, user experience can be compromised. The value range varies based on the resource type. The following items describe the value ranges of different resource types:</p>
         * <ul>
         * <li>appstreaming.general.4c8g: 1 to 2</li>
         * <li>appstreaming.general.8c16g: 1 to 4</li>
         * <li>appstreaming.vgpu.8c16g.4g: 1 to 4</li>
         * <li>appstreaming.vgpu.8c31g.16g: 1 to 4</li>
         * <li>appstreaming.vgpu.14c93g.12g: 1 to 6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <p>The memory size. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The ID of the resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu.4c8g.2g</p>
         */
        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        /**
         * <p>The resource type family.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>appstreaming.general: WUYING - General</li>
         * <li>appstreaming.vgpu: WUYING - Graphics</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.vgpu</p>
         */
        @NameInMap("NodeInstanceTypeFamily")
        public String nodeInstanceTypeFamily;

        /**
         * <p>The name of the resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>WUYING - General - 4 vCPUs 8 GB Memory</p>
         */
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
