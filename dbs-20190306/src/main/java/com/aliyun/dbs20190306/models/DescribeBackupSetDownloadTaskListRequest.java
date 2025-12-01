// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupSetDownloadTaskListRequest extends TeaModel {
    /**
     * <p>The backup schedule ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the ID.</p>
     * <blockquote>
     * <p> You must configure the <strong>BackupPlanId</strong> or <strong>BackupSetDownloadTaskId</strong> parameter.</p>
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
     * <li>Full backup set download task: You can call the <a href="https://help.aliyun.com/document_detail/2869842.html">CreateFullBackupSetDownload</a> operation to create a full backup set download task and obtain the task ID.</li>
     * <li>Incremental backup set download task: You can call the <a href="https://help.aliyun.com/document_detail/2869843.html">CreateIncrementBackupSetDownload</a> operation to create an incremental backup set download task and obtain the task ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>urxgrxt7****</p>
     */
    @NameInMap("BackupSetDownloadTaskId")
    public String backupSetDownloadTaskId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzXXXXXX</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of the page to return. The value must be a positive integer. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Valid values: 30, 50, and 100.</p>
     * <blockquote>
     * <p>Default value: 30.</p>
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
