// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class AddWorkspaceMemberRequest extends TeaModel {
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

    // 成员类型
    @NameInMap("Type")
    public String type;

    // 过期时间
    @NameInMap("ExpiredAt")
    public String expiredAt;

    public static AddWorkspaceMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceMemberRequest self = new AddWorkspaceMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceMemberRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public AddWorkspaceMemberRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AddWorkspaceMemberRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddWorkspaceMemberRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public AddWorkspaceMemberRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public AddWorkspaceMemberRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddWorkspaceMemberRequest setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }
    public String getExpiredAt() {
        return this.expiredAt;
    }

}
