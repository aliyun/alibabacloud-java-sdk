// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRtcNumberAuthStatusRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PhoneNumber")
    @Validation(required = true)
    public String phoneNumber;

    public static QueryRtcNumberAuthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtcNumberAuthStatusRequest self = new QueryRtcNumberAuthStatusRequest();
        return TeaModel.build(map, self);
    }

}
