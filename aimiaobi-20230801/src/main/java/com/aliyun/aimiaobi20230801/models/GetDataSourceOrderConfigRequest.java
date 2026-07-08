// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDataSourceOrderConfigRequest extends TeaModel {
    /**
     * <p>Unique identifier for the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d9a1f6146a37446495d9985c2e7b267e_p_outbound_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>When productCode=miaosou, this corresponds to Miaosou: generation technology. Possible values:</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>copilotPrecise</p>
     * </li>
     * <li><p>copilotReference</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>copilotPrecise</p>
     */
    @NameInMap("GenerateTechnology")
    public String generateTechnology;

    /**
     * <p>Configuration type. Possible values:</p>
     * <ul>
     * <li><p>miaobi</p>
     * </li>
     * <li><p>miaosou</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>miaobi</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static GetDataSourceOrderConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceOrderConfigRequest self = new GetDataSourceOrderConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSourceOrderConfigRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GetDataSourceOrderConfigRequest setGenerateTechnology(String generateTechnology) {
        this.generateTechnology = generateTechnology;
        return this;
    }
    public String getGenerateTechnology() {
        return this.generateTechnology;
    }

    public GetDataSourceOrderConfigRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
