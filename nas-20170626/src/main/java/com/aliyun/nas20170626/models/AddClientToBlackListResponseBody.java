// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AddClientToBlackListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddClientToBlackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddClientToBlackListResponseBody self = new AddClientToBlackListResponseBody();
        return TeaModel.build(map, self);
    }

    public AddClientToBlackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
