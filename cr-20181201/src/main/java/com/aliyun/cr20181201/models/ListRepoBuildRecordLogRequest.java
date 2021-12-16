// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRecordLogRequest extends TeaModel {
    @NameInMap("BuildRecordId")
    public String buildRecordId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepoId")
    public String repoId;

    public static ListRepoBuildRecordLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRecordLogRequest self = new ListRepoBuildRecordLogRequest();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRecordLogRequest setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    public ListRepoBuildRecordLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRepoBuildRecordLogRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListRepoBuildRecordLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListRepoBuildRecordLogRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
