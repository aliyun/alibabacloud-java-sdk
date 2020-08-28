// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class StartRobotTaskRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    @NameInMap("ScheduleTime")
    public String scheduleTime;

    public static StartRobotTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRobotTaskRequest self = new StartRobotTaskRequest();
        return TeaModel.build(map, self);
    }

}
