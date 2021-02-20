// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeStsGrantStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Role")
    public String role;

    public static DescribeStsGrantStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStsGrantStatusRequest self = new DescribeStsGrantStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStsGrantStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeStsGrantStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeStsGrantStatusRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
