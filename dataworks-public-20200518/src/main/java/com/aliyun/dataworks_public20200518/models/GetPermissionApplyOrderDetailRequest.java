// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetPermissionApplyOrderDetailRequest extends TeaModel {
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
