// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DeleteApiTemplateResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful: - true: Call succeeded - false: Call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    @Deprecated
    public Boolean success;

    public static DeleteApiTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiTemplateResponseBody self = new DeleteApiTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    @Deprecated
    public DeleteApiTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
