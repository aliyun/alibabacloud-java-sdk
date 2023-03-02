// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class GetBlockChainInfoRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("Key")
    public String key;

    @NameInMap("ProductKey")
    public String productKey;

    public static GetBlockChainInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBlockChainInfoRequest self = new GetBlockChainInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetBlockChainInfoRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GetBlockChainInfoRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public GetBlockChainInfoRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GetBlockChainInfoRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
