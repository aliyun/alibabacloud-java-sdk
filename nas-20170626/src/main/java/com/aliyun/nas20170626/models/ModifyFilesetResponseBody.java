// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyFilesetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFilesetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFilesetResponseBody self = new ModifyFilesetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFilesetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
