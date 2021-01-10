// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateAppBlackWhiteVersionsRequest extends TeaModel {
    @NameInMap("WhiteAppVersions")
    public String whiteAppVersions;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("BlackAppVersions")
    public String blackAppVersions;

    public static UpdateAppBlackWhiteVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppBlackWhiteVersionsRequest self = new UpdateAppBlackWhiteVersionsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppBlackWhiteVersionsRequest setWhiteAppVersions(String whiteAppVersions) {
        this.whiteAppVersions = whiteAppVersions;
        return this;
    }
    public String getWhiteAppVersions() {
        return this.whiteAppVersions;
    }

    public UpdateAppBlackWhiteVersionsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateAppBlackWhiteVersionsRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public UpdateAppBlackWhiteVersionsRequest setBlackAppVersions(String blackAppVersions) {
        this.blackAppVersions = blackAppVersions;
        return this;
    }
    public String getBlackAppVersions() {
        return this.blackAppVersions;
    }

}
