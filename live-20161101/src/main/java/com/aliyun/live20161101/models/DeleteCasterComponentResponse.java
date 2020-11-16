// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterComponentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("ComponentId")
    @Validation(required = true)
    public String componentId;

    public static DeleteCasterComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterComponentResponse self = new DeleteCasterComponentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterComponentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCasterComponentResponse setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterComponentResponse setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

}
