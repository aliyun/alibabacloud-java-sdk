// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSmsSignRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SignName")
    @Validation(required = true)
    public String signName;

    public static DeleteSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsSignRequest self = new DeleteSmsSignRequest();
        return TeaModel.build(map, self);
    }

}
