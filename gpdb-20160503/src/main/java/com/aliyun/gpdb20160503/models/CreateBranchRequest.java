// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateBranchRequest extends TeaModel {
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
     * <p>The client idempotency token. This token ensures the idempotence of retry requests.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the branch.</p>
     * 
     * <strong>example:</strong>
     * <p>test branch</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time when the branch automatically expires and is deleted. The value is in the ISO 8601 UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-08T09:11:12Z</p>
     */
    @NameInMap("ExpiresAt")
    public String expiresAt;

    /**
     * <p>The initialization source of the branch.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ParentData: copies the schema and data from the parent branch. This is the default value.</li>
     * <li>SchemaOnly: copies only the schema structure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ParentData</p>
     */
    @NameInMap("InitSource")
    public String initSource;

    /**
     * <p>The ID of the parent branch. This parameter specifies the parent branch for the new branch or query condition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>br-main</p>
     */
    @NameInMap("ParentBranchId")
    public String parentBranchId;

    /**
     * <p>The log sequence number (LSN) selected when creating a branch from the parent branch.</p>
     * 
     * <strong>example:</strong>
     * <p>0/3522648</p>
     */
    @NameInMap("ParentLsn")
    public String parentLsn;

    /**
     * <p>The point in time for data synchronization when creating a branch from the parent branch. The value is in the ISO 8601 UTC format.</p>
     * <p>Default value: the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-08T09:11:12Z</p>
     */
    @NameInMap("ParentTimestamp")
    public String parentTimestamp;

    /**
     * <p>The ID of the Supabase project that corresponds to the primary branch.</p>
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
     * <li>true: Enables branch protection.</li>
     * <li>false: Disables branch protection. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Protected")
    public Boolean _protected;

    /**
     * <p>The region ID. This parameter is required when you create a primary branch. When you create a child branch, the region is inherited from the primary branch by default.</p>
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
    public java.util.List<CreateBranchRequestTag> tag;

    public static CreateBranchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBranchRequest self = new CreateBranchRequest();
        return TeaModel.build(map, self);
    }

    public CreateBranchRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public CreateBranchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBranchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBranchRequest setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public CreateBranchRequest setInitSource(String initSource) {
        this.initSource = initSource;
        return this;
    }
    public String getInitSource() {
        return this.initSource;
    }

    public CreateBranchRequest setParentBranchId(String parentBranchId) {
        this.parentBranchId = parentBranchId;
        return this;
    }
    public String getParentBranchId() {
        return this.parentBranchId;
    }

    public CreateBranchRequest setParentLsn(String parentLsn) {
        this.parentLsn = parentLsn;
        return this;
    }
    public String getParentLsn() {
        return this.parentLsn;
    }

    public CreateBranchRequest setParentTimestamp(String parentTimestamp) {
        this.parentTimestamp = parentTimestamp;
        return this;
    }
    public String getParentTimestamp() {
        return this.parentTimestamp;
    }

    public CreateBranchRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateBranchRequest set_protected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }
    public Boolean get_protected() {
        return this._protected;
    }

    public CreateBranchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBranchRequest setTag(java.util.List<CreateBranchRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateBranchRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateBranchRequestTag extends TeaModel {
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

        public static CreateBranchRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateBranchRequestTag self = new CreateBranchRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateBranchRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateBranchRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
