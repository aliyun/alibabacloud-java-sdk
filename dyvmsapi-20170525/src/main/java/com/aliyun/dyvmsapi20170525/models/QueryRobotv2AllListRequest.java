// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotv2AllListRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryRobotv2AllListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotv2AllListRequest self = new QueryRobotv2AllListRequest();
        return TeaModel.build(map, self);
    }

}
