// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateColumnBusinessMetadataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D1E2E5BC-xxxx-xxxx-xxxx-xxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateColumnBusinessMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateColumnBusinessMetadataResponseBody self = new UpdateColumnBusinessMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateColumnBusinessMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateColumnBusinessMetadataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
