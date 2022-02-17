// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class BatchAddProductVersionConfigRequest extends TeaModel {
    @NameInMap("productVersionConfigList")
    public java.util.List<BatchAddProductVersionConfigRequestProductVersionConfigList> productVersionConfigList;

    public static BatchAddProductVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddProductVersionConfigRequest self = new BatchAddProductVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddProductVersionConfigRequest setProductVersionConfigList(java.util.List<BatchAddProductVersionConfigRequestProductVersionConfigList> productVersionConfigList) {
        this.productVersionConfigList = productVersionConfigList;
        return this;
    }
    public java.util.List<BatchAddProductVersionConfigRequestProductVersionConfigList> getProductVersionConfigList() {
        return this.productVersionConfigList;
    }

    public static class BatchAddProductVersionConfigRequestProductVersionConfigList extends TeaModel {
        // 组件uid
        @NameInMap("componentVersionUID")
        public String componentVersionUID;

        // 配置说明
        @NameInMap("description")
        public String description;

        // 配置信息key
        @NameInMap("name")
        public String name;

        // 父组件uid
        @NameInMap("parentComponentVersionUID")
        public String parentComponentVersionUID;

        // 配置信息value
        @NameInMap("value")
        public String value;

        @NameInMap("valueType")
        public String valueType;

        public static BatchAddProductVersionConfigRequestProductVersionConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchAddProductVersionConfigRequestProductVersionConfigList self = new BatchAddProductVersionConfigRequestProductVersionConfigList();
            return TeaModel.build(map, self);
        }

        public BatchAddProductVersionConfigRequestProductVersionConfigList setComponentVersionUID(String componentVersionUID) {
            this.componentVersionUID = componentVersionUID;
            return this;
        }
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        public BatchAddProductVersionConfigRequestProductVersionConfigList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchAddProductVersionConfigRequestProductVersionConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchAddProductVersionConfigRequestProductVersionConfigList setParentComponentVersionUID(String parentComponentVersionUID) {
            this.parentComponentVersionUID = parentComponentVersionUID;
            return this;
        }
        public String getParentComponentVersionUID() {
            return this.parentComponentVersionUID;
        }

        public BatchAddProductVersionConfigRequestProductVersionConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public BatchAddProductVersionConfigRequestProductVersionConfigList setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

}
