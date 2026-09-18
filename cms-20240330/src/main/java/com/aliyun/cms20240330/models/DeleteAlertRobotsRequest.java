// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertRobotsRequest extends TeaModel {
    /**
     * <p>The chatbot ID.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("robotIds")
    public java.util.List<String> robotIds;

    /**
     * <p>The chatbot type.</p>
     * 
     * <strong>example:</strong>
     * <p>DING</p>
     */
    @NameInMap("type")
    public String type;

    public static DeleteAlertRobotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRobotsRequest self = new DeleteAlertRobotsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRobotsRequest setRobotIds(java.util.List<String> robotIds) {
        this.robotIds = robotIds;
        return this;
    }
    public java.util.List<String> getRobotIds() {
        return this.robotIds;
    }

    public DeleteAlertRobotsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
