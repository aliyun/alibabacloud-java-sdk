// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class ModifyClusterAttributesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    public static ModifyClusterAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterAttributesRequest self = new ModifyClusterAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterAttributesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterAttributesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyClusterAttributesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
