// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetGlobalAppShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("Attributes")
    public String attributesShrink;

    @NameInMap("Location")
    public String location;

    @NameInMap("NamespaceName")
    public String namespaceName;

    public static GetGlobalAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalAppShrinkRequest self = new GetGlobalAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetGlobalAppShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetGlobalAppShrinkRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetGlobalAppShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

    public GetGlobalAppShrinkRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public GetGlobalAppShrinkRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

}
