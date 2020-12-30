// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhitelistResponseBody self = new DeleteWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
