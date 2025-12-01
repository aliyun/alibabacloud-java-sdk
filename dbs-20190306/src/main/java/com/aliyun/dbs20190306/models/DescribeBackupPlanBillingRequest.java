// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeBackupPlanBillingRequest extends TeaModel {
    /**
     * <p>The ID of the backup gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>160813</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Indicates whether the storage type is displayed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowStorageType")
    public Boolean showStorageType;

    public static DescribeBackupPlanBillingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPlanBillingRequest self = new DescribeBackupPlanBillingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPlanBillingRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DescribeBackupPlanBillingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeBackupPlanBillingRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeBackupPlanBillingRequest setShowStorageType(Boolean showStorageType) {
        this.showStorageType = showStorageType;
        return this;
    }
    public Boolean getShowStorageType() {
        return this.showStorageType;
    }

}
