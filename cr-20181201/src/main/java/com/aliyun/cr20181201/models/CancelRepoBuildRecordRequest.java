// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CancelRepoBuildRecordRequest extends TeaModel {
    @NameInMap("BuildRecordId")
    public String buildRecordId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepoId")
    public String repoId;

    public static CancelRepoBuildRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelRepoBuildRecordRequest self = new CancelRepoBuildRecordRequest();
        return TeaModel.build(map, self);
    }

    public CancelRepoBuildRecordRequest setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    public CancelRepoBuildRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelRepoBuildRecordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelRepoBuildRecordRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
