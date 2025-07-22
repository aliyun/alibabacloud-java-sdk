// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetOrderDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1715322405372273</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>233501558440169</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static GetOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderDetailRequest self = new GetOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderDetailRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public GetOrderDetailRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetOrderDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
