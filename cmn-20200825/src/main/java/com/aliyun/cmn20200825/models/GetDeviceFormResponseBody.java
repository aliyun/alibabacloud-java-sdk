// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceFormResponseBody extends TeaModel {
    @NameInMap("DeviceForm")
    public GetDeviceFormResponseBodyDeviceForm deviceForm;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceFormResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceFormResponseBody self = new GetDeviceFormResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceFormResponseBody setDeviceForm(GetDeviceFormResponseBodyDeviceForm deviceForm) {
        this.deviceForm = deviceForm;
        return this;
    }
    public GetDeviceFormResponseBodyDeviceForm getDeviceForm() {
        return this.deviceForm;
    }

    public GetDeviceFormResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceFormResponseBodyDeviceFormAttributeList extends TeaModel {
        /**
         * <p>内置属性不可修改和删除</p>
         */
        @NameInMap("AttributeBuiltIn")
        public Boolean attributeBuiltIn;

        /**
         * <p>设备形态属性值格式</p>
         */
        @NameInMap("AttributeFormat")
        public String attributeFormat;

        /**
         * <p>前端查询控件是否支持模糊搜索</p>
         */
        @NameInMap("AttributeFuzzyQuery")
        public Boolean attributeFuzzyQuery;

        /**
         * <p>设备形态属性主键</p>
         */
        @NameInMap("AttributeKey")
        public String attributeKey;

        /**
         * <p>设备形态属性名称</p>
         */
        @NameInMap("AttributeName")
        public String attributeName;

        /**
         * <p>前端查询控件占位符</p>
         */
        @NameInMap("AttributePlaceholder")
        public String attributePlaceholder;

        /**
         * <p>前端是否展示对应的查询控件</p>
         */
        @NameInMap("AttributeQuery")
        public Boolean attributeQuery;

        /**
         * <p>设备形态属性关联对象</p>
         */
        @NameInMap("AttributeReference")
        public String attributeReference;

        /**
         * <p>设备形态属性是否必填</p>
         */
        @NameInMap("AttributeRequirement")
        public Boolean attributeRequirement;

        @NameInMap("AttributeSequence")
        public Integer attributeSequence;

        /**
         * <p>设备形态属性是否表格可见</p>
         */
        @NameInMap("AttributeTableDisplay")
        public Boolean attributeTableDisplay;

        /**
         * <p>设备形态属性值类型</p>
         */
        @NameInMap("AttributeType")
        public String attributeType;

        /**
         * <p>设备形态属性是否唯一</p>
         */
        @NameInMap("AttributeUniqueness")
        public Boolean attributeUniqueness;

        public static GetDeviceFormResponseBodyDeviceFormAttributeList build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceFormResponseBodyDeviceFormAttributeList self = new GetDeviceFormResponseBodyDeviceFormAttributeList();
            return TeaModel.build(map, self);
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeBuiltIn(Boolean attributeBuiltIn) {
            this.attributeBuiltIn = attributeBuiltIn;
            return this;
        }
        public Boolean getAttributeBuiltIn() {
            return this.attributeBuiltIn;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeFormat(String attributeFormat) {
            this.attributeFormat = attributeFormat;
            return this;
        }
        public String getAttributeFormat() {
            return this.attributeFormat;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeFuzzyQuery(Boolean attributeFuzzyQuery) {
            this.attributeFuzzyQuery = attributeFuzzyQuery;
            return this;
        }
        public Boolean getAttributeFuzzyQuery() {
            return this.attributeFuzzyQuery;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeKey(String attributeKey) {
            this.attributeKey = attributeKey;
            return this;
        }
        public String getAttributeKey() {
            return this.attributeKey;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributePlaceholder(String attributePlaceholder) {
            this.attributePlaceholder = attributePlaceholder;
            return this;
        }
        public String getAttributePlaceholder() {
            return this.attributePlaceholder;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeQuery(Boolean attributeQuery) {
            this.attributeQuery = attributeQuery;
            return this;
        }
        public Boolean getAttributeQuery() {
            return this.attributeQuery;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeReference(String attributeReference) {
            this.attributeReference = attributeReference;
            return this;
        }
        public String getAttributeReference() {
            return this.attributeReference;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeRequirement(Boolean attributeRequirement) {
            this.attributeRequirement = attributeRequirement;
            return this;
        }
        public Boolean getAttributeRequirement() {
            return this.attributeRequirement;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeSequence(Integer attributeSequence) {
            this.attributeSequence = attributeSequence;
            return this;
        }
        public Integer getAttributeSequence() {
            return this.attributeSequence;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeTableDisplay(Boolean attributeTableDisplay) {
            this.attributeTableDisplay = attributeTableDisplay;
            return this;
        }
        public Boolean getAttributeTableDisplay() {
            return this.attributeTableDisplay;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeType(String attributeType) {
            this.attributeType = attributeType;
            return this;
        }
        public String getAttributeType() {
            return this.attributeType;
        }

        public GetDeviceFormResponseBodyDeviceFormAttributeList setAttributeUniqueness(Boolean attributeUniqueness) {
            this.attributeUniqueness = attributeUniqueness;
            return this;
        }
        public Boolean getAttributeUniqueness() {
            return this.attributeUniqueness;
        }

    }

    public static class GetDeviceFormResponseBodyDeviceForm extends TeaModel {
        /**
         * <p>是否需要账号配置</p>
         */
        @NameInMap("AccountConfig")
        public Boolean accountConfig;

        /**
         * <p>设备形态属性列表</p>
         */
        @NameInMap("AttributeList")
        public java.util.List<GetDeviceFormResponseBodyDeviceFormAttributeList> attributeList;

        /**
         * <p>是否支持配置生成</p>
         */
        @NameInMap("ConfigCompare")
        public Boolean configCompare;

        @NameInMap("DetailDisplay")
        public Boolean detailDisplay;

        /**
         * <p>设备形态ID</p>
         */
        @NameInMap("DeviceFormId")
        public String deviceFormId;

        /**
         * <p>设备形态名称</p>
         */
        @NameInMap("DeviceFormName")
        public String deviceFormName;

        /**
         * <p>内置形态不可修改和删除</p>
         */
        @NameInMap("FormBuiltIn")
        public Boolean formBuiltIn;

        @NameInMap("ResourceUse")
        public String resourceUse;

        @NameInMap("Script")
        public String script;

        @NameInMap("UniqueKey")
        public String uniqueKey;

        public static GetDeviceFormResponseBodyDeviceForm build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceFormResponseBodyDeviceForm self = new GetDeviceFormResponseBodyDeviceForm();
            return TeaModel.build(map, self);
        }

        public GetDeviceFormResponseBodyDeviceForm setAccountConfig(Boolean accountConfig) {
            this.accountConfig = accountConfig;
            return this;
        }
        public Boolean getAccountConfig() {
            return this.accountConfig;
        }

        public GetDeviceFormResponseBodyDeviceForm setAttributeList(java.util.List<GetDeviceFormResponseBodyDeviceFormAttributeList> attributeList) {
            this.attributeList = attributeList;
            return this;
        }
        public java.util.List<GetDeviceFormResponseBodyDeviceFormAttributeList> getAttributeList() {
            return this.attributeList;
        }

        public GetDeviceFormResponseBodyDeviceForm setConfigCompare(Boolean configCompare) {
            this.configCompare = configCompare;
            return this;
        }
        public Boolean getConfigCompare() {
            return this.configCompare;
        }

        public GetDeviceFormResponseBodyDeviceForm setDetailDisplay(Boolean detailDisplay) {
            this.detailDisplay = detailDisplay;
            return this;
        }
        public Boolean getDetailDisplay() {
            return this.detailDisplay;
        }

        public GetDeviceFormResponseBodyDeviceForm setDeviceFormId(String deviceFormId) {
            this.deviceFormId = deviceFormId;
            return this;
        }
        public String getDeviceFormId() {
            return this.deviceFormId;
        }

        public GetDeviceFormResponseBodyDeviceForm setDeviceFormName(String deviceFormName) {
            this.deviceFormName = deviceFormName;
            return this;
        }
        public String getDeviceFormName() {
            return this.deviceFormName;
        }

        public GetDeviceFormResponseBodyDeviceForm setFormBuiltIn(Boolean formBuiltIn) {
            this.formBuiltIn = formBuiltIn;
            return this;
        }
        public Boolean getFormBuiltIn() {
            return this.formBuiltIn;
        }

        public GetDeviceFormResponseBodyDeviceForm setResourceUse(String resourceUse) {
            this.resourceUse = resourceUse;
            return this;
        }
        public String getResourceUse() {
            return this.resourceUse;
        }

        public GetDeviceFormResponseBodyDeviceForm setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetDeviceFormResponseBodyDeviceForm setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

    }

}
