// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class AddRepositoryMemberRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("accessLevel")
    public Integer accessLevel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("aliyunPks")
    public String aliyunPks;

    /**
     * <p>This parameter is required.</p>
     */
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
