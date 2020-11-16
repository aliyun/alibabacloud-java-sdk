// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterLayoutResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("LayoutId")
    @Validation(required = true)
    public String layoutId;

    public static DeleteCasterLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterLayoutResponse self = new DeleteCasterLayoutResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterLayoutResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCasterLayoutResponse setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterLayoutResponse setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

}
