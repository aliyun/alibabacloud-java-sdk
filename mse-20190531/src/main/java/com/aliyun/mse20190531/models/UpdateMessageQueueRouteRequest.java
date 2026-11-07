// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateMessageQueueRouteRequest extends TeaModel {
    /**
     * <p>The language of the returned information. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hkhon1po62@c3df23522baa898</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>example-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether message canary release is enabled. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Enabled.</li>
     * <li><code>false</code>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The filtering side for message canary release.</p>
     * 
     * <strong>example:</strong>
     * <p>Server</p>
     */
    @NameInMap("FilterSide")
    public String filterSide;

    /**
     * <p>The list of baseline environment labels for MSMQ grayscale rules.</p>
     */
    @NameInMap("GrayBaseTags")
    public java.util.List<String> grayBaseTags;

    /**
     * <p>The MSE namespace name.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ignored tags for the untagged environments of the application.</p>
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

    public UpdateMessageQueueRouteRequest setGrayBaseTags(java.util.List<String> grayBaseTags) {
        this.grayBaseTags = grayBaseTags;
        return this;
    }
    public java.util.List<String> getGrayBaseTags() {
        return this.grayBaseTags;
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
