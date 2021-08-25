// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberWithExternUidRequest extends TeaModel {
    // 个人访问令牌。 使用阿里云AK+SK或使用STS临时授权方式不需要传该字段
    @NameInMap("AccessToken")
    public String accessToken;

    // 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如 https://devops.aliyun.com/organization/
    @NameInMap("OrganizationId")
    public String organizationId;

    // 云效用户ID
    @NameInMap("ExternUserId")
    public String externUserId;

    public static DeleteRepositoryMemberWithExternUidRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryMemberWithExternUidRequest self = new DeleteRepositoryMemberWithExternUidRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryMemberWithExternUidRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DeleteRepositoryMemberWithExternUidRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DeleteRepositoryMemberWithExternUidRequest setExternUserId(String externUserId) {
        this.externUserId = externUserId;
        return this;
    }
    public String getExternUserId() {
        return this.externUserId;
    }

}
