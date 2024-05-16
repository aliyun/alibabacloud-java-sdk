// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateAppCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppCodeResponseBody self = new CreateAppCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
