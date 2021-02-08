// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImageComponentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ImageComponentId")
    @Validation(required = true)
    public String imageComponentId;

    public static CreateImageComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageComponentResponse self = new CreateImageComponentResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageComponentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImageComponentResponse setImageComponentId(String imageComponentId) {
        this.imageComponentId = imageComponentId;
        return this;
    }
    public String getImageComponentId() {
        return this.imageComponentId;
    }

}
