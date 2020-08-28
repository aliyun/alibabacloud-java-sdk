// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InstallCloudAssistantRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public java.util.List<String> instanceId;

    public static InstallCloudAssistantRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudAssistantRequest self = new InstallCloudAssistantRequest();
        return TeaModel.build(map, self);
    }

}
