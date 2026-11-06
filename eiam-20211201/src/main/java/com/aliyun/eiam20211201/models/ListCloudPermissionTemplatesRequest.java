// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudPermissionTemplatesRequest extends TeaModel {
    /**
     * <p>The ID of the cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca_01kmegjc11qa1txxxxx</p>
     */
    @NameInMap("CloudAccountId")
    public String cloudAccountId;

    /**
     * <p>Filters the results by the prefix of the template name.</p>
     * 
     * <strong>example:</strong>
     * <p>AdminAccess</p>
     */
    @NameInMap("CloudPermissionTemplateNamePrefix")
    public String cloudPermissionTemplateNamePrefix;

    /**
     * <p>Filters the results by permission template sharing mode. Valid values: shared and exclusive. If you do not specify this parameter, no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>shared</p>
     */
    @NameInMap("CloudPermissionTemplateSharingMode")
    public String cloudPermissionTemplateSharingMode;

    /**
     * <p>Filters the results by permission template usage type. Valid values: user (privilege escalation for human users) and application (privilege escalation for machine-to-machine applications).</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("CloudPermissionTemplateUsageType")
    public String cloudPermissionTemplateUsageType;

    /**
     * <p>Filters the results by creator type. Valid values: idaas_admin and idaas_user.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_user</p>
     */
    @NameInMap("CreatorType")
    public String creatorType;

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
     * <p>The maximum number of entries to return per page in a paging query. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Set the value to the NextToken value returned from the previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListCloudPermissionTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudPermissionTemplatesRequest self = new ListCloudPermissionTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudPermissionTemplatesRequest setCloudAccountId(String cloudAccountId) {
        this.cloudAccountId = cloudAccountId;
        return this;
    }
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    public ListCloudPermissionTemplatesRequest setCloudPermissionTemplateNamePrefix(String cloudPermissionTemplateNamePrefix) {
        this.cloudPermissionTemplateNamePrefix = cloudPermissionTemplateNamePrefix;
        return this;
    }
    public String getCloudPermissionTemplateNamePrefix() {
        return this.cloudPermissionTemplateNamePrefix;
    }

    public ListCloudPermissionTemplatesRequest setCloudPermissionTemplateSharingMode(String cloudPermissionTemplateSharingMode) {
        this.cloudPermissionTemplateSharingMode = cloudPermissionTemplateSharingMode;
        return this;
    }
    public String getCloudPermissionTemplateSharingMode() {
        return this.cloudPermissionTemplateSharingMode;
    }

    public ListCloudPermissionTemplatesRequest setCloudPermissionTemplateUsageType(String cloudPermissionTemplateUsageType) {
        this.cloudPermissionTemplateUsageType = cloudPermissionTemplateUsageType;
        return this;
    }
    public String getCloudPermissionTemplateUsageType() {
        return this.cloudPermissionTemplateUsageType;
    }

    public ListCloudPermissionTemplatesRequest setCreatorType(String creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public String getCreatorType() {
        return this.creatorType;
    }

    public ListCloudPermissionTemplatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCloudPermissionTemplatesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListCloudPermissionTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
