// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CapacityPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CapacityPlanResponseBodyResult result;

    public static CapacityPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CapacityPlanResponseBody self = new CapacityPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CapacityPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CapacityPlanResponseBody setResult(CapacityPlanResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CapacityPlanResponseBodyResult getResult() {
        return this.result;
    }

    public static class CapacityPlanResponseBodyResultExtendConfigs extends TeaModel {
        @NameInMap("ConfigType")
        public String configType;

        @NameInMap("Disk")
        public Long disk;

        @NameInMap("DiskType")
        public String diskType;

        public static CapacityPlanResponseBodyResultExtendConfigs build(java.util.Map<String, ?> map) throws Exception {
            CapacityPlanResponseBodyResultExtendConfigs self = new CapacityPlanResponseBodyResultExtendConfigs();
            return TeaModel.build(map, self);
        }

        public CapacityPlanResponseBodyResultExtendConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public CapacityPlanResponseBodyResultExtendConfigs setDisk(Long disk) {
            this.disk = disk;
            return this;
        }
        public Long getDisk() {
            return this.disk;
        }

        public CapacityPlanResponseBodyResultExtendConfigs setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class CapacityPlanResponseBodyResultNodeConfigurations extends TeaModel {
        @NameInMap("Amount")
        public Long amount;

        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("Disk")
        public Long disk;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("NodeType")
        public String nodeType;

        public static CapacityPlanResponseBodyResultNodeConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CapacityPlanResponseBodyResultNodeConfigurations self = new CapacityPlanResponseBodyResultNodeConfigurations();
            return TeaModel.build(map, self);
        }

        public CapacityPlanResponseBodyResultNodeConfigurations setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public CapacityPlanResponseBodyResultNodeConfigurations setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public CapacityPlanResponseBodyResultNodeConfigurations setDisk(Long disk) {
            this.disk = disk;
            return this;
        }
        public Long getDisk() {
            return this.disk;
        }

        public CapacityPlanResponseBodyResultNodeConfigurations setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public CapacityPlanResponseBodyResultNodeConfigurations setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public CapacityPlanResponseBodyResultNodeConfigurations setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

    public static class CapacityPlanResponseBodyResult extends TeaModel {
        @NameInMap("ExtendConfigs")
        public java.util.List<CapacityPlanResponseBodyResultExtendConfigs> extendConfigs;

        @NameInMap("InstanceCategory")
        public String instanceCategory;

        @NameInMap("NodeConfigurations")
        public java.util.List<CapacityPlanResponseBodyResultNodeConfigurations> nodeConfigurations;

        @NameInMap("OversizedCluster")
        public Boolean oversizedCluster;

        public static CapacityPlanResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CapacityPlanResponseBodyResult self = new CapacityPlanResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CapacityPlanResponseBodyResult setExtendConfigs(java.util.List<CapacityPlanResponseBodyResultExtendConfigs> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<CapacityPlanResponseBodyResultExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        public CapacityPlanResponseBodyResult setInstanceCategory(String instanceCategory) {
            this.instanceCategory = instanceCategory;
            return this;
        }
        public String getInstanceCategory() {
            return this.instanceCategory;
        }

        public CapacityPlanResponseBodyResult setNodeConfigurations(java.util.List<CapacityPlanResponseBodyResultNodeConfigurations> nodeConfigurations) {
            this.nodeConfigurations = nodeConfigurations;
            return this;
        }
        public java.util.List<CapacityPlanResponseBodyResultNodeConfigurations> getNodeConfigurations() {
            return this.nodeConfigurations;
        }

        public CapacityPlanResponseBodyResult setOversizedCluster(Boolean oversizedCluster) {
            this.oversizedCluster = oversizedCluster;
            return this;
        }
        public Boolean getOversizedCluster() {
            return this.oversizedCluster;
        }

    }

}
