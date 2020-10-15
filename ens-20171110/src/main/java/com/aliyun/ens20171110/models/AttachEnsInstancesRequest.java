// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachEnsInstancesRequest extends TeaModel {
    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("Scripts")
    @Validation(required = true)
    public String scripts;

    public static AttachEnsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachEnsInstancesRequest self = new AttachEnsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public AttachEnsInstancesRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AttachEnsInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachEnsInstancesRequest setScripts(String scripts) {
        this.scripts = scripts;
        return this;
    }
    public String getScripts() {
        return this.scripts;
    }

}
