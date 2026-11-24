// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class RepoConfiguration extends TeaModel {
    /**
     * <p>The default parameters for the image build rule.</p>
     */
    @NameInMap("ArtifactBuildRuleParameters")
    public RepoConfigurationArtifactBuildRuleParameters artifactBuildRuleParameters;

    /**
     * <p>The type of the image repository for automatic creation. Valid values: PRIVATE (private repository) and PUBLIC (public repository).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("RepoType")
    public String repoType;

    /**
     * <p>Specifies whether image version immutability is enabled. After it is enabled, you cannot overwrite image versions other than latest.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagImmutability")
    public Boolean tagImmutability;

    public static RepoConfiguration build(java.util.Map<String, ?> map) throws Exception {
        RepoConfiguration self = new RepoConfiguration();
        return TeaModel.build(map, self);
    }

    public RepoConfiguration setArtifactBuildRuleParameters(RepoConfigurationArtifactBuildRuleParameters artifactBuildRuleParameters) {
        this.artifactBuildRuleParameters = artifactBuildRuleParameters;
        return this;
    }
    public RepoConfigurationArtifactBuildRuleParameters getArtifactBuildRuleParameters() {
        return this.artifactBuildRuleParameters;
    }

    public RepoConfiguration setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

    public RepoConfiguration setTagImmutability(Boolean tagImmutability) {
        this.tagImmutability = tagImmutability;
        return this;
    }
    public Boolean getTagImmutability() {
        return this.tagImmutability;
    }

    public static class RepoConfigurationArtifactBuildRuleParameters extends TeaModel {
        /**
         * <p>Specifies whether to build only the image index.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ImageIndexOnly")
        public Boolean imageIndexOnly;

        public static RepoConfigurationArtifactBuildRuleParameters build(java.util.Map<String, ?> map) throws Exception {
            RepoConfigurationArtifactBuildRuleParameters self = new RepoConfigurationArtifactBuildRuleParameters();
            return TeaModel.build(map, self);
        }

        public RepoConfigurationArtifactBuildRuleParameters setImageIndexOnly(Boolean imageIndexOnly) {
            this.imageIndexOnly = imageIndexOnly;
            return this;
        }
        public Boolean getImageIndexOnly() {
            return this.imageIndexOnly;
        }

    }

}
