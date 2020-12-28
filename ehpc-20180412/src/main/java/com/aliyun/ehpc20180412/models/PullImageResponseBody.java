// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class PullImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PullImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PullImageResponseBody self = new PullImageResponseBody();
        return TeaModel.build(map, self);
    }

    public PullImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
