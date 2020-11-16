// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterLayoutRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("LayoutId")
    @Validation(required = true)
    public String layoutId;

    public static DeleteCasterLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterLayoutRequest self = new DeleteCasterLayoutRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasterLayoutRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterLayoutRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

}
