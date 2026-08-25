// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListServerIdeEcsSpecsResponseBody extends TeaModel {
    /**
     * <p>The list of available ECS instance types for personal development environments.</p>
     */
    @NameInMap("EcsSpecs")
    public java.util.List<ListServerIdeEcsSpecsResponseBodyEcsSpecs> ecsSpecs;

    /**
     * <p>The maximum number of records returned in this response.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESG****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListServerIdeEcsSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerIdeEcsSpecsResponseBody self = new ListServerIdeEcsSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerIdeEcsSpecsResponseBody setEcsSpecs(java.util.List<ListServerIdeEcsSpecsResponseBodyEcsSpecs> ecsSpecs) {
        this.ecsSpecs = ecsSpecs;
        return this;
    }
    public java.util.List<ListServerIdeEcsSpecsResponseBodyEcsSpecs> getEcsSpecs() {
        return this.ecsSpecs;
    }

    public ListServerIdeEcsSpecsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerIdeEcsSpecsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerIdeEcsSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListServerIdeEcsSpecsResponseBodyEcsSpecs extends TeaModel {
        /**
         * <p>The accelerator type. Valid values:</p>
         * <ul>
         * <li>CPU: uses only CPU.</li>
         * <li>GPU: uses GPU acceleration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("AcceleratorType")
        public String acceleratorType;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Long cpu;

        /**
         * <p>The number of compute units (CUs) consumed by this instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <p>The number of GPU cards.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public Long gpu;

        /**
         * <p>The GPU memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("GpuMemorySize")
        public Float gpuMemorySize;

        /**
         * <p>The GPU model.</p>
         * 
         * <strong>example:</strong>
         * <p>V100</p>
         */
        @NameInMap("GpuType")
        public String gpuType;

        /**
         * <p>The ECS instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether the instance type is available.</p>
         */
        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        /**
         * <p>The memory size, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Memory")
        public Float memory;

        public static ListServerIdeEcsSpecsResponseBodyEcsSpecs build(java.util.Map<String, ?> map) throws Exception {
            ListServerIdeEcsSpecsResponseBodyEcsSpecs self = new ListServerIdeEcsSpecsResponseBodyEcsSpecs();
            return TeaModel.build(map, self);
        }

        public ListServerIdeEcsSpecsResponseBodyEcsSpecs setAcceleratorType(String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }
        public String getAcceleratorType() {
            return this.acceleratorType;
        }

        public ListServerIdeEcsSpecsResponseBodyEcsSpecs setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public ListServerIdeEcsSpecsResponseBodyEcsSpecs setCu(Float cu) {
            this.cu = cu;
            return this;
        }
        public Float getCu() {
            return this.cu;
        }

        public ListServerIdeEcsSpecsResponseBodyEcsSpecs setGpu(Long gpu) {
            this.gpu = gpu;
            return this;
        }
        public Long getGpu() {
            return this.gpu;
        }

        public ListServerIdeEcsSpecsResponseBodyEcsSpecs setGpuMemorySize(Float gpuMemorySize) {
            this.gpuMemorySize = gpuMemorySize;
            return this;
        }
        public Float getGpuMemorySize() {
            return this.gpuMemorySize;
        }

        public ListServerIdeEcsSpecsResponseBodyEcsSpecs setGpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }
        public String getGpuType() {
            return this.gpuType;
        }

        public ListServerIdeEcsSpecsResponseBodyEcsSpecs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListServerIdeEcsSpecsResponseBodyEcsSpecs setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        public ListServerIdeEcsSpecsResponseBodyEcsSpecs setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

}
