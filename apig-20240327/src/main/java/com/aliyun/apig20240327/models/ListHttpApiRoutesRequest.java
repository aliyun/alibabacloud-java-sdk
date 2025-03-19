// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApiRoutesRequest extends TeaModel {
    /**
     * <p>Filter the interface list based on a specific consumer authorization rule ID. The interface list in the response will only include authorized interfaces.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-xxx</p>
     */
    @NameInMap("consumerAuthorizationRuleId")
    public String consumerAuthorizationRuleId;

    /**
     * <p>Deployment status of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>NotDeployed</p>
     */
    @NameInMap("deployStatuses")
    public String deployStatuses;

    /**
     * <p>Filter route information by domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-xxx</p>
     */
    @NameInMap("domainId")
    public String domainId;

    /**
     * <p>Environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cpqnr6tlhtgubc***</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>Cloud-native API Gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cpv4sqdl****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Route name.</p>
     * 
     * <strong>example:</strong>
     * <p>itemcenter-gateway</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Fuzzy search by route name.</p>
     * 
     * <strong>example:</strong>
     * <p>item</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>Page number, starting from 1. Default is 1 if not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, valid range [1, 100]. Default is 10 if not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Fuzzy search by route path.</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("pathLike")
    public String pathLike;

    /**
     * <p>The response includes consumer authorization information.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withAuthPolicyInfo")
    public Boolean withAuthPolicyInfo;

    /**
     * <p>Each route information in the response carries the list of authorization rules for the specified consumer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-xxx</p>
     */
    @NameInMap("withConsumerInfoById")
    public String withConsumerInfoById;

    /**
     * <p>Each route information in the response carries the attachment information for the specified plugin ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-xxx</p>
     */
    @NameInMap("withPluginAttachmentByPluginId")
    public String withPluginAttachmentByPluginId;

    public static ListHttpApiRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHttpApiRoutesRequest self = new ListHttpApiRoutesRequest();
        return TeaModel.build(map, self);
    }

    public ListHttpApiRoutesRequest setConsumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
        this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
        return this;
    }
    public String getConsumerAuthorizationRuleId() {
        return this.consumerAuthorizationRuleId;
    }

    public ListHttpApiRoutesRequest setDeployStatuses(String deployStatuses) {
        this.deployStatuses = deployStatuses;
        return this;
    }
    public String getDeployStatuses() {
        return this.deployStatuses;
    }

    public ListHttpApiRoutesRequest setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public ListHttpApiRoutesRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListHttpApiRoutesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListHttpApiRoutesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListHttpApiRoutesRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListHttpApiRoutesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpApiRoutesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpApiRoutesRequest setPathLike(String pathLike) {
        this.pathLike = pathLike;
        return this;
    }
    public String getPathLike() {
        return this.pathLike;
    }

    public ListHttpApiRoutesRequest setWithAuthPolicyInfo(Boolean withAuthPolicyInfo) {
        this.withAuthPolicyInfo = withAuthPolicyInfo;
        return this;
    }
    public Boolean getWithAuthPolicyInfo() {
        return this.withAuthPolicyInfo;
    }

    public ListHttpApiRoutesRequest setWithConsumerInfoById(String withConsumerInfoById) {
        this.withConsumerInfoById = withConsumerInfoById;
        return this;
    }
    public String getWithConsumerInfoById() {
        return this.withConsumerInfoById;
    }

    public ListHttpApiRoutesRequest setWithPluginAttachmentByPluginId(String withPluginAttachmentByPluginId) {
        this.withPluginAttachmentByPluginId = withPluginAttachmentByPluginId;
        return this;
    }
    public String getWithPluginAttachmentByPluginId() {
        return this.withPluginAttachmentByPluginId;
    }

}
