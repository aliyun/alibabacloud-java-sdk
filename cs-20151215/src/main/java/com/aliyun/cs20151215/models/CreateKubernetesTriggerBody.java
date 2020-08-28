// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateKubernetesTriggerBody extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("TriggerUrl")
    public String triggerUrl;

    public static CreateKubernetesTriggerBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKubernetesTriggerBody self = new CreateKubernetesTriggerBody();
        return TeaModel.build(map, self);
    }

}
