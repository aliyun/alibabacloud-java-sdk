// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetClientConfigRequest extends TeaModel {
    // 云端配置所对应的IOS BundleId
    @NameInMap("BundleId")
    public String bundleId;

    // 云端配置所对应的包名。
    @NameInMap("PkgName")
    public String pkgName;

    // 云端配置所对应的包签名
    @NameInMap("PkgSignature")
    public String pkgSignature;

    public static GetClientConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientConfigRequest self = new GetClientConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetClientConfigRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public GetClientConfigRequest setPkgName(String pkgName) {
        this.pkgName = pkgName;
        return this;
    }
    public String getPkgName() {
        return this.pkgName;
    }

    public GetClientConfigRequest setPkgSignature(String pkgSignature) {
        this.pkgSignature = pkgSignature;
        return this;
    }
    public String getPkgSignature() {
        return this.pkgSignature;
    }

}
