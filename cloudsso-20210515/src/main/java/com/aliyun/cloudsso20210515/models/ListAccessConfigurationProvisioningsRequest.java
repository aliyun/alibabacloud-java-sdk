// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationProvisioningsRequest extends TeaModel {
    /**
     * <p>The ID of the access configuration. The ID can be used to filter accounts.</p>
     */
    @NameInMap("AccessConfigurationId")
    public String accessConfigurationId;

    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 20.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to return for the next page. If this is your first time to call this operation, you do not need to specify `NextToken`.</p>
     * <br>
     * <p>When you call this operation for the first time, if the total number of entries to return exceeds the value of `MaxResults`, the entries are truncated. Only the entries that match the value of `MaxResults` are returned, and the excess entries are not returned. In this case, the value of the response parameter `IsTruncated` is `true`, and `NextToken` is returned. In the next call, you can use the value of `NextToken` and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of `IsTruncated` becomes `false`. This way, all entries are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The status of the access configuration. The value can be used to filter accounts. Valid values:</p>
     * <br>
     * <p>*   Provisioned: The access configuration is provisioned.</p>
     * <p>*   ReprovisionRequired: The access configuration needs to be re-provisioned.</p>
     * <p>*   DeprovisionFailed: The access configuration failed to be provisioned.</p>
     */
    @NameInMap("ProvisioningStatus")
    public String provisioningStatus;

    /**
     * <p>The ID of the task object. The ID can be used to filter accounts.</p>
     * <br>
     * <p>>  You can use the ID to filter accounts only if you specify both `TargetId` and `TargetType`.</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the task object. The type can be used to filter accounts.</p>
     * <br>
     * <p>Set the value to RD-Account, which indicates an account in your resource directory.</p>
     * <br>
     * <p>>  You can use the type to filter accounts only if you specify both `TargetId` and `TargetType`.</p>
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
