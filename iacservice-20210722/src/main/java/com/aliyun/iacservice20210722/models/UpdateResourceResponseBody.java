// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class UpdateResourceResponseBody extends TeaModel {
    // 请求id
    @NameInMap("requestId")
    public String requestId;

    public static UpdateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceResponseBody self = new UpdateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
