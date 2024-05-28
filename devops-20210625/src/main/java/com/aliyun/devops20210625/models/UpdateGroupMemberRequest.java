// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateGroupMemberRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("aliyunPk")
    public String aliyunPk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("accessLevel")
    public Integer accessLevel;

    @NameInMap("memberType")
    public String memberType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static UpdateGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupMemberRequest self = new UpdateGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGroupMemberRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateGroupMemberRequest setAliyunPk(String aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public String getAliyunPk() {
        return this.aliyunPk;
    }

    public UpdateGroupMemberRequest setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public Integer getAccessLevel() {
        return this.accessLevel;
    }

    public UpdateGroupMemberRequest setMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }
    public String getMemberType() {
        return this.memberType;
    }

    public UpdateGroupMemberRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
