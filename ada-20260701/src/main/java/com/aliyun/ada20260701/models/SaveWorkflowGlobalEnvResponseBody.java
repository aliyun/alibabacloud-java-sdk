// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class SaveWorkflowGlobalEnvResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01A0677A-49CB-1605-AC3A-26761045B614</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of UTF-8 bytes in the configuration content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SaveWorkflowGlobalEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveWorkflowGlobalEnvResponseBody self = new SaveWorkflowGlobalEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveWorkflowGlobalEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveWorkflowGlobalEnvResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public SaveWorkflowGlobalEnvResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
