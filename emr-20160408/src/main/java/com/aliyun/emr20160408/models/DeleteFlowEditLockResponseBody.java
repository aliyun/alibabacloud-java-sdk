// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteFlowEditLockResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static DeleteFlowEditLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowEditLockResponseBody self = new DeleteFlowEditLockResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowEditLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFlowEditLockResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
