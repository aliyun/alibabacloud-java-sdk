// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByTtsRequest extends TeaModel {
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

    @NameInMap("TtsCode")
    @Validation(required = true)
    public String ttsCode;

    @NameInMap("TtsParam")
    public String ttsParam;

    @NameInMap("PlayTimes")
    public Integer playTimes;

    @NameInMap("Volume")
    public Integer volume;

    @NameInMap("Speed")
    public Integer speed;

    @NameInMap("OutId")
    public String outId;

    public static SingleCallByTtsRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByTtsRequest self = new SingleCallByTtsRequest();
        return TeaModel.build(map, self);
    }

}
