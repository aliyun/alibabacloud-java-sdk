// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRecordLogRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("BuildRecordId")
    public String buildRecordId;

    @NameInMap("Offset")
    public Integer offset;

    public static ListRepoBuildRecordLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepoBuildRecordLogRequest self = new ListRepoBuildRecordLogRequest();
        return TeaModel.build(map, self);
    }

    public ListRepoBuildRecordLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRepoBuildRecordLogRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public ListRepoBuildRecordLogRequest setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    public ListRepoBuildRecordLogRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

}
