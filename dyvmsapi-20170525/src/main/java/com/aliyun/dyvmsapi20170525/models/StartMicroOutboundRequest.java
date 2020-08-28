// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class StartMicroOutboundRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("CommandCode")
    public String commandCode;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("AppName")
    public String appName;

    public static StartMicroOutboundRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMicroOutboundRequest self = new StartMicroOutboundRequest();
        return TeaModel.build(map, self);
    }

}
