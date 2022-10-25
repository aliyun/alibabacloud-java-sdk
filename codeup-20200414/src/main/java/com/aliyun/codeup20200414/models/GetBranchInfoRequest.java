// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetBranchInfoRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("SubUserId")
    public String subUserId;

    public static GetBranchInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBranchInfoRequest self = new GetBranchInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetBranchInfoRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetBranchInfoRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public GetBranchInfoRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetBranchInfoRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
