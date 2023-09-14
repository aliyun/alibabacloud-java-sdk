// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateHealthCheckTemplateAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateHealthCheckTemplateAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHealthCheckTemplateAttributeResponseBody self = new UpdateHealthCheckTemplateAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHealthCheckTemplateAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
