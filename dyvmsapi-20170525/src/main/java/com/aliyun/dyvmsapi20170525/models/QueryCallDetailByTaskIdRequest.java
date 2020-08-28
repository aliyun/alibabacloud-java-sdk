// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByTaskIdRequest extends TeaModel {
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
    public String taskId;

    @NameInMap("QueryDate")
    @Validation(required = true)
    public Long queryDate;

    @NameInMap("Callee")
    @Validation(required = true)
    public String callee;

    public static QueryCallDetailByTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCallDetailByTaskIdRequest self = new QueryCallDetailByTaskIdRequest();
        return TeaModel.build(map, self);
    }

}
