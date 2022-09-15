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
        @NameInMap("componentReleaseName")
        public String componentReleaseName;

        @NameInMap("componentVersionUID")
        public String componentVersionUID;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("parentComponentReleaseName")
        public String parentComponentReleaseName;

        @NameInMap("parentComponentVersionUID")
        public String parentComponentVersionUID;

        @NameInMap("scope")
        public String scope;

        @NameInMap("value")
        public String value;

        @NameInMap("valueType")
        public String valueType;

        public static BatchAddProductVersionConfigRequestProductVersionConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchAddProductVersionConfigRequestProductVersionConfigList self = new BatchAddProductVersionConfigRequestProductVersionConfigList();
            return TeaModel.build(map, self);
        }

        public BatchAddProductVersionConfigRequestProductVersionConfigList setComponentReleaseName(String componentReleaseName) {
            this.componentReleaseName = componentReleaseName;
            return this;
        }
        public String getComponentReleaseName() {
            return this.componentReleaseName;
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

        public BatchAddProductVersionConfigRequestProductVersionConfigList setParentComponentReleaseName(String parentComponentReleaseName) {
            this.parentComponentReleaseName = parentComponentReleaseName;
            return this;
        }
        public String getParentComponentReleaseName() {
            return this.parentComponentReleaseName;
        }

        public BatchAddProductVersionConfigRequestProductVersionConfigList setParentComponentVersionUID(String parentComponentVersionUID) {
            this.parentComponentVersionUID = parentComponentVersionUID;
            return this;
        }
        public String getParentComponentVersionUID() {
            return this.parentComponentVersionUID;
        }

        public BatchAddProductVersionConfigRequestProductVersionConfigList setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
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
