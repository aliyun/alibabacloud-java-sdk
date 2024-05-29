// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetApplicationListRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of an application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of an application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The programming language of the application, such as Java and Go.</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The microservice namespace to which the application belongs.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Specifies whether to enable the Sentinel-compatible mode.</p>
     */
    @NameInMap("SentinelEnable")
    public Boolean sentinelEnable;

    /**
     * <p>The source of the application. The value is fixed as edasmsc.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Specifies whether to enable switching.</p>
     */
    @NameInMap("SwitchEnable")
    public Boolean switchEnable;

    public static GetApplicationListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationListRequest self = new GetApplicationListRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetApplicationListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetApplicationListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetApplicationListRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetApplicationListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetApplicationListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetApplicationListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetApplicationListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetApplicationListRequest setSentinelEnable(Boolean sentinelEnable) {
        this.sentinelEnable = sentinelEnable;
        return this;
    }
    public Boolean getSentinelEnable() {
        return this.sentinelEnable;
    }

    public GetApplicationListRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetApplicationListRequest setSwitchEnable(Boolean switchEnable) {
        this.switchEnable = switchEnable;
        return this;
    }
    public Boolean getSwitchEnable() {
        return this.switchEnable;
    }

}
