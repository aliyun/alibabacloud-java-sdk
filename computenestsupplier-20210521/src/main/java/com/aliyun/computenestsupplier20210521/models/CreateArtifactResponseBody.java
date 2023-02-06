// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateArtifactResponseBody extends TeaModel {
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

    @NameInMap("MaxVersion")
    public Long maxVersion;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("SupportRegionIds")
    public String supportRegionIds;

    @NameInMap("VersionName")
    public String versionName;

    public static CreateArtifactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactResponseBody self = new CreateArtifactResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateArtifactResponseBody setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public CreateArtifactResponseBody setArtifactProperty(String artifactProperty) {
        this.artifactProperty = artifactProperty;
        return this;
    }
    public String getArtifactProperty() {
        return this.artifactProperty;
    }

    public CreateArtifactResponseBody setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public CreateArtifactResponseBody setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
        return this;
    }
    public String getArtifactVersion() {
        return this.artifactVersion;
    }

    public CreateArtifactResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateArtifactResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CreateArtifactResponseBody setMaxVersion(Long maxVersion) {
        this.maxVersion = maxVersion;
        return this;
    }
    public Long getMaxVersion() {
        return this.maxVersion;
    }

    public CreateArtifactResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateArtifactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateArtifactResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateArtifactResponseBody setSupportRegionIds(String supportRegionIds) {
        this.supportRegionIds = supportRegionIds;
        return this;
    }
    public String getSupportRegionIds() {
        return this.supportRegionIds;
    }

    public CreateArtifactResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
