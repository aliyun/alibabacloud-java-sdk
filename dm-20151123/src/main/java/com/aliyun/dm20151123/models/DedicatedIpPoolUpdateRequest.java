// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolUpdateRequest extends TeaModel {
    /**
     * <p>The IDs of the purchased IP instances. Separate multiple IDs with commas. Obtain these IDs from the response of the DedicatedIpNonePoolList operation.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx,xxx</p>
     */
    @NameInMap("BuyResourceIds")
    public String buyResourceIds;

    /**
     * <p>The ID of the IP pool.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Specifies whether to change the associated IP addresses. Set this parameter to true.</p>
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
