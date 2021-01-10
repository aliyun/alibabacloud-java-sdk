// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionAllBlackDevicesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("VersionId")
    public String versionId;

    public static DeleteVersionAllBlackDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionAllBlackDevicesRequest self = new DeleteVersionAllBlackDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVersionAllBlackDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteVersionAllBlackDevicesRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public DeleteVersionAllBlackDevicesRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
