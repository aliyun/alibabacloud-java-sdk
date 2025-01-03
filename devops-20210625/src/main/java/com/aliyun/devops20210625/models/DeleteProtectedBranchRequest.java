// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteProtectedBranchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>611b75680fc7bf0dbe1dce55</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static DeleteProtectedBranchRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtectedBranchRequest self = new DeleteProtectedBranchRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProtectedBranchRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DeleteProtectedBranchRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
