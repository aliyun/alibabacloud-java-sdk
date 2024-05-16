// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateAppKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppKeyResponseBody self = new CreateAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
