// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertRobotsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteAlertRobotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRobotsResponseBody self = new DeleteAlertRobotsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRobotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
