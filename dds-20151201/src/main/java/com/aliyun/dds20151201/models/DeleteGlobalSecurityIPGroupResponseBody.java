// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DeleteGlobalSecurityIPGroupResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the request. If the request fails, provide this ID for technical support to troubleshoot the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>2F42BB4E-461F-5B55-A37C-53B1141C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGlobalSecurityIPGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalSecurityIPGroupResponseBody self = new DeleteGlobalSecurityIPGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalSecurityIPGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
