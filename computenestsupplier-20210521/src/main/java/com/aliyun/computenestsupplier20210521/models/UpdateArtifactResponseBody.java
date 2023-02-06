// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateArtifactResponseBody extends TeaModel {
    @NameInMap("ArtifactId")
    public String artifactId;

    @NameInMap("ArtifactProperty")
    public String artifactProperty;

    @NameInMap("ArtifactType")
    public String artifactType;

    @NameInMap("ArtifactVersion")
    public String artifactVersion;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("SupportRegionIds")
    public String supportRegionIds;

    @NameInMap("VersionName")
    public String versionName;

    public static UpdateArtifactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateArtifactResponseBody self = new UpdateArtifactResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateArtifactResponseBody setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public UpdateArtifactResponseBody setArtifactProperty(String artifactProperty) {
        this.artifactProperty = artifactProperty;
        return this;
    }
    public String getArtifactProperty() {
        return this.artifactProperty;
    }

    public UpdateArtifactResponseBody setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public UpdateArtifactResponseBody setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
        return this;
    }
    public String getArtifactVersion() {
        return this.artifactVersion;
    }

    public UpdateArtifactResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateArtifactResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public UpdateArtifactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateArtifactResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateArtifactResponseBody setSupportRegionIds(String supportRegionIds) {
        this.supportRegionIds = supportRegionIds;
        return this;
    }
    public String getSupportRegionIds() {
        return this.supportRegionIds;
    }

    public UpdateArtifactResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
