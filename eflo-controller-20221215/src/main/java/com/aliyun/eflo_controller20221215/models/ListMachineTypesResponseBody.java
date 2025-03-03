// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListMachineTypesResponseBody extends TeaModel {
    /**
     * <p>Details of the machine types</p>
     */
    @NameInMap("MachineTypes")
    public java.util.List<ListMachineTypesResponseBodyMachineTypes> machineTypes;

    /**
     * <p>NextToken for the next page, include this value when requesting the next page</p>
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

    public static class ListMachineTypesResponseBodyMachineTypes extends TeaModel {
        /**
         * <p>Number of bonds</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BondNum")
        public Integer bondNum;

        /**
         * <p>CPU information</p>
         * 
         * <strong>example:</strong>
         * <p>2x Intel Icelake 8369B 32C CPU</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        /**
         * <p>Disk information</p>
         * 
         * <strong>example:</strong>
         * <p>2x 480GB SATA SSD</p>
         */
        @NameInMap("DiskInfo")
        public String diskInfo;

        /**
         * <p>GPU information</p>
         * 
         * <strong>example:</strong>
         * <p>8x NVIDIA SXM4 80GB A100 GPU</p>
         */
        @NameInMap("GpuInfo")
        public String gpuInfo;

        /**
         * <p>Memory information</p>
         * 
         * <strong>example:</strong>
         * <p>32x 64GB DDR4 3200 Memory</p>
         */
        @NameInMap("MemoryInfo")
        public String memoryInfo;

        /**
         * <p>Machine name</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Network information</p>
         * 
         * <strong>example:</strong>
         * <p>2x 100Gbps DP NIC</p>
         */
        @NameInMap("NetworkInfo")
        public String networkInfo;

        /**
         * <p>Number of nodes</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NodeCount")
        public String nodeCount;

        /**
         * <p>Number of CPU cores</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("TotalCpuCore")
        public Integer totalCpuCore;

        /**
         * <p>Type of machine</p>
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

        public ListMachineTypesResponseBodyMachineTypes setDiskInfo(String diskInfo) {
            this.diskInfo = diskInfo;
            return this;
        }
        public String getDiskInfo() {
            return this.diskInfo;
        }

        public ListMachineTypesResponseBodyMachineTypes setGpuInfo(String gpuInfo) {
            this.gpuInfo = gpuInfo;
            return this;
        }
        public String getGpuInfo() {
            return this.gpuInfo;
        }

        public ListMachineTypesResponseBodyMachineTypes setMemoryInfo(String memoryInfo) {
            this.memoryInfo = memoryInfo;
            return this;
        }
        public String getMemoryInfo() {
            return this.memoryInfo;
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
