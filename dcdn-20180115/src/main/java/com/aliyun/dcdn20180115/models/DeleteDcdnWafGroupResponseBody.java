// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnWafGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDcdnWafGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnWafGroupResponseBody self = new DeleteDcdnWafGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnWafGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
