// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskDetailRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Id")
    @Validation(required = true)
    public Long id;

    public static QueryRobotTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskDetailRequest self = new QueryRobotTaskDetailRequest();
        return TeaModel.build(map, self);
    }

}
