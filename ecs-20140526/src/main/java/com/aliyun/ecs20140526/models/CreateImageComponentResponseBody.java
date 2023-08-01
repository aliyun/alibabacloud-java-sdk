// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageComponentResponseBody extends TeaModel {
    /**
     * <p>The ID of the image component.</p>
     */
    @NameInMap("ImageComponentId")
    public String imageComponentId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateImageComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageComponentResponseBody self = new CreateImageComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageComponentResponseBody setImageComponentId(String imageComponentId) {
        this.imageComponentId = imageComponentId;
        return this;
    }
    public String getImageComponentId() {
        return this.imageComponentId;
    }

    public CreateImageComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
