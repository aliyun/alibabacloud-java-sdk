// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteAllCustomizedFiltersRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("VersionType")
    public String versionType;

    public static DeleteAllCustomizedFiltersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllCustomizedFiltersRequest self = new DeleteAllCustomizedFiltersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAllCustomizedFiltersRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteAllCustomizedFiltersRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public DeleteAllCustomizedFiltersRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
