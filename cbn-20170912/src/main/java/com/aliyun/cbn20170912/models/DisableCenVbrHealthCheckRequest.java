// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisableCenVbrHealthCheckRequest extends TeaModel {
    /**
     * <p>The CEN instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-sjfoejfghhjgghjghkg****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The VBR instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-wz95o9aylj181n5****</p>
     */
    @NameInMap("VbrInstanceId")
    public String vbrInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the VBR instance.</p>
     * <blockquote>
     * <p>This parameter is required if the VBR instance and the CEN instance belong to different accounts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1250123456123456</p>
     */
    @NameInMap("VbrInstanceOwnerId")
    public Long vbrInstanceOwnerId;

    /**
     * <p>The region ID of the VBR instance.</p>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("VbrInstanceRegionId")
    public String vbrInstanceRegionId;

    public static DisableCenVbrHealthCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableCenVbrHealthCheckRequest self = new DisableCenVbrHealthCheckRequest();
        return TeaModel.build(map, self);
    }

    public DisableCenVbrHealthCheckRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DisableCenVbrHealthCheckRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DisableCenVbrHealthCheckRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DisableCenVbrHealthCheckRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DisableCenVbrHealthCheckRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DisableCenVbrHealthCheckRequest setVbrInstanceId(String vbrInstanceId) {
        this.vbrInstanceId = vbrInstanceId;
        return this;
    }
    public String getVbrInstanceId() {
        return this.vbrInstanceId;
    }

    public DisableCenVbrHealthCheckRequest setVbrInstanceOwnerId(Long vbrInstanceOwnerId) {
        this.vbrInstanceOwnerId = vbrInstanceOwnerId;
        return this;
    }
    public Long getVbrInstanceOwnerId() {
        return this.vbrInstanceOwnerId;
    }

    public DisableCenVbrHealthCheckRequest setVbrInstanceRegionId(String vbrInstanceRegionId) {
        this.vbrInstanceRegionId = vbrInstanceRegionId;
        return this;
    }
    public String getVbrInstanceRegionId() {
        return this.vbrInstanceRegionId;
    }

}
