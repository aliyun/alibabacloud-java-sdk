// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetGroupDetailRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("SubUserId")
    public String subUserId;

    public static GetGroupDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupDetailRequest self = new GetGroupDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupDetailRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetGroupDetailRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public GetGroupDetailRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetGroupDetailRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
