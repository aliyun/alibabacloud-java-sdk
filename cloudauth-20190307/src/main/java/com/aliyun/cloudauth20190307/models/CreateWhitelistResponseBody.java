// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistResponseBody self = new CreateWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
