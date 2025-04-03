// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteCloudPhoneNodesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCloudPhoneNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudPhoneNodesResponseBody self = new DeleteCloudPhoneNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloudPhoneNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
