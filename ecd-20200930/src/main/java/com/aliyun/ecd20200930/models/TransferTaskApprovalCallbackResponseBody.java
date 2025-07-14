// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class TransferTaskApprovalCallbackResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AE7B699F-625C-587E-BC5F-1395CA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TransferTaskApprovalCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferTaskApprovalCallbackResponseBody self = new TransferTaskApprovalCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferTaskApprovalCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
