// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterAvailableResourceRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Enterprise Edition transit router.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to query only the zones in which the multicast feature is supported. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * <p>After you call <strong>ListTransitRouterAvailableResource</strong>, if no zone is returned, it indicates that the Enterprise Edition transit router does not support the multicast feature.</p>
     * </li>
     * <li><p><strong>false</strong> (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SupportMulticast")
    public Boolean supportMulticast;

    public static ListTransitRouterAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterAvailableResourceRequest self = new ListTransitRouterAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterAvailableResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterAvailableResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterAvailableResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTransitRouterAvailableResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterAvailableResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterAvailableResourceRequest setSupportMulticast(Boolean supportMulticast) {
        this.supportMulticast = supportMulticast;
        return this;
    }
    public Boolean getSupportMulticast() {
        return this.supportMulticast;
    }

}
