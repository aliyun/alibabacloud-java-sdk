// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByCallIdRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CallId")
    @Validation(required = true)
    public String callId;

    @NameInMap("ProdId")
    @Validation(required = true)
    public Long prodId;

    @NameInMap("QueryDate")
    @Validation(required = true)
    public Long queryDate;

    public static QueryCallDetailByCallIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCallDetailByCallIdRequest self = new QueryCallDetailByCallIdRequest();
        return TeaModel.build(map, self);
    }

}
