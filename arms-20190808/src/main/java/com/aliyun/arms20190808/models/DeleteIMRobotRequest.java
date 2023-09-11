// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIMRobotRequest extends TeaModel {
    /**
     * <p>The ID of the IM chatbot.</p>
     */
    @NameInMap("RobotId")
    public Long robotId;

    public static DeleteIMRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIMRobotRequest self = new DeleteIMRobotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIMRobotRequest setRobotId(Long robotId) {
        this.robotId = robotId;
        return this;
    }
    public Long getRobotId() {
        return this.robotId;
    }

}
