// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RefundPayAsYouGoOrderRequest extends TeaModel {
    /**
     * <p>The instance ID in the sales order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dms_pre_public_intl-sg-vf****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The order ID of the order for the pay-as-you-go resource. You can call the ListEffectiveOrders operation to query the order ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2190037****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static RefundPayAsYouGoOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundPayAsYouGoOrderRequest self = new RefundPayAsYouGoOrderRequest();
        return TeaModel.build(map, self);
    }

    public RefundPayAsYouGoOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RefundPayAsYouGoOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RefundPayAsYouGoOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
