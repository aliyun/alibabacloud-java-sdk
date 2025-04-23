// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetQueueResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DFC3EAA9-F11F-4ED0-836F-4FFCB279E700</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetQueueResponseBody self = new SetQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public SetQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
