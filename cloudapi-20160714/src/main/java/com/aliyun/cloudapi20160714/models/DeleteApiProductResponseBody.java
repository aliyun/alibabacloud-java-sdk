// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteApiProductResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApiProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiProductResponseBody self = new DeleteApiProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
