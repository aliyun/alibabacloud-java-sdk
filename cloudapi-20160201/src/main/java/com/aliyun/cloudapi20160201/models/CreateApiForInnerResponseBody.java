// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateApiForInnerResponseBody extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateApiForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiForInnerResponseBody self = new CreateApiForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiForInnerResponseBody setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public CreateApiForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
