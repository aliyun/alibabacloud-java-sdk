// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveUserFromGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>85836703-8D4F-485F-9726-4D1C730F957E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveUserFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromGroupResponseBody self = new RemoveUserFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
