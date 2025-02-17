// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListsRequest extends TeaModel {
    /**
     * <p>The IP address family. Valid values:</p>
     * <ul>
     * <li>IPv4</li>
     * <li>IPv6</li>
     * </ul>
     * <p>This parameter is empty by default, which indicates that all prefix lists are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("AddressFamily")
    public String addressFamily;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results. Set the value to the <code>NextToken</code> value returned in the last call to this operation. Leave this parameter empty the first time you call this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IDs of prefix lists. Valid values of N: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-x1j1k5ykzqlixdcy****</p>
     */
    @NameInMap("PrefixListId")
    public java.util.List<String> prefixListId;

    /**
     * <p>The name of the prefix list.</p>
     * 
     * <strong>example:</strong>
     * <p>PrefixListNameSample</p>
     */
    @NameInMap("PrefixListName")
    public String prefixListName;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribePrefixListsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePrefixListsRequest self = new DescribePrefixListsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePrefixListsRequest setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
        return this;
    }
    public String getAddressFamily() {
        return this.addressFamily;
    }

    public DescribePrefixListsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePrefixListsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePrefixListsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribePrefixListsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePrefixListsRequest setPrefixListId(java.util.List<String> prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }
    public java.util.List<String> getPrefixListId() {
        return this.prefixListId;
    }

    public DescribePrefixListsRequest setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
        return this;
    }
    public String getPrefixListName() {
        return this.prefixListName;
    }

    public DescribePrefixListsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePrefixListsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePrefixListsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
