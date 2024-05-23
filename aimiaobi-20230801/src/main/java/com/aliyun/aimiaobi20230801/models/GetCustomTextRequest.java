// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomTextRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetCustomTextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomTextRequest self = new GetCustomTextRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomTextRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetCustomTextRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public GetCustomTextRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
