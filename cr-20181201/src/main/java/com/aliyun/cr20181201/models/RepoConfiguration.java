// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class RepoConfiguration extends TeaModel {
    @NameInMap("ArtifactBuildRuleParameters")
    public RepoConfigurationArtifactBuildRuleParameters artifactBuildRuleParameters;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RepoType")
    public String repoType;

    /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("ImageIndexOnly")
        public Boolean imageIndexOnly;

        @NameInMap("PriorityFile")
        public String priorityFile;

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

        public RepoConfigurationArtifactBuildRuleParameters setPriorityFile(String priorityFile) {
            this.priorityFile = priorityFile;
            return this;
        }
        public String getPriorityFile() {
            return this.priorityFile;
        }

    }

}
