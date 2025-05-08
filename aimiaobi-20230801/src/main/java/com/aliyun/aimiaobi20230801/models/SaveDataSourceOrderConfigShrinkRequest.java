// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveDataSourceOrderConfigShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>copilotReference</p>
     */
    @NameInMap("GenerateTechnology")
    public String generateTechnology;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>miaobi</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserConfigDataSourceList")
    public String userConfigDataSourceListShrink;

    public static SaveDataSourceOrderConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDataSourceOrderConfigShrinkRequest self = new SaveDataSourceOrderConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveDataSourceOrderConfigShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SaveDataSourceOrderConfigShrinkRequest setGenerateTechnology(String generateTechnology) {
        this.generateTechnology = generateTechnology;
        return this;
    }
    public String getGenerateTechnology() {
        return this.generateTechnology;
    }

    public SaveDataSourceOrderConfigShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SaveDataSourceOrderConfigShrinkRequest setUserConfigDataSourceListShrink(String userConfigDataSourceListShrink) {
        this.userConfigDataSourceListShrink = userConfigDataSourceListShrink;
        return this;
    }
    public String getUserConfigDataSourceListShrink() {
        return this.userConfigDataSourceListShrink;
    }

}
