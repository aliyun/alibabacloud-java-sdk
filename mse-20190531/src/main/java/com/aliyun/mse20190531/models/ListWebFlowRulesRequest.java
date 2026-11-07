// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListWebFlowRulesRequest extends TeaModel {
    /**
     * <p>The language in which the returned results are displayed. Valid values: zh (default): Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b22qb1****@2f0586be4b1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-a</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The first page to export. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The interface to which the protection rule applies. This parameter is mutually exclusive with the ResourceSearchKey parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>/flow</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The interface keyword that you can search from protection rules. This parameter is mutually exclusive with the Resource parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>flow</p>
     */
    @NameInMap("ResourceSearchKey")
    public String resourceSearchKey;

    public static ListWebFlowRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWebFlowRulesRequest self = new ListWebFlowRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListWebFlowRulesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListWebFlowRulesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListWebFlowRulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListWebFlowRulesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListWebFlowRulesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListWebFlowRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWebFlowRulesRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ListWebFlowRulesRequest setResourceSearchKey(String resourceSearchKey) {
        this.resourceSearchKey = resourceSearchKey;
        return this;
    }
    public String getResourceSearchKey() {
        return this.resourceSearchKey;
    }

}
