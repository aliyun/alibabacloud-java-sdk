// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportImageRequest extends TeaModel {
    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The OSS bucket to which you want to export the image.</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>The prefix of the object as which you want to store the image in the OSS bucket. The prefix must be 1 to 30 characters in length and can contain digits and letters.</p>
     */
    @NameInMap("OSSPrefix")
    public String OSSPrefix;

    /**
     * <p>The ID of the region.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   cn-beijing</p>
     */
    @NameInMap("OSSRegionId")
    public String OSSRegionId;

    /**
     * <p>The name of the Resource Access Management (RAM) role.</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static ExportImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportImageRequest self = new ExportImageRequest();
        return TeaModel.build(map, self);
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

    public ExportImageRequest setOSSRegionId(String OSSRegionId) {
        this.OSSRegionId = OSSRegionId;
        return this;
    }
    public String getOSSRegionId() {
        return this.OSSRegionId;
    }

    public ExportImageRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
