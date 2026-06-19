// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public ModifyInstanceSpecRequestSystemDisk systemDisk;

    @NameInMap("Temporary")
    public ModifyInstanceSpecRequestTemporary temporary;

    /**
     * <p>Specifies whether to support cross-cluster instance type upgrade. Valid values:</p>
     * <ul>
     * <li>true: Cross-cluster instance type upgrade is supported.</li>
     * <li>false: Cross-cluster instance type upgrade is not supported.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>If you set the parameter <code>AllowMigrateAcrossZone</code> to true and upgrade the Elastic Compute Service instance based on the response, take note of the following items:</p>
     * <p>Classic network type instances:</p>
     * <ul>
     * <li><p>For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is changed to an I/O optimized instance, the private IP address, disk device names, and software authorization codes of the instance change. For Linux instances, basic disks (<code>cloud</code>) are identified as <strong>xvda</strong> or <strong>xvdb</strong>, and ultra disks (<code>cloud_efficiency</code>) and standard SSDs (<code>cloud_ssd</code>) are identified as <strong>vda</strong> or <strong>vdb</strong>.</p>
     * </li>
     * <li><p>For <a href="https://help.aliyun.com/document_detail/25378.html">instance families that are available for purchase</a>, the private IP address of the instance changes.</p>
     * </li>
     * </ul>
     * <p>VPC-type instances: For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is changed to an I/O optimized instance, the disk device names and software authorization codes of the instance change. For Linux instances, basic disks (<code>cloud</code>) are identified as <strong>xvda</strong> or <strong>xvdb</strong>, and ultra disks (<code>cloud_efficiency</code>) and standard SSDs (<code>cloud_ssd</code>) are identified as <strong>vda</strong> or <strong>vdb</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowMigrateAcrossZone")
    public Boolean allowMigrateAcrossZone;

    /**
     * <p>Specifies whether to submit an asynchronous request. Valid values:</p>
     * <ul>
     * <li>true: The request is submitted asynchronously.</li>
     * <li>false: The request is not submitted asynchronously.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("Disk")
    public java.util.List<ModifyInstanceSpecRequestDisk> disk;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run. The instance type and public bandwidth are not changed. The system checks whether the required parameters are specified, whether the request format is valid, whether business restrictions are met, and whether ECS resources are sufficient. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
     * <li>false (default): performs a dry run and sends the request. If the check succeeds, the instance type and public bandwidth are changed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The target instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>. You can also call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the most recent instance type list.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <ul>
     * <li>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s: 1 to 10. Default value: 10.</li>
     * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of <code>InternetMaxBandwidthOut</code>. Default value: the value of <code>InternetMaxBandwidthOut</code>.</li>
     * </ul>
     * <blockquote>
     * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are used as upper limits of bandwidths instead of guaranteed performance. When resource contention occurs, the peak bandwidths may be limited. If your business requires guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <blockquote>
     * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are used as upper limits of bandwidths instead of guaranteed performance. When resource contention occurs, the peak bandwidths may be limited. If your business requires guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecRequest self = new ModifyInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecRequest setSystemDisk(ModifyInstanceSpecRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public ModifyInstanceSpecRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public ModifyInstanceSpecRequest setTemporary(ModifyInstanceSpecRequestTemporary temporary) {
        this.temporary = temporary;
        return this;
    }
    public ModifyInstanceSpecRequestTemporary getTemporary() {
        return this.temporary;
    }

    public ModifyInstanceSpecRequest setAllowMigrateAcrossZone(Boolean allowMigrateAcrossZone) {
        this.allowMigrateAcrossZone = allowMigrateAcrossZone;
        return this;
    }
    public Boolean getAllowMigrateAcrossZone() {
        return this.allowMigrateAcrossZone;
    }

    public ModifyInstanceSpecRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public ModifyInstanceSpecRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceSpecRequest setDisk(java.util.List<ModifyInstanceSpecRequestDisk> disk) {
        this.disk = disk;
        return this;
    }
    public java.util.List<ModifyInstanceSpecRequestDisk> getDisk() {
        return this.disk;
    }

    public ModifyInstanceSpecRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyInstanceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceSpecRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyInstanceSpecRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public ModifyInstanceSpecRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public ModifyInstanceSpecRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifyInstanceSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyInstanceSpecRequestSystemDisk extends TeaModel {
        /**
         * <p>更换系统盘类型。取值范围：</p>
         * <ul>
         * <li><p>cloud_efficiency：高效云盘</p>
         * </li>
         * <li><p>cloud_ssd：SSD云盘</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>该参数只有在从<a href="https://help.aliyun.com/document_detail/55263.html">已停售的实例规格</a>升级到<a href="https://help.aliyun.com/document_detail/25378.html">正常售卖的实例规格族</a>，并将非I/O优化实例规格升级为I/O优化实例规格时有效。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        public static ModifyInstanceSpecRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceSpecRequestSystemDisk self = new ModifyInstanceSpecRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceSpecRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class ModifyInstanceSpecRequestTemporary extends TeaModel {
        /**
         * <blockquote>
         * <p>该参数正在邀测中，暂未开放使用。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <blockquote>
         * <p>该参数正在邀测中，暂未开放使用。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <blockquote>
         * <p>该参数正在邀测中，暂未开放使用。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ModifyInstanceSpecRequestTemporary build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceSpecRequestTemporary self = new ModifyInstanceSpecRequestTemporary();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceSpecRequestTemporary setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ModifyInstanceSpecRequestTemporary setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public ModifyInstanceSpecRequestTemporary setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ModifyInstanceSpecRequestDisk extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static ModifyInstanceSpecRequestDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceSpecRequestDisk self = new ModifyInstanceSpecRequestDisk();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceSpecRequestDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyInstanceSpecRequestDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public ModifyInstanceSpecRequestDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

}
