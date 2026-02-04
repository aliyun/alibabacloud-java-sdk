// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetNormalizationSchemaResponseBody extends TeaModel {
    @NameInMap("NormalizationSchema")
    public GetNormalizationSchemaResponseBodyNormalizationSchema normalizationSchema;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNormalizationSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNormalizationSchemaResponseBody self = new GetNormalizationSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNormalizationSchemaResponseBody setNormalizationSchema(GetNormalizationSchemaResponseBodyNormalizationSchema normalizationSchema) {
        this.normalizationSchema = normalizationSchema;
        return this;
    }
    public GetNormalizationSchemaResponseBodyNormalizationSchema getNormalizationSchema() {
        return this.normalizationSchema;
    }

    public GetNormalizationSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>云code，枚举值：\n<br>● alibaba_cloud\n<br>● huawei_cloud\n<br>● tencent_cloud</p>
         */
        @NameInMap("NormalizationFieldDescription")
        public String normalizationFieldDescription;

        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("NormalizationFieldExample")
        public String normalizationFieldExample;

        /**
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationFieldFrom")
        public String normalizationFieldFrom;

        /**
         * <strong>example:</strong>
         * <p>cloud_code</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

        @NameInMap("NormalizationFieldRequired")
        public Boolean normalizationFieldRequired;

        @NameInMap("NormalizationFieldReserved")
        public Boolean normalizationFieldReserved;

        @NameInMap("NormalizationFieldTokenize")
        public Boolean normalizationFieldTokenize;

        /**
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        /**
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys build(java.util.Map<String, ?> map) throws Exception {
            GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys self = new GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys();
            return TeaModel.build(map, self);
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldDescription(String normalizationFieldDescription) {
            this.normalizationFieldDescription = normalizationFieldDescription;
            return this;
        }
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldExample(String normalizationFieldExample) {
            this.normalizationFieldExample = normalizationFieldExample;
            return this;
        }
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldFrom(String normalizationFieldFrom) {
            this.normalizationFieldFrom = normalizationFieldFrom;
            return this;
        }
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldRequired(Boolean normalizationFieldRequired) {
            this.normalizationFieldRequired = normalizationFieldRequired;
            return this;
        }
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldReserved(Boolean normalizationFieldReserved) {
            this.normalizationFieldReserved = normalizationFieldReserved;
            return this;
        }
        public Boolean getNormalizationFieldReserved() {
            return this.normalizationFieldReserved;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldTokenize(Boolean normalizationFieldTokenize) {
            this.normalizationFieldTokenize = normalizationFieldTokenize;
            return this;
        }
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldType(String normalizationFieldType) {
            this.normalizationFieldType = normalizationFieldType;
            return this;
        }
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>cloud_user。</p>
         */
        @NameInMap("NormalizationFieldDescription")
        public String normalizationFieldDescription;

        /**
         * <strong>example:</strong>
         * <p>173326*******。</p>
         */
        @NameInMap("NormalizationFieldExample")
        public String normalizationFieldExample;

        /**
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationFieldFrom")
        public String normalizationFieldFrom;

        @NameInMap("NormalizationFieldJsonIndexAll")
        public Boolean normalizationFieldJsonIndexAll;

        @NameInMap("NormalizationFieldJsonKeys")
        public java.util.List<GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys> normalizationFieldJsonKeys;

        /**
         * <strong>example:</strong>
         * <p>cloud_user。</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

        @NameInMap("NormalizationFieldRequired")
        public Boolean normalizationFieldRequired;

        /**
         * <strong>example:</strong>
         * <p>true。</p>
         */
        @NameInMap("NormalizationFieldRequirement")
        public Boolean normalizationFieldRequirement;

        /**
         * <strong>example:</strong>
         * <p>true。</p>
         */
        @NameInMap("NormalizationFieldReserved")
        public Boolean normalizationFieldReserved;

        @NameInMap("NormalizationFieldTokenize")
        public Boolean normalizationFieldTokenize;

        /**
         * <strong>example:</strong>
         * <p>varchar。</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        /**
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields build(java.util.Map<String, ?> map) throws Exception {
            GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields self = new GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields();
            return TeaModel.build(map, self);
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldDescription(String normalizationFieldDescription) {
            this.normalizationFieldDescription = normalizationFieldDescription;
            return this;
        }
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldExample(String normalizationFieldExample) {
            this.normalizationFieldExample = normalizationFieldExample;
            return this;
        }
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldFrom(String normalizationFieldFrom) {
            this.normalizationFieldFrom = normalizationFieldFrom;
            return this;
        }
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldJsonIndexAll(Boolean normalizationFieldJsonIndexAll) {
            this.normalizationFieldJsonIndexAll = normalizationFieldJsonIndexAll;
            return this;
        }
        public Boolean getNormalizationFieldJsonIndexAll() {
            return this.normalizationFieldJsonIndexAll;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldJsonKeys(java.util.List<GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys> normalizationFieldJsonKeys) {
            this.normalizationFieldJsonKeys = normalizationFieldJsonKeys;
            return this;
        }
        public java.util.List<GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFieldsNormalizationFieldJsonKeys> getNormalizationFieldJsonKeys() {
            return this.normalizationFieldJsonKeys;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldRequired(Boolean normalizationFieldRequired) {
            this.normalizationFieldRequired = normalizationFieldRequired;
            return this;
        }
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldRequirement(Boolean normalizationFieldRequirement) {
            this.normalizationFieldRequirement = normalizationFieldRequirement;
            return this;
        }
        public Boolean getNormalizationFieldRequirement() {
            return this.normalizationFieldRequirement;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldReserved(Boolean normalizationFieldReserved) {
            this.normalizationFieldReserved = normalizationFieldReserved;
            return this;
        }
        public Boolean getNormalizationFieldReserved() {
            return this.normalizationFieldReserved;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldTokenize(Boolean normalizationFieldTokenize) {
            this.normalizationFieldTokenize = normalizationFieldTokenize;
            return this;
        }
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldType(String normalizationFieldType) {
            this.normalizationFieldType = normalizationFieldType;
            return this;
        }
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationSchemaReferences extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud_cfw_flow_rule</p>
         */
        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        public static GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationSchemaReferences build(java.util.Map<String, ?> map) throws Exception {
            GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationSchemaReferences self = new GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationSchemaReferences();
            return TeaModel.build(map, self);
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationSchemaReferences setNormalizationRuleId(String normalizationRuleId) {
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

    }

    public static class GetNormalizationSchemaResponseBodyNormalizationSchema extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY。</p>
         */
        @NameInMap("NormalizationCategoryId")
        public String normalizationCategoryId;

        @NameInMap("NormalizationFields")
        public java.util.List<GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields> normalizationFields;

        /**
         * <strong>example:</strong>
         * <p>网络五元组日志</p>
         */
        @NameInMap("NormalizationSchemaDescription")
        public String normalizationSchemaDescription;

        /**
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationSchemaFrom")
        public String normalizationSchemaFrom;

        /**
         * <strong>example:</strong>
         * <p>HTTP_ACTIVITY。</p>
         */
        @NameInMap("NormalizationSchemaId")
        public String normalizationSchemaId;

        /**
         * <strong>example:</strong>
         * <p>normalization_rule_Z57np。</p>
         */
        @NameInMap("NormalizationSchemaName")
        public String normalizationSchemaName;

        @NameInMap("NormalizationSchemaReferences")
        public java.util.List<GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationSchemaReferences> normalizationSchemaReferences;

        /**
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationSchemaType")
        public String normalizationSchemaType;

        /**
         * <strong>example:</strong>
         * <p>network-activity。</p>
         */
        @NameInMap("TargetLogStore")
        public String targetLogStore;

        /**
         * <strong>example:</strong>
         * <p>network_activity。</p>
         */
        @NameInMap("TargetStoreView")
        public String targetStoreView;

        /**
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetNormalizationSchemaResponseBodyNormalizationSchema build(java.util.Map<String, ?> map) throws Exception {
            GetNormalizationSchemaResponseBodyNormalizationSchema self = new GetNormalizationSchemaResponseBodyNormalizationSchema();
            return TeaModel.build(map, self);
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setNormalizationCategoryId(String normalizationCategoryId) {
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setNormalizationFields(java.util.List<GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields> normalizationFields) {
            this.normalizationFields = normalizationFields;
            return this;
        }
        public java.util.List<GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields> getNormalizationFields() {
            return this.normalizationFields;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setNormalizationSchemaDescription(String normalizationSchemaDescription) {
            this.normalizationSchemaDescription = normalizationSchemaDescription;
            return this;
        }
        public String getNormalizationSchemaDescription() {
            return this.normalizationSchemaDescription;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setNormalizationSchemaFrom(String normalizationSchemaFrom) {
            this.normalizationSchemaFrom = normalizationSchemaFrom;
            return this;
        }
        public String getNormalizationSchemaFrom() {
            return this.normalizationSchemaFrom;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setNormalizationSchemaId(String normalizationSchemaId) {
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setNormalizationSchemaName(String normalizationSchemaName) {
            this.normalizationSchemaName = normalizationSchemaName;
            return this;
        }
        public String getNormalizationSchemaName() {
            return this.normalizationSchemaName;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setNormalizationSchemaReferences(java.util.List<GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationSchemaReferences> normalizationSchemaReferences) {
            this.normalizationSchemaReferences = normalizationSchemaReferences;
            return this;
        }
        public java.util.List<GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationSchemaReferences> getNormalizationSchemaReferences() {
            return this.normalizationSchemaReferences;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setNormalizationSchemaType(String normalizationSchemaType) {
            this.normalizationSchemaType = normalizationSchemaType;
            return this;
        }
        public String getNormalizationSchemaType() {
            return this.normalizationSchemaType;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setTargetLogStore(String targetLogStore) {
            this.targetLogStore = targetLogStore;
            return this;
        }
        public String getTargetLogStore() {
            return this.targetLogStore;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setTargetStoreView(String targetStoreView) {
            this.targetStoreView = targetStoreView;
            return this;
        }
        public String getTargetStoreView() {
            return this.targetStoreView;
        }

        public GetNormalizationSchemaResponseBodyNormalizationSchema setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
