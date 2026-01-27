// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadBackupSetStorageInfoRequest extends TeaModel {
    /**
     * <p>The ID of the backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>30****</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <strong>example:</strong>
     * <p>dds-example</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The validity period of the URL that is used as the download destination. Take note of the following items:</p>
     * <ul>
     * <li>Default value: 7200. This means that the URL is valid for 2 hours by default.</li>
     * <li>Valid values: 300 to 86400. Unit: seconds. This means that you can specify a validity period in the range of 5 minutes to 1 day.</li>
     * <li>Before you specify this parameter, convert the validity period to seconds. For example, if you want to set the validity period of the URL to 5 minutes, enter 300.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>The <strong>BackupSetId</strong> parameter is required if you specify the <strong>InstanceName</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6qqf569n435****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    /**
     * <p>The download task ID.</p>
     * <ul>
     * <li>The <strong>BackupSetId</strong> and <strong>InstanceName</strong> parameters are required if you do not specify the <strong>TaskId</strong> parameter.</li>
     * <li>To view the download task ID, go to the instance details page in the console and click <strong>Backup and Restoration</strong> in the left-side navigation pane. On the <strong>Backup Download</strong> tab, view the task ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dt-s0ugzak9****</p>
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

    public DescribeDownloadBackupSetStorageInfoRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
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
