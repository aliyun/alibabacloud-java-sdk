// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateDownloadRequest extends TeaModel {
    /**
     * <p>The ID of the backup set. You can call the [DescribeBackups](~~26273~~) operation to query the ID of the backup set.</p>
     * <br>
     * <p>> This parameter is required if the BakSetType parameter is set to full.</p>
     */
    @NameInMap("BakSetId")
    public String bakSetId;

    /**
     * <p>The size of the full backup set. Unit: bytes. You can call the [DescribeBackups](~~26273~~) operation to query the size of the full backup set.</p>
     */
    @NameInMap("BakSetSize")
    public String bakSetSize;

    /**
     * <p>The type of the download task. Valid values:</p>
     * <br>
     * <p>*   **full**: downloads a full backup set.</p>
     * <p>*   **pitr**: downloads a backup set at a specific point in time.</p>
     */
    @NameInMap("BakSetType")
    public String bakSetType;

    /**
     * <p>The point in time at which the backup set is downloaded. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>> This parameter is required if the BakSetType parameter is set to pitr.</p>
     */
    @NameInMap("DownloadPointInTime")
    public String downloadPointInTime;

    /**
     * <p>The format to which the downloaded backup set is converted. Valid values:</p>
     * <br>
     * <p>*   **CSV**</p>
     * <p>*   **SQL**</p>
     * <p>*   **Parquet**</p>
     * <br>
     * <p>> This parameter is required.</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The ID of the region in which the instance resides. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the region ID of the instance.</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    /**
     * <p>The name of the OSS bucket that is used to store the backup set.</p>
     * <br>
     * <p>*   This parameter is required if the TargetType parameter is set to OSS.</p>
     * <p>*   Make sure that your account is granted the **AliyunDBSDefaultRole** permission. For more information, see [Use RAM for resource authorization](~~26307~~). You can also grant permissions based on the operation instructions in the Resource Access Management (RAM) console.</p>
     */
    @NameInMap("TargetBucket")
    public String targetBucket;

    /**
     * <p>The region in which the OSS bucket resides.</p>
     * <br>
     * <p>> This parameter is required if the TargetType parameter is set to OSS.</p>
     */
    @NameInMap("TargetOssRegion")
    public String targetOssRegion;

    /**
     * <p>The destination path to which the backup set is downloaded.</p>
     * <br>
     * <p>> This parameter is required if the TargetType parameter is set to OSS.</p>
     */
    @NameInMap("TargetPath")
    public String targetPath;

    /**
     * <p>The type of the destination to which the backup set is downloaded. Valid values:</p>
     * <br>
     * <p>*   **OSS**</p>
     * <p>*   **URL**</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static CreateDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadRequest self = new CreateDownloadRequest();
        return TeaModel.build(map, self);
    }

    public CreateDownloadRequest setBakSetId(String bakSetId) {
        this.bakSetId = bakSetId;
        return this;
    }
    public String getBakSetId() {
        return this.bakSetId;
    }

    public CreateDownloadRequest setBakSetSize(String bakSetSize) {
        this.bakSetSize = bakSetSize;
        return this;
    }
    public String getBakSetSize() {
        return this.bakSetSize;
    }

    public CreateDownloadRequest setBakSetType(String bakSetType) {
        this.bakSetType = bakSetType;
        return this;
    }
    public String getBakSetType() {
        return this.bakSetType;
    }

    public CreateDownloadRequest setDownloadPointInTime(String downloadPointInTime) {
        this.downloadPointInTime = downloadPointInTime;
        return this;
    }
    public String getDownloadPointInTime() {
        return this.downloadPointInTime;
    }

    public CreateDownloadRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public CreateDownloadRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateDownloadRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public CreateDownloadRequest setTargetBucket(String targetBucket) {
        this.targetBucket = targetBucket;
        return this;
    }
    public String getTargetBucket() {
        return this.targetBucket;
    }

    public CreateDownloadRequest setTargetOssRegion(String targetOssRegion) {
        this.targetOssRegion = targetOssRegion;
        return this;
    }
    public String getTargetOssRegion() {
        return this.targetOssRegion;
    }

    public CreateDownloadRequest setTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }
    public String getTargetPath() {
        return this.targetPath;
    }

    public CreateDownloadRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
