// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CancelCallRequest extends TeaModel {
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

    public static CancelCallRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCallRequest self = new CancelCallRequest();
        return TeaModel.build(map, self);
    }

}
