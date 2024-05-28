// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProtectedBranchesRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static ListProtectedBranchesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProtectedBranchesRequest self = new ListProtectedBranchesRequest();
        return TeaModel.build(map, self);
    }

    public ListProtectedBranchesRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListProtectedBranchesRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
