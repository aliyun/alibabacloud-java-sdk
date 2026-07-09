// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class AllocateCostCenterResourceShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the source cost center. This parameter is required.</p>
     * <ul>
     * <li>0 indicates that the cost center is unallocated.</li>
     * <li>A value greater than 0 indicates an allocated cost center ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>637180</p>
     */
    @NameInMap("FromCostCenterId")
    public Long fromCostCenterId;

    /**
     * <p>The ID of the owner of the source cost center.</p>
     * 
     * <strong>example:</strong>
     * <p>1529600453335198</p>
     */
    @NameInMap("FromOwnerAccountId")
    public Long fromOwnerAccountId;

    /**
     * <p>The primary sales channel ID. If this parameter is left empty, the sales channel ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>The list of resource instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceInstanceList")
    public String resourceInstanceListShrink;

    /**
     * <p>The ID of the destination cost center. Valid values:</p>
     * <ul>
     * <li>-1: moves the allocated resource to the unallocated state.</li>
     * <li>A value greater than 0: allocates the resource to the specified cost center.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>638288</p>
     */
    @NameInMap("ToCostCenterId")
    public Long toCostCenterId;

    public static AllocateCostCenterResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateCostCenterResourceShrinkRequest self = new AllocateCostCenterResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AllocateCostCenterResourceShrinkRequest setFromCostCenterId(Long fromCostCenterId) {
        this.fromCostCenterId = fromCostCenterId;
        return this;
    }
    public Long getFromCostCenterId() {
        return this.fromCostCenterId;
    }

    public AllocateCostCenterResourceShrinkRequest setFromOwnerAccountId(Long fromOwnerAccountId) {
        this.fromOwnerAccountId = fromOwnerAccountId;
        return this;
    }
    public Long getFromOwnerAccountId() {
        return this.fromOwnerAccountId;
    }

    public AllocateCostCenterResourceShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public AllocateCostCenterResourceShrinkRequest setResourceInstanceListShrink(String resourceInstanceListShrink) {
        this.resourceInstanceListShrink = resourceInstanceListShrink;
        return this;
    }
    public String getResourceInstanceListShrink() {
        return this.resourceInstanceListShrink;
    }

    public AllocateCostCenterResourceShrinkRequest setToCostCenterId(Long toCostCenterId) {
        this.toCostCenterId = toCostCenterId;
        return this;
    }
    public Long getToCostCenterId() {
        return this.toCostCenterId;
    }

}
