// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateCustomTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0D715397-2E66-4AE1-694h-C546628AD145</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomTemplateResponseBody self = new CreateCustomTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
