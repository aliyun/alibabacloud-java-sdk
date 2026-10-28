// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertActionResponseBody extends TeaModel {
    /**
     * <p>The ID of the alert action integration.</p>
     * 
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("alertActionId")
    public String alertActionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateAlertActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertActionResponseBody self = new CreateAlertActionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlertActionResponseBody setAlertActionId(String alertActionId) {
        this.alertActionId = alertActionId;
        return this;
    }
    public String getAlertActionId() {
        return this.alertActionId;
    }

    public CreateAlertActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
