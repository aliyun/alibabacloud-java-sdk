// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteRobotTaskRequest extends TeaModel {
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

    public static DeleteRobotTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRobotTaskRequest self = new DeleteRobotTaskRequest();
        return TeaModel.build(map, self);
    }

}
