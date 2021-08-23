// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreatePerspectiveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PerspectiveId")
    public String perspectiveId;

    public static CreatePerspectiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePerspectiveResponseBody self = new CreatePerspectiveResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePerspectiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePerspectiveResponseBody setPerspectiveId(String perspectiveId) {
        this.perspectiveId = perspectiveId;
        return this;
    }
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

}
