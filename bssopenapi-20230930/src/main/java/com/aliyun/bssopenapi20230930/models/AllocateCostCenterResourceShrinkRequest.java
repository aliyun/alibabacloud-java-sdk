// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class AllocateCostCenterResourceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>637180</p>
     */
    @NameInMap("FromCostCenterId")
    public Long fromCostCenterId;

    /**
     * <strong>example:</strong>
     * <p>1529600453335198</p>
     */
    @NameInMap("FromOwnerAccountId")
    public Long fromOwnerAccountId;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceInstanceList")
    public String resourceInstanceListShrink;

    /**
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
