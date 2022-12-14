// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateDownloadRequest extends TeaModel {
    // The ID of the backup set. You can call the [DescribeBackups](~~26273~~) operation to obtain the ID of the backup set.
    // 
    // >  This parameter is required if the BakSetType parameter is set to full.
    @NameInMap("BakSetId")
    public String bakSetId;

    // The size of the full backup set. You can call the [DescribeBackups](~~26273~~) operation to query the size of the full backup set. Unit: bytes.
    @NameInMap("BakSetSize")
    public String bakSetSize;

    // The type of the download task. Valid values:
    // 
    // *   **full**: downloads a full backup set.
    // *   **pitr**: downloads a backup set at a specific point in time.
    @NameInMap("BakSetType")
    public String bakSetType;

    // The point in time at which the backup set is downloaded. The UNIX timestamp of the LONG type. Unit: milliseconds.
    // 
    // >  This parameter is required if the BakSetType parameter is set to pitr.
    @NameInMap("DownloadPointInTime")
    public String downloadPointInTime;

    // The destination format to which the downloaded backup set is converted. Valid values:
    // 
    // *   **csv**
    // *   **SQL**
    // *   **Parquet**
    @NameInMap("FormatType")
    public String formatType;

    // The ID of the instance.
    @NameInMap("InstanceName")
    public String instanceName;

    // The ID of the region in which the instance resides. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the region ID of the instance.
    @NameInMap("RegionCode")
    public String regionCode;

    // The name of the OSS bucket that is used to store the backup set.
    // 
    // *   This parameter is required if the TargetType parameter is set to OSS.
    // *   Make sure that your account has the **AliyunDBSDefaultRole** permission. For more information, see [Use RAM for resource authorization](~~26307~~). You can also grant permissions based on the operation instructions in the RAM console.
    @NameInMap("TargetBucket")
    public String targetBucket;

    // The region in which the OSS bucket resides.
    // 
    // >  This parameter is required if the TargetType parameter is set to OSS.
    @NameInMap("TargetOssRegion")
    public String targetOssRegion;

    // The destination path of the downloaded data.
    // 
    // >  This parameter is required if the TargetType parameter is set to OSS.
    @NameInMap("TargetPath")
    public String targetPath;

    // The type of the method in which the backup set is downloaded. Valid values:
    // 
    // *   **OSS**
    // *   **URL**
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
