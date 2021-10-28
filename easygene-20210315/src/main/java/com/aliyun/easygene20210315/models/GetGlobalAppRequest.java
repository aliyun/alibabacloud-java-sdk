// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetGlobalAppRequest extends TeaModel {
    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // 应用版本
    @NameInMap("AppVersion")
    public String appVersion;

    // 查询字段信息：appVersions，regionIds，dag
    @NameInMap("Attributes")
    public java.util.List<String> attributes;

    // 应用可用区域
    @NameInMap("Location")
    public String location;

    // 命名空间
    @NameInMap("NamespaceName")
    public String namespaceName;

    public static GetGlobalAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalAppRequest self = new GetGlobalAppRequest();
        return TeaModel.build(map, self);
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

    public GetGlobalAppRequest setAttributes(java.util.List<String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<String> getAttributes() {
        return this.attributes;
    }

    public GetGlobalAppRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public GetGlobalAppRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}
