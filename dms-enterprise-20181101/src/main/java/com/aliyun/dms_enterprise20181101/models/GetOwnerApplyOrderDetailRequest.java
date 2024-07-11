// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOwnerApplyOrderDetailRequest extends TeaModel {
    /**
     * <p>The ID of the ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>730000</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>: To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetOwnerApplyOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOwnerApplyOrderDetailRequest self = new GetOwnerApplyOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetOwnerApplyOrderDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetOwnerApplyOrderDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
