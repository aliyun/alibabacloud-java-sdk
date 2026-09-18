// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAlertRobotsShrinkRequest extends TeaModel {
    /**
     * <p>The chatbot ID.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("robotIds")
    public String robotIdsShrink;

    /**
     * <p>The chatbot type.</p>
     * 
     * <strong>example:</strong>
     * <p>DING</p>
     */
    @NameInMap("type")
    public String type;

    public static DeleteAlertRobotsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRobotsShrinkRequest self = new DeleteAlertRobotsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRobotsShrinkRequest setRobotIdsShrink(String robotIdsShrink) {
        this.robotIdsShrink = robotIdsShrink;
        return this;
    }
    public String getRobotIdsShrink() {
        return this.robotIdsShrink;
    }

    public DeleteAlertRobotsShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
