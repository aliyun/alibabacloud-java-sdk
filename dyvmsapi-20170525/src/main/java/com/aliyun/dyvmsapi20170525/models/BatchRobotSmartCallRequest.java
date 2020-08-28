// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class BatchRobotSmartCallRequest extends TeaModel {
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

    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("CalledNumber")
    @Validation(required = true)
    public String calledNumber;

    @NameInMap("DialogId")
    @Validation(required = true)
    public String dialogId;

    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    @NameInMap("TaskName")
    @Validation(required = true)
    public String taskName;

    @NameInMap("ScheduleTime")
    public Long scheduleTime;

    @NameInMap("ScheduleCall")
    public Boolean scheduleCall;

    @NameInMap("TtsParam")
    public String ttsParam;

    @NameInMap("TtsParamHead")
    public String ttsParamHead;

    @NameInMap("IsSelfLine")
    public Boolean isSelfLine;

    public static BatchRobotSmartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRobotSmartCallRequest self = new BatchRobotSmartCallRequest();
        return TeaModel.build(map, self);
    }

}
