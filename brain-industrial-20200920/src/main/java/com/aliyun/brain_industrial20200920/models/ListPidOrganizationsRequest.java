// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidOrganizationsRequest extends TeaModel {
    @NameInMap("ParentOrganizationId")
    public String parentOrganizationId;

    public static ListPidOrganizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPidOrganizationsRequest self = new ListPidOrganizationsRequest();
        return TeaModel.build(map, self);
    }

    public ListPidOrganizationsRequest setParentOrganizationId(String parentOrganizationId) {
        this.parentOrganizationId = parentOrganizationId;
        return this;
    }
    public String getParentOrganizationId() {
        return this.parentOrganizationId;
    }

}
