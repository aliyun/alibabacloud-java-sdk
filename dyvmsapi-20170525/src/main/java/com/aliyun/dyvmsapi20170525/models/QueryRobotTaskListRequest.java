// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskListRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("Status")
    public String status;

    @NameInMap("Time")
    public String time;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    public static QueryRobotTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskListRequest self = new QueryRobotTaskListRequest();
        return TeaModel.build(map, self);
    }

}
