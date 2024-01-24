// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyDataFlowAutoRefreshResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDataFlowAutoRefreshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataFlowAutoRefreshResponseBody self = new ModifyDataFlowAutoRefreshResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDataFlowAutoRefreshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
