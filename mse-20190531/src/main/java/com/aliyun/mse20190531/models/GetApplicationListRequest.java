// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetApplicationListRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Language")
    public String language;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Region")
    public String region;

    @NameInMap("SentinelEnable")
    public Boolean sentinelEnable;

    @NameInMap("Source")
    public String source;

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
