// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("ConfirmStop")
    public Boolean confirmStop;

    @NameInMap("ForceStop")
    public Boolean forceStop;

    @NameInMap("StoppedMode")
    public String stoppedMode;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static StopInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceRequest self = new StopInstanceRequest();
        return TeaModel.build(map, self);
    }

}
