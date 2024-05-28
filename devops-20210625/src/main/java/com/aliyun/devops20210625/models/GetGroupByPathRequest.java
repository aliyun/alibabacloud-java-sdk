// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetGroupByPathRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("identity")
    public String identity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static GetGroupByPathRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupByPathRequest self = new GetGroupByPathRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupByPathRequest setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public GetGroupByPathRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
