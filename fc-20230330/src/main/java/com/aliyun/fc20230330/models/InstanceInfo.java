// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class InstanceInfo extends TeaModel {
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("versionId")
    public String versionId;

    public static InstanceInfo build(java.util.Map<String, ?> map) throws Exception {
        InstanceInfo self = new InstanceInfo();
        return TeaModel.build(map, self);
    }

    public InstanceInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceInfo setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
