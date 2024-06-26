// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationTriggersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeOrganizationTriggersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationTriggersRequest self = new DescribeOrganizationTriggersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationTriggersRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
