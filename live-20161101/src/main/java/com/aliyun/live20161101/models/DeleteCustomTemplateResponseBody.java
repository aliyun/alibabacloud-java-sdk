// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCustomTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BC1E78D3-FA8B-4457-DEE2-6093E1232254</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCustomTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTemplateResponseBody self = new DeleteCustomTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
