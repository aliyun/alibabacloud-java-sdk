// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteLogstashResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>94B03BBA-A132-42C3-8367-0A0C1C45****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLogstashResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogstashResponseBody self = new DeleteLogstashResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLogstashResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
