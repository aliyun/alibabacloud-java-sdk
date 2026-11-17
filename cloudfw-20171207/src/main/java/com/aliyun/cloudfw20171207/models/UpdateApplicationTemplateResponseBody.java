// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateApplicationTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApplicationTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationTemplateResponseBody self = new UpdateApplicationTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
