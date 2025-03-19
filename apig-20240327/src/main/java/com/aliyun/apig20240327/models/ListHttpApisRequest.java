// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApisRequest extends TeaModel {
    /**
     * <p>Cloud-native API Gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cq2avtllh****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Search keyword, supports fuzzy search by API name or exact search by API ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test-</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>Exact search by name.</p>
     * 
     * <strong>example:</strong>
     * <p>login</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Page number, starting from 1, default is 1 if not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, valid range [1, 100], default is 10 if not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ahr5uil8raz0rq3b</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Type of HTTP API. Multiple types can be passed, separated by &quot;,&quot;.</p>
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

    /**
     * <p>Each API information in the response carries consumer authentication policy information for the specified environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("withAuthPolicyInEnvironmentId")
    public String withAuthPolicyInEnvironmentId;

    /**
     * <p>Whether the authentication policy is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withAuthPolicyList")
    public Boolean withAuthPolicyList;

    /**
     * <p>Each API information in the response carries a list of authorization rules for the specified consumer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-xxx</p>
     */
    @NameInMap("withConsumerInfoById")
    public String withConsumerInfoById;

    /**
     * <p>Environment information</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withEnvironmentInfo")
    public Boolean withEnvironmentInfo;

    /**
     * <p>Environment ID</p>
     * 
     * <strong>example:</strong>
     * <p>env-ctovu5mm1hksb4q8ln40</p>
     */
    @NameInMap("withEnvironmentInfoById")
    public String withEnvironmentInfoById;

    /**
     * <p>Ingress information</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("withIngressInfo")
    public Boolean withIngressInfo;

    /**
     * <p>Plugin ID, used to get plugin release information based on this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-ct9qn3um1hktue8dqol0</p>
     */
    @NameInMap("withPluginAttachmentByPluginId")
    public String withPluginAttachmentByPluginId;

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

}
