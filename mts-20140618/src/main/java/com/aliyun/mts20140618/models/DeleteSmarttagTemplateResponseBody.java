// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteSmarttagTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5F37036F-5267-43F1-AE47-10A18E840739</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSmarttagTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmarttagTemplateResponseBody self = new DeleteSmarttagTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSmarttagTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
