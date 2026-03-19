// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupSetDownloadTaskListRequest extends TeaModel {
    /**
     * <p>The ID of the backup plan. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the value of this parameter.</p>
     * <blockquote>
     * <p>You must specify either <strong>BackupPlanId</strong> or <strong>BackupSetDownloadTaskId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dbsqhnuhyw3****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The ID of the backup set download task.</p>
     * <ul>
     * <li><p>For a full backup, call the <a href="https://help.aliyun.com/document_detail/2869842.html">CreateFullBackupSetDownload</a> operation to obtain the value of this parameter.</p>
     * </li>
     * <li><p>For an incremental backup, call the <a href="https://help.aliyun.com/document_detail/2869843.html">CreateIncrementBackupSetDownload</a> operation to obtain the value of this parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>urxgrxt7****</p>
     */
    @NameInMap("BackupSetDownloadTaskId")
    public String backupSetDownloadTaskId;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. This prevents duplicate requests.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzXXXXXX</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The page number. The value must be a non-negative integer that does not exceed the maximum value of the integer type. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Valid values: 30, 50, and 100.</p>
     * <blockquote>
     * <p>The default value is 30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
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
