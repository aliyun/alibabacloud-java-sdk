// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryOrganizationDeletableRequest extends TeaModel {
    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static QueryOrganizationDeletableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationDeletableRequest self = new QueryOrganizationDeletableRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrganizationDeletableRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public QueryOrganizationDeletableRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
