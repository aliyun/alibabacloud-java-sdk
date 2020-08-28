// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteInstancesRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public java.util.List<String> instanceId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("TerminateSubscription")
    public Boolean terminateSubscription;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DeleteInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancesRequest self = new DeleteInstancesRequest();
        return TeaModel.build(map, self);
    }

}
