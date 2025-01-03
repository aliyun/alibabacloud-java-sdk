// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateOrganizationMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationMemberName")
    public String organizationMemberName;

    public static UpdateOrganizationMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationMemberRequest self = new UpdateOrganizationMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationMemberRequest setOrganizationMemberName(String organizationMemberName) {
        this.organizationMemberName = organizationMemberName;
        return this;
    }
    public String getOrganizationMemberName() {
        return this.organizationMemberName;
    }

}
