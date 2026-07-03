// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApiOperationsRequest extends TeaModel {
    /**
     * <p>The consumer authorization rule ID used to filter the API operation list. The response includes only authorized API operations.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-xxx</p>
     */
    @NameInMap("consumerAuthorizationRuleId")
    public String consumerAuthorizationRuleId;

    /**
     * <p>Specifies whether to filter by authentication enablement status.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuth")
    public Boolean enableAuth;

    /**
     * <p>Specifies whether the request is for a deployment scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("forDeploy")
    public Boolean forDeploy;

    /**
     * <p>The gateway ID used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-001</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Lists API operations by HTTP method.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>Searches for API operations by exact name match.</p>
     * 
     * <strong>example:</strong>
     * <p>getUserInfo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Searches for API operations by name prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>GetUser</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>The page number to return. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Searches for API operations by path prefix match.</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("pathLike")
    public String pathLike;

    /**
     * <p>The environment ID. When specified, the response includes the authorization rule list of the specified consumer under the specified environment for each API operation. You must also specify the withConsumerInfoById parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("withConsumerInEnvironmentId")
    public String withConsumerInEnvironmentId;

    /**
     * <p>The consumer ID. When specified, the response includes the authorization rule list of the specified consumer under the specified environment for each API operation. You must also specify the withConsumerInEnvironmentId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-xxx</p>
     */
    @NameInMap("withConsumerInfoById")
    public String withConsumerInfoById;

    /**
     * <p>The plug-in ID used to retrieve plug-in publishing information.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-xxx</p>
     */
    @NameInMap("withPluginAttachmentByPluginId")
    public String withPluginAttachmentByPluginId;

    public static ListHttpApiOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHttpApiOperationsRequest self = new ListHttpApiOperationsRequest();
        return TeaModel.build(map, self);
    }

    public ListHttpApiOperationsRequest setConsumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
        this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
        return this;
    }
    public String getConsumerAuthorizationRuleId() {
        return this.consumerAuthorizationRuleId;
    }

    public ListHttpApiOperationsRequest setEnableAuth(Boolean enableAuth) {
        this.enableAuth = enableAuth;
        return this;
    }
    public Boolean getEnableAuth() {
        return this.enableAuth;
    }

    public ListHttpApiOperationsRequest setForDeploy(Boolean forDeploy) {
        this.forDeploy = forDeploy;
        return this;
    }
    public Boolean getForDeploy() {
        return this.forDeploy;
    }

    public ListHttpApiOperationsRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListHttpApiOperationsRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public ListHttpApiOperationsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListHttpApiOperationsRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListHttpApiOperationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpApiOperationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpApiOperationsRequest setPathLike(String pathLike) {
        this.pathLike = pathLike;
        return this;
    }
    public String getPathLike() {
        return this.pathLike;
    }

    public ListHttpApiOperationsRequest setWithConsumerInEnvironmentId(String withConsumerInEnvironmentId) {
        this.withConsumerInEnvironmentId = withConsumerInEnvironmentId;
        return this;
    }
    public String getWithConsumerInEnvironmentId() {
        return this.withConsumerInEnvironmentId;
    }

    public ListHttpApiOperationsRequest setWithConsumerInfoById(String withConsumerInfoById) {
        this.withConsumerInfoById = withConsumerInfoById;
        return this;
    }
    public String getWithConsumerInfoById() {
        return this.withConsumerInfoById;
    }

    public ListHttpApiOperationsRequest setWithPluginAttachmentByPluginId(String withPluginAttachmentByPluginId) {
        this.withPluginAttachmentByPluginId = withPluginAttachmentByPluginId;
        return this;
    }
    public String getWithPluginAttachmentByPluginId() {
        return this.withPluginAttachmentByPluginId;
    }

}
