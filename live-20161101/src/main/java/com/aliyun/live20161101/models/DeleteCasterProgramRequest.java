// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterProgramRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    public static DeleteCasterProgramRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterProgramRequest self = new DeleteCasterProgramRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasterProgramRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
