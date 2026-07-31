// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Artifact extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-15T10:30:00Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The artifact name.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The artifact type.</p>
     * 
     * <strong>example:</strong>
     * <p>Image</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The version list.</p>
     */
    @NameInMap("Versions")
    public java.util.List<ArtifactVersions> versions;

    public static Artifact build(java.util.Map<String, ?> map) throws Exception {
        Artifact self = new Artifact();
        return TeaModel.build(map, self);
    }

    public Artifact setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Artifact setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Artifact setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Artifact setVersions(java.util.List<ArtifactVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ArtifactVersions> getVersions() {
        return this.versions;
    }

    public static class ArtifactVersions extends TeaModel {
        /**
         * <p>The version alias.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The template description associated with the version.</p>
         * 
         * <strong>example:</strong>
         * <p>Supports new xx feature</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-ahpa-hz</p>
         */
        @NameInMap("ReleaseName")
        public String releaseName;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>V2.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ArtifactVersions build(java.util.Map<String, ?> map) throws Exception {
            ArtifactVersions self = new ArtifactVersions();
            return TeaModel.build(map, self);
        }

        public ArtifactVersions setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ArtifactVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ArtifactVersions setReleaseName(String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        public String getReleaseName() {
            return this.releaseName;
        }

        public ArtifactVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
