// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingCancelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dis123</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    /**
     * <strong>example:</strong>
     * <p>refun123</p>
     */
    @NameInMap("dis_sub_order_id")
    public String disSubOrderId;

    public static TicketChangingCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingCancelRequest self = new TicketChangingCancelRequest();
        return TeaModel.build(map, self);
    }

    public TicketChangingCancelRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public TicketChangingCancelRequest setDisSubOrderId(String disSubOrderId) {
        this.disSubOrderId = disSubOrderId;
        return this;
    }
    public String getDisSubOrderId() {
        return this.disSubOrderId;
    }

}
