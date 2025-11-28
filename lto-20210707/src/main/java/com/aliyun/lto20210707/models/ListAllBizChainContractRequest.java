// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllBizChainContractRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListAllBizChainContractRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllBizChainContractRequest self = new ListAllBizChainContractRequest();
        return TeaModel.build(map, self);
    }

    public ListAllBizChainContractRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public ListAllBizChainContractRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
