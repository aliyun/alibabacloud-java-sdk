// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDeviceFormsResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("DeviceForms")
    public java.util.List<ListDeviceFormsResponseBodyDeviceForms> deviceForms;

    // 每页数量。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDeviceFormsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceFormsResponseBody self = new ListDeviceFormsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceFormsResponseBody setDeviceForms(java.util.List<ListDeviceFormsResponseBodyDeviceForms> deviceForms) {
        this.deviceForms = deviceForms;
        return this;
    }
    public java.util.List<ListDeviceFormsResponseBodyDeviceForms> getDeviceForms() {
        return this.deviceForms;
    }

    public ListDeviceFormsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeviceFormsResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListDeviceFormsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceFormsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDeviceFormsResponseBodyDeviceFormsAttributeList extends TeaModel {
        // 设备形态属性是否内置
        @NameInMap("AttributeBuiltIn")
        public Boolean attributeBuiltIn;

        // 设备形态属性值格式
        @NameInMap("AttributeFormat")
        public String attributeFormat;

        // 前端查询控件是否支持模糊搜索
        @NameInMap("AttributeFuzzyQuery")
        public Boolean attributeFuzzyQuery;

        // 设备形态属性主键
        @NameInMap("AttributeKey")
        public String attributeKey;

        // 设备形态属性名称
        @NameInMap("AttributeName")
        public String attributeName;

        // 前端查询控件占位符
        @NameInMap("AttributePlaceholder")
        public String attributePlaceholder;

        // 前端是否展示对应的查询控件
        @NameInMap("AttributeQuery")
        public Boolean attributeQuery;

        // 设备形态属性关联对象
        @NameInMap("AttributeReference")
        public String attributeReference;

        // 设备形态属性是否必填
        @NameInMap("AttributeRequirement")
        public Boolean attributeRequirement;

        // 设备形态属性是否表格可见
        @NameInMap("AttributeTableDisplay")
        public Boolean attributeTableDisplay;

        // 设备形态属性值类型
        @NameInMap("AttributeType")
        public String attributeType;

        // 设备形态属性是否唯一
        @NameInMap("AttributeUniqueness")
        public Boolean attributeUniqueness;

        public static ListDeviceFormsResponseBodyDeviceFormsAttributeList build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceFormsResponseBodyDeviceFormsAttributeList self = new ListDeviceFormsResponseBodyDeviceFormsAttributeList();
            return TeaModel.build(map, self);
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeBuiltIn(Boolean attributeBuiltIn) {
            this.attributeBuiltIn = attributeBuiltIn;
            return this;
        }
        public Boolean getAttributeBuiltIn() {
            return this.attributeBuiltIn;
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeFormat(String attributeFormat) {
            this.attributeFormat = attributeFormat;
            return this;
        }
        public String getAttributeFormat() {
            return this.attributeFormat;
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeFuzzyQuery(Boolean attributeFuzzyQuery) {
            this.attributeFuzzyQuery = attributeFuzzyQuery;
            return this;
        }
        public Boolean getAttributeFuzzyQuery() {
            return this.attributeFuzzyQuery;
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeKey(String attributeKey) {
            this.attributeKey = attributeKey;
            return this;
        }
        public String getAttributeKey() {
            return this.attributeKey;
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributePlaceholder(String attributePlaceholder) {
            this.attributePlaceholder = attributePlaceholder;
            return this;
        }
        public String getAttributePlaceholder() {
            return this.attributePlaceholder;
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeQuery(Boolean attributeQuery) {
            this.attributeQuery = attributeQuery;
            return this;
        }
        public Boolean getAttributeQuery() {
            return this.attributeQuery;
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeReference(String attributeReference) {
            this.attributeReference = attributeReference;
            return this;
        }
        public String getAttributeReference() {
            return this.attributeReference;
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeRequirement(Boolean attributeRequirement) {
            this.attributeRequirement = attributeRequirement;
            return this;
        }
        public Boolean getAttributeRequirement() {
            return this.attributeRequirement;
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeTableDisplay(Boolean attributeTableDisplay) {
            this.attributeTableDisplay = attributeTableDisplay;
            return this;
        }
        public Boolean getAttributeTableDisplay() {
            return this.attributeTableDisplay;
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeType(String attributeType) {
            this.attributeType = attributeType;
            return this;
        }
        public String getAttributeType() {
            return this.attributeType;
        }

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeUniqueness(Boolean attributeUniqueness) {
            this.attributeUniqueness = attributeUniqueness;
            return this;
        }
        public Boolean getAttributeUniqueness() {
            return this.attributeUniqueness;
        }

    }

    public static class ListDeviceFormsResponseBodyDeviceForms extends TeaModel {
        // 是否需要账号配置
        @NameInMap("AccountConfig")
        public Boolean accountConfig;

        // 设备形态属性列表
        @NameInMap("AttributeList")
        public java.util.List<ListDeviceFormsResponseBodyDeviceFormsAttributeList> attributeList;

        // 是否支持配置生成
        @NameInMap("ConfigCompare")
        public Boolean configCompare;

        // 是否展示详情
        @NameInMap("DetailDisplay")
        public Boolean detailDisplay;

        // 设备形态ID
        @NameInMap("DeviceFormId")
        public String deviceFormId;

        // 设备形态名称
        @NameInMap("DeviceFormName")
        public String deviceFormName;

        // 设备形态是否内置
        @NameInMap("FormBuiltIn")
        public Boolean formBuiltIn;

        // 关联设备形态ID
        @NameInMap("RelatedDeviceFormId")
        public String relatedDeviceFormId;

        // 资源用途
        @NameInMap("ResourceUse")
        public String resourceUse;

        // 设备代码
        @NameInMap("Script")
        public String script;

        // 设备形态主键
        @NameInMap("UniqueKey")
        public String uniqueKey;

        public static ListDeviceFormsResponseBodyDeviceForms build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceFormsResponseBodyDeviceForms self = new ListDeviceFormsResponseBodyDeviceForms();
            return TeaModel.build(map, self);
        }

        public ListDeviceFormsResponseBodyDeviceForms setAccountConfig(Boolean accountConfig) {
            this.accountConfig = accountConfig;
            return this;
        }
        public Boolean getAccountConfig() {
            return this.accountConfig;
        }

        public ListDeviceFormsResponseBodyDeviceForms setAttributeList(java.util.List<ListDeviceFormsResponseBodyDeviceFormsAttributeList> attributeList) {
            this.attributeList = attributeList;
            return this;
        }
        public java.util.List<ListDeviceFormsResponseBodyDeviceFormsAttributeList> getAttributeList() {
            return this.attributeList;
        }

        public ListDeviceFormsResponseBodyDeviceForms setConfigCompare(Boolean configCompare) {
            this.configCompare = configCompare;
            return this;
        }
        public Boolean getConfigCompare() {
            return this.configCompare;
        }

        public ListDeviceFormsResponseBodyDeviceForms setDetailDisplay(Boolean detailDisplay) {
            this.detailDisplay = detailDisplay;
            return this;
        }
        public Boolean getDetailDisplay() {
            return this.detailDisplay;
        }

        public ListDeviceFormsResponseBodyDeviceForms setDeviceFormId(String deviceFormId) {
            this.deviceFormId = deviceFormId;
            return this;
        }
        public String getDeviceFormId() {
            return this.deviceFormId;
        }

        public ListDeviceFormsResponseBodyDeviceForms setDeviceFormName(String deviceFormName) {
            this.deviceFormName = deviceFormName;
            return this;
        }
        public String getDeviceFormName() {
            return this.deviceFormName;
        }

        public ListDeviceFormsResponseBodyDeviceForms setFormBuiltIn(Boolean formBuiltIn) {
            this.formBuiltIn = formBuiltIn;
            return this;
        }
        public Boolean getFormBuiltIn() {
            return this.formBuiltIn;
        }

        public ListDeviceFormsResponseBodyDeviceForms setRelatedDeviceFormId(String relatedDeviceFormId) {
            this.relatedDeviceFormId = relatedDeviceFormId;
            return this;
        }
        public String getRelatedDeviceFormId() {
            return this.relatedDeviceFormId;
        }

        public ListDeviceFormsResponseBodyDeviceForms setResourceUse(String resourceUse) {
            this.resourceUse = resourceUse;
            return this;
        }
        public String getResourceUse() {
            return this.resourceUse;
        }

        public ListDeviceFormsResponseBodyDeviceForms setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public ListDeviceFormsResponseBodyDeviceForms setUniqueKey(String uniqueKey) {
            this.uniqueKey = uniqueKey;
            return this;
        }
        public String getUniqueKey() {
            return this.uniqueKey;
        }

    }

}
