// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportImageRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("OSSBucket")
    @Validation(required = true)
    public String OSSBucket;

    @NameInMap("OSSRegionId")
    @Validation(required = true)
    public String OSSRegionId;

    @NameInMap("OSSPrefix")
    public String OSSPrefix;

    @NameInMap("RoleName")
    public String roleName;

    public static ExportImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportImageRequest self = new ExportImageRequest();
        return TeaModel.build(map, self);
    }

    public ExportImageRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
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

    public ExportImageRequest setOSSRegionId(String OSSRegionId) {
        this.OSSRegionId = OSSRegionId;
        return this;
    }
    public String getOSSRegionId() {
        return this.OSSRegionId;
    }

    public ExportImageRequest setOSSPrefix(String OSSPrefix) {
        this.OSSPrefix = OSSPrefix;
        return this;
    }
    public String getOSSPrefix() {
        return this.OSSPrefix;
    }

    public ExportImageRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
