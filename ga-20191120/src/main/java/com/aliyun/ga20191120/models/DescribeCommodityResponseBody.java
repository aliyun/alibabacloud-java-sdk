// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCommodityResponseBody extends TeaModel {
    /**
     * <p>The commodity code.</p>
     * <p>Examples for the China site (aliyun.com):</p>
     * <ul>
     * <li><strong>ga_gapluspre_public_cn</strong>: GA instance.</li>
     * <li><strong>ga_plusbwppre_public_cn</strong>: basic bandwidth plan.</li>
     * </ul>
     * <p>Examples for the international site (alibabacloud.com):</p>
     * <ul>
     * <li><strong>ga_pluspre_public_intl</strong>: GA instance.</li>
     * <li><strong>ga_bwppreintl_public_intl</strong>: basic bandwidth plan.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ga_gapluspre_public_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The name of the commodity.</p>
     * 
     * <strong>example:</strong>
     * <p>Global Accelerator_Instance Type (Subscription)</p>
     */
    @NameInMap("CommodityName")
    public String commodityName;

    /**
     * <p>The information about the commodity modules.</p>
     * <p>The returned information varies based on the commodity.</p>
     */
    @NameInMap("Components")
    public java.util.List<DescribeCommodityResponseBodyComponents> components;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
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
        /**
         * <p>The sequence number of the attribute.</p>
         * <p>The returned information varies based on the commodity module.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderIndex")
        public Long orderIndex;

        /**
         * <p>The content of the attribute.</p>
         * <p>The returned information varies based on the commodity module.</p>
         * 
         * <strong>example:</strong>
         * <p>1 Month</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The message of the attribute.</p>
         * <p>The returned information varies based on the commodity module.</p>
         * 
         * <strong>example:</strong>
         * <p>1 Month</p>
         */
        @NameInMap("Tips")
        public String tips;

        /**
         * <p>The value of the attribute.</p>
         * <p>The returned information varies based on the commodity module.</p>
         * 
         * <strong>example:</strong>
         * <p>1:Month</p>
         */
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
        /**
         * <p>The code of the attribute.</p>
         * <p>The returned information varies based on the commodity module.</p>
         * 
         * <strong>example:</strong>
         * <p>ord_time</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the attribute.</p>
         * <p>The returned information varies based on the commodity module.</p>
         * 
         * <strong>example:</strong>
         * <p>Duration</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of attribute values of the commodity module.</p>
         * <p>The returned information varies based on the commodity module.</p>
         */
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
        /**
         * <p>The code of the commodity module.</p>
         * <p>The returned information varies based on the commodity module.</p>
         * 
         * <strong>example:</strong>
         * <p>Duration</p>
         */
        @NameInMap("ComponentCode")
        public String componentCode;

        /**
         * <p>The name of the commodity module.</p>
         * <p>The returned information varies based on the commodity module.</p>
         * 
         * <strong>example:</strong>
         * <p>Duration</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The attributes of the commodity module.</p>
         * <p>The returned information varies based on the commodity module.</p>
         */
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
