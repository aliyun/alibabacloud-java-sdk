// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeListUserBackupFileRecordRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("OpsServiceVersion")
    public String opsServiceVersion;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeListUserBackupFileRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeListUserBackupFileRecordRequest self = new DescribeListUserBackupFileRecordRequest();
        return TeaModel.build(map, self);
    }

    public DescribeListUserBackupFileRecordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeListUserBackupFileRecordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeListUserBackupFileRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeListUserBackupFileRecordRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeListUserBackupFileRecordRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeListUserBackupFileRecordRequest setOpsServiceVersion(String opsServiceVersion) {
        this.opsServiceVersion = opsServiceVersion;
        return this;
    }
    public String getOpsServiceVersion() {
        return this.opsServiceVersion;
    }

    public DescribeListUserBackupFileRecordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
