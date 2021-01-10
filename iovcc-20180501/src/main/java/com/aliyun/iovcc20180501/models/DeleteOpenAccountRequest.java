// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteOpenAccountRequest extends TeaModel {
    @NameInMap("IdentityId")
    public String identityId;

    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteOpenAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenAccountRequest self = new DeleteOpenAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOpenAccountRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public DeleteOpenAccountRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
