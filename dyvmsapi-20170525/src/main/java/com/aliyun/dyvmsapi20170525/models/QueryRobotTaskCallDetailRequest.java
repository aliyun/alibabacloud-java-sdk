// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskCallDetailRequest extends TeaModel {
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

    @NameInMap("Callee")
    @Validation(required = true)
    public String callee;

    @NameInMap("QueryDate")
    @Validation(required = true)
    public Long queryDate;

    public static QueryRobotTaskCallDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskCallDetailRequest self = new QueryRobotTaskCallDetailRequest();
        return TeaModel.build(map, self);
    }

}
