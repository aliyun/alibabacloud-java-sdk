// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApiRoutesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-svc</p>
     */
    @NameInMap("backendServiceName")
    public String backendServiceName;

    /**
     * <p>The consumer authorization rule ID. If specified, the response includes only routes that are authorized by the specified rule.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-xxx</p>
     */
    @NameInMap("consumerAuthorizationRuleId")
    public String consumerAuthorizationRuleId;

    /**
     * <p>The deployment status of the route.</p>
     * 
     * <strong>example:</strong>
     * <p>NotDeployed</p>
     */
    @NameInMap("deployStatuses")
    public String deployStatuses;

    /**
     * <p>The domain name ID used to filter routes.</p>
     * 
     * <strong>example:</strong>
     * <p>d-xxx</p>
     */
    @NameInMap("domainId")
    public String domainId;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cpqnr6tlhtgubc***</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>Specifies whether the query is for a deployment scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("forDeploy")
    public Boolean forDeploy;

    /**
     * <p>The cloud-native API gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cpv4sqdl****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The route name.</p>
     * 
     * <strong>example:</strong>
     * <p>itemcenter-gateway</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The route name for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>item</p>
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
     * <p>The route path for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("pathLike")
    public String pathLike;

    /**
     * <p>Specifies whether to include consumer authorization information in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withAuthPolicyInfo")
    public Boolean withAuthPolicyInfo;

    /**
     * <p>The consumer ID. If specified, the response includes the authorization rule list for the specified consumer in each route.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-xxx</p>
     */
    @NameInMap("withConsumerInfoById")
    public String withConsumerInfoById;

    /**
     * <p>The plug-in ID. If specified, the response includes the attachment information of the specified plug-in for each route.</p>
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

    public ListHttpApiRoutesRequest setBackendServiceName(String backendServiceName) {
        this.backendServiceName = backendServiceName;
        return this;
    }
    public String getBackendServiceName() {
        return this.backendServiceName;
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

    public ListHttpApiRoutesRequest setForDeploy(Boolean forDeploy) {
        this.forDeploy = forDeploy;
        return this;
    }
    public Boolean getForDeploy() {
        return this.forDeploy;
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
