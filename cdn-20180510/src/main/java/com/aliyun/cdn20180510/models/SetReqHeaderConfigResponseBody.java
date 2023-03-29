// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetReqHeaderConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetReqHeaderConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetReqHeaderConfigResponseBody self = new SetReqHeaderConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetReqHeaderConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
