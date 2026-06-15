// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ExportImageRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run to check the request\&quot;s validity without actually exporting the image. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Performs a dry run. If the check succeeds, the <code>DryRunOperation</code> error code is returned. If the check fails, an error is returned.</li>
     * <li><code>false</code>: Sends a normal request. If the check succeeds, the image is exported.</li>
     * </ul>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The format of the exported image file. Valid values:</p>
     * <ul>
     * <li><p>raw.</p>
     * </li>
     * <li><p>vhd.</p>
     * </li>
     * <li><p>qcow2.</p>
     * </li>
     * <li><p>vmdk.</p>
     * </li>
     * <li><p>vdi.</p>
     * </li>
     * </ul>
     * <p>Default value: raw.</p>
     * 
     * <strong>example:</strong>
     * <p>raw</p>
     */
    @NameInMap("ImageFormat")
    public String imageFormat;

    /**
     * <p>The ID of the custom image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp67acfmxazb4p****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The destination OSS bucket for the exported image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testexportImage</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>The prefix for the OSS object. The prefix must be 1 to 30 characters in length and can consist of letters and digits.</p>
     * 
     * <strong>example:</strong>
     * <p>EcsExport</p>
     */
    @NameInMap("OSSPrefix")
    public String OSSPrefix;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the custom image. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the RAM role used to export the image.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunECSImageExportDefaultRole</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static ExportImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportImageRequest self = new ExportImageRequest();
        return TeaModel.build(map, self);
    }

    public ExportImageRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ExportImageRequest setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    public String getImageFormat() {
        return this.imageFormat;
    }

    public ExportImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ExportImageRequest setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public ExportImageRequest setOSSPrefix(String OSSPrefix) {
        this.OSSPrefix = OSSPrefix;
        return this;
    }
    public String getOSSPrefix() {
        return this.OSSPrefix;
    }

    public ExportImageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ExportImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportImageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ExportImageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ExportImageRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
