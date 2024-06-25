// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleOutClusterRequest extends TeaModel {
    /**
     * <p>Specifies whether to install the CloudMonitor agent. Valid values:</p>
     * <ul>
     * <li><code>true</code>: installs the CloudMonitor agent.</li>
     * <li><code>false</code>: does not install the CloudMonitor agent.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("cloud_monitor_flags")
    public Boolean cloudMonitorFlags;

    /**
     * <p>The number of worker nodes that you want to add.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <p>The CPU management policy of the nodes in a node pool. The following policies are supported if the Kubernetes version of the cluster is 1.12.6 or later.</p>
     * <ul>
     * <li><code>static</code>: This policy allows pods with specific resource characteristics on the node to be granted with enhanced CPU affinity and exclusivity.</li>
     * <li><code>none</code>: The default CPU affinity is used.</li>
     * </ul>
     * <p>Default value: <code>none</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("cpu_policy")
    public String cpuPolicy;

    /**
     * <p>Specifies a custom image for nodes. By default, the image provided by Container Service for Kubernetes (ACK) is used. You can select a custom image to replace the default image. For more information, see <a href="https://help.aliyun.com/document_detail/146647.html">Custom images</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp16z7xko3vvv8gt****</p>
     */
    @NameInMap("image_id")
    public String imageId;

    /**
     * <p>The name of the key pair. You must set this parameter or the <code>login_password</code> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secrity-key</p>
     */
    @NameInMap("key_pair")
    public String keyPair;

    /**
     * <p>The password for SSH logon. You must set this parameter or the <code>key_pair</code> parameter. The password must be 8 to 30 characters in length, and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello@1234</p>
     */
    @NameInMap("login_password")
    public String loginPassword;

    /**
     * <p>After you specify the list of ApsaraDB RDS instances, the ECS instances in the cluster are automatically added to the whitelist of the ApsaraDB RDS instances.</p>
     */
    @NameInMap("rds_instances")
    public java.util.List<String> rdsInstances;

    /**
     * <p>The container runtime.</p>
     */
    @NameInMap("runtime")
    public Runtime runtime;

    /**
     * <p>The labels that you want to add to nodes. You must add labels based on the following rules:</p>
     * <ul>
     * <li>Each label is a case-sensitive key-value pair. You can add up to 20 labels.</li>
     * <li>A key must be unique and cannot exceed 64 characters in length. A value can be empty and cannot exceed 128 characters in length. Keys and values cannot start with aliyun, acs:, https://, or http://. For more information, see <a href="https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#syntax-and-character-set">Labels and Selectors</a>.</li>
     * </ul>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The taints that you want to add to nodes. Taints are added to nodes to prevent pods from being scheduled to inappropriate nodes. However, tolerations allow pods to be scheduled to nodes with matching taints. For more information, see <a href="https://kubernetes.io/zh/docs/concepts/scheduling-eviction/taint-and-toleration/">Taints and Tolerations</a>.</p>
     */
    @NameInMap("taints")
    public java.util.List<Taint> taints;

    /**
     * <p>The user data of the node pool. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Generate user-defined data</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>IyEvdXNyL2Jpbi9iYXNoCmVjaG8gIkhlbGxvIEFD****</p>
     */
    @NameInMap("user_data")
    public String userData;

    /**
     * <p>The IDs of the vSwitches. You can select one to three vSwitches when you create a cluster. We recommend that you select vSwitches in different zones to ensure high availability.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("vswitch_ids")
    public java.util.List<String> vswitchIds;

    /**
     * <p>Specifies whether to enable auto-renewal for worker nodes. This parameter takes effect only if <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables auto-renewal.</li>
     * <li><code>false</code>: disables auto-renewal.</li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("worker_auto_renew")
    public Boolean workerAutoRenew;

    /**
     * <p>The auto-renewal period for worker nodes after the subscriptions of worker nodes expire. This parameter takes effect and is required only if the subscription billing method is selected for worker nodes.</p>
     * <p>Valid values: 1, 2, 3, 6, and 12.</p>
     * <p>Default value: <code>1</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("worker_auto_renew_period")
    public Long workerAutoRenewPeriod;

    /**
     * <p>The configuration of the data disk that is mounted to worker nodes. The configuration includes the disk type and disk size.</p>
     */
    @NameInMap("worker_data_disks")
    public java.util.List<ScaleOutClusterRequestWorkerDataDisks> workerDataDisks;

    /**
     * <p>The billing method of worker nodes. Valid values:</p>
     * <ul>
     * <li><code>PrePaid</code>: subscription.</li>
     * <li><code>PostPaid</code>: pay-as-you-go.</li>
     * </ul>
     * <p>Default value: <code>PostPaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("worker_instance_charge_type")
    public String workerInstanceChargeType;

    /**
     * <p>The instance configurations of worker nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("worker_instance_types")
    public java.util.List<String> workerInstanceTypes;

    /**
     * <p>The subscription duration of worker nodes. This parameter takes effect and is required only if <code>worker_instance_charge_type</code> is set to <code>PrePaid</code>.</p>
     * <p>Valid values: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("worker_period")
    public Long workerPeriod;

    /**
     * <p>The billing cycle of worker nodes. This parameter is required if worker_instance_charge_type is set to <code>PrePaid</code>.</p>
     * <p>Set the value to <code>Month</code>. Worker nodes are billed only on a monthly basis.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("worker_period_unit")
    public String workerPeriodUnit;

    /**
     * <p>The type of system disk that you want to use for worker nodes. Valid values:</p>
     * <ul>
     * <li><code>cloud_efficiency</code>: ultra disk.</li>
     * <li><code>cloud_ssd</code>: standard SSD.</li>
     * <li><code>cloud_essd</code>: enhanced SSD (ESSD).</li>
     * </ul>
     * <p>Default value: <code>cloud_ssd</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("worker_system_disk_category")
    public String workerSystemDiskCategory;

    /**
     * <p>The size of the system disk that you want to use for worker nodes. Unit: GiB.</p>
     * <p>Valid values: 40 to 500.</p>
     * <p>Default value: <code>120</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("worker_system_disk_size")
    public Long workerSystemDiskSize;

    public static ScaleOutClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutClusterRequest self = new ScaleOutClusterRequest();
        return TeaModel.build(map, self);
    }

    public ScaleOutClusterRequest setCloudMonitorFlags(Boolean cloudMonitorFlags) {
        this.cloudMonitorFlags = cloudMonitorFlags;
        return this;
    }
    public Boolean getCloudMonitorFlags() {
        return this.cloudMonitorFlags;
    }

    public ScaleOutClusterRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ScaleOutClusterRequest setCpuPolicy(String cpuPolicy) {
        this.cpuPolicy = cpuPolicy;
        return this;
    }
    public String getCpuPolicy() {
        return this.cpuPolicy;
    }

    public ScaleOutClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ScaleOutClusterRequest setKeyPair(String keyPair) {
        this.keyPair = keyPair;
        return this;
    }
    public String getKeyPair() {
        return this.keyPair;
    }

    public ScaleOutClusterRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public ScaleOutClusterRequest setRdsInstances(java.util.List<String> rdsInstances) {
        this.rdsInstances = rdsInstances;
        return this;
    }
    public java.util.List<String> getRdsInstances() {
        return this.rdsInstances;
    }

    public ScaleOutClusterRequest setRuntime(Runtime runtime) {
        this.runtime = runtime;
        return this;
    }
    public Runtime getRuntime() {
        return this.runtime;
    }

    public ScaleOutClusterRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public ScaleOutClusterRequest setTaints(java.util.List<Taint> taints) {
        this.taints = taints;
        return this;
    }
    public java.util.List<Taint> getTaints() {
        return this.taints;
    }

    public ScaleOutClusterRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public ScaleOutClusterRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public ScaleOutClusterRequest setWorkerAutoRenew(Boolean workerAutoRenew) {
        this.workerAutoRenew = workerAutoRenew;
        return this;
    }
    public Boolean getWorkerAutoRenew() {
        return this.workerAutoRenew;
    }

    public ScaleOutClusterRequest setWorkerAutoRenewPeriod(Long workerAutoRenewPeriod) {
        this.workerAutoRenewPeriod = workerAutoRenewPeriod;
        return this;
    }
    public Long getWorkerAutoRenewPeriod() {
        return this.workerAutoRenewPeriod;
    }

    public ScaleOutClusterRequest setWorkerDataDisks(java.util.List<ScaleOutClusterRequestWorkerDataDisks> workerDataDisks) {
        this.workerDataDisks = workerDataDisks;
        return this;
    }
    public java.util.List<ScaleOutClusterRequestWorkerDataDisks> getWorkerDataDisks() {
        return this.workerDataDisks;
    }

    public ScaleOutClusterRequest setWorkerInstanceChargeType(String workerInstanceChargeType) {
        this.workerInstanceChargeType = workerInstanceChargeType;
        return this;
    }
    public String getWorkerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }

    public ScaleOutClusterRequest setWorkerInstanceTypes(java.util.List<String> workerInstanceTypes) {
        this.workerInstanceTypes = workerInstanceTypes;
        return this;
    }
    public java.util.List<String> getWorkerInstanceTypes() {
        return this.workerInstanceTypes;
    }

    public ScaleOutClusterRequest setWorkerPeriod(Long workerPeriod) {
        this.workerPeriod = workerPeriod;
        return this;
    }
    public Long getWorkerPeriod() {
        return this.workerPeriod;
    }

    public ScaleOutClusterRequest setWorkerPeriodUnit(String workerPeriodUnit) {
        this.workerPeriodUnit = workerPeriodUnit;
        return this;
    }
    public String getWorkerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    public ScaleOutClusterRequest setWorkerSystemDiskCategory(String workerSystemDiskCategory) {
        this.workerSystemDiskCategory = workerSystemDiskCategory;
        return this;
    }
    public String getWorkerSystemDiskCategory() {
        return this.workerSystemDiskCategory;
    }

    public ScaleOutClusterRequest setWorkerSystemDiskSize(Long workerSystemDiskSize) {
        this.workerSystemDiskSize = workerSystemDiskSize;
        return this;
    }
    public Long getWorkerSystemDiskSize() {
        return this.workerSystemDiskSize;
    }

    public static class ScaleOutClusterRequestWorkerDataDisks extends TeaModel {
        /**
         * <p>The ID of an automatic snapshot policy. Automatic backup is performed for a disk based on the specified automatic snapshot policy.</p>
         * <p>By default, this parameter is empty, which indicates that automatic backup is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp14yziiuvu3s6jn****</p>
         */
        @NameInMap("auto_snapshot_policy_id")
        public String autoSnapshotPolicyId;

        /**
         * <p>The data disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Specifies whether to encrypt the data disks. Valid values:</p>
         * <ul>
         * <li><code>true</code>: encrypts data disks.</li>
         * <li><code>false</code>: does not encrypt data disks.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("encrypted")
        public String encrypted;

        /**
         * <p>The size of the data disk. Valid values: 40 to 32767.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("size")
        public String size;

        public static ScaleOutClusterRequestWorkerDataDisks build(java.util.Map<String, ?> map) throws Exception {
            ScaleOutClusterRequestWorkerDataDisks self = new ScaleOutClusterRequestWorkerDataDisks();
            return TeaModel.build(map, self);
        }

        public ScaleOutClusterRequestWorkerDataDisks setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public ScaleOutClusterRequestWorkerDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ScaleOutClusterRequestWorkerDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public ScaleOutClusterRequestWorkerDataDisks setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}
