// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AdaptCreateServiceShrinkRequest extends TeaModel {
    @NameInMap("AdaptTarget")
    public String adaptTargetShrink;

    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("AppVersionName")
    public String appVersionName;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AdaptCreateServiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AdaptCreateServiceShrinkRequest self = new AdaptCreateServiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AdaptCreateServiceShrinkRequest setAdaptTargetShrink(String adaptTargetShrink) {
        this.adaptTargetShrink = adaptTargetShrink;
        return this;
    }
    public String getAdaptTargetShrink() {
        return this.adaptTargetShrink;
    }

    public AdaptCreateServiceShrinkRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public AdaptCreateServiceShrinkRequest setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
        return this;
    }
    public String getAppVersionName() {
        return this.appVersionName;
    }

    public AdaptCreateServiceShrinkRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
