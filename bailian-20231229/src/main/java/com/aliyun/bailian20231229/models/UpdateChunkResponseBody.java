// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateChunkResponseBody extends TeaModel {
    /**
     * <p>The error status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned upon a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35A267BF-xxxx-54DB-8394-AA3B0742D833</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;200&quot;</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li>true: Succeeded.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateChunkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateChunkResponseBody self = new UpdateChunkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateChunkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateChunkResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateChunkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateChunkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateChunkResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateChunkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
