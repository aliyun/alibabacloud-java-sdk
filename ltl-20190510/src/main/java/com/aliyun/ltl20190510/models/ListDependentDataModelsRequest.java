// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListDependentDataModelsRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("ProductKey")
    public String productKey;

    public static ListDependentDataModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDependentDataModelsRequest self = new ListDependentDataModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListDependentDataModelsRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ListDependentDataModelsRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
