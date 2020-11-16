// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterComponentRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("ComponentId")
    @Validation(required = true)
    public String componentId;

    public static DeleteCasterComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterComponentRequest self = new DeleteCasterComponentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasterComponentRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterComponentRequest setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

}
