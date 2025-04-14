// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTableBusinessMetadataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7C352CB7-CD88-XXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateTableBusinessMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableBusinessMetadataResponseBody self = new UpdateTableBusinessMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTableBusinessMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTableBusinessMetadataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
