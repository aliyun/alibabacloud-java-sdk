// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadBackupSetStorageInfoRequest extends TeaModel {
    /**
     * <p>The ID of the backup set.</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The validity period of the URL that is used as the download destination. Take note of the following items:</p>
     * <br>
     * <p>*   Default value: 7200. This means that the URL is valid for 2 hours by default.</p>
     * <p>*   Valid values: 300 to 86400. Unit: seconds. This means that you can specify a validity period in the range of 5 minutes to 1 day.</p>
     * <p>*   Before you specify this parameter, convert the validity period to seconds. For example, if you want to set the validity period of the URL to 5 minutes, enter 300.</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> The **BackupSetId** parameter is required if you specify the **InstanceName** parameter.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The ID of the region in which the instance resides. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the region ID of the instance.</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    /**
     * <p>The ID of the download task.</p>
     * <br>
     * <p>*   The **BackupSetId** and **InstanceName** parameters are required if you do not specify the **TaskId** parameter.</p>
     * <p>*   You can go to the instance details page in the Alibaba Cloud Management Console and click **Backup and Restoration** in the left-side navigation pane. On the **Backup Download** tab, view the task ID.</p>
     */
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
