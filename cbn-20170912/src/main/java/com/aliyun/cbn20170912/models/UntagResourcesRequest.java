// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong> (default): no.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>TagKey.N</strong> is left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the resource.</p>
     * <p>This parameter is not required when the resource type is Cen or BandwidthPackage. This parameter is required for other resource types.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource ID. <strong>N</strong> ranges from <strong>1</strong> to <strong>50</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-7qthudw0ll6jmc****</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The resource type. Valid values:</p>
     * <p><strong>Cen</strong>: Cloud Enterprise Network (CEN) instance.</p>
     * <p><strong>BandwidthPackage</strong>: bandwidth plan instance.</p>
     * <p><strong>TransitRouter</strong>: transit router instance.</p>
     * <p><strong>TransitRouterVpcAttachment</strong>: VPC connection instance.</p>
     * <p><strong>TransitRouterVbrAttachment</strong>: VBR connection instance.</p>
     * <p><strong>TransitRouterPeerAttachment</strong>: cross-region connection instance.</p>
     * <p><strong>TransitRouterVpnAttachment</strong>: VPN connection instance.</p>
     * <p><strong>TransitRouterRouteTable</strong>: route table instance.</p>
     * <p><strong>Flowlog</strong>: flow log instance.</p>
     * <p><strong>TransitRouterMulticastDomain</strong>: multicast domain instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag key.</p>
     * <p>A tag key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
     * <p>If you specify multiple tag keys, they are evaluated by using the <strong>OR</strong> logical operator. <strong>N</strong> ranges from <strong>1</strong> to <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>FinanceDept</p>
     */
    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UntagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UntagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UntagResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
