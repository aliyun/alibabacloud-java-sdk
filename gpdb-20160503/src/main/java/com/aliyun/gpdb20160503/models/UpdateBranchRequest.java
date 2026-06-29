// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateBranchRequest extends TeaModel {
    /**
     * <p>The branch ID that uniquely identifies a Supabase branch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>br-xxxx</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>The branch name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("BranchName")
    public String branchName;

    /**
     * <p>Specifies whether to clear the branch expiration time.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Clears ExpiresAt.</li>
     * <li>false: Does not clear ExpiresAt.</li>
     * </ul>
     * <p>If this parameter is not specified, the existing expiration time remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ClearExpiresAt")
    public Boolean clearExpiresAt;

    /**
     * <p>The branch description.</p>
     * 
     * <strong>example:</strong>
     * <p>test branch</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the branch automatically expires and is deleted. The value is in ISO 8601 UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-08T09:11:12Z</p>
     */
    @NameInMap("ExpiresAt")
    public String expiresAt;

    /**
     * <p>The Supabase project ID that corresponds to the primary branch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>spb-xxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>Specifies whether to enable branch protection.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Branch protection is enabled.</li>
     * <li>false: Branch protection is disabled. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Protected")
    public Boolean _protected;

    /**
     * <p>The region ID. This parameter is required when you create a primary branch. When you create a sub-branch, the region of the primary branch is inherited by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of branch tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<UpdateBranchRequestTag> tag;

    public static UpdateBranchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBranchRequest self = new UpdateBranchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBranchRequest setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public UpdateBranchRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public UpdateBranchRequest setClearExpiresAt(Boolean clearExpiresAt) {
        this.clearExpiresAt = clearExpiresAt;
        return this;
    }
    public Boolean getClearExpiresAt() {
        return this.clearExpiresAt;
    }

    public UpdateBranchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBranchRequest setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public UpdateBranchRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateBranchRequest set_protected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }
    public Boolean get_protected() {
        return this._protected;
    }

    public UpdateBranchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateBranchRequest setTag(java.util.List<UpdateBranchRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateBranchRequestTag> getTag() {
        return this.tag;
    }

    public static class UpdateBranchRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateBranchRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateBranchRequestTag self = new UpdateBranchRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateBranchRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateBranchRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
