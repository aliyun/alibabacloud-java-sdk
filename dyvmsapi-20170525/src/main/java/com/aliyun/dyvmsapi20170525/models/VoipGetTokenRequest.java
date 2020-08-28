// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class VoipGetTokenRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VoipId")
    @Validation(required = true)
    public String voipId;

    @NameInMap("DeviceId")
    @Validation(required = true)
    public String deviceId;

    @NameInMap("IsCustomAccount")
    public Boolean isCustomAccount;

    public static VoipGetTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        VoipGetTokenRequest self = new VoipGetTokenRequest();
        return TeaModel.build(map, self);
    }

}
