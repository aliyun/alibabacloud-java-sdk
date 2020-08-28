// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CancelRobotTaskRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TaskId")
    public Long taskId;

    public static CancelRobotTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelRobotTaskRequest self = new CancelRobotTaskRequest();
        return TeaModel.build(map, self);
    }

}
