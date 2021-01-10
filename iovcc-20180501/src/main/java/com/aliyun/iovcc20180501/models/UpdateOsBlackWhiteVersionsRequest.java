// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsBlackWhiteVersionsRequest extends TeaModel {
    @NameInMap("WhiteVersions")
    public String whiteVersions;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("BlackVersions")
    public String blackVersions;

    public static UpdateOsBlackWhiteVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsBlackWhiteVersionsRequest self = new UpdateOsBlackWhiteVersionsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOsBlackWhiteVersionsRequest setWhiteVersions(String whiteVersions) {
        this.whiteVersions = whiteVersions;
        return this;
    }
    public String getWhiteVersions() {
        return this.whiteVersions;
    }

    public UpdateOsBlackWhiteVersionsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateOsBlackWhiteVersionsRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public UpdateOsBlackWhiteVersionsRequest setBlackVersions(String blackVersions) {
        this.blackVersions = blackVersions;
        return this;
    }
    public String getBlackVersions() {
        return this.blackVersions;
    }

}
