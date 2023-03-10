// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreatePortResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePortResponseBody self = new CreatePortResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
