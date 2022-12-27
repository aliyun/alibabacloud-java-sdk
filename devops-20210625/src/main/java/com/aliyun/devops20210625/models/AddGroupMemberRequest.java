// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddGroupMemberRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("accessLevel")
    public Integer accessLevel;

    @NameInMap("aliyunPks")
    public String aliyunPks;

    @NameInMap("organizationId")
    public String organizationId;

    public static AddGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGroupMemberRequest self = new AddGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddGroupMemberRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public AddGroupMemberRequest setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public Integer getAccessLevel() {
        return this.accessLevel;
    }

    public AddGroupMemberRequest setAliyunPks(String aliyunPks) {
        this.aliyunPks = aliyunPks;
        return this;
    }
    public String getAliyunPks() {
        return this.aliyunPks;
    }

    public AddGroupMemberRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
