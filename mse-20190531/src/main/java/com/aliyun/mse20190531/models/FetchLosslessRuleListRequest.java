// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class FetchLosslessRuleListRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>systemError</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static FetchLosslessRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchLosslessRuleListRequest self = new FetchLosslessRuleListRequest();
        return TeaModel.build(map, self);
    }

    public FetchLosslessRuleListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public FetchLosslessRuleListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public FetchLosslessRuleListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public FetchLosslessRuleListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public FetchLosslessRuleListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public FetchLosslessRuleListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FetchLosslessRuleListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
