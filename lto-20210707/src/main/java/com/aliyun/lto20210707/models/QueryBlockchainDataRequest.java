// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class QueryBlockchainDataRequest extends TeaModel {
    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("IotDataDID")
    public String iotDataDID;

    public static QueryBlockchainDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainDataRequest self = new QueryBlockchainDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainDataRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public QueryBlockchainDataRequest setIotDataDID(String iotDataDID) {
        this.iotDataDID = iotDataDID;
        return this;
    }
    public String getIotDataDID() {
        return this.iotDataDID;
    }

}
