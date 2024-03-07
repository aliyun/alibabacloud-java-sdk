// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class CreateNamespaceShrinkRequest extends TeaModel {
    @NameInMap("Ha")
    public Boolean ha;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceSpec")
    public String resourceSpecShrink;

    public static CreateNamespaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceShrinkRequest self = new CreateNamespaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceShrinkRequest setHa(Boolean ha) {
        this.ha = ha;
        return this;
    }
    public Boolean getHa() {
        return this.ha;
    }

    public CreateNamespaceShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNamespaceShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateNamespaceShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateNamespaceShrinkRequest setResourceSpecShrink(String resourceSpecShrink) {
        this.resourceSpecShrink = resourceSpecShrink;
        return this;
    }
    public String getResourceSpecShrink() {
        return this.resourceSpecShrink;
    }

}
