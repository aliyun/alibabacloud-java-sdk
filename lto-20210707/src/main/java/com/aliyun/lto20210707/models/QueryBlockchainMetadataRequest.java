// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class QueryBlockchainMetadataRequest extends TeaModel {
    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("IotDataDID")
    public String iotDataDID;

    public static QueryBlockchainMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainMetadataRequest self = new QueryBlockchainMetadataRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainMetadataRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public QueryBlockchainMetadataRequest setIotDataDID(String iotDataDID) {
        this.iotDataDID = iotDataDID;
        return this;
    }
    public String getIotDataDID() {
        return this.iotDataDID;
    }

}
