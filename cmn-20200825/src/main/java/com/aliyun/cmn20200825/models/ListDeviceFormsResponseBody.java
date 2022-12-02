// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDeviceFormsResponseBody extends TeaModel {
    @NameInMap("DeviceForms")
    public java.util.List<ListDeviceFormsResponseBodyDeviceForms> deviceForms;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AttributeBuiltIn")
        public Boolean attributeBuiltIn;

        @NameInMap("AttributeContent")
        public String attributeContent;

        @NameInMap("AttributeFormat")
        public String attributeFormat;

        @NameInMap("AttributeFuzzyQuery")
        public Boolean attributeFuzzyQuery;

        @NameInMap("AttributeKey")
        public String attributeKey;

        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributePlaceholder")
        public String attributePlaceholder;

        @NameInMap("AttributeQuery")
        public Boolean attributeQuery;

        @NameInMap("AttributeReference")
        public String attributeReference;

        @NameInMap("AttributeRequirement")
        public Boolean attributeRequirement;

        @NameInMap("AttributeSequence")
        public Integer attributeSequence;

        @NameInMap("AttributeTableDisplay")
        public Boolean attributeTableDisplay;

        @NameInMap("AttributeType")
        public String attributeType;

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

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeContent(String attributeContent) {
            this.attributeContent = attributeContent;
            return this;
        }
        public String getAttributeContent() {
            return this.attributeContent;
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

        public ListDeviceFormsResponseBodyDeviceFormsAttributeList setAttributeSequence(Integer attributeSequence) {
            this.attributeSequence = attributeSequence;
            return this;
        }
        public Integer getAttributeSequence() {
            return this.attributeSequence;
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
        @NameInMap("AccountConfig")
        public Boolean accountConfig;

        @NameInMap("AttributeList")
        public java.util.List<ListDeviceFormsResponseBodyDeviceFormsAttributeList> attributeList;

        @NameInMap("ConfigCompare")
        public Boolean configCompare;

        @NameInMap("DetailDisplay")
        public Boolean detailDisplay;

        @NameInMap("DeviceFormId")
        public String deviceFormId;

        @NameInMap("DeviceFormName")
        public String deviceFormName;

        @NameInMap("FormBuiltIn")
        public Boolean formBuiltIn;

        @NameInMap("RelatedDeviceFormId")
        public String relatedDeviceFormId;

        @NameInMap("ResourceUse")
        public String resourceUse;

        @NameInMap("Script")
        public String script;

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
