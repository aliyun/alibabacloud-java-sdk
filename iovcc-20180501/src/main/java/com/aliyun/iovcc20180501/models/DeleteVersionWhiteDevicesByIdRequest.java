// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionWhiteDevicesByIdRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("VersionId")
    public String versionId;

    public static DeleteVersionWhiteDevicesByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionWhiteDevicesByIdRequest self = new DeleteVersionWhiteDevicesByIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVersionWhiteDevicesByIdRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DeleteVersionWhiteDevicesByIdRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteVersionWhiteDevicesByIdRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public DeleteVersionWhiteDevicesByIdRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
