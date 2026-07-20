// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dis123</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    /**
     * <strong>example:</strong>
     * <p>chang123</p>
     */
    @NameInMap("dis_sub_order_id")
    public String disSubOrderId;

    public static TicketChangingDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingDetailRequest self = new TicketChangingDetailRequest();
        return TeaModel.build(map, self);
    }

    public TicketChangingDetailRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public TicketChangingDetailRequest setDisSubOrderId(String disSubOrderId) {
        this.disSubOrderId = disSubOrderId;
        return this;
    }
    public String getDisSubOrderId() {
        return this.disSubOrderId;
    }

}
