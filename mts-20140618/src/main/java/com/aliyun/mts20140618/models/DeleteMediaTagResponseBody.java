// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteMediaTagResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>283DC68C-146F-4489-A2A1-2F88F1472A56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMediaTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaTagResponseBody self = new DeleteMediaTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
