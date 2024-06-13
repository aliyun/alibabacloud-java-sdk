// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeResourcesDeleteProtectionRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    @NameInMap("resources")
    public String resources;

    public static DescribeResourcesDeleteProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesDeleteProtectionRequest self = new DescribeResourcesDeleteProtectionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesDeleteProtectionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeResourcesDeleteProtectionRequest setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
