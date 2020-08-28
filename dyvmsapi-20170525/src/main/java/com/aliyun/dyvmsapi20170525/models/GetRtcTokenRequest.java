// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class GetRtcTokenRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    @NameInMap("DeviceId")
    @Validation(required = true)
    public String deviceId;

    @NameInMap("IsCustomAccount")
    public Boolean isCustomAccount;

    public static GetRtcTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRtcTokenRequest self = new GetRtcTokenRequest();
        return TeaModel.build(map, self);
    }

}
