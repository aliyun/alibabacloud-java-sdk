// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveDataSourceOrderConfigRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c160c841c8e54295bf2f441432785944_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The generation technology for Miaosou. This parameter is valid only when \<code>ProductCode\\</code> is set to \<code>miaosou\\</code>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>copilotPrecise</p>
     * </li>
     * <li><p>copilotReference</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>copilotReference</p>
     */
    @NameInMap("GenerateTechnology")
    public String generateTechnology;

    /**
     * <p>The product type. Valid values:</p>
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

    /**
     * <p>The data source configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserConfigDataSourceList")
    public java.util.List<SaveDataSourceOrderConfigRequestUserConfigDataSourceList> userConfigDataSourceList;

    public static SaveDataSourceOrderConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveDataSourceOrderConfigRequest self = new SaveDataSourceOrderConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveDataSourceOrderConfigRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SaveDataSourceOrderConfigRequest setGenerateTechnology(String generateTechnology) {
        this.generateTechnology = generateTechnology;
        return this;
    }
    public String getGenerateTechnology() {
        return this.generateTechnology;
    }

    public SaveDataSourceOrderConfigRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SaveDataSourceOrderConfigRequest setUserConfigDataSourceList(java.util.List<SaveDataSourceOrderConfigRequestUserConfigDataSourceList> userConfigDataSourceList) {
        this.userConfigDataSourceList = userConfigDataSourceList;
        return this;
    }
    public java.util.List<SaveDataSourceOrderConfigRequestUserConfigDataSourceList> getUserConfigDataSourceList() {
        return this.userConfigDataSourceList;
    }

    public static class SaveDataSourceOrderConfigRequestUserConfigDataSourceList extends TeaModel {
        /**
         * <p>Code description</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Specifies whether to enable the data source.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>夸克通用搜索</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Quantity</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>The type of the data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("Type")
        public String type;

        public static SaveDataSourceOrderConfigRequestUserConfigDataSourceList build(java.util.Map<String, ?> map) throws Exception {
            SaveDataSourceOrderConfigRequestUserConfigDataSourceList self = new SaveDataSourceOrderConfigRequestUserConfigDataSourceList();
            return TeaModel.build(map, self);
        }

        public SaveDataSourceOrderConfigRequestUserConfigDataSourceList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SaveDataSourceOrderConfigRequestUserConfigDataSourceList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SaveDataSourceOrderConfigRequestUserConfigDataSourceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SaveDataSourceOrderConfigRequestUserConfigDataSourceList setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public SaveDataSourceOrderConfigRequestUserConfigDataSourceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
