// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SmartCallRequest extends TeaModel {
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

    @NameInMap("RecordFlag")
    public Boolean recordFlag;

    @NameInMap("Volume")
    public Integer volume;

    @NameInMap("Speed")
    public Integer speed;

    @NameInMap("AsrModelId")
    public String asrModelId;

    @NameInMap("PauseTime")
    public Integer pauseTime;

    @NameInMap("MuteTime")
    public Integer muteTime;

    @NameInMap("ActionCodeBreak")
    public Boolean actionCodeBreak;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("DynamicId")
    public String dynamicId;

    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    @NameInMap("VoiceCodeParam")
    public String voiceCodeParam;

    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    @NameInMap("ActionCodeTimeBreak")
    public Integer actionCodeTimeBreak;

    @NameInMap("TtsStyle")
    public String ttsStyle;

    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    @NameInMap("TtsConf")
    public Boolean ttsConf;

    @NameInMap("AsrBaseId")
    public String asrBaseId;

    public static SmartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        SmartCallRequest self = new SmartCallRequest();
        return TeaModel.build(map, self);
    }

}
