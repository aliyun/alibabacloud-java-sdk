// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByVoiceRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CalledShowNumber")
    @Validation(required = true)
    public String calledShowNumber;

    @NameInMap("CalledNumber")
    @Validation(required = true)
    public String calledNumber;

    @NameInMap("VoiceCode")
    @Validation(required = true)
    public String voiceCode;

    @NameInMap("PlayTimes")
    public Integer playTimes;

    @NameInMap("Volume")
    public Integer volume;

    @NameInMap("Speed")
    public Integer speed;

    @NameInMap("OutId")
    public String outId;

    public static SingleCallByVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByVoiceRequest self = new SingleCallByVoiceRequest();
        return TeaModel.build(map, self);
    }

}
