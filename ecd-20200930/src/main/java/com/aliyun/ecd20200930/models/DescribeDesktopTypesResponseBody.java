// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesResponseBody extends TeaModel {
    /**
     * <p>The specifications.</p>
     */
    @NameInMap("DesktopTypes")
    public java.util.List<DescribeDesktopTypesResponseBodyDesktopTypes> desktopTypes;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDesktopTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopTypesResponseBody self = new DescribeDesktopTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopTypesResponseBody setDesktopTypes(java.util.List<DescribeDesktopTypesResponseBodyDesktopTypes> desktopTypes) {
        this.desktopTypes = desktopTypes;
        return this;
    }
    public java.util.List<DescribeDesktopTypesResponseBodyDesktopTypes> getDesktopTypes() {
        return this.desktopTypes;
    }

    public DescribeDesktopTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDesktopTypesResponseBodyDesktopTypes extends TeaModel {
        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuCount")
        public String cpuCount;

        /**
         * <p>The size of the data disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the cloud desktop type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd.graphics.xlarge</p>
         */
        @NameInMap("DesktopTypeId")
        public String desktopTypeId;

        /**
         * <p>The status of the cloud desktop type. If SUFFICIENT is returned, the number of cloud desktops of the type is sufficient.</p>
         * 
         * <strong>example:</strong>
         * <p>SUFFICIENT</p>
         */
        @NameInMap("DesktopTypeStatus")
        public String desktopTypeStatus;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GpuCount")
        public Float gpuCount;

        /**
         * <p>The GPU memory size. For GPU-accelerated cloud computers, this return value is significant. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("GpuMemory")
        public Integer gpuMemory;

        /**
         * <p>The GPU memory.</p>
         * 
         * <strong>example:</strong>
         * <p>16 GiB</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The family of the cloud desktop type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd.graphics</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The number of sessions supported by the specification.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxSessionCount")
        public Integer maxSessionCount;

        /**
         * <p>The memory size. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>23552</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <p>The sales modes of the specifications.</p>
         */
        @NameInMap("Scopes")
        public java.util.List<String> scopes;

        /**
         * <p>The inventory status of the specification.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Insufficient</li>
         * <li>Sufficient</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Sufficient</p>
         */
        @NameInMap("StockState")
        public String stockState;

        /**
         * <p>The size of the system disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("SystemDiskSize")
        public String systemDiskSize;

        public static DescribeDesktopTypesResponseBodyDesktopTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopTypesResponseBodyDesktopTypes self = new DescribeDesktopTypesResponseBodyDesktopTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setCpuCount(String cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public String getCpuCount() {
            return this.cpuCount;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setDataDiskSize(String dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setDesktopTypeId(String desktopTypeId) {
            this.desktopTypeId = desktopTypeId;
            return this;
        }
        public String getDesktopTypeId() {
            return this.desktopTypeId;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setDesktopTypeStatus(String desktopTypeStatus) {
            this.desktopTypeStatus = desktopTypeStatus;
            return this;
        }
        public String getDesktopTypeStatus() {
            return this.desktopTypeStatus;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setGpuCount(Float gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Float getGpuCount() {
            return this.gpuCount;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setGpuMemory(Integer gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }
        public Integer getGpuMemory() {
            return this.gpuMemory;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setMaxSessionCount(Integer maxSessionCount) {
            this.maxSessionCount = maxSessionCount;
            return this;
        }
        public Integer getMaxSessionCount() {
            return this.maxSessionCount;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setStockState(String stockState) {
            this.stockState = stockState;
            return this;
        }
        public String getStockState() {
            return this.stockState;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setSystemDiskSize(String systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public String getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

}
