// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClickToDialRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("CallerShowNumber")
    @Validation(required = true)
    public String callerShowNumber;

    @NameInMap("CallerNumber")
    @Validation(required = true)
    public String callerNumber;

    @NameInMap("CalledShowNumber")
    @Validation(required = true)
    public String calledShowNumber;

    @NameInMap("CalledNumber")
    @Validation(required = true)
    public String calledNumber;

    @NameInMap("RecordFlag")
    public Boolean recordFlag;

    @NameInMap("AsrFlag")
    public Boolean asrFlag;

    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    @NameInMap("AsrModelId")
    public String asrModelId;

    @NameInMap("OutId")
    public String outId;

    public static ClickToDialRequest build(java.util.Map<String, ?> map) throws Exception {
        ClickToDialRequest self = new ClickToDialRequest();
        return TeaModel.build(map, self);
    }

}
