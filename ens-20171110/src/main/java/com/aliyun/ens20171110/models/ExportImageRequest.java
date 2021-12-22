// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportImageRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("OSSBucket")
    public String OSSBucket;

    @NameInMap("OSSPrefix")
    public String OSSPrefix;

    @NameInMap("OSSRegionId")
    public String OSSRegionId;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("Version")
    public String version;

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

    public ExportImageRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
