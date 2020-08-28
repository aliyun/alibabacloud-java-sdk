// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListRobotTaskCallsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("DurationFrom")
    public String durationFrom;

    @NameInMap("DurationTo")
    public String durationTo;

    @NameInMap("DialogCountFrom")
    public String dialogCountFrom;

    @NameInMap("DialogCountTo")
    public String dialogCountTo;

    @NameInMap("HangupDirection")
    public String hangupDirection;

    @NameInMap("CallResult")
    public String callResult;

    @NameInMap("Called")
    public String called;

    public static ListRobotTaskCallsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRobotTaskCallsRequest self = new ListRobotTaskCallsRequest();
        return TeaModel.build(map, self);
    }

}
