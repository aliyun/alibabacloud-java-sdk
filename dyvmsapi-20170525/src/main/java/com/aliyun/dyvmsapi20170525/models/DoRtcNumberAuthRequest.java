// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class DoRtcNumberAuthRequest extends TeaModel {
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

    public static DoRtcNumberAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        DoRtcNumberAuthRequest self = new DoRtcNumberAuthRequest();
        return TeaModel.build(map, self);
    }

}
