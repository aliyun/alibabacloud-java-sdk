// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteSecurityInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B9982ED-FD0D-5622-8EA0-7B768685DCE7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecurityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityInfoResponseBody self = new DeleteSecurityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
