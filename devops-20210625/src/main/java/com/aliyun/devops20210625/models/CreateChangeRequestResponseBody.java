// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateChangeRequestResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sn123</p>
     */
    @NameInMap("appCodeRepoSn")
    public String appCodeRepoSn;

    /**
     * <strong>example:</strong>
     * <p>app-name</p>
     */
    @NameInMap("appName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoDeleteBranchWhenEnd")
    public Boolean autoDeleteBranchWhenEnd;

    /**
     * <strong>example:</strong>
     * <p>hotfix/20240524</p>
     */
    @NameInMap("branch")
    public String branch;

    /**
     * <strong>example:</strong>
     * <p>create-account-123</p>
     */
    @NameInMap("creatorAccountId")
    public String creatorAccountId;

    /**
     * <strong>example:</strong>
     * <p>create-id-123</p>
     */
    @NameInMap("creatorId")
    public String creatorId;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("originBranch")
    public String originBranch;

    /**
     * <strong>example:</strong>
     * <p>revision-123</p>
     */
    @NameInMap("originBranchRevisionSha")
    public String originBranchRevisionSha;

    /**
     * <strong>example:</strong>
     * <p>account-id-123</p>
     */
    @NameInMap("ownerAccountId")
    public String ownerAccountId;

    /**
     * <strong>example:</strong>
     * <p>owner-id-123</p>
     */
    @NameInMap("ownerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>ce51b31b996246ecaf874736838360b2</p>
     */
    @NameInMap("sn")
    public String sn;

    /**
     * <strong>example:</strong>
     * <p>DEVELOPING</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("type")
    public String type;

    public static CreateChangeRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChangeRequestResponseBody self = new CreateChangeRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChangeRequestResponseBody setAppCodeRepoSn(String appCodeRepoSn) {
        this.appCodeRepoSn = appCodeRepoSn;
        return this;
    }
    public String getAppCodeRepoSn() {
        return this.appCodeRepoSn;
    }

    public CreateChangeRequestResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateChangeRequestResponseBody setAutoDeleteBranchWhenEnd(Boolean autoDeleteBranchWhenEnd) {
        this.autoDeleteBranchWhenEnd = autoDeleteBranchWhenEnd;
        return this;
    }
    public Boolean getAutoDeleteBranchWhenEnd() {
        return this.autoDeleteBranchWhenEnd;
    }

    public CreateChangeRequestResponseBody setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CreateChangeRequestResponseBody setCreatorAccountId(String creatorAccountId) {
        this.creatorAccountId = creatorAccountId;
        return this;
    }
    public String getCreatorAccountId() {
        return this.creatorAccountId;
    }

    public CreateChangeRequestResponseBody setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public CreateChangeRequestResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateChangeRequestResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CreateChangeRequestResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateChangeRequestResponseBody setOriginBranch(String originBranch) {
        this.originBranch = originBranch;
        return this;
    }
    public String getOriginBranch() {
        return this.originBranch;
    }

    public CreateChangeRequestResponseBody setOriginBranchRevisionSha(String originBranchRevisionSha) {
        this.originBranchRevisionSha = originBranchRevisionSha;
        return this;
    }
    public String getOriginBranchRevisionSha() {
        return this.originBranchRevisionSha;
    }

    public CreateChangeRequestResponseBody setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    public CreateChangeRequestResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateChangeRequestResponseBody setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public CreateChangeRequestResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateChangeRequestResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
