// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewaySpecRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // 网关名称
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // 节点数量
    @NameInMap("Replica")
    public Integer replica;

    // 节点规格
    @NameInMap("Spec")
    public String spec;

    public static UpdateGatewaySpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewaySpecRequest self = new UpdateGatewaySpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewaySpecRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewaySpecRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewaySpecRequest setReplica(Integer replica) {
        this.replica = replica;
        return this;
    }
    public Integer getReplica() {
        return this.replica;
    }

    public UpdateGatewaySpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
