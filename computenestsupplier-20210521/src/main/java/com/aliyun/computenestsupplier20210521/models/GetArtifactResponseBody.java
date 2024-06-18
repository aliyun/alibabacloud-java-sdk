// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetArtifactResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>artifact-eea08d1e2d3a43aexxxx</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;CommodityCode\&quot;:\&quot;cmjj0005xxxx\&quot;,\&quot;CommodityVersion\&quot;:\&quot;V2022xxxx\&quot;}</p>
     */
    @NameInMap("ArtifactProperty")
    public String artifactProperty;

    /**
     * <strong>example:</strong>
     * <p>EcsImage</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ArtifactVersion")
    public String artifactVersion;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2022-10-20T02:19:55Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxVersion")
    public Long maxVersion;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Progress")
    public String progress;

    /**
     * <strong>example:</strong>
     * <p>B1A0198B-F316-1B72-B8DD-28B6F6D6XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;,&quot;cn-beijing&quot;]</p>
     */
    @NameInMap("SupportRegionIds")
    public String supportRegionIds;

    @NameInMap("Tags")
    public java.util.List<GetArtifactResponseBodyTags> tags;

    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static GetArtifactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactResponseBody self = new GetArtifactResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArtifactResponseBody setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public GetArtifactResponseBody setArtifactProperty(String artifactProperty) {
        this.artifactProperty = artifactProperty;
        return this;
    }
    public String getArtifactProperty() {
        return this.artifactProperty;
    }

    public GetArtifactResponseBody setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public GetArtifactResponseBody setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
        return this;
    }
    public String getArtifactVersion() {
        return this.artifactVersion;
    }

    public GetArtifactResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetArtifactResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetArtifactResponseBody setMaxVersion(Long maxVersion) {
        this.maxVersion = maxVersion;
        return this;
    }
    public Long getMaxVersion() {
        return this.maxVersion;
    }

    public GetArtifactResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetArtifactResponseBody setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

    public GetArtifactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetArtifactResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetArtifactResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetArtifactResponseBody setSupportRegionIds(String supportRegionIds) {
        this.supportRegionIds = supportRegionIds;
        return this;
    }
    public String getSupportRegionIds() {
        return this.supportRegionIds;
    }

    public GetArtifactResponseBody setTags(java.util.List<GetArtifactResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetArtifactResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetArtifactResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class GetArtifactResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetArtifactResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactResponseBodyTags self = new GetArtifactResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetArtifactResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetArtifactResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
