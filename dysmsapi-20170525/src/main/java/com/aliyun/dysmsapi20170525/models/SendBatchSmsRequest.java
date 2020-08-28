// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchSmsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PhoneNumberJson")
    @Validation(required = true)
    public String phoneNumberJson;

    @NameInMap("SignNameJson")
    @Validation(required = true)
    public String signNameJson;

    @NameInMap("TemplateCode")
    @Validation(required = true)
    public String templateCode;

    @NameInMap("TemplateParamJson")
    public String templateParamJson;

    @NameInMap("SmsUpExtendCodeJson")
    public String smsUpExtendCodeJson;

    public static SendBatchSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendBatchSmsRequest self = new SendBatchSmsRequest();
        return TeaModel.build(map, self);
    }

}
