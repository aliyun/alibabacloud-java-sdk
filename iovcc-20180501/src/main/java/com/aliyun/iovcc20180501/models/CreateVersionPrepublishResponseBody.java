// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateVersionPrepublishResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PrepublishId")
    public String prepublishId;

    public static CreateVersionPrepublishResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionPrepublishResponseBody self = new CreateVersionPrepublishResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVersionPrepublishResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVersionPrepublishResponseBody setPrepublishId(String prepublishId) {
        this.prepublishId = prepublishId;
        return this;
    }
    public String getPrepublishId() {
        return this.prepublishId;
    }

}
