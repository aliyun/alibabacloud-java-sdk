// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeBakDataSourceStorageAccessInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ee-d84wwm3cazdbjli1m1*****</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FullBackup</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <strong>example:</strong>
     * <p>dbs</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-7iz7uwzgcgumznkd02xn*****</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StorageType")
    public String storageType;

    public static DescribeBakDataSourceStorageAccessInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBakDataSourceStorageAccessInfoRequest self = new DescribeBakDataSourceStorageAccessInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBakDataSourceStorageAccessInfoRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public DescribeBakDataSourceStorageAccessInfoRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public DescribeBakDataSourceStorageAccessInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeBakDataSourceStorageAccessInfoRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DescribeBakDataSourceStorageAccessInfoRequest setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public DescribeBakDataSourceStorageAccessInfoRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public DescribeBakDataSourceStorageAccessInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBakDataSourceStorageAccessInfoRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
