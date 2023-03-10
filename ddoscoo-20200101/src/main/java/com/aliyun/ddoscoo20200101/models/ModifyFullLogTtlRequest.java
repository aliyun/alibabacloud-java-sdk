// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyFullLogTtlRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The log storage duration of a website. Valid values: **30** to **180**. Unit: days.</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static ModifyFullLogTtlRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFullLogTtlRequest self = new ModifyFullLogTtlRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFullLogTtlRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyFullLogTtlRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
