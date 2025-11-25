// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteComputeResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B56432E0-2112-5C97-88D0-AA0AE5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteComputeResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteComputeResourceResponseBody self = new DeleteComputeResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteComputeResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteComputeResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
