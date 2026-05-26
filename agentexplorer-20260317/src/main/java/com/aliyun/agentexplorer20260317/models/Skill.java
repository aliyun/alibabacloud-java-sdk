// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentexplorer20260317.models;

import com.aliyun.tea.*;

public class Skill extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("categoryCode")
    public String categoryCode;

    @NameInMap("categoryName")
    public String categoryName;

    /**
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("description")
    public String description;

    @NameInMap("displayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("installCount")
    public Integer installCount;

    /**
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("likeCount")
    public Integer likeCount;

    /**
     * <strong>example:</strong>
     * <p>deploy-to-vercel</p>
     */
    @NameInMap("skillName")
    public String skillName;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("subCategoryCode")
    public String subCategoryCode;

    @NameInMap("subCategoryName")
    public String subCategoryName;

    /**
     * <strong>example:</strong>
     * <p>2026-03-17T00:00:00Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    public static Skill build(java.util.Map<String, ?> map) throws Exception {
        Skill self = new Skill();
        return TeaModel.build(map, self);
    }

    public Skill setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public Skill setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public Skill setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Skill setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Skill setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Skill setInstallCount(Integer installCount) {
        this.installCount = installCount;
        return this;
    }
    public Integer getInstallCount() {
        return this.installCount;
    }

    public Skill setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
        return this;
    }
    public Integer getLikeCount() {
        return this.likeCount;
    }

    public Skill setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public Skill setSubCategoryCode(String subCategoryCode) {
        this.subCategoryCode = subCategoryCode;
        return this;
    }
    public String getSubCategoryCode() {
        return this.subCategoryCode;
    }

    public Skill setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
        return this;
    }
    public String getSubCategoryName() {
        return this.subCategoryName;
    }

    public Skill setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
