// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CloneNacosConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OriginNamespaceId")
    public String originNamespaceId;

    @NameInMap("TargetNamespaceId")
    public String targetNamespaceId;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Ids")
    public String ids;

    public static CloneNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneNacosConfigRequest self = new CloneNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public CloneNacosConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CloneNacosConfigRequest setOriginNamespaceId(String originNamespaceId) {
        this.originNamespaceId = originNamespaceId;
        return this;
    }
    public String getOriginNamespaceId() {
        return this.originNamespaceId;
    }

    public CloneNacosConfigRequest setTargetNamespaceId(String targetNamespaceId) {
        this.targetNamespaceId = targetNamespaceId;
        return this;
    }
    public String getTargetNamespaceId() {
        return this.targetNamespaceId;
    }

    public CloneNacosConfigRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CloneNacosConfigRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
