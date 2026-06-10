// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesResponseBody extends TeaModel {
    /**
     * <p>The details of the specifications.</p>
     */
    @NameInMap("DesktopTypes")
    public java.util.List<DescribeDesktopTypesResponseBodyDesktopTypes> desktopTypes;

    /**
     * <p>The request ID.</p>
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
         * <p>The size of the data disk, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        @NameInMap("Description")
        public String description;

        /**
         * <p>The specification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd.graphics.xlarge</p>
         */
        @NameInMap("DesktopTypeId")
        public String desktopTypeId;

        /**
         * <p>The availability of the specification. A value of <code>SUFFICIENT</code> indicates that the specification is in stock.</p>
         * 
         * <strong>example:</strong>
         * <p>SUFFICIENT</p>
         */
        @NameInMap("DesktopTypeStatus")
        public String desktopTypeStatus;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The number of GPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GpuCount")
        public Float gpuCount;

        /**
         * <p>The GPU memory size in MiB. This parameter is valid only for GPU-accelerated cloud desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("GpuMemory")
        public Integer gpuMemory;

        /**
         * <p>The GPU memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>16 GiB</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The instance type family.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd.graphics</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The maximum number of concurrent sessions that is supported by the cloud desktop specification.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxSessionCount")
        public Integer maxSessionCount;

        /**
         * <p>The memory size, in MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>23552</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <p>The purchase options for the specification.</p>
         */
        @NameInMap("Scopes")
        public java.util.List<String> scopes;

        /**
         * <p>The inventory status.</p>
         * 
         * <strong>example:</strong>
         * <p>Sufficient</p>
         */
        @NameInMap("StockState")
        public String stockState;

        /**
         * <p>The size of the system disk, in GiB.</p>
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

        public DescribeDesktopTypesResponseBodyDesktopTypes setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DescribeDesktopTypesResponseBodyDesktopTypes setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
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
