// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListCircuitBreakerRulesRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResourceSearchKey")
    public String resourceSearchKey;

    public static ListCircuitBreakerRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCircuitBreakerRulesRequest self = new ListCircuitBreakerRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListCircuitBreakerRulesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListCircuitBreakerRulesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListCircuitBreakerRulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListCircuitBreakerRulesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListCircuitBreakerRulesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListCircuitBreakerRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCircuitBreakerRulesRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ListCircuitBreakerRulesRequest setResourceSearchKey(String resourceSearchKey) {
        this.resourceSearchKey = resourceSearchKey;
        return this;
    }
    public String getResourceSearchKey() {
        return this.resourceSearchKey;
    }

}
