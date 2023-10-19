// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteSignatureResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSignatureResponseBody self = new DeleteSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
