// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SmartCallOperateRequest extends TeaModel {
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

    @NameInMap("Command")
    @Validation(required = true)
    public String command;

    @NameInMap("Param")
    public String param;

    public static SmartCallOperateRequest build(java.util.Map<String, ?> map) throws Exception {
        SmartCallOperateRequest self = new SmartCallOperateRequest();
        return TeaModel.build(map, self);
    }

}
