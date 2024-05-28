// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateMergeRequestPersonnelRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("newUserIdList")
    public java.util.List<String> newUserIdList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static UpdateMergeRequestPersonnelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMergeRequestPersonnelRequest self = new UpdateMergeRequestPersonnelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMergeRequestPersonnelRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateMergeRequestPersonnelRequest setNewUserIdList(java.util.List<String> newUserIdList) {
        this.newUserIdList = newUserIdList;
        return this;
    }
    public java.util.List<String> getNewUserIdList() {
        return this.newUserIdList;
    }

    public UpdateMergeRequestPersonnelRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
