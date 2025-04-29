// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ExportImageRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The format in which you want to export the custom image. Valid values:</p>
     * <ul>
     * <li>raw</li>
     * <li>vhd</li>
     * <li>qcow2</li>
     * <li>vmdk</li>
     * <li>vdi</li>
     * </ul>
     * <p>Default value: raw.</p>
     * 
     * <strong>example:</strong>
     * <p>raw</p>
     */
    @NameInMap("ImageFormat")
    public String imageFormat;

    /**
     * <p>The custom image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp67acfmxazb4p****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The OSS bucket in which you want to store the exported custom image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testexportImage</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>The prefix for the name of the OSS object. The prefix must be 1 to 30 characters in length and can contain digits and letters.</p>
     * 
     * <strong>example:</strong>
     * <p>EcsExport</p>
     */
    @NameInMap("OSSPrefix")
    public String OSSPrefix;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the custom image. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The name of the RAM role that you want to use to export the custom image.</p>
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
