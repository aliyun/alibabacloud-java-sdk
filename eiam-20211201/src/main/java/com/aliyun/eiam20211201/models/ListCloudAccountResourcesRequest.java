// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789012xxxx</p>
     */
    @NameInMap("CloudAccountId")
    public String cloudAccountId;

    /**
     * <p>Filters resources by entity type. Valid values: ram_policy.</p>
     * 
     * <strong>example:</strong>
     * <p>ram_policy</p>
     */
    @NameInMap("CloudAccountResourceEntityType")
    public String cloudAccountResourceEntityType;

    /**
     * <p>Fuzzy matches the resource name. This is equivalent to LIKE \&quot;%value%\&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>sso</p>
     */
    @NameInMap("CloudAccountResourceNameContains")
    public String cloudAccountResourceNameContains;

    /**
     * <p>Matches resources by the prefix of the resource name.</p>
     * 
     * <strong>example:</strong>
     * <p>eiam-</p>
     */
    @NameInMap("CloudAccountResourceNamePrefix")
    public String cloudAccountResourceNamePrefix;

    /**
     * <p>The ID of the IDaaS EIAM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries per page for paging in a paged query. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Set the value to the NextToken value returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListCloudAccountResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountResourcesRequest self = new ListCloudAccountResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountResourcesRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public ListCloudAccountResourcesRequest setCloudAccountResourceEntityType(String cloudAccountResourceEntityType) {
        this.cloudAccountResourceEntityType = cloudAccountResourceEntityType;
        return this;
    }
    public String getCloudAccountResourceEntityType() {
        return this.cloudAccountResourceEntityType;
    }

    public ListCloudAccountResourcesRequest setCloudAccountResourceNameContains(String cloudAccountResourceNameContains) {
        this.cloudAccountResourceNameContains = cloudAccountResourceNameContains;
        return this;
    }
    public String getCloudAccountResourceNameContains() {
        return this.cloudAccountResourceNameContains;
    }

    public ListCloudAccountResourcesRequest setCloudAccountResourceNamePrefix(String cloudAccountResourceNamePrefix) {
        this.cloudAccountResourceNamePrefix = cloudAccountResourceNamePrefix;
        return this;
    }
    public String getCloudAccountResourceNamePrefix() {
        return this.cloudAccountResourceNamePrefix;
    }

    public ListCloudAccountResourcesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCloudAccountResourcesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListCloudAccountResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
