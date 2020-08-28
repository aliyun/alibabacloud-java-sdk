// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVoipNumberBindInfosRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("VoipId")
    public String voipId;

    public static QueryVoipNumberBindInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVoipNumberBindInfosRequest self = new QueryVoipNumberBindInfosRequest();
        return TeaModel.build(map, self);
    }

}
