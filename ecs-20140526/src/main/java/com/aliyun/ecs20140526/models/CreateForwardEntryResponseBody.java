// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateForwardEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    public static CreateForwardEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardEntryResponseBody self = new CreateForwardEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateForwardEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateForwardEntryResponseBody setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

}
