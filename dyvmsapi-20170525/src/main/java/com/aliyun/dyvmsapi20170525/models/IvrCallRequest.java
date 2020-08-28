// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class IvrCallRequest extends TeaModel {
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

    @NameInMap("StartCode")
    @Validation(required = true)
    public String startCode;

    @NameInMap("StartTtsParams")
    public String startTtsParams;

    @NameInMap("MenuKeyMap")
    public java.util.List<IvrCallRequestMenuKeyMap> menuKeyMap;

    @NameInMap("PlayTimes")
    public Long playTimes;

    @NameInMap("ByeCode")
    public String byeCode;

    @NameInMap("ByeTtsParams")
    public String byeTtsParams;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("OutId")
    public String outId;

    public static IvrCallRequest build(java.util.Map<String, ?> map) throws Exception {
        IvrCallRequest self = new IvrCallRequest();
        return TeaModel.build(map, self);
    }

    public static class IvrCallRequestMenuKeyMap extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("TtsParams")
        @Validation(required = true)
        public String ttsParams;

        public static IvrCallRequestMenuKeyMap build(java.util.Map<String, ?> map) throws Exception {
            IvrCallRequestMenuKeyMap self = new IvrCallRequestMenuKeyMap();
            return TeaModel.build(map, self);
        }

    }

}
