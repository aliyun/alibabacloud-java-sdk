// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListProtectionPolicyApplicationsRequest extends TeaModel {
    /**
     * <p>The application status.</p>
     * 
     * <strong>example:</strong>
     * <p>FAILED</p>
     */
    @NameInMap("ApplyStatus")
    public String applyStatus;

    /**
     * <p>The maximum number of results to return in a single page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. The response returns a <code>NextToken</code> value only when more results are available. To retrieve the next page, include the <code>NextToken</code> from the previous response in your request. If the response does not include a <code>NextToken</code> value, all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>cae**********699</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The sub-protection policy type.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS_AUTO_SNAPSHOT_POLICY</p>
     */
    @NameInMap("SubProtectionPolicyType")
    public String subProtectionPolicyType;

    /**
     * <p>The task ID. You can call the DescribeTasks operation to query task IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-0004d9ctt1ii********</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ListProtectionPolicyApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProtectionPolicyApplicationsRequest self = new ListProtectionPolicyApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListProtectionPolicyApplicationsRequest setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }

    public ListProtectionPolicyApplicationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProtectionPolicyApplicationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProtectionPolicyApplicationsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListProtectionPolicyApplicationsRequest setSubProtectionPolicyType(String subProtectionPolicyType) {
        this.subProtectionPolicyType = subProtectionPolicyType;
        return this;
    }
    public String getSubProtectionPolicyType() {
        return this.subProtectionPolicyType;
    }

    public ListProtectionPolicyApplicationsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
