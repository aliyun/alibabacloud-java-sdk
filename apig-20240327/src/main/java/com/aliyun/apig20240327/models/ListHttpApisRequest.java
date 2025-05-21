// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApisRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud-native API Gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq2avtllh****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The search keyword. You can fuzzy-search by API name or exact-search by API ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test-</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The API name that is used for the search. In this case, exact search is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>login</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number of the page to return. Pages start from page 1. Default value: 1.</p>
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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ahr5uil8raz0rq3b</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The API type. You can specify multiple types and separate them with a comma (,).</p>
     * <ul>
     * <li>Http</li>
     * <li>Rest</li>
     * <li>WebSocket</li>
     * <li>HttpIngress</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Http,Rest</p>
     */
    @NameInMap("types")
    public String types;

    @NameInMap("withAPIsPublishedToEnvironment")
    public Boolean withAPIsPublishedToEnvironment;

    /**
     * <p>The consumer authentication policy in the specified environment in each returned API.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("withAuthPolicyInEnvironmentId")
    public String withAuthPolicyInEnvironmentId;

    /**
     * <p>Specifies whether authentication is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withAuthPolicyList")
    public Boolean withAuthPolicyList;

    /**
     * <p>The authorization rules of the specified consumer in each returned API.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-xxx</p>
     */
    @NameInMap("withConsumerInfoById")
    public String withConsumerInfoById;

    /**
     * <p>The environment information.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withEnvironmentInfo")
    public Boolean withEnvironmentInfo;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-ctovu5mm1hksb4q8ln40</p>
     */
    @NameInMap("withEnvironmentInfoById")
    public String withEnvironmentInfoById;

    /**
     * <p>The Ingress information.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("withIngressInfo")
    public Boolean withIngressInfo;

    /**
     * <p>The plug-in ID. You can use the returned value of this parameter to query the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-ct9qn3um1hktue8dqol0</p>
     */
    @NameInMap("withPluginAttachmentByPluginId")
    public String withPluginAttachmentByPluginId;

    @NameInMap("withPolicyConfigs")
    public Boolean withPolicyConfigs;

    public static ListHttpApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHttpApisRequest self = new ListHttpApisRequest();
        return TeaModel.build(map, self);
    }

    public ListHttpApisRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListHttpApisRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public ListHttpApisRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListHttpApisRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListHttpApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpApisRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListHttpApisRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public ListHttpApisRequest setWithAPIsPublishedToEnvironment(Boolean withAPIsPublishedToEnvironment) {
        this.withAPIsPublishedToEnvironment = withAPIsPublishedToEnvironment;
        return this;
    }
    public Boolean getWithAPIsPublishedToEnvironment() {
        return this.withAPIsPublishedToEnvironment;
    }

    public ListHttpApisRequest setWithAuthPolicyInEnvironmentId(String withAuthPolicyInEnvironmentId) {
        this.withAuthPolicyInEnvironmentId = withAuthPolicyInEnvironmentId;
        return this;
    }
    public String getWithAuthPolicyInEnvironmentId() {
        return this.withAuthPolicyInEnvironmentId;
    }

    public ListHttpApisRequest setWithAuthPolicyList(Boolean withAuthPolicyList) {
        this.withAuthPolicyList = withAuthPolicyList;
        return this;
    }
    public Boolean getWithAuthPolicyList() {
        return this.withAuthPolicyList;
    }

    public ListHttpApisRequest setWithConsumerInfoById(String withConsumerInfoById) {
        this.withConsumerInfoById = withConsumerInfoById;
        return this;
    }
    public String getWithConsumerInfoById() {
        return this.withConsumerInfoById;
    }

    public ListHttpApisRequest setWithEnvironmentInfo(Boolean withEnvironmentInfo) {
        this.withEnvironmentInfo = withEnvironmentInfo;
        return this;
    }
    public Boolean getWithEnvironmentInfo() {
        return this.withEnvironmentInfo;
    }

    public ListHttpApisRequest setWithEnvironmentInfoById(String withEnvironmentInfoById) {
        this.withEnvironmentInfoById = withEnvironmentInfoById;
        return this;
    }
    public String getWithEnvironmentInfoById() {
        return this.withEnvironmentInfoById;
    }

    public ListHttpApisRequest setWithIngressInfo(Boolean withIngressInfo) {
        this.withIngressInfo = withIngressInfo;
        return this;
    }
    public Boolean getWithIngressInfo() {
        return this.withIngressInfo;
    }

    public ListHttpApisRequest setWithPluginAttachmentByPluginId(String withPluginAttachmentByPluginId) {
        this.withPluginAttachmentByPluginId = withPluginAttachmentByPluginId;
        return this;
    }
    public String getWithPluginAttachmentByPluginId() {
        return this.withPluginAttachmentByPluginId;
    }

    public ListHttpApisRequest setWithPolicyConfigs(Boolean withPolicyConfigs) {
        this.withPolicyConfigs = withPolicyConfigs;
        return this;
    }
    public Boolean getWithPolicyConfigs() {
        return this.withPolicyConfigs;
    }

}
