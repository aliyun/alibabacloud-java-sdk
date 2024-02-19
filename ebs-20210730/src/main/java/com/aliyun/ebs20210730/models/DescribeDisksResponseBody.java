// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDisksResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeDisksResponseBodyData> data;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksResponseBody self = new DescribeDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisksResponseBody setData(java.util.List<DescribeDisksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDisksResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDisksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDisksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDisksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDisksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDisksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDisksResponseBodyDataAccessAuthorizationEcs extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeDisksResponseBodyDataAccessAuthorizationEcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDataAccessAuthorizationEcs self = new DescribeDisksResponseBodyDataAccessAuthorizationEcs();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDataAccessAuthorizationEcs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeDisksResponseBodyDataAccessAuthorizationPod extends TeaModel {
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

        public static DescribeDisksResponseBodyDataAccessAuthorizationPod build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDataAccessAuthorizationPod self = new DescribeDisksResponseBodyDataAccessAuthorizationPod();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDataAccessAuthorizationPod setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeDisksResponseBodyDataAccessAuthorizationPod setPodId(String podId) {
            this.podId = podId;
            return this;
        }
        public String getPodId() {
            return this.podId;
        }

    }

    public static class DescribeDisksResponseBodyDataAccessAuthorization extends TeaModel {
        /**
         * <p>The token that is used to access the disk.</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <p>The information of ecs.</p>
         */
        @NameInMap("Ecs")
        public DescribeDisksResponseBodyDataAccessAuthorizationEcs ecs;

        /**
         * <p>The information of pod.</p>
         */
        @NameInMap("Pod")
        public DescribeDisksResponseBodyDataAccessAuthorizationPod pod;

        public static DescribeDisksResponseBodyDataAccessAuthorization build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDataAccessAuthorization self = new DescribeDisksResponseBodyDataAccessAuthorization();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDataAccessAuthorization setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public DescribeDisksResponseBodyDataAccessAuthorization setEcs(DescribeDisksResponseBodyDataAccessAuthorizationEcs ecs) {
            this.ecs = ecs;
            return this;
        }
        public DescribeDisksResponseBodyDataAccessAuthorizationEcs getEcs() {
            return this.ecs;
        }

        public DescribeDisksResponseBodyDataAccessAuthorization setPod(DescribeDisksResponseBodyDataAccessAuthorizationPod pod) {
            this.pod = pod;
            return this;
        }
        public DescribeDisksResponseBodyDataAccessAuthorizationPod getPod() {
            return this.pod;
        }

    }

    public static class DescribeDisksResponseBodyDataAttachments extends TeaModel {
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

        public static DescribeDisksResponseBodyDataAttachments build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDataAttachments self = new DescribeDisksResponseBodyDataAttachments();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDataAttachments setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyDataAttachments setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDisksResponseBodyDataAttachments setNamespaceId(Integer namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Integer getNamespaceId() {
            return this.namespaceId;
        }

    }

    public static class DescribeDisksResponseBodyDataTags extends TeaModel {
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

        public static DescribeDisksResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDataTags self = new DescribeDisksResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDisksResponseBodyDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDisksResponseBodyData extends TeaModel {
        /**
         * <p>The access authorization information of the disk.</p>
         */
        @NameInMap("AccessAuthorization")
        public java.util.List<DescribeDisksResponseBodyDataAccessAuthorization> accessAuthorization;

        /**
         * <p>The time when the disk was attached.</p>
         */
        @NameInMap("AttachedTime")
        public String attachedTime;

        /**
         * <p>The attachment information of the disk.</p>
         */
        @NameInMap("Attachments")
        public java.util.List<DescribeDisksResponseBodyDataAttachments> attachments;

        /**
         * <p>Specifies whether to enable the performance burst feature for the disk. Valid values:</p>
         * <br>
         * <p>*   true: enable the performance burst feature.</p>
         * <p>*   false: disable the performance burst feature.</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of disk.</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the disk was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the disk. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
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
         * <p>The time when the disk was modified.</p>
         */
        @NameInMap("ModifyAt")
        public String modifyAt;

        /**
         * <p>The performance level of the ESSD. Valid values:</p>
         * <br>
         * <p>*   PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</p>
         * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
         * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
         * <p>*   PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</p>
         * <br>
         * <p>Default value: PL1.</p>
         * <br>
         * <p>For more information about ESSD performance levels, see [ESSDs](~~122389~~).</p>
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
         * <p>The region ID of the disk.</p>
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
         * <p>*   In_use</p>
         * <p>*   Available</p>
         * <p>*   Attaching</p>
         * <p>*   Detaching</p>
         * <p>*   Creating</p>
         * <p>*   ReIniting</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The details of the tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDisksResponseBodyDataTags> tags;

        /**
         * <p>The throughput of the disk.</p>
         * <br>
         * <p>Unit: MB/s.</p>
         */
        @NameInMap("Throughput")
        public Long throughput;

        /**
         * <p>The zone ID of the disk.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDisksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyData self = new DescribeDisksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyData setAccessAuthorization(java.util.List<DescribeDisksResponseBodyDataAccessAuthorization> accessAuthorization) {
            this.accessAuthorization = accessAuthorization;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDataAccessAuthorization> getAccessAuthorization() {
            return this.accessAuthorization;
        }

        public DescribeDisksResponseBodyData setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyData setAttachments(java.util.List<DescribeDisksResponseBodyDataAttachments> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDataAttachments> getAttachments() {
            return this.attachments;
        }

        public DescribeDisksResponseBodyData setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeDisksResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDisksResponseBodyData setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDisksResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDisksResponseBodyData setDetachedTime(String detachedTime) {
            this.detachedTime = detachedTime;
            return this;
        }
        public String getDetachedTime() {
            return this.detachedTime;
        }

        public DescribeDisksResponseBodyData setDeviceNguid(String deviceNguid) {
            this.deviceNguid = deviceNguid;
            return this;
        }
        public String getDeviceNguid() {
            return this.deviceNguid;
        }

        public DescribeDisksResponseBodyData setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDisksResponseBodyData setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeDisksResponseBodyData setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeDisksResponseBodyData setIops(Long iops) {
            this.iops = iops;
            return this;
        }
        public Long getIops() {
            return this.iops;
        }

        public DescribeDisksResponseBodyData setIopsRead(Long iopsRead) {
            this.iopsRead = iopsRead;
            return this;
        }
        public Long getIopsRead() {
            return this.iopsRead;
        }

        public DescribeDisksResponseBodyData setIopsWrite(Long iopsWrite) {
            this.iopsWrite = iopsWrite;
            return this;
        }
        public Long getIopsWrite() {
            return this.iopsWrite;
        }

        public DescribeDisksResponseBodyData setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public DescribeDisksResponseBodyData setModifyAt(String modifyAt) {
            this.modifyAt = modifyAt;
            return this;
        }
        public String getModifyAt() {
            return this.modifyAt;
        }

        public DescribeDisksResponseBodyData setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeDisksResponseBodyData setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeDisksResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDisksResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDisksResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeDisksResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDisksResponseBodyData setTags(java.util.List<DescribeDisksResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public DescribeDisksResponseBodyData setThroughput(Long throughput) {
            this.throughput = throughput;
            return this;
        }
        public Long getThroughput() {
            return this.throughput;
        }

        public DescribeDisksResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
