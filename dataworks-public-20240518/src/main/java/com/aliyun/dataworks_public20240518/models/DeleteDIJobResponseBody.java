// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDIJobResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D33D4A51-5845-579A-B4BA-FAADD0F83D53</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>true</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public DeleteDIJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
