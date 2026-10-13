// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AddClientToBlackListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A70BEE5D-76D3-49FB-B58F-1F398211A5C3</p>
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
