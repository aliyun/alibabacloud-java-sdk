// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetWorkflowGlobalEnvResponseBody extends TeaModel {
    /**
     * <p>The configuration content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MODE=demo</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Indicates whether the configuration is saved.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Exists")
    public Boolean exists;

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

    /**
     * <p>The timestamp of the last modification in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000000</p>
     */
    @NameInMap("UpdatedAt")
    public Long updatedAt;

    public static GetWorkflowGlobalEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowGlobalEnvResponseBody self = new GetWorkflowGlobalEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowGlobalEnvResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetWorkflowGlobalEnvResponseBody setExists(Boolean exists) {
        this.exists = exists;
        return this;
    }
    public Boolean getExists() {
        return this.exists;
    }

    public GetWorkflowGlobalEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowGlobalEnvResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GetWorkflowGlobalEnvResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetWorkflowGlobalEnvResponseBody setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
