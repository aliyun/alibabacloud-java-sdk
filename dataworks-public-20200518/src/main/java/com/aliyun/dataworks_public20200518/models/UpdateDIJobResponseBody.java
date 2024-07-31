// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIJobResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAC30B35-820D-5F3E-A42C-E96BB6379325</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIJobResponseBody self = new UpdateDIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
