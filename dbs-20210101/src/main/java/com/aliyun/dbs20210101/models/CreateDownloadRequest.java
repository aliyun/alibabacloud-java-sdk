// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateDownloadRequest extends TeaModel {
    @NameInMap("AdminDatabase")
    public String adminDatabase;

    /**
     * <p>The ID of the backup set. You can call the <a href="https://help.aliyun.com/document_detail/26273.html">DescribeBackups</a> operation to query the ID of the backup set.</p>
     * <blockquote>
     * <p>This parameter is required if the BakSetType parameter is set to full.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>146005****</p>
     */
    @NameInMap("BakSetId")
    public String bakSetId;

    /**
     * <p>The size of the full backup set. Unit: bytes. You can call the <a href="https://help.aliyun.com/document_detail/26273.html">DescribeBackups</a> operation to query the size of the full backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>216****</p>
     */
    @NameInMap("BakSetSize")
    public String bakSetSize;

    /**
     * <p>The type of the download task. Valid values:</p>
     * <ul>
     * <li><strong>full</strong>: downloads a full backup set.</li>
     * <li><strong>pitr</strong>: downloads a backup set at a specific point in time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>full</p>
     */
    @NameInMap("BakSetType")
    public String bakSetType;

    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The point in time at which the backup set is downloaded. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p>This parameter is required if the BakSetType parameter is set to pitr.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1661331864000</p>
     */
    @NameInMap("DownloadPointInTime")
    public String downloadPointInTime;

    /**
     * <p>The format to which the downloaded backup set is converted. Valid values:</p>
     * <ul>
     * <li><strong>CSV</strong></li>
     * <li><strong>SQL</strong></li>
     * <li><strong>Parquet</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CSV</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-wz994c1t1****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IsCluster")
    public String isCluster;

    @NameInMap("IsPhysical")
    public Boolean isPhysical;

    @NameInMap("PrimaryKeyTypeOnly")
    public String primaryKeyTypeOnly;

    /**
     * <p>The ID of the region in which the instance resides. You can call the <a href="https://help.aliyun.com/document_detail/26231.html">DescribeDBInstanceAttribute</a> operation to query the region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    /**
     * <p>The name of the OSS bucket that is used to store the backup set.</p>
     * <ul>
     * <li>This parameter is required if the TargetType parameter is set to OSS.</li>
     * <li>Make sure that your account is granted the <strong>AliyunDBSDefaultRole</strong> permission. For more information, see <a href="https://help.aliyun.com/document_detail/26307.html">Use RAM for resource authorization</a>. You can also grant permissions based on the operation instructions in the Resource Access Management (RAM) console.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test123</p>
     */
    @NameInMap("TargetBucket")
    public String targetBucket;

    /**
     * <p>The region in which the OSS bucket resides.</p>
     * <blockquote>
     * <p>This parameter is required if the TargetType parameter is set to OSS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("TargetOssRegion")
    public String targetOssRegion;

    /**
     * <p>The destination path to which the backup set is downloaded.</p>
     * <blockquote>
     * <p>This parameter is required if the TargetType parameter is set to OSS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test_db/path</p>
     */
    @NameInMap("TargetPath")
    public String targetPath;

    /**
     * <p>The type of the destination to which the backup set is downloaded. Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong></li>
     * <li><strong>URL</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("UseZstd")
    public String useZstd;

    public static CreateDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadRequest self = new CreateDownloadRequest();
        return TeaModel.build(map, self);
    }

    public CreateDownloadRequest setAdminDatabase(String adminDatabase) {
        this.adminDatabase = adminDatabase;
        return this;
    }
    public String getAdminDatabase() {
        return this.adminDatabase;
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

    public CreateDownloadRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
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

    public CreateDownloadRequest setIsCluster(String isCluster) {
        this.isCluster = isCluster;
        return this;
    }
    public String getIsCluster() {
        return this.isCluster;
    }

    public CreateDownloadRequest setIsPhysical(Boolean isPhysical) {
        this.isPhysical = isPhysical;
        return this;
    }
    public Boolean getIsPhysical() {
        return this.isPhysical;
    }

    public CreateDownloadRequest setPrimaryKeyTypeOnly(String primaryKeyTypeOnly) {
        this.primaryKeyTypeOnly = primaryKeyTypeOnly;
        return this;
    }
    public String getPrimaryKeyTypeOnly() {
        return this.primaryKeyTypeOnly;
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

    public CreateDownloadRequest setUseZstd(String useZstd) {
        this.useZstd = useZstd;
        return this;
    }
    public String getUseZstd() {
        return this.useZstd;
    }

}
