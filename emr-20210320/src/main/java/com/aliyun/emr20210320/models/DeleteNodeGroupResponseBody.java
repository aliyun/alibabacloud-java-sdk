// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DeleteNodeGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64EBE3F5-0498-1578-BEC0-6ACE364E912D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation to release the node group was successful. Valid values:</p>
     * <ul>
     * <li>true: The operation was successful.</li>
     * <li>false: The operation failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteNodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeGroupResponseBody self = new DeleteNodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteNodeGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
