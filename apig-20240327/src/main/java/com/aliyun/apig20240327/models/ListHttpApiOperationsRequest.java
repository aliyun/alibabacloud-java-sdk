// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApiOperationsRequest extends TeaModel {
    /**
     * <p>Filters the list of API operations by a specific consumer authorization rule ID. The response only includes authorized API operations.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-xxx</p>
     */
    @NameInMap("consumerAuthorizationRuleId")
    public String consumerAuthorizationRuleId;

    /**
     * <p>Specifies whether to enable the authentication filter.</p>
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
     * <p>The ID of the gateway used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-001</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Filters API operations by HTTP method.</p>
     * 
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <p>Filters API operations by exact API name.</p>
     * 
     * <strong>example:</strong>
     * <p>getUserInfo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Filters API operations by API name prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>GetUser</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
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
     * <p>Filters API operations by path prefix.</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("pathLike")
    public String pathLike;

    /**
     * <p>Specifies whether to include the list of authorization rules for a specific consumer in a specified environment in the response for each API operation. You must also specify the withConsumerInfoById parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("withConsumerInEnvironmentId")
    public String withConsumerInEnvironmentId;

    /**
     * <p>Specifies whether to include the list of authorization rules for a specific consumer in a specified environment in the response for each API operation. You must also specify the withConsumerInEnvironmentId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-xxx</p>
     */
    @NameInMap("withConsumerInfoById")
    public String withConsumerInfoById;

    /**
     * <p>The ID of the plugin used to retrieve plugin release information.</p>
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
