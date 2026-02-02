// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDisksResponseBody extends TeaModel {
    /**
     * <p>Details about the disks.</p>
     */
    @NameInMap("Disks")
    public DescribeDisksResponseBodyDisks disks;

    /**
     * <p>The returned pagination token which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <blockquote>
     * <p> This parameter will be removed in the future. We recommend that you use <code>NextToken</code> and <code>MaxResults</code> for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p> This parameter will be removed in the future. We recommend that you use <code>NextToken</code> and <code>MaxResults</code> for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * <blockquote>
     * <p>When using the <code>MaxResults</code> and <code>NextToken</code> parameters for a paginated query, the returned <code>TotalCount</code> parameter value is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDisksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisksResponseBody self = new DescribeDisksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisksResponseBody setDisks(DescribeDisksResponseBodyDisks disks) {
        this.disks = disks;
        return this;
    }
    public DescribeDisksResponseBodyDisks getDisks() {
        return this.disks;
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

    public DescribeDisksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDisksResponseBodyDisksDiskAttachmentsAttachment extends TeaModel {
        /**
         * <p>The time when the disk was attached. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-07T06:08:56Z</p>
         */
        @NameInMap("AttachedTime")
        public String attachedTime;

        /**
         * <p>The device name of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvda</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The ID of the instance to which the disk is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4q****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeDisksResponseBodyDisksDiskAttachmentsAttachment build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskAttachmentsAttachment self = new DescribeDisksResponseBodyDisksDiskAttachmentsAttachment();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskAttachmentsAttachment setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyDisksDiskAttachmentsAttachment setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseBodyDisksDiskAttachmentsAttachment setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskAttachments extends TeaModel {
        @NameInMap("Attachment")
        public java.util.List<DescribeDisksResponseBodyDisksDiskAttachmentsAttachment> attachment;

        public static DescribeDisksResponseBodyDisksDiskAttachments build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskAttachments self = new DescribeDisksResponseBodyDisksDiskAttachments();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskAttachments setAttachment(java.util.List<DescribeDisksResponseBodyDisksDiskAttachmentsAttachment> attachment) {
            this.attachment = attachment;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDiskAttachmentsAttachment> getAttachment() {
            return this.attachment;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance extends TeaModel {
        /**
         * <p>The time when the disk was attached. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-05T2340:00Z</p>
         */
        @NameInMap("AttachedTime")
        public String attachedTime;

        /**
         * <p>The mount point of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvda</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The ID of the instance to which the disk is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1j4i2jdf3owlhe****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance self = new DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskMountInstances extends TeaModel {
        @NameInMap("MountInstance")
        public java.util.List<DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance> mountInstance;

        public static DescribeDisksResponseBodyDisksDiskMountInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskMountInstances self = new DescribeDisksResponseBodyDisksDiskMountInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskMountInstances setMountInstance(java.util.List<DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance> mountInstance) {
            this.mountInstance = mountInstance;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDiskMountInstancesMountInstance> getMountInstance() {
            return this.mountInstance;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock extends TeaModel {
        /**
         * <p>The reason why the disk was locked.</p>
         * 
         * <strong>example:</strong>
         * <p>security</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock self = new DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskOperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        public java.util.List<DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock> operationLock;

        public static DescribeDisksResponseBodyDisksDiskOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskOperationLocks self = new DescribeDisksResponseBodyDisksDiskOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskOperationLocks setOperationLock(java.util.List<DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock> operationLock) {
            this.operationLock = operationLock;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDiskOperationLocksOperationLock> getOperationLock() {
            return this.operationLock;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskPlacement extends TeaModel {
        /**
         * <p>The IDs of the zones in which data is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b
         * cn-hangzhou-j</p>
         */
        @NameInMap("ZoneIds")
        public String zoneIds;

        public static DescribeDisksResponseBodyDisksDiskPlacement build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskPlacement self = new DescribeDisksResponseBodyDisksDiskPlacement();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskPlacement setZoneIds(String zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public String getZoneIds() {
            return this.zoneIds;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskTagsTag extends TeaModel {
        /**
         * <p>The tag key of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDisksResponseBodyDisksDiskTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskTagsTag self = new DescribeDisksResponseBodyDisksDiskTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDisksResponseBodyDisksDiskTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDisksResponseBodyDisksDiskTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDisksResponseBodyDisksDiskTagsTag> tag;

        public static DescribeDisksResponseBodyDisksDiskTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDiskTags self = new DescribeDisksResponseBodyDisksDiskTags();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDiskTags setTag(java.util.List<DescribeDisksResponseBodyDisksDiskTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDiskTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDisksResponseBodyDisksDisk extends TeaModel {
        /**
         * <p>The time when the disk was last attached. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-07T06:08:56Z</p>
         */
        @NameInMap("AttachedTime")
        public String attachedTime;

        /**
         * <p>The attachment information of the disk. The value is an array that consists of the <code>Attachment</code> values. This value is not returned when you query Shared Block Storage devices.</p>
         */
        @NameInMap("Attachments")
        public DescribeDisksResponseBodyDisksDiskAttachments attachments;

        /**
         * <p>The ID of the automatic snapshot policy that is applied to the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("BdfId")
        public String bdfId;

        /**
         * <p>Indicates whether the performance burst feature is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is available only if you set <code>Category</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk</li>
         * <li>cloud_efficiency: ultra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: ESSD</li>
         * <li>cloud_auto: ESSD AutoPL disk</li>
         * <li>local_ssd_pro: I/O-intensive local disk</li>
         * <li>local_hdd_pro: throughput-intensive local disk</li>
         * <li>cloud_essd_entry: ESSD Entry disk</li>
         * <li>elastic_ephemeral_disk_standard: standard elastic ephemeral disk</li>
         * <li>elastic_ephemeral_disk_premium: premium static ephemeral disk</li>
         * <li>ephemeral: retired local disk</li>
         * <li>ephemeral_ssd: retired local SSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the disk was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-07T06:08:54Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the automatic snapshots of the cloud disk are deleted when the cloud disk is released. Valid values:</p>
         * <ul>
         * <li>true: The automatic snapshots of the cloud disk are deleted when the disk is released.</li>
         * <li>false: The automatic snapshots of the cloud disk are retained when the disk is released.</li>
         * </ul>
         * <p>Snapshots that were created in the ECS console or by calling the <a href="https://help.aliyun.com/document_detail/25524.html">CreateSnapshot</a> operation are retained and not affected by this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeleteAutoSnapshot")
        public Boolean deleteAutoSnapshot;

        /**
         * <p>Indicates whether the disk is released when the instance to which the disk is attached is released. Valid values:</p>
         * <ul>
         * <li>true: The disk is released when the associated instance is released.</li>
         * <li>false: The disk is retained when the associated instance is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the disk was last detached.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-07T21:01:22Z</p>
         */
        @NameInMap("DetachedTime")
        public String detachedTime;

        /**
         * <p>The device name of the disk on the instance to which the disk is attached. Example: /dev/xvdb. Take note of the following items:</p>
         * <ul>
         * <li>This parameter has a value only when the <code>Status</code> value is <code>In_use</code> or <code>Detaching</code>.</li>
         * <li>This parameter is empty for cloud disks for which the multi-attach feature is enabled. You can query the attachment information of the cloud disk based on the returned list of <code>Attachment</code> objects.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The billing method of the disk. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription</li>
         * <li>PostPaid: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("DiskChargeType")
        public String diskChargeType;

        /**
         * <p>The ID of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp18um4r4f2fve24****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The name of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>testDiskName</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Indicates whether the automatic snapshot policy feature is enabled for the cloud disk.</p>
         * <blockquote>
         * <p> This parameter is deprecated. By default, the automatic snapshot policy feature is enabled for cloud disks. You need to only apply an automatic snapshot policy to a cloud disk before you can use the automatic snapshot policy.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableAutoSnapshot")
        public Boolean enableAutoSnapshot;

        /**
         * <p>Indicates whether an automatic snapshot policy is applied to the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableAutomatedSnapshotPolicy")
        public Boolean enableAutomatedSnapshotPolicy;

        /**
         * <p>Indicates whether the cloud disk is encrypted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The time when the subscription disk expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-07T16:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The maximum number of read and write operations per second.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("IOPS")
        public Integer IOPS;

        /**
         * <p>The maximum number of read operations per second.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("IOPSRead")
        public Integer IOPSRead;

        /**
         * <p>The maximum number of write operations per second.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("IOPSWrite")
        public Integer IOPSWrite;

        /**
         * <p>The ID of the image that was used to create the instance. This parameter is empty unless the cloud disk was created from an image. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp13aqm171qynt3u***</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The ID of the instance to which the disk is attached. Take note of the following items:</p>
         * <ul>
         * <li>This parameter has a value only when the <code>Status</code> value is <code>In_use</code> or <code>Detaching</code>.</li>
         * <li>This parameter is empty for cloud disks for which the multi-attach feature is enabled. You can query the attachment information of the cloud disk based on the returned <code>Attachment</code> objects.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4q****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the KMS key that is used for the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb408***</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The number of instances to which the Shared Block Storage device is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MountInstanceNum")
        public Integer mountInstanceNum;

        /**
         * <p>The attachment information of the Shared Block Storage device.</p>
         */
        @NameInMap("MountInstances")
        public DescribeDisksResponseBodyDisksDiskMountInstances mountInstances;

        /**
         * <p>Indicates whether the multi-attach feature is enabled for the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("MultiAttach")
        public String multiAttach;

        /**
         * <p>The reasons why the disk was locked.</p>
         */
        @NameInMap("OperationLocks")
        public DescribeDisksResponseBodyDisksDiskOperationLocks operationLocks;

        /**
         * <p>The performance level of the ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The locations in which data is stored.</p>
         * <p>This parameter is returned only if you specify <code>Placement</code> in the AdditionalAttributes.N request parameter.</p>
         * <blockquote>
         * <p> This parameter is valid only for Regional ESSDs (cloud_regional_disk_auto).</p>
         * </blockquote>
         */
        @NameInMap("Placement")
        public DescribeDisksResponseBodyDisksDiskPlacement placement;

        /**
         * <p>Indicates whether the disk is removable.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Portable")
        public Boolean portable;

        /**
         * <p>The product code of the disk in Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>jxsc000204</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × *Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × *Capacity, 50,000}</p>
         * <p>This parameter is available only if you set <code>Category</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The ID of the region to which the disk belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the disk belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The serial number of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>bp18um4r4f2fve2****</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>d-123*********</p>
         */
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        /**
         * <p>The ID of the snapshot that was used to create the cloud disk.</p>
         * <p>This parameter is empty unless the cloud disk was created from a snapshot. The value of this parameter remains unchanged throughout the lifecycle of the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp67acfmxazb4p****</p>
         */
        @NameInMap("SourceSnapshotId")
        public String sourceSnapshotId;

        /**
         * <p>The status of the disk. Valid values:</p>
         * <ul>
         * <li>In_use</li>
         * <li>Available</li>
         * <li>Attaching</li>
         * <li>Detaching</li>
         * <li>Creating</li>
         * <li>ReIniting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>In_use</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the dedicated block storage cluster to which the cloud disk belongs. If your cloud disk belongs to the public block storage cluster, an empty value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsc-j5e1sf2vaf5he8m2****</p>
         */
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        /**
         * <p>The ID of the storage set.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-i-bp1j4i2jdf3owlhe****</p>
         */
        @NameInMap("StorageSetId")
        public String storageSetId;

        /**
         * <p>The maximum number of partitions in the storage set.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("StorageSetPartitionNumber")
        public Integer storageSetPartitionNumber;

        /**
         * <p>The tags of the disk.</p>
         */
        @NameInMap("Tags")
        public DescribeDisksResponseBodyDisksDiskTags tags;

        /**
         * <p>The amount of data that can be transferred per second. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Throughput")
        public Integer throughput;

        /**
         * <p>The amount of data that can be read per second. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ThroughputRead")
        public Integer throughputRead;

        /**
         * <p>The amount of data that can be written per second. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ThroughputWrite")
        public Integer throughputWrite;

        /**
         * <p>The type of the disk. Valid values:</p>
         * <ul>
         * <li>system: system disk</li>
         * <li>data: data disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the zone to which the disk belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDisksResponseBodyDisksDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisksDisk self = new DescribeDisksResponseBodyDisksDisk();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisksDisk setAttachedTime(String attachedTime) {
            this.attachedTime = attachedTime;
            return this;
        }
        public String getAttachedTime() {
            return this.attachedTime;
        }

        public DescribeDisksResponseBodyDisksDisk setAttachments(DescribeDisksResponseBodyDisksDiskAttachments attachments) {
            this.attachments = attachments;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskAttachments getAttachments() {
            return this.attachments;
        }

        public DescribeDisksResponseBodyDisksDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeDisksResponseBodyDisksDisk setBdfId(String bdfId) {
            this.bdfId = bdfId;
            return this;
        }
        public String getBdfId() {
            return this.bdfId;
        }

        public DescribeDisksResponseBodyDisksDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeDisksResponseBodyDisksDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDisksResponseBodyDisksDisk setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDisksResponseBodyDisksDisk setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }
        public Boolean getDeleteAutoSnapshot() {
            return this.deleteAutoSnapshot;
        }

        public DescribeDisksResponseBodyDisksDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeDisksResponseBodyDisksDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDisksResponseBodyDisksDisk setDetachedTime(String detachedTime) {
            this.detachedTime = detachedTime;
            return this;
        }
        public String getDetachedTime() {
            return this.detachedTime;
        }

        public DescribeDisksResponseBodyDisksDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeDisksResponseBodyDisksDisk setDiskChargeType(String diskChargeType) {
            this.diskChargeType = diskChargeType;
            return this;
        }
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        public DescribeDisksResponseBodyDisksDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeDisksResponseBodyDisksDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeDisksResponseBodyDisksDisk setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.enableAutoSnapshot = enableAutoSnapshot;
            return this;
        }
        public Boolean getEnableAutoSnapshot() {
            return this.enableAutoSnapshot;
        }

        public DescribeDisksResponseBodyDisksDisk setEnableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
            this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
            return this;
        }
        public Boolean getEnableAutomatedSnapshotPolicy() {
            return this.enableAutomatedSnapshotPolicy;
        }

        public DescribeDisksResponseBodyDisksDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeDisksResponseBodyDisksDisk setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDisksResponseBodyDisksDisk setIOPS(Integer IOPS) {
            this.IOPS = IOPS;
            return this;
        }
        public Integer getIOPS() {
            return this.IOPS;
        }

        public DescribeDisksResponseBodyDisksDisk setIOPSRead(Integer IOPSRead) {
            this.IOPSRead = IOPSRead;
            return this;
        }
        public Integer getIOPSRead() {
            return this.IOPSRead;
        }

        public DescribeDisksResponseBodyDisksDisk setIOPSWrite(Integer IOPSWrite) {
            this.IOPSWrite = IOPSWrite;
            return this;
        }
        public Integer getIOPSWrite() {
            return this.IOPSWrite;
        }

        public DescribeDisksResponseBodyDisksDisk setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeDisksResponseBodyDisksDisk setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDisksResponseBodyDisksDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeDisksResponseBodyDisksDisk setMountInstanceNum(Integer mountInstanceNum) {
            this.mountInstanceNum = mountInstanceNum;
            return this;
        }
        public Integer getMountInstanceNum() {
            return this.mountInstanceNum;
        }

        public DescribeDisksResponseBodyDisksDisk setMountInstances(DescribeDisksResponseBodyDisksDiskMountInstances mountInstances) {
            this.mountInstances = mountInstances;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskMountInstances getMountInstances() {
            return this.mountInstances;
        }

        public DescribeDisksResponseBodyDisksDisk setMultiAttach(String multiAttach) {
            this.multiAttach = multiAttach;
            return this;
        }
        public String getMultiAttach() {
            return this.multiAttach;
        }

        public DescribeDisksResponseBodyDisksDisk setOperationLocks(DescribeDisksResponseBodyDisksDiskOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeDisksResponseBodyDisksDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeDisksResponseBodyDisksDisk setPlacement(DescribeDisksResponseBodyDisksDiskPlacement placement) {
            this.placement = placement;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskPlacement getPlacement() {
            return this.placement;
        }

        public DescribeDisksResponseBodyDisksDisk setPortable(Boolean portable) {
            this.portable = portable;
            return this;
        }
        public Boolean getPortable() {
            return this.portable;
        }

        public DescribeDisksResponseBodyDisksDisk setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeDisksResponseBodyDisksDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DescribeDisksResponseBodyDisksDisk setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDisksResponseBodyDisksDisk setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDisksResponseBodyDisksDisk setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeDisksResponseBodyDisksDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeDisksResponseBodyDisksDisk setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeDisksResponseBodyDisksDisk setSourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }
        public String getSourceSnapshotId() {
            return this.sourceSnapshotId;
        }

        public DescribeDisksResponseBodyDisksDisk setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDisksResponseBodyDisksDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

        public DescribeDisksResponseBodyDisksDisk setStorageSetId(String storageSetId) {
            this.storageSetId = storageSetId;
            return this;
        }
        public String getStorageSetId() {
            return this.storageSetId;
        }

        public DescribeDisksResponseBodyDisksDisk setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
            this.storageSetPartitionNumber = storageSetPartitionNumber;
            return this;
        }
        public Integer getStorageSetPartitionNumber() {
            return this.storageSetPartitionNumber;
        }

        public DescribeDisksResponseBodyDisksDisk setTags(DescribeDisksResponseBodyDisksDiskTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDisksResponseBodyDisksDiskTags getTags() {
            return this.tags;
        }

        public DescribeDisksResponseBodyDisksDisk setThroughput(Integer throughput) {
            this.throughput = throughput;
            return this;
        }
        public Integer getThroughput() {
            return this.throughput;
        }

        public DescribeDisksResponseBodyDisksDisk setThroughputRead(Integer throughputRead) {
            this.throughputRead = throughputRead;
            return this;
        }
        public Integer getThroughputRead() {
            return this.throughputRead;
        }

        public DescribeDisksResponseBodyDisksDisk setThroughputWrite(Integer throughputWrite) {
            this.throughputWrite = throughputWrite;
            return this;
        }
        public Integer getThroughputWrite() {
            return this.throughputWrite;
        }

        public DescribeDisksResponseBodyDisksDisk setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDisksResponseBodyDisksDisk setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDisksResponseBodyDisks extends TeaModel {
        @NameInMap("Disk")
        public java.util.List<DescribeDisksResponseBodyDisksDisk> disk;

        public static DescribeDisksResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisksResponseBodyDisks self = new DescribeDisksResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeDisksResponseBodyDisks setDisk(java.util.List<DescribeDisksResponseBodyDisksDisk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<DescribeDisksResponseBodyDisksDisk> getDisk() {
            return this.disk;
        }

    }

}
