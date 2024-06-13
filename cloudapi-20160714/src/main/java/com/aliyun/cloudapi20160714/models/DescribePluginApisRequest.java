// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginApisRequest extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The description of the API.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The request HTTP method of the API.</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * <p>Default value:10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request path of the API.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The ID of the gateway plug-in.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribePluginApisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginApisRequest self = new DescribePluginApisRequest();
        return TeaModel.build(map, self);
    }

    public DescribePluginApisRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribePluginApisRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribePluginApisRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribePluginApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePluginApisRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public DescribePluginApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePluginApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePluginApisRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribePluginApisRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public DescribePluginApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
