// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllSystemContractRequest extends TeaModel {
    @NameInMap("BlockChainType")
    public String blockChainType;

    public static ListAllSystemContractRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllSystemContractRequest self = new ListAllSystemContractRequest();
        return TeaModel.build(map, self);
    }

    public ListAllSystemContractRequest setBlockChainType(String blockChainType) {
        this.blockChainType = blockChainType;
        return this;
    }
    public String getBlockChainType() {
        return this.blockChainType;
    }

}
