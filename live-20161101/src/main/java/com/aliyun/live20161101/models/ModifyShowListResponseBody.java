// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyShowListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyShowListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyShowListResponseBody self = new ModifyShowListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyShowListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
