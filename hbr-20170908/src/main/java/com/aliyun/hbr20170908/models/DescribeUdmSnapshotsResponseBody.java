// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeUdmSnapshotsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>51CDEECB-7001-51CC-94AC-2A0F2A4B71D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about snapshots.</p>
     */
    @NameInMap("Snapshots")
    public java.util.List<DescribeUdmSnapshotsResponseBodySnapshots> snapshots;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of backup snapshots.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeUdmSnapshotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUdmSnapshotsResponseBody self = new DescribeUdmSnapshotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUdmSnapshotsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeUdmSnapshotsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeUdmSnapshotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUdmSnapshotsResponseBody setSnapshots(java.util.List<DescribeUdmSnapshotsResponseBodySnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }
    public java.util.List<DescribeUdmSnapshotsResponseBodySnapshots> getSnapshots() {
        return this.snapshots;
    }

    public DescribeUdmSnapshotsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeUdmSnapshotsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeUdmSnapshotsResponseBodySnapshotsDetail extends TeaModel {
        /**
         * <p>The consistency level.</p>
         * 
         * <strong>example:</strong>
         * <p>CRASH</p>
         */
        @NameInMap("ConsistentLevel")
        public String consistentLevel;

        /**
         * <p>Indicates whether the system disk is included.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ContainOsDisk")
        public Boolean containOsDisk;

        /**
         * <p>The type of the source disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("DiskCategory")
        public String diskCategory;

        /**
         * <p>The name of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("DiskDevName")
        public String diskDevName;

        /**
         * <p>The mapping between the device and the recovery point ID.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;/dev/xvdb&quot;:&quot;s-0000u7y6wm3v1e7hxh5a&quot;,					 
         *     &quot;/dev/xvda&quot;:&quot;s-0004bl6yr5pt89jjsv5a&quot;
         * }</p>
         */
        @NameInMap("DiskHbrSnapshotIdWithDeviceMap")
        public java.util.Map<String, ?> diskHbrSnapshotIdWithDeviceMap;

        /**
         * <p>The IDs of the disks that are backed up at the recovery point.</p>
         */
        @NameInMap("DiskIdList")
        public java.util.List<String> diskIdList;

        /**
         * <p>The reason for the downgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>HBR.NoRamRoleBound</p>
         */
        @NameInMap("DowngradeReason")
        public String downgradeReason;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>iZbpxxxxxxxxxxxxxxxxe2Z</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The mapping between the instance ID and the disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;i-bp1dlp0keohh7ids4uo6&quot;:&quot;d-bp1e6427vhd320hifvs&quot;,					 
         *     &quot;i-bp1dlp0keohh7ids4uo6&quot;:&quot;d-bp1e6427vhd320hifvd&quot;
         * }</p>
         */
        @NameInMap("InstanceIdWithDiskIdListMap")
        public java.util.Map<String, ?> instanceIdWithDiskIdListMap;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>swh-hbr</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The specifications of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether the backup is created by the instant clone feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        /**
         * <p>The list of snapshot IDs, corresponding to DiskIdList.</p>
         */
        @NameInMap("NativeSnapshotIdList")
        public java.util.List<String> nativeSnapshotIdList;

        /**
         * <p>The ID of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1e6427vhd320hifvc</p>
         */
        @NameInMap("OsDiskId")
        public String osDiskId;

        /**
         * <p>The name of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>Debian 10.10 64-bit (UEFI)</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The English name of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>Debian  11.1 64 bit</p>
         */
        @NameInMap("OsNameEn")
        public String osNameEn;

        /**
         * <p>The type of the operating system. Valid values: linux and windows.</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The performance level of the source disk.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The system platform.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The ID of the snapshot group.</p>
         * 
         * <strong>example:</strong>
         * <p>ssg-uf6856txcaq31uj***</p>
         */
        @NameInMap("SnapshotGroupId")
        public String snapshotGroupId;

        /**
         * <p>Indicates whether the disk is a system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SystemDisk")
        public Boolean systemDisk;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>BNSHSVR42 IPGUARD</p>
         */
        @NameInMap("VmName")
        public String vmName;

        public static DescribeUdmSnapshotsResponseBodySnapshotsDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeUdmSnapshotsResponseBodySnapshotsDetail self = new DescribeUdmSnapshotsResponseBodySnapshotsDetail();
            return TeaModel.build(map, self);
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setConsistentLevel(String consistentLevel) {
            this.consistentLevel = consistentLevel;
            return this;
        }
        public String getConsistentLevel() {
            return this.consistentLevel;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setContainOsDisk(Boolean containOsDisk) {
            this.containOsDisk = containOsDisk;
            return this;
        }
        public Boolean getContainOsDisk() {
            return this.containOsDisk;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setDiskDevName(String diskDevName) {
            this.diskDevName = diskDevName;
            return this;
        }
        public String getDiskDevName() {
            return this.diskDevName;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setDiskHbrSnapshotIdWithDeviceMap(java.util.Map<String, ?> diskHbrSnapshotIdWithDeviceMap) {
            this.diskHbrSnapshotIdWithDeviceMap = diskHbrSnapshotIdWithDeviceMap;
            return this;
        }
        public java.util.Map<String, ?> getDiskHbrSnapshotIdWithDeviceMap() {
            return this.diskHbrSnapshotIdWithDeviceMap;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setDiskIdList(java.util.List<String> diskIdList) {
            this.diskIdList = diskIdList;
            return this;
        }
        public java.util.List<String> getDiskIdList() {
            return this.diskIdList;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setDowngradeReason(String downgradeReason) {
            this.downgradeReason = downgradeReason;
            return this;
        }
        public String getDowngradeReason() {
            return this.downgradeReason;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setInstanceIdWithDiskIdListMap(java.util.Map<String, ?> instanceIdWithDiskIdListMap) {
            this.instanceIdWithDiskIdListMap = instanceIdWithDiskIdListMap;
            return this;
        }
        public java.util.Map<String, ?> getInstanceIdWithDiskIdListMap() {
            return this.instanceIdWithDiskIdListMap;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setInstantAccess(Boolean instantAccess) {
            this.instantAccess = instantAccess;
            return this;
        }
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setNativeSnapshotIdList(java.util.List<String> nativeSnapshotIdList) {
            this.nativeSnapshotIdList = nativeSnapshotIdList;
            return this;
        }
        public java.util.List<String> getNativeSnapshotIdList() {
            return this.nativeSnapshotIdList;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setOsDiskId(String osDiskId) {
            this.osDiskId = osDiskId;
            return this;
        }
        public String getOsDiskId() {
            return this.osDiskId;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setOsNameEn(String osNameEn) {
            this.osNameEn = osNameEn;
            return this;
        }
        public String getOsNameEn() {
            return this.osNameEn;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setSnapshotGroupId(String snapshotGroupId) {
            this.snapshotGroupId = snapshotGroupId;
            return this;
        }
        public String getSnapshotGroupId() {
            return this.snapshotGroupId;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setSystemDisk(Boolean systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }
        public Boolean getSystemDisk() {
            return this.systemDisk;
        }

        public DescribeUdmSnapshotsResponseBodySnapshotsDetail setVmName(String vmName) {
            this.vmName = vmName;
            return this;
        }
        public String getVmName() {
            return this.vmName;
        }

    }

    public static class DescribeUdmSnapshotsResponseBodySnapshots extends TeaModel {
        /**
         * <p>The size of the backup snapshot. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("ActualBytes")
        public String actualBytes;

        /**
         * <p>The special retention type, which is valid only for special backups. Valid values:</p>
         * <ul>
         * <li><strong>WEEKLY</strong>: weekly backups</li>
         * <li><strong>MONTHLY</strong>: monthly backups</li>
         * <li><strong>YEARLY</strong>: yearly backups</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WEEKLY</p>
         */
        @NameInMap("AdvancedRetentionType")
        public String advancedRetentionType;

        /**
         * <p>The backup type. Valid value: <strong>COMPLETE</strong>, which indicates full backup.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The total amount of data. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("BytesTotal")
        public Long bytesTotal;

        /**
         * <p>Indicates whether the disk backup point can be deleted. This parameter is valid only if the value of SourceType is UDM_ECS_DISK.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("CanBeDeleted")
        public Boolean canBeDeleted;

        /**
         * <p>The time when the backup snapshot was completed. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1646895666</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>The time when the backup snapshot was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1607436917</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the backup snapshot was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642496679</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The snapshot details.</p>
         */
        @NameInMap("Detail")
        public DescribeUdmSnapshotsResponseBodySnapshotsDetail detail;

        /**
         * <p>The ID of the cloud disk or local disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-2ze86h5fga5rfwxxa8ef</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The expiration time of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>1640334062</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1f0pe78dxizrsdcgxd</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>job-00030j3chkt******2</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-00047mg17p26x*****b</p>
         */
        @NameInMap("NativeSnapshotId")
        public String nativeSnapshotId;

        /**
         * <p>The snapshot information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *                     &quot;sourceDiskId&quot;:&quot;d-bp17misjuy636t82v7b0&quot;,
         *                     &quot;lastModifiedTime&quot;:&quot;2022-03-09T11:35:12Z&quot;,
         *                     &quot;snapshotSN&quot;:&quot;64588-429372675-857161235&quot;,
         *                     &quot;snapshotId&quot;:&quot;s-bp1fbtwv3e6xr6wpe9e0&quot;,
         *                     &quot;creationTime&quot;:&quot;2022-03-09T11:31:12Z&quot;,
         *                     &quot;snapshotType&quot;:&quot;user&quot;,
         *                     &quot;usage&quot;:&quot;none&quot;,
         *                     &quot;description&quot;:&quot;&quot;,
         *                     &quot;sourceStorageType&quot;:&quot;disk&quot;,
         *                     &quot;tags&quot;:[
         *                         {
         *                             &quot;tagValue&quot;:&quot;job-0007e0wqjl0imbrtkmnm&quot;,
         *                             &quot;tagKey&quot;:&quot;HBR JobId&quot;
         *                         }
         *                     ],
         *                     &quot;productCode&quot;:&quot;&quot;,
         *                     &quot;encrypted&quot;:false,
         *                     &quot;sourceDiskType&quot;:&quot;system&quot;,
         *                     &quot;retentionDays&quot;:30,
         *                     &quot;snapshotName&quot;:&quot;Created-from-HBR-job:job-0007e0wqjl0imbrtkmnm&quot;,
         *                     &quot;kMSKeyId&quot;:&quot;&quot;,
         *                     &quot;progress&quot;:&quot;100%&quot;,
         *                     &quot;category&quot;:&quot;standard&quot;,
         *                     &quot;sourceDiskSize&quot;:&quot;20&quot;,
         *                     &quot;status&quot;:&quot;accomplished&quot;
         *                 }</p>
         */
        @NameInMap("NativeSnapshotInfo")
        public String nativeSnapshotInfo;

        /**
         * <p>The hash value of the parent backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>f2fe..</p>
         */
        @NameInMap("ParentSnapshotHash")
        public String parentSnapshotHash;

        /**
         * <p>The prefix of the backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>example/</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <p>The timestamp of the backup snapshot. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642496679</p>
         */
        @NameInMap("RealSnapshotTime")
        public Long realSnapshotTime;

        /**
         * <p>The retention period of the backup snapshot. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Long retention;

        /**
         * <p>The hash value of the backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>f2fe...</p>
         */
        @NameInMap("SnapshotHash")
        public String snapshotHash;

        /**
         * <p>The ID of the backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-00047mxg17p26*****b</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: ECS instance backup</li>
         * <li><strong>UDM_ECS_DISK</strong>: disk backup subtask of ECS instance backup</li>
         * <li><strong>UDM_DISK</strong>: disk backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDM_ECS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The time when the backup snapshot was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554347313</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the backup job. Valid values:</p>
         * <ul>
         * <li><strong>COMPLETE</strong>: The backup job is completed.</li>
         * <li><strong>PARTIAL_COMPLETE</strong>: The backup job is partially completed.</li>
         * <li><strong>FAILED</strong>: The backup job has failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the backup snapshot was updated. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642496679</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static DescribeUdmSnapshotsResponseBodySnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeUdmSnapshotsResponseBodySnapshots self = new DescribeUdmSnapshotsResponseBodySnapshots();
            return TeaModel.build(map, self);
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setActualBytes(String actualBytes) {
            this.actualBytes = actualBytes;
            return this;
        }
        public String getActualBytes() {
            return this.actualBytes;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setAdvancedRetentionType(String advancedRetentionType) {
            this.advancedRetentionType = advancedRetentionType;
            return this;
        }
        public String getAdvancedRetentionType() {
            return this.advancedRetentionType;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setBytesTotal(Long bytesTotal) {
            this.bytesTotal = bytesTotal;
            return this;
        }
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setCanBeDeleted(Boolean canBeDeleted) {
            this.canBeDeleted = canBeDeleted;
            return this;
        }
        public Boolean getCanBeDeleted() {
            return this.canBeDeleted;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setDetail(DescribeUdmSnapshotsResponseBodySnapshotsDetail detail) {
            this.detail = detail;
            return this;
        }
        public DescribeUdmSnapshotsResponseBodySnapshotsDetail getDetail() {
            return this.detail;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setNativeSnapshotId(String nativeSnapshotId) {
            this.nativeSnapshotId = nativeSnapshotId;
            return this;
        }
        public String getNativeSnapshotId() {
            return this.nativeSnapshotId;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setNativeSnapshotInfo(String nativeSnapshotInfo) {
            this.nativeSnapshotInfo = nativeSnapshotInfo;
            return this;
        }
        public String getNativeSnapshotInfo() {
            return this.nativeSnapshotInfo;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setParentSnapshotHash(String parentSnapshotHash) {
            this.parentSnapshotHash = parentSnapshotHash;
            return this;
        }
        public String getParentSnapshotHash() {
            return this.parentSnapshotHash;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setRealSnapshotTime(Long realSnapshotTime) {
            this.realSnapshotTime = realSnapshotTime;
            return this;
        }
        public Long getRealSnapshotTime() {
            return this.realSnapshotTime;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setSnapshotHash(String snapshotHash) {
            this.snapshotHash = snapshotHash;
            return this;
        }
        public String getSnapshotHash() {
            return this.snapshotHash;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeUdmSnapshotsResponseBodySnapshots setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
