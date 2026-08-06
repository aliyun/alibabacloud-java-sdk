// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCrawlerTypeCapabilitiesResponseBody extends TeaModel {
    @NameInMap("CrawlerTypes")
    public java.util.List<GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes> crawlerTypes;

    /**
     * <strong>example:</strong>
     * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCrawlerTypeCapabilitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCrawlerTypeCapabilitiesResponseBody self = new GetCrawlerTypeCapabilitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCrawlerTypeCapabilitiesResponseBody setCrawlerTypes(java.util.List<GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes> crawlerTypes) {
        this.crawlerTypes = crawlerTypes;
        return this;
    }
    public java.util.List<GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes> getCrawlerTypes() {
        return this.crawlerTypes;
    }

    public GetCrawlerTypeCapabilitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCrawlerTypeCapabilitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedEntityTypes extends TeaModel {
        @NameInMap("Optional")
        public Boolean optional;

        /**
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ParentSubType")
        public String parentSubType;

        /**
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <strong>example:</strong>
         * <p>holo</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedEntityTypes build(java.util.Map<String, ?> map) throws Exception {
            GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedEntityTypes self = new GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedEntityTypes();
            return TeaModel.build(map, self);
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedEntityTypes setOptional(Boolean optional) {
            this.optional = optional;
            return this;
        }
        public Boolean getOptional() {
            return this.optional;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedEntityTypes setParentSubType(String parentSubType) {
            this.parentSubType = parentSubType;
            return this;
        }
        public String getParentSubType() {
            return this.parentSubType;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedEntityTypes setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedEntityTypes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys extends TeaModel {
        @NameInMap("AllowedValues")
        public java.util.List<String> allowedValues;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>CollectRecyclebin</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>BOOLEAN</p>
         */
        @NameInMap("ValueType")
        public String valueType;

        public static GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys build(java.util.Map<String, ?> map) throws Exception {
            GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys self = new GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys();
            return TeaModel.build(map, self);
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys setAllowedValues(java.util.List<String> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }
        public java.util.List<String> getAllowedValues() {
            return this.allowedValues;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }
        public String getValueType() {
            return this.valueType;
        }

    }

    public static class GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        @NameInMap("DefaultScopeUnit")
        public String defaultScopeUnit;

        /**
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("RequireResourceGroup")
        public Boolean requireResourceGroup;

        @NameInMap("SupportAiComment")
        public Boolean supportAiComment;

        @NameInMap("SupportExcludeRegex")
        public Boolean supportExcludeRegex;

        @NameInMap("SupportSchedule")
        public Boolean supportSchedule;

        @NameInMap("SupportedDatasourceTypes")
        public java.util.List<String> supportedDatasourceTypes;

        @NameInMap("SupportedEntityTypes")
        public java.util.List<GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedEntityTypes> supportedEntityTypes;

        @NameInMap("SupportedOptionKeys")
        public java.util.List<GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys> supportedOptionKeys;

        @NameInMap("SupportedScopeUnits")
        public java.util.List<String> supportedScopeUnits;

        /**
         * <strong>example:</strong>
         * <p>holo</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes build(java.util.Map<String, ?> map) throws Exception {
            GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes self = new GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes();
            return TeaModel.build(map, self);
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes setDefaultScopeUnit(String defaultScopeUnit) {
            this.defaultScopeUnit = defaultScopeUnit;
            return this;
        }
        public String getDefaultScopeUnit() {
            return this.defaultScopeUnit;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes setRequireResourceGroup(Boolean requireResourceGroup) {
            this.requireResourceGroup = requireResourceGroup;
            return this;
        }
        public Boolean getRequireResourceGroup() {
            return this.requireResourceGroup;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes setSupportAiComment(Boolean supportAiComment) {
            this.supportAiComment = supportAiComment;
            return this;
        }
        public Boolean getSupportAiComment() {
            return this.supportAiComment;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes setSupportExcludeRegex(Boolean supportExcludeRegex) {
            this.supportExcludeRegex = supportExcludeRegex;
            return this;
        }
        public Boolean getSupportExcludeRegex() {
            return this.supportExcludeRegex;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes setSupportSchedule(Boolean supportSchedule) {
            this.supportSchedule = supportSchedule;
            return this;
        }
        public Boolean getSupportSchedule() {
            return this.supportSchedule;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes setSupportedDatasourceTypes(java.util.List<String> supportedDatasourceTypes) {
            this.supportedDatasourceTypes = supportedDatasourceTypes;
            return this;
        }
        public java.util.List<String> getSupportedDatasourceTypes() {
            return this.supportedDatasourceTypes;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes setSupportedEntityTypes(java.util.List<GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedEntityTypes> supportedEntityTypes) {
            this.supportedEntityTypes = supportedEntityTypes;
            return this;
        }
        public java.util.List<GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedEntityTypes> getSupportedEntityTypes() {
            return this.supportedEntityTypes;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes setSupportedOptionKeys(java.util.List<GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys> supportedOptionKeys) {
            this.supportedOptionKeys = supportedOptionKeys;
            return this;
        }
        public java.util.List<GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypesSupportedOptionKeys> getSupportedOptionKeys() {
            return this.supportedOptionKeys;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes setSupportedScopeUnits(java.util.List<String> supportedScopeUnits) {
            this.supportedScopeUnits = supportedScopeUnits;
            return this;
        }
        public java.util.List<String> getSupportedScopeUnits() {
            return this.supportedScopeUnits;
        }

        public GetCrawlerTypeCapabilitiesResponseBodyCrawlerTypes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
