// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetSkillResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the current caller can delete the Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CanDelete")
    public Boolean canDelete;

    /**
     * <p>Indicates whether the current caller can modify the Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CanModify")
    public Boolean canModify;

    /**
     * <p>The creation time of the Skill, in Unix millisecond timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1760000000000</p>
     */
    @NameInMap("CreatedAt")
    public Long createdAt;

    /**
     * <p>The description in the current Skill main record.</p>
     * 
     * <strong>example:</strong>
     * <p>A Skill for performing code review and risk alerts</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The bundle download URL. Returned when a network type is specified, an accessible Artifact exists, and pre-signing succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/artifacts/code-review-v2.zip?signature=example">https://example.com/artifacts/code-review-v2.zip?signature=example</a></p>
     */
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    /**
     * <p>The network type used to generate the download URL.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("DownloadUrlNetwork")
    public String downloadUrlNetwork;

    /**
     * <p>The Skill icon URL, sourced from the iconUrl in the metadata. This field may be empty if no icon is configured.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/icons/code-review.png">https://example.com/icons/code-review.png</a></p>
     */
    @NameInMap("IconUrl")
    public String iconUrl;

    /**
     * <p>The Skill metadata, mapped to the metadata field in the backend response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;skillMd&quot;:&quot;# Code Review\nCheck code quality.&quot;,&quot;artifactId&quot;:&quot;artifact_example003&quot;}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The Skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>code-review</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Indicates whether the Skill is an official Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Official")
    public Boolean official;

    /**
     * <p>The request ID, used for Tracing Analysis and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Skill ID。</p>
     * 
     * <strong>example:</strong>
     * <p>skill_example123</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>The current Skill status. Common values are DRAFT and PUBLISHED.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLISHED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The update time of the Skill, in Unix millisecond timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1760000300000</p>
     */
    @NameInMap("UpdatedAt")
    public Long updatedAt;

    /**
     * <p>The visibility of the current Skill. Common values are user and tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static GetSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillResponseBody self = new GetSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillResponseBody setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public GetSkillResponseBody setCanModify(Boolean canModify) {
        this.canModify = canModify;
        return this;
    }
    public Boolean getCanModify() {
        return this.canModify;
    }

    public GetSkillResponseBody setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public GetSkillResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetSkillResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public GetSkillResponseBody setDownloadUrlNetwork(String downloadUrlNetwork) {
        this.downloadUrlNetwork = downloadUrlNetwork;
        return this;
    }
    public String getDownloadUrlNetwork() {
        return this.downloadUrlNetwork;
    }

    public GetSkillResponseBody setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }
    public String getIconUrl() {
        return this.iconUrl;
    }

    public GetSkillResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public GetSkillResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSkillResponseBody setOfficial(Boolean official) {
        this.official = official;
        return this;
    }
    public Boolean getOfficial() {
        return this.official;
    }

    public GetSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillResponseBody setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public GetSkillResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSkillResponseBody setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public GetSkillResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
