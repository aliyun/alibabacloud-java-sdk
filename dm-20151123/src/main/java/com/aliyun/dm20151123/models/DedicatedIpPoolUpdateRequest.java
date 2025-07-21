// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolUpdateRequest extends TeaModel {
    /**
     * <p>Purchased IP instance IDs, separated by commas; sourced from the DedicatedIpNonePoolList API\&quot;s returned IP purchase instance IDs</p>
     * 
     * <strong>example:</strong>
     * <p>xxx,xxx</p>
     */
    @NameInMap("BuyResourceIds")
    public String buyResourceIds;

    /**
     * <p>IP pool ID</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Whether to change the associated IP, enter true</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UpdateResource")
    public Boolean updateResource;

    public static DedicatedIpPoolUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpPoolUpdateRequest self = new DedicatedIpPoolUpdateRequest();
        return TeaModel.build(map, self);
    }

    public DedicatedIpPoolUpdateRequest setBuyResourceIds(String buyResourceIds) {
        this.buyResourceIds = buyResourceIds;
        return this;
    }
    public String getBuyResourceIds() {
        return this.buyResourceIds;
    }

    public DedicatedIpPoolUpdateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DedicatedIpPoolUpdateRequest setUpdateResource(Boolean updateResource) {
        this.updateResource = updateResource;
        return this;
    }
    public Boolean getUpdateResource() {
        return this.updateResource;
    }

}
