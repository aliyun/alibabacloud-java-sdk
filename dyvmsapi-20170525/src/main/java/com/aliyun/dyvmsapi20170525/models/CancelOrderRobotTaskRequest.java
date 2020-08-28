// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CancelOrderRobotTaskRequest extends TeaModel {
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

    public static CancelOrderRobotTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderRobotTaskRequest self = new CancelOrderRobotTaskRequest();
        return TeaModel.build(map, self);
    }

}
