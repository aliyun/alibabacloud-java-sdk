// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateRobotTaskRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TaskName")
    @Validation(required = true)
    public String taskName;

    @NameInMap("DialogId")
    @Validation(required = true)
    public Long dialogId;

    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("Caller")
    @Validation(required = true)
    public String caller;

    @NameInMap("NumberStatusIdent")
    @Validation(required = true)
    public Boolean numberStatusIdent;

    @NameInMap("RetryType")
    @Validation(required = true)
    public Integer retryType;

    @NameInMap("RecallStateCodes")
    public String recallStateCodes;

    @NameInMap("RecallTimes")
    public Integer recallTimes;

    @NameInMap("RecallInterval")
    public Integer recallInterval;

    @NameInMap("IsSelfLine")
    public Boolean isSelfLine;

    public static CreateRobotTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRobotTaskRequest self = new CreateRobotTaskRequest();
        return TeaModel.build(map, self);
    }

}
