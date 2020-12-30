// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CancelRepoBuildRecordRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("BuildRecordId")
    public String buildRecordId;

    public static CancelRepoBuildRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelRepoBuildRecordRequest self = new CancelRepoBuildRecordRequest();
        return TeaModel.build(map, self);
    }

    public CancelRepoBuildRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelRepoBuildRecordRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public CancelRepoBuildRecordRequest setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

}
