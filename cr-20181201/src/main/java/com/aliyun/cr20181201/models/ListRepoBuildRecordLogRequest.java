// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoBuildRecordLogRequest extends TeaModel {
    /**
     * <p>The ID of the image building record.</p>
     */
    @NameInMap("BuildRecordId")
    public String buildRecordId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The offset of log lines.</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <p>The ID of the image repository.</p>
     */
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

    public ListRepoBuildRecordLogRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
