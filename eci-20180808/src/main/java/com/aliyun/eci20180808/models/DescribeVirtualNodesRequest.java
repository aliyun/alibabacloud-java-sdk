// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeVirtualNodesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotency of requests?](~~25693~~)</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The maximum number of resources that are allowed to return for this request. Default value: 20. Maximum value: 20.</p>
     * <br>
     * <p>>  The number of returned resources is less than or equal to the specified number.</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>The token that determines the start point of the next query. If this parameter is empty, all results have been returned.</p>
     * <br>
     * <p>You do not need to specify this parameter in the first request. From the second request, you can obtain the token from the result returned by the previous request.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the virtual nodes.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the virtual node. Valid values:</p>
     * <br>
     * <p>*   Pending</p>
     * <p>*   Ready</p>
     * <p>*   Failed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags that are bound to the virtual node.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeVirtualNodesRequestTag> tag;

    /**
     * <p>The IDs of the virtual nodes. You can specify up to 20 IDs. Each ID must be a string in the JSON format.</p>
     */
    @NameInMap("VirtualNodeIds")
    public String virtualNodeIds;

    /**
     * <p>The names of the virtual nodes.</p>
     */
    @NameInMap("VirtualNodeName")
    public String virtualNodeName;

    public static DescribeVirtualNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualNodesRequest self = new DescribeVirtualNodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualNodesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeVirtualNodesRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public DescribeVirtualNodesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVirtualNodesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVirtualNodesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVirtualNodesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVirtualNodesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVirtualNodesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVirtualNodesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVirtualNodesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVirtualNodesRequest setTag(java.util.List<DescribeVirtualNodesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVirtualNodesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeVirtualNodesRequest setVirtualNodeIds(String virtualNodeIds) {
        this.virtualNodeIds = virtualNodeIds;
        return this;
    }
    public String getVirtualNodeIds() {
        return this.virtualNodeIds;
    }

    public DescribeVirtualNodesRequest setVirtualNodeName(String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
        return this;
    }
    public String getVirtualNodeName() {
        return this.virtualNodeName;
    }

    public static class DescribeVirtualNodesRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVirtualNodesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualNodesRequestTag self = new DescribeVirtualNodesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualNodesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVirtualNodesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
