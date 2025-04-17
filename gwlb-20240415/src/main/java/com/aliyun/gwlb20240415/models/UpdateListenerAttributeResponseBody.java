// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class UpdateListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7DBFC67C-A272-5952-8287-6C3EBE4E04D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerAttributeResponseBody self = new UpdateListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
