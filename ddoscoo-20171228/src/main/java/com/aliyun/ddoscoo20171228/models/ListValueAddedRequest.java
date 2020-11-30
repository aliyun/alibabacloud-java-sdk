// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListValueAddedRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListValueAddedRequest build(java.util.Map<String, ?> map) throws Exception {
        ListValueAddedRequest self = new ListValueAddedRequest();
        return TeaModel.build(map, self);
    }

    public ListValueAddedRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ListValueAddedRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
