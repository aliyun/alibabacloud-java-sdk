// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationFieldsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("NormalizationFields")
    public java.util.List<ListNormalizationFieldsResponseBodyNormalizationFields> normalizationFields;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>57。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNormalizationFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationFieldsResponseBody self = new ListNormalizationFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNormalizationFieldsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNormalizationFieldsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNormalizationFieldsResponseBody setNormalizationFields(java.util.List<ListNormalizationFieldsResponseBodyNormalizationFields> normalizationFields) {
        this.normalizationFields = normalizationFields;
        return this;
    }
    public java.util.List<ListNormalizationFieldsResponseBodyNormalizationFields> getNormalizationFields() {
        return this.normalizationFields;
    }

    public ListNormalizationFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNormalizationFieldsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNormalizationFieldsResponseBodyNormalizationFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY。</p>
         */
        @NameInMap("NormalizationCategoryId")
        public String normalizationCategoryId;

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

        /**
         * <strong>example:</strong>
         * <p>NETWORK_SESSION_ACTIVITY。</p>
         */
        @NameInMap("NormalizationSchemaId")
        public String normalizationSchemaId;

        public static ListNormalizationFieldsResponseBodyNormalizationFields build(java.util.Map<String, ?> map) throws Exception {
            ListNormalizationFieldsResponseBodyNormalizationFields self = new ListNormalizationFieldsResponseBodyNormalizationFields();
            return TeaModel.build(map, self);
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationCategoryId(String normalizationCategoryId) {
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldDescription(String normalizationFieldDescription) {
            this.normalizationFieldDescription = normalizationFieldDescription;
            return this;
        }
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldExample(String normalizationFieldExample) {
            this.normalizationFieldExample = normalizationFieldExample;
            return this;
        }
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldRequirement(Boolean normalizationFieldRequirement) {
            this.normalizationFieldRequirement = normalizationFieldRequirement;
            return this;
        }
        public Boolean getNormalizationFieldRequirement() {
            return this.normalizationFieldRequirement;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldReserved(Boolean normalizationFieldReserved) {
            this.normalizationFieldReserved = normalizationFieldReserved;
            return this;
        }
        public Boolean getNormalizationFieldReserved() {
            return this.normalizationFieldReserved;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldType(String normalizationFieldType) {
            this.normalizationFieldType = normalizationFieldType;
            return this;
        }
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationSchemaId(String normalizationSchemaId) {
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

    }

}
