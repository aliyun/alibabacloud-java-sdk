// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetApplicationListShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of an application.</p>
     * 
     * <strong>example:</strong>
     * <p>hkhon1po62@c3df23522b*****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of an application.</p>
     * 
     * <strong>example:</strong>
     * <p>rest-container</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The programming language of the application, such as Java and Go.</p>
     * 
     * <strong>example:</strong>
     * <p>Java</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The microservice namespace to which the application belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Specifies whether to enable the Sentinel-compatible mode.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SentinelEnable")
    public Boolean sentinelEnable;

    /**
     * <p>The source of the application. The value is fixed as edasmsc.</p>
     * 
     * <strong>example:</strong>
     * <p>edasmsc</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Specifies whether to enable switching.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SwitchEnable")
    public Boolean switchEnable;

    @NameInMap("Tags")
    public String tagsShrink;

    public static GetApplicationListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationListShrinkRequest self = new GetApplicationListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationListShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetApplicationListShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetApplicationListShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetApplicationListShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetApplicationListShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetApplicationListShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetApplicationListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetApplicationListShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetApplicationListShrinkRequest setSentinelEnable(Boolean sentinelEnable) {
        this.sentinelEnable = sentinelEnable;
        return this;
    }
    public Boolean getSentinelEnable() {
        return this.sentinelEnable;
    }

    public GetApplicationListShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetApplicationListShrinkRequest setSwitchEnable(Boolean switchEnable) {
        this.switchEnable = switchEnable;
        return this;
    }
    public Boolean getSwitchEnable() {
        return this.switchEnable;
    }

    public GetApplicationListShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
