// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionBlackDevicesByIdRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("VersionId")
    public String versionId;

    public static DeleteVersionBlackDevicesByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionBlackDevicesByIdRequest self = new DeleteVersionBlackDevicesByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVersionBlackDevicesByIdRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DeleteVersionBlackDevicesByIdRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteVersionBlackDevicesByIdRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public DeleteVersionBlackDevicesByIdRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
