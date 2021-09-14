// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceMemberRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("WorkspaceId")
    public Integer workspaceId;

    // 成员用户id
    @NameInMap("MemberUid")
    public String memberUid;

    public static DeleteWorkspaceMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceMemberRequest self = new DeleteWorkspaceMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceMemberRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DeleteWorkspaceMemberRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DeleteWorkspaceMemberRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteWorkspaceMemberRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public DeleteWorkspaceMemberRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

}
