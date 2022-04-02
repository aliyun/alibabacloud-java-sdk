// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddRepositoryMemberRequest extends TeaModel {
    // Codeup访问令牌，使用AK/SK方式访问可以不用填AccessToken
    @NameInMap("AccessToken")
    public String accessToken;

    // 成员权限
    @NameInMap("accessLevel")
    public Integer accessLevel;

    // 需要添加为代码库成员的用户阿里云ID。支持多个，以","分割
    @NameInMap("aliyunPks")
    public String aliyunPks;

    // 企业ID
    @NameInMap("organizationId")
    public String organizationId;

    public static AddRepositoryMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRepositoryMemberRequest self = new AddRepositoryMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddRepositoryMemberRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public AddRepositoryMemberRequest setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public Integer getAccessLevel() {
        return this.accessLevel;
    }

    public AddRepositoryMemberRequest setAliyunPks(String aliyunPks) {
        this.aliyunPks = aliyunPks;
        return this;
    }
    public String getAliyunPks() {
        return this.aliyunPks;
    }

    public AddRepositoryMemberRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
