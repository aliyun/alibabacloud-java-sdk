// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateChangeRequestRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sn123</p>
     */
    @NameInMap("appCodeRepoSn")
    public String appCodeRepoSn;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoDeleteBranchWhenEnd")
    public Boolean autoDeleteBranchWhenEnd;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hotfix/20240524</p>
     */
    @NameInMap("branchName")
    public String branchName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("createBranch")
    public Boolean createBranch;

    /**
     * <strong>example:</strong>
     * <p>1332695887xxxxxx</p>
     */
    @NameInMap("ownerAccountId")
    public String ownerAccountId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ownerId")
    public String ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>66c0c9fffeb86b450c199fcd</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static CreateChangeRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChangeRequestRequest self = new CreateChangeRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateChangeRequestRequest setAppCodeRepoSn(String appCodeRepoSn) {
        this.appCodeRepoSn = appCodeRepoSn;
        return this;
    }
    public String getAppCodeRepoSn() {
        return this.appCodeRepoSn;
    }

    public CreateChangeRequestRequest setAutoDeleteBranchWhenEnd(Boolean autoDeleteBranchWhenEnd) {
        this.autoDeleteBranchWhenEnd = autoDeleteBranchWhenEnd;
        return this;
    }
    public Boolean getAutoDeleteBranchWhenEnd() {
        return this.autoDeleteBranchWhenEnd;
    }

    public CreateChangeRequestRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public CreateChangeRequestRequest setCreateBranch(Boolean createBranch) {
        this.createBranch = createBranch;
        return this;
    }
    public Boolean getCreateBranch() {
        return this.createBranch;
    }

    public CreateChangeRequestRequest setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public CreateChangeRequestRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateChangeRequestRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateChangeRequestRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
