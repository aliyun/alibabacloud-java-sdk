// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AddClientToBlackListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddClientToBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddClientToBlackListResponse self = new AddClientToBlackListResponse();
        return TeaModel.build(map, self);
    }

    public AddClientToBlackListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
