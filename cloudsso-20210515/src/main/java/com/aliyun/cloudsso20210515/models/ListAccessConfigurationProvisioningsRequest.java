// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationProvisioningsRequest extends TeaModel {
    /**
     * <p>The access configuration ID used as a filter condition for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>ac-00ccule7tadaijxc****</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <p>Valid values: 1 to 20.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to return the next page of query results. You do not need to specify NextToken when you call this operation for the first time.</p>
     * <p>When you call this operation for the first time, if the total number of returned entries exceeds the value of MaxResults, the returned results are truncated. Only the number of entries specified by MaxResults is returned, the IsTruncated parameter is set to true, and a NextToken is returned. You can use the returned NextToken to call this operation again to query the truncated entries while keeping other request parameters unchanged. You can repeat this process until IsTruncated is set to false, which indicates that all entries are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The Alibaba Cloud account ID of the provisioning target.</p>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("OriginTargetId")
    public String originTargetId;

    /**
     * <p>The provisioning status used as a filter condition for the query. Valid values:</p>
     * <ul>
     * <li>Provisioned: The provisioning succeeded.</li>
     * <li>ReprovisionRequired: Reprovisioning is required.</li>
     * <li>DeprovisionFailed: The provisioning failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Provisioned</p>
     */
    @NameInMap("ProvisioningStatus")
    public String provisioningStatus;

    /**
     * <p>The target ID used as a filter condition for the query.</p>
     * <blockquote>
     * <p>You must specify both TargetId and TargetType for them to take effect as filter conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>114240524784****</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The target type used as a filter condition for the query.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>RD-Account: The target is an account in a resource directory.</li>
     * </ul>
     * <blockquote>
     * <p>You must specify both TargetId and TargetType for them to take effect as filter conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>RD-Account</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static ListAccessConfigurationProvisioningsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessConfigurationProvisioningsRequest self = new ListAccessConfigurationProvisioningsRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessConfigurationProvisioningsRequest setAccessConfigurationId(String accessConfigurationId) {
        this.accessConfigurationId = accessConfigurationId;
        return this;
    }
    public String getAccessConfigurationId() {
        return this.accessConfigurationId;
    }

    public ListAccessConfigurationProvisioningsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ListAccessConfigurationProvisioningsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccessConfigurationProvisioningsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccessConfigurationProvisioningsRequest setOriginTargetId(String originTargetId) {
        this.originTargetId = originTargetId;
        return this;
    }
    public String getOriginTargetId() {
        return this.originTargetId;
    }

    public ListAccessConfigurationProvisioningsRequest setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }
    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }

    public ListAccessConfigurationProvisioningsRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ListAccessConfigurationProvisioningsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
