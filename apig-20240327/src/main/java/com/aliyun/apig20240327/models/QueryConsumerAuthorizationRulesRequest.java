// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class QueryConsumerAuthorizationRulesRequest extends TeaModel {
    /**
     * <p>The API name.</p>
     * 
     * <strong>example:</strong>
     * <p>api-xx</p>
     */
    @NameInMap("apiNameLike")
    public String apiNameLike;

    /**
     * <p>The consumer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-ct21c16m1hkp64hk6qmg</p>
     */
    @NameInMap("consumerId")
    public String consumerId;

    /**
     * <p>The consumer name.</p>
     * 
     * <strong>example:</strong>
     * <p>consumer-xxx</p>
     */
    @NameInMap("consumerNameLike")
    public String consumerNameLike;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cpqnr6tlhtgubc***</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>Specifies whether to group the results by API.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("groupByApi")
    public Boolean groupByApi;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The parent resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-li942gy8p01</p>
     */
    @NameInMap("parentResourceId")
    public String parentResourceId;

    /**
     * <p>The resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ha-cn-li942gy8p03</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>HttpApiRoute</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    /**
     * <p>The resource types.</p>
     * 
     * <strong>example:</strong>
     * <p>K8S</p>
     */
    @NameInMap("resourceTypes")
    public String resourceTypes;

    public static QueryConsumerAuthorizationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerAuthorizationRulesRequest self = new QueryConsumerAuthorizationRulesRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumerAuthorizationRulesRequest setApiNameLike(String apiNameLike) {
        this.apiNameLike = apiNameLike;
        return this;
    }
    public String getApiNameLike() {
        return this.apiNameLike;
    }

    public QueryConsumerAuthorizationRulesRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public QueryConsumerAuthorizationRulesRequest setConsumerNameLike(String consumerNameLike) {
        this.consumerNameLike = consumerNameLike;
        return this;
    }
    public String getConsumerNameLike() {
        return this.consumerNameLike;
    }

    public QueryConsumerAuthorizationRulesRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public QueryConsumerAuthorizationRulesRequest setGroupByApi(Boolean groupByApi) {
        this.groupByApi = groupByApi;
        return this;
    }
    public Boolean getGroupByApi() {
        return this.groupByApi;
    }

    public QueryConsumerAuthorizationRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryConsumerAuthorizationRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryConsumerAuthorizationRulesRequest setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
        return this;
    }
    public String getParentResourceId() {
        return this.parentResourceId;
    }

    public QueryConsumerAuthorizationRulesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public QueryConsumerAuthorizationRulesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public QueryConsumerAuthorizationRulesRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

}
