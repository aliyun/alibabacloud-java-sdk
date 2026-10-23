// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GetGovernanceServiceStatusRequest extends TeaModel {
    /**
     * <p>必填。待操作或查询的地域 ID，必须为服务支持的合法地域，且与本次调用 endpoint 对应的地域一致；不提供隐式默认地域。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetGovernanceServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceServiceStatusRequest self = new GetGovernanceServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetGovernanceServiceStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
