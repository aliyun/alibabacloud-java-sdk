// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApiRoutesRequest extends TeaModel {
    @NameInMap("consumerAuthorizationRuleId")
    public String consumerAuthorizationRuleId;

    /**
     * <strong>example:</strong>
     * <p>NotDeployed</p>
     */
    @NameInMap("deployStatuses")
    public String deployStatuses;

    @NameInMap("domainId")
    public String domainId;

    /**
     * <strong>example:</strong>
     * <p>env-cpqnr6tlhtgubc***</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <strong>example:</strong>
     * <p>gw-cpv4sqdl****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>itemcenter-gateway</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>item</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("pathLike")
    public String pathLike;

    @NameInMap("withAuthPolicyInfo")
    public Boolean withAuthPolicyInfo;

    @NameInMap("withConsumerInfoById")
    public String withConsumerInfoById;

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
