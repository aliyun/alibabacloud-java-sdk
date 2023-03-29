// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnSubTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCdnSubTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCdnSubTaskResponseBody self = new UpdateCdnSubTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCdnSubTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
