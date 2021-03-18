// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageComponentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageComponentId")
    public String imageComponentId;

    public static CreateImageComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageComponentResponseBody self = new CreateImageComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageComponentResponseBody setImageComponentId(String imageComponentId) {
        this.imageComponentId = imageComponentId;
        return this;
    }
    public String getImageComponentId() {
        return this.imageComponentId;
    }

}
