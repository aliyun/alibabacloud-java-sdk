// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateArtifactResponseBody extends TeaModel {
    /**
     * <p>The ID of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>artifact-eea08d1e2d3a43aexxxx</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <p>The properties of the deployment object.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;CommodityCode\&quot;:\&quot;cmjj0005xxxx\&quot;,\&quot;CommodityVersion\&quot;:\&quot;V2022xxxx\&quot;}</p>
     */
    @NameInMap("ArtifactProperty")
    public String artifactProperty;

    /**
     * <p>The type of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>EcsImage</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <p>The version of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ArtifactVersion")
    public String artifactVersion;

    /**
     * <p>The description of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>Test artifact</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the deployment package was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-11T12:00:00Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The latest version of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxVersion")
    public Long maxVersion;

    /**
     * <p>The name of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B1A0198B-F316-1B72-B8DD-28B6F6D6XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the deployment package. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>Created</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the region that supports the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *             &quot;cn-beijing&quot;,
     *             &quot;cn-hangzhou&quot;,
     *             &quot;cn-shanghai&quot;
     *         ]</p>
     */
    @NameInMap("SupportRegionIds")
    public String supportRegionIds;

    /**
     * <p>The name of the deployment package.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
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
