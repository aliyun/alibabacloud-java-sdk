// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class AttachUserENIResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachUserENIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachUserENIResponseBody self = new AttachUserENIResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachUserENIResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
