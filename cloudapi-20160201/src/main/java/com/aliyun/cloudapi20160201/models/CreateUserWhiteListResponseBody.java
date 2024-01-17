// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateUserWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUserWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserWhiteListResponseBody self = new CreateUserWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
