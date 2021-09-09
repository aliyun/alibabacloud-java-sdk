// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteWhitelistResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhitelistResponse self = new DeleteWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWhitelistResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
