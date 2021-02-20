// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEnsServiceRequest extends TeaModel {
    @NameInMap("Version")
    public String version;

    @NameInMap("EnsServiceId")
    public String ensServiceId;

    @NameInMap("OrderType")
    public String orderType;

    public static CreateEnsServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnsServiceRequest self = new CreateEnsServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnsServiceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateEnsServiceRequest setEnsServiceId(String ensServiceId) {
        this.ensServiceId = ensServiceId;
        return this;
    }
    public String getEnsServiceId() {
        return this.ensServiceId;
    }

    public CreateEnsServiceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
