// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribleLayer7InstanceRelationsRequest extends TeaModel {
    @NameInMap("DomainList")
    public java.util.List<String> domainList;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribleLayer7InstanceRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribleLayer7InstanceRelationsRequest self = new DescribleLayer7InstanceRelationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribleLayer7InstanceRelationsRequest setDomainList(java.util.List<String> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

    public DescribleLayer7InstanceRelationsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribleLayer7InstanceRelationsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
