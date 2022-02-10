// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteAuthResourceRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Id")
    public Long id;

    public static DeleteAuthResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthResourceRequest self = new DeleteAuthResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAuthResourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteAuthResourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public DeleteAuthResourceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
