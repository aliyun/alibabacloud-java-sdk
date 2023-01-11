// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateMessageQueueRouteShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether the canary release for messaging feature is enabled for the application. Valid values:</p>
     * <br>
     * <p>*   `true`: enabled</p>
     * <p>*   `false`: disabled</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The side for message filtering when the canary release for messaging feature is enabled.</p>
     */
    @NameInMap("FilterSide")
    public String filterSide;

    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The tag that is negligible for the untagged environment of the application.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static UpdateMessageQueueRouteShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageQueueRouteShrinkRequest self = new UpdateMessageQueueRouteShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMessageQueueRouteShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateMessageQueueRouteShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMessageQueueRouteShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMessageQueueRouteShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateMessageQueueRouteShrinkRequest setFilterSide(String filterSide) {
        this.filterSide = filterSide;
        return this;
    }
    public String getFilterSide() {
        return this.filterSide;
    }

    public UpdateMessageQueueRouteShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateMessageQueueRouteShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateMessageQueueRouteShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
