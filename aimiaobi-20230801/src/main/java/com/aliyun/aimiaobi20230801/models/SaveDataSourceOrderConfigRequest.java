// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveDataSourceOrderConfigRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ProductCode")
    public String productCode;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        @NameInMap("Number")
        public Integer number;

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
