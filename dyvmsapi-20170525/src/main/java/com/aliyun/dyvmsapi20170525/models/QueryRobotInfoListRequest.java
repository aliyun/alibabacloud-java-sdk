// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotInfoListRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("AuditStatus")
    public String auditStatus;

    public static QueryRobotInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotInfoListRequest self = new QueryRobotInfoListRequest();
        return TeaModel.build(map, self);
    }

}
