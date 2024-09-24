// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteProtocolServiceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProtocolServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtocolServiceResponseBody self = new DeleteProtocolServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProtocolServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
