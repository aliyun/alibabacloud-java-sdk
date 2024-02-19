// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class GetDiskResponseBody extends TeaModel {
    /**
     * <p>The information of the disk.</p>
     */
    @NameInMap("Disk")
    public GetDiskResponseBodyDisk disk;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDiskResponseBody self = new GetDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDiskResponseBody setDisk(GetDiskResponseBodyDisk disk) {
        this.disk = disk;
        return this;
    }
    public GetDiskResponseBodyDisk getDisk() {
        return this.disk;
    }

    public GetDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDiskResponseBodyDiskAccessAuthorizationEcs extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetDiskResponseBodyDiskAccessAuthorizationEcs build(java.util.Map<String, ?> map) throws Exception {
            GetDiskResponseBodyDiskAccessAuthorizationEcs self = new GetDiskResponseBodyDiskAccessAuthorizationEcs();
            return TeaModel.build(map, self);
        }

        public GetDiskResponseBodyDiskAccessAuthorizationEcs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class GetDiskResponseBodyDiskAccessAuthorizationPod extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The pod ID.</p>
         */
        @NameInMap("PodId")
        public String podId;

        public static GetDiskResponseBodyDiskAccessAuthorizationPod build(java.util.Map<String, ?> map) throws Exception {
            GetDiskResponseBodyDiskAccessAuthorizationPod self = new GetDiskResponseBodyDiskAccessAuthorizationPod();
            return TeaModel.build(map, self);
        }

        public GetDiskResponseBodyDiskAccessAuthorizationPod setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetDiskResponseBodyDiskAccessAuthorizationPod setPodId(String podId) {
            this.podId = podId;
            return this;
        }
        public String getPodId() {
            return this.podId;
        }

    }

    public static class GetDiskResponseBodyDiskAccessAuthorization extends TeaModel {
        /**
         * <p>The token that is used to access the disk.</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <p>The information of ecs.</p>
         */
        @NameInMap("Ecs")
        public GetDiskResponseBodyDiskAccessAuthorizationEcs ecs;

        /**
         * <p>The information of pod.</p>
         */
        @NameInMap("Pod")
        public GetDiskResponseBodyDiskAccessAuthorizationPod pod;

        public static GetDiskResponseBodyDiskAccessAuthorization build(java.util.Map<String, ?> map) throws Exception {
            GetDiskResponseBodyDiskAccessAuthorization self = new GetDiskResponseBodyDiskAccessAuthorization();
            return TeaModel.build(map, self);
        }

        public GetDiskResponseBodyDiskAccessAuthorization setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public GetDiskResponseBodyDiskAccessAuthorization setEcs(GetDiskResponseBodyDiskAccessAuthorizationEcs ecs) {
            this.ecs = ecs;
            return this;
        }
        public GetDiskResponseBodyDiskAccessAuthorizationEcs getEcs() {
            return this.ecs;
        }

        public GetDiskResponseBodyDiskAccessAuthorization setPod(GetDiskResponseBodyDiskAccessAuthorizationPod pod) {
            this.pod = pod;
            return this;
        }
        public GetDiskResponseBodyDiskAccessAuthorizationPod getPod() {
            return this.pod;
        }

    }

    public static class GetDiskResponseBodyDiskAttachments extends TeaModel {
        /**
         * <p>The time when the disk was attached.</p>
         */
        @NameInMap("AttachedTime")
        public String attachedTime;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public Integer namespaceId;

        public static GetDiskResponseBodyDiskAttachments build(java.util.Map<String, ?> map) throws Exception {
            GetDiskResponseBodyDiskAttachments self = new GetDiskResponseBodyDiskAttachments();
            return TeaModel.build(map, self);
        }

        public GetDiskResponseBodyDiskAttachments setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public GetDiskResponseBodyDiskAttachments setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDiskResponseBodyDiskAttachments setNamespaceId(Integer namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Integer getNamespaceId() {
            return this.namespaceId;
        }

    }

    public static class GetDiskResponseBodyDiskTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetDiskResponseBodyDiskTags build(java.util.Map<String, ?> map) throws Exception {
            GetDiskResponseBodyDiskTags self = new GetDiskResponseBodyDiskTags();
            return TeaModel.build(map, self);
        }

        public GetDiskResponseBodyDiskTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetDiskResponseBodyDiskTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetDiskResponseBodyDisk extends TeaModel {
        /**
         * <p>The access authorization information of the disk.</p>
         */
        @NameInMap("AccessAuthorization")
        public java.util.List<GetDiskResponseBodyDiskAccessAuthorization> accessAuthorization;

        /**
         * <p>The time when the disk was attached.</p>
         */
        @NameInMap("AttachedTime")
        public String attachedTime;

        /**
         * <p>The attachment information of the disk.</p>
         */
        @NameInMap("Attachments")
        public java.util.List<GetDiskResponseBodyDiskAttachments> attachments;

        /**
         * <p>Specifies whether to enable the performance burst feature for the disk. Valid values:</p>
         * <br>
         * <p>* true: enable the performance burst feature.</p>
         * <p>* false: disable the performance burst feature.</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the disk.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the disk was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. For more information, see [ISO 8601](~~25696~~).</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the disk.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the disk was detached.</p>
         */
        @NameInMap("DetachedTime")
        public String detachedTime;

        /**
         * <p>The maximum number of read and write operations per second. Unit: operations/s.</p>
         */
        @NameInMap("DeviceNguid")
        public String deviceNguid;

        /**
         * <p>The ID of the disk.</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The name of the disk.</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the disk. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>IOPS。</p>
         */
        @NameInMap("Iops")
        public Long iops;

        /**
         * <p>The maximum number of read operations per second. Unit: operations/s.</p>
         */
        @NameInMap("IopsRead")
        public Long iopsRead;

        /**
         * <p>The maximum number of write operations per second. Unit: operations/s.</p>
         */
        @NameInMap("IopsWrite")
        public Long iopsWrite;

        /**
         * <p>The ID of the KMS key.</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The time when the disk was modfied.</p>
         */
        @NameInMap("ModifyAt")
        public String modifyAt;

        /**
         * <p>The performance level of the ESSD. Valid values:</p>
         * <br>
         * <p>* PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>* PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>* PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>* PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}</p>
         * <br>
         * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}</p>
         * <br>
         * <p>>  This parameter is available only if the DiskCategory parameter is set to cloud_auto. For more information, see [ESSD AutoPL disks](~~368372~~) and [Modify the performance configurations of an ESSD AutoPL disk](~~413275~~).</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The region ID of the disk. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the disk belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The size of the disk. Unit: GB.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The states of disk. Valid values:</p>
         * <br>
         * <p>* In_use</p>
         * <p>* Available</p>
         * <p>* Attaching</p>
         * <p>* Detaching</p>
         * <p>* Creating</p>
         * <p>* ReIniting</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The details of the tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetDiskResponseBodyDiskTags> tags;

        /**
         * <p>The throughput of the disk.</p>
         * <br>
         * <p>Unit: MB/s.</p>
         */
        @NameInMap("Throughput")
        public Long throughput;

        /**
         * <p>The ID of the zone where the disk resides.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetDiskResponseBodyDisk build(java.util.Map<String, ?> map) throws Exception {
            GetDiskResponseBodyDisk self = new GetDiskResponseBodyDisk();
            return TeaModel.build(map, self);
        }

        public GetDiskResponseBodyDisk setAccessAuthorization(java.util.List<GetDiskResponseBodyDiskAccessAuthorization> accessAuthorization) {
            this.accessAuthorization = accessAuthorization;
            return this;
        }
        public java.util.List<GetDiskResponseBodyDiskAccessAuthorization> getAccessAuthorization() {
            return this.accessAuthorization;
        }

        public GetDiskResponseBodyDisk setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public GetDiskResponseBodyDisk setAttachments(java.util.List<GetDiskResponseBodyDiskAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<GetDiskResponseBodyDiskAttachments> getAttachments() {
            return this.attachments;
        }

        public GetDiskResponseBodyDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public GetDiskResponseBodyDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetDiskResponseBodyDisk setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetDiskResponseBodyDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDiskResponseBodyDisk setDetachedTime(String detachedTime) {
            this.detachedTime = detachedTime;
            return this;
        }
        public String getDetachedTime() {
            return this.detachedTime;
        }

        public GetDiskResponseBodyDisk setDeviceNguid(String deviceNguid) {
            this.deviceNguid = deviceNguid;
            return this;
        }
        public String getDeviceNguid() {
            return this.deviceNguid;
        }

        public GetDiskResponseBodyDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public GetDiskResponseBodyDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public GetDiskResponseBodyDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public GetDiskResponseBodyDisk setIops(Long iops) {
            this.iops = iops;
            return this;
        }
        public Long getIops() {
            return this.iops;
        }

        public GetDiskResponseBodyDisk setIopsRead(Long iopsRead) {
            this.iopsRead = iopsRead;
            return this;
        }
        public Long getIopsRead() {
            return this.iopsRead;
        }

        public GetDiskResponseBodyDisk setIopsWrite(Long iopsWrite) {
            this.iopsWrite = iopsWrite;
            return this;
        }
        public Long getIopsWrite() {
            return this.iopsWrite;
        }

        public GetDiskResponseBodyDisk setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public GetDiskResponseBodyDisk setModifyAt(String modifyAt) {
            this.modifyAt = modifyAt;
            return this;
        }
        public String getModifyAt() {
            return this.modifyAt;
        }

        public GetDiskResponseBodyDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public GetDiskResponseBodyDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public GetDiskResponseBodyDisk setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetDiskResponseBodyDisk setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetDiskResponseBodyDisk setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetDiskResponseBodyDisk setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDiskResponseBodyDisk setTags(java.util.List<GetDiskResponseBodyDiskTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetDiskResponseBodyDiskTags> getTags() {
            return this.tags;
        }

        public GetDiskResponseBodyDisk setThroughput(Long throughput) {
            this.throughput = throughput;
            return this;
        }
        public Long getThroughput() {
            return this.throughput;
        }

        public GetDiskResponseBodyDisk setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
