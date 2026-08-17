// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListMachineTypesResponseBody extends TeaModel {
    /**
     * <p>Details of the machine types.</p>
     */
    @NameInMap("MachineTypes")
    public java.util.List<ListMachineTypesResponseBodyMachineTypes> machineTypes;

    /**
     * <p>The token to request the next page of results. Include this token in your next request to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>a3f2224a5ec7224116c4f5246120abe4</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F16BA4D8-FF50-53B6-A026-F443FE31006C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMachineTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMachineTypesResponseBody self = new ListMachineTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMachineTypesResponseBody setMachineTypes(java.util.List<ListMachineTypesResponseBodyMachineTypes> machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public java.util.List<ListMachineTypesResponseBodyMachineTypes> getMachineTypes() {
        return this.machineTypes;
    }

    public ListMachineTypesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMachineTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMachineTypesResponseBodyMachineTypesCpuInfoDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("CpuArch")
        public String cpuArch;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuSockets")
        public Integer cpuSockets;

        /**
         * <strong>example:</strong>
         * <p>192</p>
         */
        @NameInMap("VCpuCores")
        public Integer VCpuCores;

        public static ListMachineTypesResponseBodyMachineTypesCpuInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            ListMachineTypesResponseBodyMachineTypesCpuInfoDetail self = new ListMachineTypesResponseBodyMachineTypesCpuInfoDetail();
            return TeaModel.build(map, self);
        }

        public ListMachineTypesResponseBodyMachineTypesCpuInfoDetail setCpuArch(String cpuArch) {
            this.cpuArch = cpuArch;
            return this;
        }
        public String getCpuArch() {
            return this.cpuArch;
        }

        public ListMachineTypesResponseBodyMachineTypesCpuInfoDetail setCpuSockets(Integer cpuSockets) {
            this.cpuSockets = cpuSockets;
            return this;
        }
        public Integer getCpuSockets() {
            return this.cpuSockets;
        }

        public ListMachineTypesResponseBodyMachineTypesCpuInfoDetail setVCpuCores(Integer VCpuCores) {
            this.VCpuCores = VCpuCores;
            return this;
        }
        public Integer getVCpuCores() {
            return this.VCpuCores;
        }

    }

    public static class ListMachineTypesResponseBodyMachineTypesDiskInfoDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("LocalDiskCount")
        public Integer localDiskCount;

        /**
         * <strong>example:</strong>
         * <p>3.84</p>
         */
        @NameInMap("LocalDiskSizeInTB")
        public Float localDiskSizeInTB;

        /**
         * <strong>example:</strong>
         * <p>NVMe SSD</p>
         */
        @NameInMap("LocalDiskType")
        public String localDiskType;

        public static ListMachineTypesResponseBodyMachineTypesDiskInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            ListMachineTypesResponseBodyMachineTypesDiskInfoDetail self = new ListMachineTypesResponseBodyMachineTypesDiskInfoDetail();
            return TeaModel.build(map, self);
        }

        public ListMachineTypesResponseBodyMachineTypesDiskInfoDetail setLocalDiskCount(Integer localDiskCount) {
            this.localDiskCount = localDiskCount;
            return this;
        }
        public Integer getLocalDiskCount() {
            return this.localDiskCount;
        }

        public ListMachineTypesResponseBodyMachineTypesDiskInfoDetail setLocalDiskSizeInTB(Float localDiskSizeInTB) {
            this.localDiskSizeInTB = localDiskSizeInTB;
            return this;
        }
        public Float getLocalDiskSizeInTB() {
            return this.localDiskSizeInTB;
        }

        public ListMachineTypesResponseBodyMachineTypesDiskInfoDetail setLocalDiskType(String localDiskType) {
            this.localDiskType = localDiskType;
            return this;
        }
        public String getLocalDiskType() {
            return this.localDiskType;
        }

    }

    public static class ListMachineTypesResponseBodyMachineTypesFrontendNetworkDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("FrontendNetworkType")
        public String frontendNetworkType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("JumboFrameSupported")
        public Boolean jumboFrameSupported;

        public static ListMachineTypesResponseBodyMachineTypesFrontendNetworkDetail build(java.util.Map<String, ?> map) throws Exception {
            ListMachineTypesResponseBodyMachineTypesFrontendNetworkDetail self = new ListMachineTypesResponseBodyMachineTypesFrontendNetworkDetail();
            return TeaModel.build(map, self);
        }

        public ListMachineTypesResponseBodyMachineTypesFrontendNetworkDetail setFrontendNetworkType(String frontendNetworkType) {
            this.frontendNetworkType = frontendNetworkType;
            return this;
        }
        public String getFrontendNetworkType() {
            return this.frontendNetworkType;
        }

        public ListMachineTypesResponseBodyMachineTypesFrontendNetworkDetail setJumboFrameSupported(Boolean jumboFrameSupported) {
            this.jumboFrameSupported = jumboFrameSupported;
            return this;
        }
        public Boolean getJumboFrameSupported() {
            return this.jumboFrameSupported;
        }

    }

    public static class ListMachineTypesResponseBodyMachineTypesGpuInfoDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("GpuCount")
        public Integer gpuCount;

        /**
         * <strong>example:</strong>
         * <p>144</p>
         */
        @NameInMap("GpuMemoryInGB")
        public Integer gpuMemoryInGB;

        /**
         * <strong>example:</strong>
         * <p>M890P-144G</p>
         */
        @NameInMap("GpuName")
        public String gpuName;

        /**
         * <strong>example:</strong>
         * <p>T-HEAD</p>
         */
        @NameInMap("GpuVendor")
        public String gpuVendor;

        /**
         * <strong>example:</strong>
         * <p>9216</p>
         */
        @NameInMap("TotalGpuMemoryInGB")
        public Integer totalGpuMemoryInGB;

        public static ListMachineTypesResponseBodyMachineTypesGpuInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            ListMachineTypesResponseBodyMachineTypesGpuInfoDetail self = new ListMachineTypesResponseBodyMachineTypesGpuInfoDetail();
            return TeaModel.build(map, self);
        }

        public ListMachineTypesResponseBodyMachineTypesGpuInfoDetail setGpuCount(Integer gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Integer getGpuCount() {
            return this.gpuCount;
        }

        public ListMachineTypesResponseBodyMachineTypesGpuInfoDetail setGpuMemoryInGB(Integer gpuMemoryInGB) {
            this.gpuMemoryInGB = gpuMemoryInGB;
            return this;
        }
        public Integer getGpuMemoryInGB() {
            return this.gpuMemoryInGB;
        }

        public ListMachineTypesResponseBodyMachineTypesGpuInfoDetail setGpuName(String gpuName) {
            this.gpuName = gpuName;
            return this;
        }
        public String getGpuName() {
            return this.gpuName;
        }

        public ListMachineTypesResponseBodyMachineTypesGpuInfoDetail setGpuVendor(String gpuVendor) {
            this.gpuVendor = gpuVendor;
            return this;
        }
        public String getGpuVendor() {
            return this.gpuVendor;
        }

        public ListMachineTypesResponseBodyMachineTypesGpuInfoDetail setTotalGpuMemoryInGB(Integer totalGpuMemoryInGB) {
            this.totalGpuMemoryInGB = totalGpuMemoryInGB;
            return this;
        }
        public Integer getTotalGpuMemoryInGB() {
            return this.totalGpuMemoryInGB;
        }

    }

    public static class ListMachineTypesResponseBodyMachineTypesMemoryInfoDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("MemorySizeInGB")
        public Integer memorySizeInGB;

        public static ListMachineTypesResponseBodyMachineTypesMemoryInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            ListMachineTypesResponseBodyMachineTypesMemoryInfoDetail self = new ListMachineTypesResponseBodyMachineTypesMemoryInfoDetail();
            return TeaModel.build(map, self);
        }

        public ListMachineTypesResponseBodyMachineTypesMemoryInfoDetail setMemorySizeInGB(Integer memorySizeInGB) {
            this.memorySizeInGB = memorySizeInGB;
            return this;
        }
        public Integer getMemorySizeInGB() {
            return this.memorySizeInGB;
        }

    }

    public static class ListMachineTypesResponseBodyMachineTypesRdmaInfoDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("BackendRdmaNicBwInGbps")
        public Integer backendRdmaNicBwInGbps;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("BackendRdmaNicCount")
        public Integer backendRdmaNicCount;

        public static ListMachineTypesResponseBodyMachineTypesRdmaInfoDetail build(java.util.Map<String, ?> map) throws Exception {
            ListMachineTypesResponseBodyMachineTypesRdmaInfoDetail self = new ListMachineTypesResponseBodyMachineTypesRdmaInfoDetail();
            return TeaModel.build(map, self);
        }

        public ListMachineTypesResponseBodyMachineTypesRdmaInfoDetail setBackendRdmaNicBwInGbps(Integer backendRdmaNicBwInGbps) {
            this.backendRdmaNicBwInGbps = backendRdmaNicBwInGbps;
            return this;
        }
        public Integer getBackendRdmaNicBwInGbps() {
            return this.backendRdmaNicBwInGbps;
        }

        public ListMachineTypesResponseBodyMachineTypesRdmaInfoDetail setBackendRdmaNicCount(Integer backendRdmaNicCount) {
            this.backendRdmaNicCount = backendRdmaNicCount;
            return this;
        }
        public Integer getBackendRdmaNicCount() {
            return this.backendRdmaNicCount;
        }

    }

    public static class ListMachineTypesResponseBodyMachineTypes extends TeaModel {
        /**
         * <p>The number of bonds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BondNum")
        public Integer bondNum;

        /**
         * <p>CPU information.</p>
         * 
         * <strong>example:</strong>
         * <p>2x Intel Icelake 8369B 32C CPU</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        @NameInMap("CpuInfoDetail")
        public ListMachineTypesResponseBodyMachineTypesCpuInfoDetail cpuInfoDetail;

        /**
         * <p>Disk information.</p>
         * 
         * <strong>example:</strong>
         * <p>2x 480GB SATA SSD</p>
         */
        @NameInMap("DiskInfo")
        public String diskInfo;

        @NameInMap("DiskInfoDetail")
        public ListMachineTypesResponseBodyMachineTypesDiskInfoDetail diskInfoDetail;

        @NameInMap("FrontendNetworkDetail")
        public ListMachineTypesResponseBodyMachineTypesFrontendNetworkDetail frontendNetworkDetail;

        /**
         * <p>GPU information.</p>
         * 
         * <strong>example:</strong>
         * <p>8x NVIDIA SXM4 80GB A100 GPU</p>
         */
        @NameInMap("GpuInfo")
        public String gpuInfo;

        @NameInMap("GpuInfoDetail")
        public ListMachineTypesResponseBodyMachineTypesGpuInfoDetail gpuInfoDetail;

        /**
         * <p>Memory information.</p>
         * 
         * <strong>example:</strong>
         * <p>32x 64GB DDR4 3200 Memory</p>
         */
        @NameInMap("MemoryInfo")
        public String memoryInfo;

        @NameInMap("MemoryInfoDetail")
        public ListMachineTypesResponseBodyMachineTypesMemoryInfoDetail memoryInfoDetail;

        /**
         * <p>The name of the machine type.</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Network information.</p>
         * 
         * <strong>example:</strong>
         * <p>2x 100Gbps DP NIC</p>
         */
        @NameInMap("NetworkInfo")
        public String networkInfo;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NodeCount")
        public String nodeCount;

        @NameInMap("RdmaInfoDetail")
        public ListMachineTypesResponseBodyMachineTypesRdmaInfoDetail rdmaInfoDetail;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("TotalCpuCore")
        public Integer totalCpuCore;

        /**
         * <p>The type of the machine type.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListMachineTypesResponseBodyMachineTypes build(java.util.Map<String, ?> map) throws Exception {
            ListMachineTypesResponseBodyMachineTypes self = new ListMachineTypesResponseBodyMachineTypes();
            return TeaModel.build(map, self);
        }

        public ListMachineTypesResponseBodyMachineTypes setBondNum(Integer bondNum) {
            this.bondNum = bondNum;
            return this;
        }
        public Integer getBondNum() {
            return this.bondNum;
        }

        public ListMachineTypesResponseBodyMachineTypes setCpuInfo(String cpuInfo) {
            this.cpuInfo = cpuInfo;
            return this;
        }
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        public ListMachineTypesResponseBodyMachineTypes setCpuInfoDetail(ListMachineTypesResponseBodyMachineTypesCpuInfoDetail cpuInfoDetail) {
            this.cpuInfoDetail = cpuInfoDetail;
            return this;
        }
        public ListMachineTypesResponseBodyMachineTypesCpuInfoDetail getCpuInfoDetail() {
            return this.cpuInfoDetail;
        }

        public ListMachineTypesResponseBodyMachineTypes setDiskInfo(String diskInfo) {
            this.diskInfo = diskInfo;
            return this;
        }
        public String getDiskInfo() {
            return this.diskInfo;
        }

        public ListMachineTypesResponseBodyMachineTypes setDiskInfoDetail(ListMachineTypesResponseBodyMachineTypesDiskInfoDetail diskInfoDetail) {
            this.diskInfoDetail = diskInfoDetail;
            return this;
        }
        public ListMachineTypesResponseBodyMachineTypesDiskInfoDetail getDiskInfoDetail() {
            return this.diskInfoDetail;
        }

        public ListMachineTypesResponseBodyMachineTypes setFrontendNetworkDetail(ListMachineTypesResponseBodyMachineTypesFrontendNetworkDetail frontendNetworkDetail) {
            this.frontendNetworkDetail = frontendNetworkDetail;
            return this;
        }
        public ListMachineTypesResponseBodyMachineTypesFrontendNetworkDetail getFrontendNetworkDetail() {
            return this.frontendNetworkDetail;
        }

        public ListMachineTypesResponseBodyMachineTypes setGpuInfo(String gpuInfo) {
            this.gpuInfo = gpuInfo;
            return this;
        }
        public String getGpuInfo() {
            return this.gpuInfo;
        }

        public ListMachineTypesResponseBodyMachineTypes setGpuInfoDetail(ListMachineTypesResponseBodyMachineTypesGpuInfoDetail gpuInfoDetail) {
            this.gpuInfoDetail = gpuInfoDetail;
            return this;
        }
        public ListMachineTypesResponseBodyMachineTypesGpuInfoDetail getGpuInfoDetail() {
            return this.gpuInfoDetail;
        }

        public ListMachineTypesResponseBodyMachineTypes setMemoryInfo(String memoryInfo) {
            this.memoryInfo = memoryInfo;
            return this;
        }
        public String getMemoryInfo() {
            return this.memoryInfo;
        }

        public ListMachineTypesResponseBodyMachineTypes setMemoryInfoDetail(ListMachineTypesResponseBodyMachineTypesMemoryInfoDetail memoryInfoDetail) {
            this.memoryInfoDetail = memoryInfoDetail;
            return this;
        }
        public ListMachineTypesResponseBodyMachineTypesMemoryInfoDetail getMemoryInfoDetail() {
            return this.memoryInfoDetail;
        }

        public ListMachineTypesResponseBodyMachineTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMachineTypesResponseBodyMachineTypes setNetworkInfo(String networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }
        public String getNetworkInfo() {
            return this.networkInfo;
        }

        public ListMachineTypesResponseBodyMachineTypes setNodeCount(String nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public String getNodeCount() {
            return this.nodeCount;
        }

        public ListMachineTypesResponseBodyMachineTypes setRdmaInfoDetail(ListMachineTypesResponseBodyMachineTypesRdmaInfoDetail rdmaInfoDetail) {
            this.rdmaInfoDetail = rdmaInfoDetail;
            return this;
        }
        public ListMachineTypesResponseBodyMachineTypesRdmaInfoDetail getRdmaInfoDetail() {
            return this.rdmaInfoDetail;
        }

        public ListMachineTypesResponseBodyMachineTypes setTotalCpuCore(Integer totalCpuCore) {
            this.totalCpuCore = totalCpuCore;
            return this;
        }
        public Integer getTotalCpuCore() {
            return this.totalCpuCore;
        }

        public ListMachineTypesResponseBodyMachineTypes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
