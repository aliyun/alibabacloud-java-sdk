// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteCustomTextRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>商品code</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The primary key ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteCustomTextRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTextRequest self = new DeleteCustomTextRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTextRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteCustomTextRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DeleteCustomTextRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
