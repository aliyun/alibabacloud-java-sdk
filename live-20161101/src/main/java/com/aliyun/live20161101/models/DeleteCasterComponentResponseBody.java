// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterComponentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("ComponentId")
    public String componentId;

    public static DeleteCasterComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterComponentResponseBody self = new DeleteCasterComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCasterComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCasterComponentResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterComponentResponseBody setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

}
