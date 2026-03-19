// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SkillInfoDO extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Compatibility")
    public String compatibility;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("InstallCount")
    public String installCount;

    @NameInMap("Name")
    public String name;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Version")
    public String version;

    public static SkillInfoDO build(java.util.Map<String, ?> map) throws Exception {
        SkillInfoDO self = new SkillInfoDO();
        return TeaModel.build(map, self);
    }

    public SkillInfoDO setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public SkillInfoDO setCompatibility(String compatibility) {
        this.compatibility = compatibility;
        return this;
    }
    public String getCompatibility() {
        return this.compatibility;
    }

    public SkillInfoDO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SkillInfoDO setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public SkillInfoDO setInstallCount(String installCount) {
        this.installCount = installCount;
        return this;
    }
    public String getInstallCount() {
        return this.installCount;
    }

    public SkillInfoDO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SkillInfoDO setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SkillInfoDO setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public SkillInfoDO setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public SkillInfoDO setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public SkillInfoDO setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
