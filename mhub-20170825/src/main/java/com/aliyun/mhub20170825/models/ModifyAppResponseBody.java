// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ModifyAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>126D4DDD-05A5-49B1-B18C-39C4A929BFB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppResponseBody self = new ModifyAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
