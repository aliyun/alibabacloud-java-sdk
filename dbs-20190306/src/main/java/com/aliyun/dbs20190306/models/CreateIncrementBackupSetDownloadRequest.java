// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateIncrementBackupSetDownloadRequest extends TeaModel {
    /**
     * <p>The format in which the incremental backup set is downloaded. Valid values:</p>
     * <ul>
     * <li><strong>Native</strong></li>
     * <li><strong>SQL</strong></li>
     * <li><strong>CSV</strong></li>
     * <li><strong>JSON</strong></li>
     * </ul>
     * <blockquote>
     * <p>Default value: Native.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Native</p>
     */
    @NameInMap("BackupSetDataFormat")
    public String backupSetDataFormat;

    /**
     * <p>The ID of the incremental backup task. To obtain the task ID, you can call the <a href="https://help.aliyun.com/document_detail/2869833.html">DescribeIncrementBackupList</a> operation and view the value of the <strong>BackupSetJobId</strong> parameter in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01e****</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The ID of the incremental backup set. To obtain the backup set ID, you can call the <a href="https://help.aliyun.com/document_detail/2869833.html">DescribeIncrementBackupList</a> operation and view the value of the <strong>BackupSetId</strong> parameter in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BackupSetName")
    public String backupSetName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    public static CreateIncrementBackupSetDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIncrementBackupSetDownloadRequest self = new CreateIncrementBackupSetDownloadRequest();
        return TeaModel.build(map, self);
    }

    public CreateIncrementBackupSetDownloadRequest setBackupSetDataFormat(String backupSetDataFormat) {
        this.backupSetDataFormat = backupSetDataFormat;
        return this;
    }
    public String getBackupSetDataFormat() {
        return this.backupSetDataFormat;
    }

    public CreateIncrementBackupSetDownloadRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateIncrementBackupSetDownloadRequest setBackupSetName(String backupSetName) {
        this.backupSetName = backupSetName;
        return this;
    }
    public String getBackupSetName() {
        return this.backupSetName;
    }

    public CreateIncrementBackupSetDownloadRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIncrementBackupSetDownloadRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
