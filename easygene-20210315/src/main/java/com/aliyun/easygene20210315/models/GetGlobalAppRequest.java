// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetGlobalAppRequest extends TeaModel {
    // 查询字段信息
    @NameInMap("Attributes")
    public String attributes;

    // 命名空间
    @NameInMap("NamespaceName")
    public String namespaceName;

    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // 应用版本
    @NameInMap("AppVersion")
    public String appVersion;

    // 应用可用区域
    @NameInMap("Region")
    public String region;

    public static GetGlobalAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalAppRequest self = new GetGlobalAppRequest();
        return TeaModel.build(map, self);
    }

    public GetGlobalAppRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public GetGlobalAppRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public GetGlobalAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetGlobalAppRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetGlobalAppRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
