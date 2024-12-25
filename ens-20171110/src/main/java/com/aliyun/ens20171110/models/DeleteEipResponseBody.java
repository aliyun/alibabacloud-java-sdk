// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEipResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9341CDC2-D6AC-5992-86C8-D5774CFCC708</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEipResponseBody self = new DeleteEipResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
