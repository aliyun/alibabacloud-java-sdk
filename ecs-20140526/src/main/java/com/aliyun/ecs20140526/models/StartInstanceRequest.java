// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    @NameInMap("SourceRegionId")
    public String sourceRegionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InitLocalDisk")
    public Boolean initLocalDisk;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static StartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRequest self = new StartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceRequest setSourceRegionId(String sourceRegionId) {
        this.sourceRegionId = sourceRegionId;
        return this;
    }
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    public StartInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartInstanceRequest setInitLocalDisk(Boolean initLocalDisk) {
        this.initLocalDisk = initLocalDisk;
        return this;
    }
    public Boolean getInitLocalDisk() {
        return this.initLocalDisk;
    }

    public StartInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
