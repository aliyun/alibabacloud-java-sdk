// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListCircuitBreakerRulesRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh-CN and en-US. Default value: zh-CN. The value zh-CN indicates Chinese, and the value en-US indicates English.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The microservice namespace to which the application belongs.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The start page of the returned pages. Default value: 1.</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page. Default value: 6.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is used for exact match of circuit breaking rules.</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>This parameter is used for fuzzy match of circuit breaking rules.</p>
     */
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
