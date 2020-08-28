// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PhoneNumbers")
    @Validation(required = true)
    public String phoneNumbers;

    @NameInMap("SignName")
    @Validation(required = true)
    public String signName;

    @NameInMap("TemplateCode")
    @Validation(required = true)
    public String templateCode;

    @NameInMap("TemplateParam")
    public String templateParam;

    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    @NameInMap("OutId")
    public String outId;

    public static SendSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSmsRequest self = new SendSmsRequest();
        return TeaModel.build(map, self);
    }

}
