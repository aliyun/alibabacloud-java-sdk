// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class CreateApiResponseBody extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiResponseBody self = new CreateApiResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiResponseBody setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public CreateApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
