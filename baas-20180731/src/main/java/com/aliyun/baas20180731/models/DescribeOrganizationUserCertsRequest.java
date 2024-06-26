// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationUserCertsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("Username")
    public String username;

    public static DescribeOrganizationUserCertsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationUserCertsRequest self = new DescribeOrganizationUserCertsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationUserCertsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DescribeOrganizationUserCertsRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
