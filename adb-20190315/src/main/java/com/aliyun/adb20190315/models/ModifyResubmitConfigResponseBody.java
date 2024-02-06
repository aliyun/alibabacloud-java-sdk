// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyResubmitConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyResubmitConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResubmitConfigResponseBody self = new ModifyResubmitConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResubmitConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
