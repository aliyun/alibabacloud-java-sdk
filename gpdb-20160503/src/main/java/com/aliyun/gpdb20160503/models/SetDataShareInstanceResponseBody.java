// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SetDataShareInstanceResponseBody extends TeaModel {
    /**
     * <p>The error message returned if the operation fails.</p>
     * 
     * <strong>example:</strong>
     * <p>error message</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D5**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: The operation is successful.</li>
     * <li><strong>failed</strong>: The operation fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static SetDataShareInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDataShareInstanceResponseBody self = new SetDataShareInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDataShareInstanceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SetDataShareInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDataShareInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
