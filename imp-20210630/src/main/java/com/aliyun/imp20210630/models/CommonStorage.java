// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CommonStorage extends TeaModel {
    // OSS bucket
    @NameInMap("Bucket")
    public String bucket;

    // OSS object path
    @NameInMap("Object")
    public String object;

    // 阿里云Region，比如 cn-shanghai
    @NameInMap("Region")
    public String region;

    // OSS的签名URL
    @NameInMap("SignUrl")
    public String signUrl;

    // Security Token Service
    @NameInMap("Sts")
    public CommonSTS sts;

    public static CommonStorage build(java.util.Map<String, ?> map) throws Exception {
        CommonStorage self = new CommonStorage();
        return TeaModel.build(map, self);
    }

    public CommonStorage setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public CommonStorage setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public CommonStorage setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CommonStorage setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

    public CommonStorage setSts(CommonSTS sts) {
        this.sts = sts;
        return this;
    }
    public CommonSTS getSts() {
        return this.sts;
    }

}
