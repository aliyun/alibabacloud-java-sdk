// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteComputeResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B56432E0-2112-5C97-88D0-AA0AE5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded.</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
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
