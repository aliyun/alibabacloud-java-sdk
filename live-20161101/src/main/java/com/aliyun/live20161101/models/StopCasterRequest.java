// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopCasterRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    public static StopCasterRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCasterRequest self = new StopCasterRequest();
        return TeaModel.build(map, self);
    }

    public StopCasterRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
