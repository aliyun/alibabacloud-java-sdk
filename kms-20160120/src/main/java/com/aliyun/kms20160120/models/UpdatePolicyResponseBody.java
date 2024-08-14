// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdatePolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>f455324b-e229-4066-9f58-9c1cf3fe83a8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyResponseBody self = new UpdatePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
