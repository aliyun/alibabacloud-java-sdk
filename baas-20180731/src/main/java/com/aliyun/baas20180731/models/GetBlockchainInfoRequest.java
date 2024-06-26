// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetBlockchainInfoRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static GetBlockchainInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBlockchainInfoRequest self = new GetBlockchainInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetBlockchainInfoRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
