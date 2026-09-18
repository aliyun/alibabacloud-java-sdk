// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertRobotResponseBody extends TeaModel {
    /**
     * <p>The robot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("alertRobotId")
    public String alertRobotId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateAlertRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertRobotResponseBody self = new CreateAlertRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlertRobotResponseBody setAlertRobotId(String alertRobotId) {
        this.alertRobotId = alertRobotId;
        return this;
    }
    public String getAlertRobotId() {
        return this.alertRobotId;
    }

    public CreateAlertRobotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
