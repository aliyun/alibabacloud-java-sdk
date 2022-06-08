// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetClientConfigRequest extends TeaModel {
    // 云端配置所对应的IOS BundleId
    @NameInMap("BundleId")
    public String bundleId;

    // 端侧上传存储Bucket信息
    @NameInMap("ClientUploadBucket")
    public String clientUploadBucket;

    // 端侧上传存储bucket下路径信息
    @NameInMap("ClientUploadPath")
    public String clientUploadPath;

    // 端侧上传存储类型，vod_oss_bucket: vod托管bucket，user_oss_bucket: 用户私有bucket
    @NameInMap("ClientUploadStorageType")
    public String clientUploadStorageType;

    // 云端配置所对应的安卓包名。
    @NameInMap("PkgName")
    public String pkgName;

    // 云端配置所对应的安卓包签名，当包名不为空时，必填。
    @NameInMap("PkgSignature")
    public String pkgSignature;

    public static SetClientConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetClientConfigRequest self = new SetClientConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetClientConfigRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public SetClientConfigRequest setClientUploadBucket(String clientUploadBucket) {
        this.clientUploadBucket = clientUploadBucket;
        return this;
    }
    public String getClientUploadBucket() {
        return this.clientUploadBucket;
    }

    public SetClientConfigRequest setClientUploadPath(String clientUploadPath) {
        this.clientUploadPath = clientUploadPath;
        return this;
    }
    public String getClientUploadPath() {
        return this.clientUploadPath;
    }

    public SetClientConfigRequest setClientUploadStorageType(String clientUploadStorageType) {
        this.clientUploadStorageType = clientUploadStorageType;
        return this;
    }
    public String getClientUploadStorageType() {
        return this.clientUploadStorageType;
    }

    public SetClientConfigRequest setPkgName(String pkgName) {
        this.pkgName = pkgName;
        return this;
    }
    public String getPkgName() {
        return this.pkgName;
    }

    public SetClientConfigRequest setPkgSignature(String pkgSignature) {
        this.pkgSignature = pkgSignature;
        return this;
    }
    public String getPkgSignature() {
        return this.pkgSignature;
    }

}
