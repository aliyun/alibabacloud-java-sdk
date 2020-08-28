// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ReportVoipProblemsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("VoipId")
    @Validation(required = true)
    public String voipId;

    @NameInMap("Title")
    @Validation(required = true)
    public String title;

    @NameInMap("Desc")
    @Validation(required = true)
    public String desc;

    public static ReportVoipProblemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportVoipProblemsRequest self = new ReportVoipProblemsRequest();
        return TeaModel.build(map, self);
    }

}
