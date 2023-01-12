// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCommodityResponseBody extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("CommodityName")
    public String commodityName;

    @NameInMap("Components")
    public java.util.List<DescribeCommodityResponseBodyComponents> components;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCommodityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommodityResponseBody self = new DescribeCommodityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommodityResponseBody setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeCommodityResponseBody setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

    public DescribeCommodityResponseBody setComponents(java.util.List<DescribeCommodityResponseBodyComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<DescribeCommodityResponseBodyComponents> getComponents() {
        return this.components;
    }

    public DescribeCommodityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCommodityResponseBodyComponentsPropertiesPropertyValueList extends TeaModel {
        @NameInMap("OrderIndex")
        public Long orderIndex;

        @NameInMap("Text")
        public String text;

        @NameInMap("Tips")
        public String tips;

        @NameInMap("Value")
        public String value;

        public static DescribeCommodityResponseBodyComponentsPropertiesPropertyValueList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityResponseBodyComponentsPropertiesPropertyValueList self = new DescribeCommodityResponseBodyComponentsPropertiesPropertyValueList();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityResponseBodyComponentsPropertiesPropertyValueList setOrderIndex(Long orderIndex) {
            this.orderIndex = orderIndex;
            return this;
        }
        public Long getOrderIndex() {
            return this.orderIndex;
        }

        public DescribeCommodityResponseBodyComponentsPropertiesPropertyValueList setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribeCommodityResponseBodyComponentsPropertiesPropertyValueList setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public DescribeCommodityResponseBodyComponentsPropertiesPropertyValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCommodityResponseBodyComponentsProperties extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        @NameInMap("PropertyValueList")
        public java.util.List<DescribeCommodityResponseBodyComponentsPropertiesPropertyValueList> propertyValueList;

        public static DescribeCommodityResponseBodyComponentsProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityResponseBodyComponentsProperties self = new DescribeCommodityResponseBodyComponentsProperties();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityResponseBodyComponentsProperties setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeCommodityResponseBodyComponentsProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCommodityResponseBodyComponentsProperties setPropertyValueList(java.util.List<DescribeCommodityResponseBodyComponentsPropertiesPropertyValueList> propertyValueList) {
            this.propertyValueList = propertyValueList;
            return this;
        }
        public java.util.List<DescribeCommodityResponseBodyComponentsPropertiesPropertyValueList> getPropertyValueList() {
            return this.propertyValueList;
        }

    }

    public static class DescribeCommodityResponseBodyComponents extends TeaModel {
        @NameInMap("ComponentCode")
        public String componentCode;

        @NameInMap("ComponentName")
        public String componentName;

        @NameInMap("Properties")
        public java.util.List<DescribeCommodityResponseBodyComponentsProperties> properties;

        public static DescribeCommodityResponseBodyComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommodityResponseBodyComponents self = new DescribeCommodityResponseBodyComponents();
            return TeaModel.build(map, self);
        }

        public DescribeCommodityResponseBodyComponents setComponentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }
        public String getComponentCode() {
            return this.componentCode;
        }

        public DescribeCommodityResponseBodyComponents setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public DescribeCommodityResponseBodyComponents setProperties(java.util.List<DescribeCommodityResponseBodyComponentsProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<DescribeCommodityResponseBodyComponentsProperties> getProperties() {
            return this.properties;
        }

    }

}
