// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupSetDownloadTaskListRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("BackupSetDownloadTaskId")
    public String backupSetDownloadTaskId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeBackupSetDownloadTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetDownloadTaskListRequest self = new DescribeBackupSetDownloadTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetDownloadTaskListRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DescribeBackupSetDownloadTaskListRequest setBackupSetDownloadTaskId(String backupSetDownloadTaskId) {
        this.backupSetDownloadTaskId = backupSetDownloadTaskId;
        return this;
    }
    public String getBackupSetDownloadTaskId() {
        return this.backupSetDownloadTaskId;
    }

    public DescribeBackupSetDownloadTaskListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeBackupSetDownloadTaskListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeBackupSetDownloadTaskListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeBackupSetDownloadTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
