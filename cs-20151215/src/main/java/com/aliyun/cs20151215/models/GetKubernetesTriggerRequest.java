// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetKubernetesTriggerRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Type")
    public String type;

    @NameInMap("action")
    public String action;

    public static GetKubernetesTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKubernetesTriggerRequest self = new GetKubernetesTriggerRequest();
        return TeaModel.build(map, self);
    }

    public GetKubernetesTriggerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetKubernetesTriggerRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetKubernetesTriggerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetKubernetesTriggerRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

}
