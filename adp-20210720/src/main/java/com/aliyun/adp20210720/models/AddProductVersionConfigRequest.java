// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddProductVersionConfigRequest extends TeaModel {
    @NameInMap("componentVersionUID")
    public String componentVersionUID;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("parentComponentVersionUID")
    public String parentComponentVersionUID;

    @NameInMap("value")
    public String value;

    @NameInMap("valueType")
    public String valueType;

    public static AddProductVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductVersionConfigRequest self = new AddProductVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddProductVersionConfigRequest setComponentVersionUID(String componentVersionUID) {
        this.componentVersionUID = componentVersionUID;
        return this;
    }
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    public AddProductVersionConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddProductVersionConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddProductVersionConfigRequest setParentComponentVersionUID(String parentComponentVersionUID) {
        this.parentComponentVersionUID = parentComponentVersionUID;
        return this;
    }
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

    public AddProductVersionConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AddProductVersionConfigRequest setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

    public static class BatchAddProductVersionConfigRequestProductVersionConfigList extends TeaModel {
        @NameInMap("componentVersionUID")
        public String componentVersionUID;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("parentComponentVersionUID")
        public String parentComponentVersionUID;

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
