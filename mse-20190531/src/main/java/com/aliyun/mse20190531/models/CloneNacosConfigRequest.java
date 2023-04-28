// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CloneNacosConfigRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OriginNamespaceId")
    public String originNamespaceId;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("TargetNamespaceId")
    public String targetNamespaceId;

    public static CloneNacosConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneNacosConfigRequest self = new CloneNacosConfigRequest();
        return TeaModel.build(map, self);
    }

    public CloneNacosConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CloneNacosConfigRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
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

    public CloneNacosConfigRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CloneNacosConfigRequest setTargetNamespaceId(String targetNamespaceId) {
        this.targetNamespaceId = targetNamespaceId;
        return this;
    }
    public String getTargetNamespaceId() {
        return this.targetNamespaceId;
    }

}
