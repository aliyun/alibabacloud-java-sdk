// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SuspendInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public Long instanceId;

    @NameInMap("ProjectEnv")
    @Validation(required = true)
    public String projectEnv;

    public static SuspendInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendInstanceRequest self = new SuspendInstanceRequest();
        return TeaModel.build(map, self);
    }

}
