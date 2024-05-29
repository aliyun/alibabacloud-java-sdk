// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateMessageQueueRouteRequest extends TeaModel {
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
     * <br>
     * <p>This parameter is required.</p>
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
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The tag that is negligible for the untagged environment of the application.</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static UpdateMessageQueueRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageQueueRouteRequest self = new UpdateMessageQueueRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMessageQueueRouteRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateMessageQueueRouteRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMessageQueueRouteRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateMessageQueueRouteRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateMessageQueueRouteRequest setFilterSide(String filterSide) {
        this.filterSide = filterSide;
        return this;
    }
    public String getFilterSide() {
        return this.filterSide;
    }

    public UpdateMessageQueueRouteRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateMessageQueueRouteRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateMessageQueueRouteRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
