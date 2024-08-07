// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePerspectiveResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3001</p>
     */
    @NameInMap("PerspectiveId")
    public String perspectiveId;

    /**
     * <strong>example:</strong>
     * <p>F285D735-D580-18A8-B97F-B2E72B00F101</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePerspectiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePerspectiveResponseBody self = new CreatePerspectiveResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePerspectiveResponseBody setPerspectiveId(String perspectiveId) {
        this.perspectiveId = perspectiveId;
        return this;
    }
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

    public CreatePerspectiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
