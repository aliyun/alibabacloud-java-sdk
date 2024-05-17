// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetChangeOrderInfoRequest extends TeaModel {
    /**
     * <p>The ID of the change process.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    public static GetChangeOrderInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChangeOrderInfoRequest self = new GetChangeOrderInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetChangeOrderInfoRequest setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

}
