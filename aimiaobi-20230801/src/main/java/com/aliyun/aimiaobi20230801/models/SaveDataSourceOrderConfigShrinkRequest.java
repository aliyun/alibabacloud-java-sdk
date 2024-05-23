// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveDataSourceOrderConfigShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
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
