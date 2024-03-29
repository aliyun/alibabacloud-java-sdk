// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeleteCasterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterRequest self = new DeleteCasterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasterRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
