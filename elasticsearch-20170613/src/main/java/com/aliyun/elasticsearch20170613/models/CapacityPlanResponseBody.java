// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CapacityPlanResponseBody extends TeaModel {
    /**
     * <p>The response of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E91B7129-A669-4D9D-A743-F90A0FF1F5EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The extension configuration information.</p>
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
         * <p>The size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>sharedDisk</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>The type of the disk. Valid value: CPFS_PREMIUM.</p>
         * <blockquote>
         * <p> The extendConfigs attribute that may occur when the planned instance type is enhanced (advanced).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Disk")
        public Long disk;

        /**
         * <p>The version type. Valid values:</p>
         * <ul>
         * <li>advanced: enhanced edition</li>
         * <li>x-pack: Commercial Edition</li>
         * <li>community: community version</li>
         * </ul>
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
         * <p>The number of CPUs of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public Long cpu;

        /**
         * <p>The type of the hard disk. Valid values:</p>
         * <ul>
         * <li>cloud_essd: enhanced SSD (ESSD)</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>local_ssd: local SSD</li>
         * <li>local_efficiency: local ultra disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Disk")
        public Long disk;

        /**
         * <p>The memory size of the current node role.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The type of the node. Supported types are as follows:</p>
         * <ul>
         * <li>WORKER: data node</li>
         * <li>WORKER_WARM: cold data node</li>
         * <li>MASTER: dedicated master node</li>
         * <li>KIBANA: Kibana node</li>
         * <li>COORDINATING: client node</li>
         * <li>ELASTIC_WORKER: elastic node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The result calculated based on the capacity planning. No default value is available. The values are as follows:</p>
         * <ul>
         * <li>true: indicates that the number of data nodes calculated by capacity planning exceeds the threshold of 50.</li>
         * <li>false: The number of data nodes calculated by capacity planning is less than 50.</li>
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
         * <p>The type of the configuration. Set the value to sharedDisk.</p>
         * <blockquote>
         * <p> The extendConfigs attribute that may occur when the planned instance type is enhanced (advanced).</p>
         * </blockquote>
         */
        @NameInMap("ExtendConfigs")
        public java.util.List<CapacityPlanResponseBodyResultExtendConfigs> extendConfigs;

        /**
         * <p>The node information.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        @NameInMap("InstanceCategory")
        public String instanceCategory;

        /**
         * <p>The number of cores.</p>
         */
        @NameInMap("NodeConfigurations")
        public java.util.List<CapacityPlanResponseBodyResultNodeConfigurations> nodeConfigurations;

        /**
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
