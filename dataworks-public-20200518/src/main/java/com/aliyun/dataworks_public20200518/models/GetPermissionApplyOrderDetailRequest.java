// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetPermissionApplyOrderDetailRequest extends TeaModel {
    /**
     * <p>The ID of the permission request order. You can call the <a href="https://help.aliyun.com/document_detail/211008.html">ListPermissionApplyOrders</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>48f36729-05f9-4a40-9286-933fd940f30a</p>
     */
    @NameInMap("FlowId")
    public String flowId;

    public static GetPermissionApplyOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionApplyOrderDetailRequest self = new GetPermissionApplyOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetPermissionApplyOrderDetailRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

}
