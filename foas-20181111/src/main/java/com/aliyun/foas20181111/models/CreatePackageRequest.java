// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CreatePackageRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("md5")
    public String md5;

    @NameInMap("originName")
    public String originName;

    /**
     * <p>OSSBucket</p>
     */
    @NameInMap("ossBucket")
    public String ossBucket;

    @NameInMap("ossEndpoint")
    public String ossEndpoint;

    @NameInMap("ossOwner")
    public String ossOwner;

    @NameInMap("ossPath")
    public String ossPath;

    @NameInMap("packageName")
    public String packageName;

    @NameInMap("tag")
    public String tag;

    @NameInMap("type")
    public String type;

    public static CreatePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePackageRequest self = new CreatePackageRequest();
        return TeaModel.build(map, self);
    }

    public CreatePackageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePackageRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public CreatePackageRequest setOriginName(String originName) {
        this.originName = originName;
        return this;
    }
    public String getOriginName() {
        return this.originName;
    }

    public CreatePackageRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public CreatePackageRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public CreatePackageRequest setOssOwner(String ossOwner) {
        this.ossOwner = ossOwner;
        return this;
    }
    public String getOssOwner() {
        return this.ossOwner;
    }

    public CreatePackageRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public CreatePackageRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public CreatePackageRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CreatePackageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
