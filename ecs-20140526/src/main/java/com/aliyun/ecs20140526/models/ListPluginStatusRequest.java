// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListPluginStatusRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The maximum number of entries per page. </p>
     * <br>
     * <p>Valid values: 1 to 50. </p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the Cloud Assistant plug-in. The name supports all character sets and must be 1 to 255 characters in length.</p>
     * <br>
     * <p>*   If this parameter is not specified, the status of all Cloud Assistant plug-ins that are installed on the specified instances are queried.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** If this parameter is not specified, only a single instance ID can be specified.</p>
     * <br>
     * <p>*   If this parameter is specified, the status of the specified Cloud Assistant plug-in is queried.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>*   Pages start from page 1.</p>
     * <p>*   Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>*   Valid values: 1 to 50.</p>
     * <p>*   Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListPluginStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginStatusRequest self = new ListPluginStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginStatusRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public ListPluginStatusRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPluginStatusRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPluginStatusRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPluginStatusRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListPluginStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListPluginStatusRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPluginStatusRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPluginStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPluginStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListPluginStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
