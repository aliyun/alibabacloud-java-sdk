// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CapacityPlanResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E91B7129-A669-4D9D-A743-F90A0FF1F5EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     */
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
        /**
         * <p>The configuration type. The only valid value is sharedDisk.</p>
         * <blockquote>
         * <p>This extendConfigs property may appear when the planned instance type is Advanced Edition (advanced).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sharedDisk</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>The disk size, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Disk")
        public Long disk;

        /**
         * <p>The disk type. The only valid value is CPFS_PREMIUM.</p>
         * <blockquote>
         * <p>This extendConfigs property may appear when the planned instance type is Advanced Edition (advanced).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CPFS_PREMIUM</p>
         */
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
        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <p>The number of CPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Long cpu;

        /**
         * <p>The disk size, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Disk")
        public Long disk;

        /**
         * <p>The disk type. Valid values:</p>
         * <ul>
         * <li><p>cloud_essd: ESSD</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD</p>
         * </li>
         * <li><p>cloud_efficiency: ultra cloud disk</p>
         * </li>
         * <li><p>local_ssd: local SSD</p>
         * </li>
         * <li><p>local_efficiency: local ultra disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The memory size of the specifications for the current node role.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><p>WORKER: data node</p>
         * </li>
         * <li><p>WORKER_WARM: warm node</p>
         * </li>
         * <li><p>MASTER: dedicated master node</p>
         * </li>
         * <li><p>KIBANA: Kibana node</p>
         * </li>
         * <li><p>COORDINATING: client node</p>
         * </li>
         * <li><p>ELASTIC_WORKER: elastic node.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WORKER</p>
         */
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
        /**
         * <p>The extended configuration information.</p>
         */
        @NameInMap("ExtendConfigs")
        public java.util.List<CapacityPlanResponseBodyResultExtendConfigs> extendConfigs;

        /**
         * <p>The edition type. Valid values:</p>
         * <ul>
         * <li><p>advanced: Advanced Edition</p>
         * </li>
         * <li><p>x-pack: Commercial Edition</p>
         * </li>
         * <li><p>community: Community Edition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        @NameInMap("InstanceCategory")
        public String instanceCategory;

        /**
         * <p>The node information.</p>
         */
        @NameInMap("NodeConfigurations")
        public java.util.List<CapacityPlanResponseBodyResultNodeConfigurations> nodeConfigurations;

        /**
         * <p>The result calculated based on capacity planning. No default value is available. Valid values:</p>
         * <ul>
         * <li><p>true: The cluster is oversized. The number of data nodes calculated by capacity planning exceeds the threshold of 50.</p>
         * </li>
         * <li><p>false: The number of data nodes calculated by capacity planning is within 50.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
