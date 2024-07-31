// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDIJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D33D4A51-5845-579A-B4BA-FAADD0F83D53</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDIJobResponseBody self = new DeleteDIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
