// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoBuildRecordStatusRequest extends TeaModel {
    @NameInMap("BuildRecordId")
    public String buildRecordId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepoId")
    public String repoId;

    public static GetRepoBuildRecordStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoBuildRecordStatusRequest self = new GetRepoBuildRecordStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoBuildRecordStatusRequest setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    public GetRepoBuildRecordStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepoBuildRecordStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRepoBuildRecordStatusRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
