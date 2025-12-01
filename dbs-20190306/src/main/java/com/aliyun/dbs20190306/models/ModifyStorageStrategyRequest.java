// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyStorageStrategyRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbsqdss5tmh****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The number of days for which the backup data is retained. Valid values: 0 to 1825.</p>
     * <blockquote>
     * <p>Default value: 730.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>730</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstest</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The number of days after which the storage class of the backup data is changed to Archive. The value of this parameter must be smaller than the value of the BackupRetentionPeriod parameter. For more information about the Archive storage class, see <a href="https://help.aliyun.com/document_detail/51374.html">Storage class overview</a>.</p>
     * <blockquote>
     * <p>Default value: 365.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>366</p>
     */
    @NameInMap("DuplicationArchivePeriod")
    public Integer duplicationArchivePeriod;

    /**
     * <p>The number of days after which the storage class of the backup data is changed to Infrequent Access (IA). The value of this parameter must be smaller than the value of the DuplicationArchivePeriod parameter. For more information about the IA storage class, see <a href="https://help.aliyun.com/document_detail/51374.html">Storage class overview</a>.</p>
     * <blockquote>
     * <p>Default value: 180.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>190</p>
     */
    @NameInMap("DuplicationInfrequentAccessPeriod")
    public Integer duplicationInfrequentAccessPeriod;

    @NameInMap("OwnerId")
    public String ownerId;

    public static ModifyStorageStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageStrategyRequest self = new ModifyStorageStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStorageStrategyRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyStorageStrategyRequest setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public ModifyStorageStrategyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyStorageStrategyRequest setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
        this.duplicationArchivePeriod = duplicationArchivePeriod;
        return this;
    }
    public Integer getDuplicationArchivePeriod() {
        return this.duplicationArchivePeriod;
    }

    public ModifyStorageStrategyRequest setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
        this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
        return this;
    }
    public Integer getDuplicationInfrequentAccessPeriod() {
        return this.duplicationInfrequentAccessPeriod;
    }

    public ModifyStorageStrategyRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
