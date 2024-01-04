// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListApplicationMembersRequest extends TeaModel {
    @NameInMap("organizationId")
    public String organizationId;

    public static ListApplicationMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMembersRequest self = new ListApplicationMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationMembersRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
