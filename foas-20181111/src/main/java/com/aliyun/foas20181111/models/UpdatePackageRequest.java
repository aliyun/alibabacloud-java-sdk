// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdatePackageRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("md5")
    public String md5;

    @NameInMap("originName")
    public String originName;

    /**
     * <p>OSS Bucket</p>
     */
    @NameInMap("ossBucket")
    public String ossBucket;

    @NameInMap("ossEndpoint")
    public String ossEndpoint;

    @NameInMap("ossOwner")
    public String ossOwner;

    @NameInMap("ossPath")
    public String ossPath;

    @NameInMap("tag")
    public String tag;

    public static UpdatePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePackageRequest self = new UpdatePackageRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePackageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePackageRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public UpdatePackageRequest setOriginName(String originName) {
        this.originName = originName;
        return this;
    }
    public String getOriginName() {
        return this.originName;
    }

    public UpdatePackageRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public UpdatePackageRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public UpdatePackageRequest setOssOwner(String ossOwner) {
        this.ossOwner = ossOwner;
        return this;
    }
    public String getOssOwner() {
        return this.ossOwner;
    }

    public UpdatePackageRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public UpdatePackageRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
