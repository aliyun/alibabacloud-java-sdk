// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListArtifactBuildTaskLogRequest extends TeaModel {
    @NameInMap("BuildTaskId")
    public String buildTaskId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListArtifactBuildTaskLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactBuildTaskLogRequest self = new ListArtifactBuildTaskLogRequest();
        return TeaModel.build(map, self);
    }

    public ListArtifactBuildTaskLogRequest setBuildTaskId(String buildTaskId) {
        this.buildTaskId = buildTaskId;
        return this;
    }
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

    public ListArtifactBuildTaskLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListArtifactBuildTaskLogRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListArtifactBuildTaskLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
