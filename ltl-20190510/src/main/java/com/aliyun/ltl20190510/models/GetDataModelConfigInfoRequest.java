// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class GetDataModelConfigInfoRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("DataModelCode")
    public String dataModelCode;

    @NameInMap("ProductKey")
    public String productKey;

    public static GetDataModelConfigInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataModelConfigInfoRequest self = new GetDataModelConfigInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDataModelConfigInfoRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GetDataModelConfigInfoRequest setDataModelCode(String dataModelCode) {
        this.dataModelCode = dataModelCode;
        return this;
    }
    public String getDataModelCode() {
        return this.dataModelCode;
    }

    public GetDataModelConfigInfoRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
