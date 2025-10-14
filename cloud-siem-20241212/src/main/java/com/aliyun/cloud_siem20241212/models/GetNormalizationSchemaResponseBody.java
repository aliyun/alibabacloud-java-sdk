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

    public static class GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields extends TeaModel {
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
         * <p>cloud_user。</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

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

        /**
         * <strong>example:</strong>
         * <p>varchar。</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        public static GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields build(java.util.Map<String, ?> map) throws Exception {
            GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields self = new GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields();
            return TeaModel.build(map, self);
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

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
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

        public GetNormalizationSchemaResponseBodyNormalizationSchemaNormalizationFields setNormalizationFieldType(String normalizationFieldType) {
            this.normalizationFieldType = normalizationFieldType;
            return this;
        }
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

    }

    public static class GetNormalizationSchemaResponseBodyNormalizationSchema extends TeaModel {
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
