// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyPrepayNamespaceSpecShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceSpec")
    public String resourceSpecShrink;

    public static ModifyPrepayNamespaceSpecShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayNamespaceSpecShrinkRequest self = new ModifyPrepayNamespaceSpecShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayNamespaceSpecShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPrepayNamespaceSpecShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ModifyPrepayNamespaceSpecShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifyPrepayNamespaceSpecShrinkRequest setResourceSpecShrink(String resourceSpecShrink) {
        this.resourceSpecShrink = resourceSpecShrink;
        return this;
    }
    public String getResourceSpecShrink() {
        return this.resourceSpecShrink;
    }

}
