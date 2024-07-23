// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListNodeInstanceTypeResponseBody extends TeaModel {
    @NameInMap("NodeInstanceTypeModels")
    public java.util.List<ListNodeInstanceTypeResponseBodyNodeInstanceTypeModels> nodeInstanceTypeModels;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Gpu")
        public String gpu;

        /**
         * <p>显卡内存大小，单位为MB。</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("GpuMemory")
        public Long gpuMemory;

        /**
         * <p>最大并发会话数，即单个资源可同时连接的会话数。如果同时连接的会话数过多，可能导致应用的使用体验下降。取值范围因资源规格不同而不同。各资源规格对应的取值范围分别是：</p>
         * <ul>
         * <li>appstreaming.general.4c8g：1\~2；</li>
         * <li>appstreaming.general.8c16g：1\~4；</li>
         * <li>appstreaming.vgpu.8c16g.4g：1\~4；</li>
         * <li>appstreaming.vgpu.8c31g.16g：1\~4；</li>
         * <li>appstreaming.vgpu.14c93g.12g：1\~6；</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxCapacity")
        public Integer maxCapacity;

        /**
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <strong>example:</strong>
         * <p>appstreaming.vgpu.4c8g.2g</p>
         */
        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        /**
         * <strong>example:</strong>
         * <p>appstreaming.vgpu</p>
         */
        @NameInMap("NodeInstanceTypeFamily")
        public String nodeInstanceTypeFamily;

        /**
         * <p>资源规格名称。</p>
         * 
         * <strong>example:</strong>
         * <p>无影-通用型_4核8G</p>
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
