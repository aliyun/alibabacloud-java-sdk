// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class CatalogVpcConnectionInfo extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("EndpointId")
    public String endpointId;

    public static CatalogVpcConnectionInfo build(java.util.Map<String, ?> map) throws Exception {
        CatalogVpcConnectionInfo self = new CatalogVpcConnectionInfo();
        return TeaModel.build(map, self);
    }

    public CatalogVpcConnectionInfo setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CatalogVpcConnectionInfo setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

}
