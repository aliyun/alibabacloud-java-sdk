// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateBackupConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BackupConfig")
    public String backupConfig;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>videoDetection</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static UpdateBackupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupConfigRequest self = new UpdateBackupConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBackupConfigRequest setBackupConfig(String backupConfig) {
        this.backupConfig = backupConfig;
        return this;
    }
    public String getBackupConfig() {
        return this.backupConfig;
    }

    public UpdateBackupConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateBackupConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateBackupConfigRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
