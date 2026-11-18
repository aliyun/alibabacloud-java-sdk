// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountResourcesForCloudPermissionTemplateRequest extends TeaModel {
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
     * <p>Filters results by resource entity type. Valid values: ram_policy.</p>
     * 
     * <strong>example:</strong>
     * <p>ram_policy</p>
     */
    @NameInMap("CloudAccountResourceEntityType")
    public String cloudAccountResourceEntityType;

    /**
     * <p>The ID of the permission template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpt_xxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("CloudPermissionTemplateId")
    public String cloudPermissionTemplateId;

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
     * <p>The number of entries to return per page in a paging query. Default value: 20. Maximum value: 100.</p>
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

    public static ListCloudAccountResourcesForCloudPermissionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountResourcesForCloudPermissionTemplateRequest self = new ListCloudAccountResourcesForCloudPermissionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateRequest setCloudAccountResourceEntityType(String cloudAccountResourceEntityType) {
        this.cloudAccountResourceEntityType = cloudAccountResourceEntityType;
        return this;
    }
    public String getCloudAccountResourceEntityType() {
        return this.cloudAccountResourceEntityType;
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateRequest setCloudPermissionTemplateId(String cloudPermissionTemplateId) {
        this.cloudPermissionTemplateId = cloudPermissionTemplateId;
        return this;
    }
    public String getCloudPermissionTemplateId() {
        return this.cloudPermissionTemplateId;
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
