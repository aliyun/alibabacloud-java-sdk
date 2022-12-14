// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadBackupSetStorageInfoRequest extends TeaModel {
    // The ID of the backup set.
    @NameInMap("BackupSetId")
    public String backupSetId;

    // Set this parameter if the Download Destination parameter is set to URL.
    // 
    // *   By default, a URL is valid for 2 hours, which is equal to 7,200 seconds.
    // *   The valid duration is 5 minutes (300 seconds) to 1 day (86,400 seconds).
    // *   Before you set this parameter, convert the time to seconds. For example, if you want to set the validity period of the link to 5 minutes, enter 300.
    @NameInMap("Duration")
    public String duration;

    // The ID of the instance.
    // 
    // >  The **BackupSetId** parameter is required if you specify the **InstanceName** parameter.
    @NameInMap("InstanceName")
    public String instanceName;

    // The region ID of the instance. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the region ID of the instance.
    @NameInMap("RegionCode")
    public String regionCode;

    // The ID of the download task.
    // 
    // *   The **BackupSetId** and **InstanceName** parameters are required if you do not specify the **TaskId** parameter.
    // *   You can find the instance and click **Backup and Restoration**. On the **Backup Download** tab, view the **task ID**.
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeDownloadBackupSetStorageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadBackupSetStorageInfoRequest self = new DescribeDownloadBackupSetStorageInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadBackupSetStorageInfoRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public DescribeDownloadBackupSetStorageInfoRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public DescribeDownloadBackupSetStorageInfoRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeDownloadBackupSetStorageInfoRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public DescribeDownloadBackupSetStorageInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
