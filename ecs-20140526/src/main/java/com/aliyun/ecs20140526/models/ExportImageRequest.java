// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ExportImageRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("OSSBucket")
    @Validation(required = true)
    public String OSSBucket;

    @NameInMap("OSSPrefix")
    public String OSSPrefix;

    @NameInMap("ImageFormat")
    public String imageFormat;

    @NameInMap("RoleName")
    public String roleName;

    public static ExportImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportImageRequest self = new ExportImageRequest();
        return TeaModel.build(map, self);
    }

    public ExportImageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public ExportImageRequest setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }
    public String getImageFormat() {
        return this.imageFormat;
    }

    public ExportImageRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
