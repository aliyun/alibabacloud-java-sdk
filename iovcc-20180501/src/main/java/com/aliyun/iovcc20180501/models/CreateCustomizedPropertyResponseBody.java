// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateCustomizedPropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CustomizedPropertyId")
    public String customizedPropertyId;

    public static CreateCustomizedPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedPropertyResponseBody self = new CreateCustomizedPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomizedPropertyResponseBody setCustomizedPropertyId(String customizedPropertyId) {
        this.customizedPropertyId = customizedPropertyId;
        return this;
    }
    public String getCustomizedPropertyId() {
        return this.customizedPropertyId;
    }

}
