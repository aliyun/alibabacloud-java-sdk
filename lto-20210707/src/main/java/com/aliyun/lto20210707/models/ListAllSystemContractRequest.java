// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllSystemContractRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlockChainType")
    public String blockChainType;

    @NameInMap("RegionId")
    public String regionId;

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

    public ListAllSystemContractRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
