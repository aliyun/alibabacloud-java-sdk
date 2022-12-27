// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePrefixListsRequest extends TeaModel {
    // The IP address family of the prefix list. Valid values:
    // 
    // *   IPv4
    // *   IPv6
    // 
    // This parameter is empty by default, which indicates that all prefix lists are queried.
    @NameInMap("AddressFamily")
    public String addressFamily;

    // The number of entries to return on each page.
    // 
    // Maximum value: 100.
    // 
    // Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The query token. Set the value to the `NextToken` value returned in the previous call to the DescribePrefixLists operation. Leave this parameter empty the first time you call this operation.
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The IDs of prefix list.
    @NameInMap("PrefixListId")
    public java.util.List<String> prefixListId;

    // The name of the prefix list.
    @NameInMap("PrefixListName")
    public String prefixListName;

    // The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
