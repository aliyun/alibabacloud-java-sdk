// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteSCIMServerCredentialResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSCIMServerCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSCIMServerCredentialResponseBody self = new DeleteSCIMServerCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSCIMServerCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
