// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterLayoutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("CasterId")
    public String casterId;

    public static DeleteCasterLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterLayoutResponseBody self = new DeleteCasterLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCasterLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCasterLayoutResponseBody setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public DeleteCasterLayoutResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
