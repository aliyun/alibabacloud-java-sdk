// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CloseOrderRequest extends TeaModel {
    /**
     * <p>The reason why the ticket is closed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>close reason</p>
     */
    @NameInMap("CloseReason")
    public String closeReason;

    /**
     * <p>The ID of the ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1343</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CloseOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseOrderRequest self = new CloseOrderRequest();
        return TeaModel.build(map, self);
    }

    public CloseOrderRequest setCloseReason(String closeReason) {
        this.closeReason = closeReason;
        return this;
    }
    public String getCloseReason() {
        return this.closeReason;
    }

    public CloseOrderRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CloseOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
