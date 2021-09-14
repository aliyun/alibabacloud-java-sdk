// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeHostEcsLevelInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HostEcsLevelInfos")
    public java.util.List<DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfos> hostEcsLevelInfos;

    public static DescribeHostEcsLevelInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostEcsLevelInfoResponseBody self = new DescribeHostEcsLevelInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHostEcsLevelInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHostEcsLevelInfoResponseBody setHostEcsLevelInfos(java.util.List<DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfos> hostEcsLevelInfos) {
        this.hostEcsLevelInfos = hostEcsLevelInfos;
        return this;
    }
    public java.util.List<DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfos> getHostEcsLevelInfos() {
        return this.hostEcsLevelInfos;
    }

    public static class DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems extends TeaModel {
        @NameInMap("NetBandWidth")
        public Float netBandWidth;

        @NameInMap("EcsClass")
        public String ecsClass;

        @NameInMap("RdsClassCode")
        public String rdsClassCode;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CpuFrequency")
        public String cpuFrequency;

        @NameInMap("StorageIops")
        public Integer storageIops;

        @NameInMap("CloudStorageBandwidth")
        public Float cloudStorageBandwidth;

        @NameInMap("EcsClassCode")
        public String ecsClassCode;

        @NameInMap("IsCloudDisk")
        public Integer isCloudDisk;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("NetPackage")
        public Integer netPackage;

        @NameInMap("CpuVersion")
        public String cpuVersion;

        @NameInMap("LocalStorage")
        public String localStorage;

        @NameInMap("Description")
        public String description;

        public static DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems self = new DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems();
            return TeaModel.build(map, self);
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setNetBandWidth(Float netBandWidth) {
            this.netBandWidth = netBandWidth;
            return this;
        }
        public Float getNetBandWidth() {
            return this.netBandWidth;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setEcsClass(String ecsClass) {
            this.ecsClass = ecsClass;
            return this;
        }
        public String getEcsClass() {
            return this.ecsClass;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setRdsClassCode(String rdsClassCode) {
            this.rdsClassCode = rdsClassCode;
            return this;
        }
        public String getRdsClassCode() {
            return this.rdsClassCode;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setCpuFrequency(String cpuFrequency) {
            this.cpuFrequency = cpuFrequency;
            return this;
        }
        public String getCpuFrequency() {
            return this.cpuFrequency;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setStorageIops(Integer storageIops) {
            this.storageIops = storageIops;
            return this;
        }
        public Integer getStorageIops() {
            return this.storageIops;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setCloudStorageBandwidth(Float cloudStorageBandwidth) {
            this.cloudStorageBandwidth = cloudStorageBandwidth;
            return this;
        }
        public Float getCloudStorageBandwidth() {
            return this.cloudStorageBandwidth;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setEcsClassCode(String ecsClassCode) {
            this.ecsClassCode = ecsClassCode;
            return this;
        }
        public String getEcsClassCode() {
            return this.ecsClassCode;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setIsCloudDisk(Integer isCloudDisk) {
            this.isCloudDisk = isCloudDisk;
            return this;
        }
        public Integer getIsCloudDisk() {
            return this.isCloudDisk;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setNetPackage(Integer netPackage) {
            this.netPackage = netPackage;
            return this;
        }
        public Integer getNetPackage() {
            return this.netPackage;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setCpuVersion(String cpuVersion) {
            this.cpuVersion = cpuVersion;
            return this;
        }
        public String getCpuVersion() {
            return this.cpuVersion;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setLocalStorage(String localStorage) {
            this.localStorage = localStorage;
            return this;
        }
        public String getLocalStorage() {
            return this.localStorage;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfos extends TeaModel {
        @NameInMap("CddcHostType")
        public String cddcHostType;

        @NameInMap("Items")
        public java.util.List<DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems> items;

        public static DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfos self = new DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfos();
            return TeaModel.build(map, self);
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfos setCddcHostType(String cddcHostType) {
            this.cddcHostType = cddcHostType;
            return this;
        }
        public String getCddcHostType() {
            return this.cddcHostType;
        }

        public DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfos setItems(java.util.List<DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeHostEcsLevelInfoResponseBodyHostEcsLevelInfosItems> getItems() {
            return this.items;
        }

    }

}
