// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppVersionRemarkRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("Remark")
    public String remark;

    public static UpdateAppVersionRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionRemarkRequest self = new UpdateAppVersionRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionRemarkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateAppVersionRemarkRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public UpdateAppVersionRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
