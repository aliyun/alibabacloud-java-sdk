// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentexplorer20260317.models;

import com.aliyun.tea.*;

public class Skill extends TeaModel {
    /**
     * <p>The primary category code.</p>
     * 
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("categoryCode")
    public String categoryCode;

    /**
     * <p>The primary category name.</p>
     * 
     * <strong>example:</strong>
     * <p>计算</p>
     */
    @NameInMap("categoryName")
    public String categoryName;

    @NameInMap("categoryNameEn")
    public String categoryNameEn;

    /**
     * <p>The time when the Agent Skill was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01T00:00:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The description of the Agent Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS 实例管理</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("descriptionEn")
    public String descriptionEn;

    /**
     * <p>The display name of the Agent Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS 实例管理</p>
     */
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("githubPath")
    public String githubPath;

    /**
     * <p>The number of installations.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("installCount")
    public Integer installCount;

    /**
     * <p>The number of likes.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("likeCount")
    public Integer likeCount;

    @NameInMap("nameEn")
    public String nameEn;

    /**
     * <p>The English name of the Agent Skill, which serves as a unique identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>deploy-to-vercel</p>
     */
    @NameInMap("skillName")
    public String skillName;

    /**
     * <p>The secondary category code.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("subCategoryCode")
    public String subCategoryCode;

    /**
     * <p>The secondary category name.</p>
     * 
     * <strong>example:</strong>
     * <p>弹性计算</p>
     */
    @NameInMap("subCategoryName")
    public String subCategoryName;

    @NameInMap("subCategoryNameEn")
    public String subCategoryNameEn;

    /**
     * <p>The time when the Agent Skill was last updated.</p>
     * 
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

    public Skill setCategoryNameEn(String categoryNameEn) {
        this.categoryNameEn = categoryNameEn;
        return this;
    }
    public String getCategoryNameEn() {
        return this.categoryNameEn;
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

    public Skill setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
        return this;
    }
    public String getDescriptionEn() {
        return this.descriptionEn;
    }

    public Skill setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Skill setGithubPath(String githubPath) {
        this.githubPath = githubPath;
        return this;
    }
    public String getGithubPath() {
        return this.githubPath;
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

    public Skill setNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }
    public String getNameEn() {
        return this.nameEn;
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

    public Skill setSubCategoryNameEn(String subCategoryNameEn) {
        this.subCategoryNameEn = subCategoryNameEn;
        return this;
    }
    public String getSubCategoryNameEn() {
        return this.subCategoryNameEn;
    }

    public Skill setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
