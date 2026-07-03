// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationFieldsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether a next query token exists. You do not need to specify this parameter for the first query or if no next query exists. If a next query exists, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of normalization fields.</p>
     */
    @NameInMap("NormalizationFields")
    public java.util.List<ListNormalizationFieldsResponseBodyNormalizationFields> normalizationFields;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
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

    public static class ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the JSON-type normalization field key.</p>
         * 
         * <strong>example:</strong>
         * <p>alert_level</p>
         */
        @NameInMap("NormalizationFieldDescription")
        public String normalizationFieldDescription;

        /**
         * <p>The example value of the JSON-type normalization field key.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NormalizationFieldExample")
        public String normalizationFieldExample;

        /**
         * <p>The source of the normalization field key of the JSON type.</p>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationFieldFrom")
        public String normalizationFieldFrom;

        /**
         * <p>The name of the JSON-type normalization field key.</p>
         * 
         * <strong>example:</strong>
         * <p>alert_level</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

        /**
         * <p>Indicates whether the JSON-type normalization field key is required.</p>
         */
        @NameInMap("NormalizationFieldRequired")
        public Boolean normalizationFieldRequired;

        /**
         * <p>Indicates whether the normalization field key is a built-in system field key.</p>
         */
        @NameInMap("NormalizationFieldReserved")
        public Boolean normalizationFieldReserved;

        /**
         * <p>Indicates whether the JSON-type normalization field key is tokenized.</p>
         */
        @NameInMap("NormalizationFieldTokenize")
        public Boolean normalizationFieldTokenize;

        /**
         * <p>The type of the JSON-type normalization field key.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys build(java.util.Map<String, ?> map) throws Exception {
            ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys self = new ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys();
            return TeaModel.build(map, self);
        }

        public ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldDescription(String normalizationFieldDescription) {
            this.normalizationFieldDescription = normalizationFieldDescription;
            return this;
        }
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldExample(String normalizationFieldExample) {
            this.normalizationFieldExample = normalizationFieldExample;
            return this;
        }
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldFrom(String normalizationFieldFrom) {
            this.normalizationFieldFrom = normalizationFieldFrom;
            return this;
        }
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldRequired(Boolean normalizationFieldRequired) {
            this.normalizationFieldRequired = normalizationFieldRequired;
            return this;
        }
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldReserved(Boolean normalizationFieldReserved) {
            this.normalizationFieldReserved = normalizationFieldReserved;
            return this;
        }
        public Boolean getNormalizationFieldReserved() {
            return this.normalizationFieldReserved;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldTokenize(Boolean normalizationFieldTokenize) {
            this.normalizationFieldTokenize = normalizationFieldTokenize;
            return this;
        }
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldType(String normalizationFieldType) {
            this.normalizationFieldType = normalizationFieldType;
            return this;
        }
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListNormalizationFieldsResponseBodyNormalizationFields extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the normalization category.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY</p>
         */
        @NameInMap("NormalizationCategoryId")
        public String normalizationCategoryId;

        /**
         * <p>The description of the normalization field.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_user</p>
         */
        @NameInMap("NormalizationFieldDescription")
        public String normalizationFieldDescription;

        /**
         * <p>The example value of the normalization field.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        @NameInMap("NormalizationFieldExample")
        public String normalizationFieldExample;

        /**
         * <p>The source of the normalization field key of the JSON type.</p>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationFieldFrom")
        public String normalizationFieldFrom;

        /**
         * <p>Indicates whether indexes are created for all keys of the JSON-type normalization field.</p>
         */
        @NameInMap("NormalizationFieldJsonIndexAll")
        public Boolean normalizationFieldJsonIndexAll;

        /**
         * <p>The list of keys for the JSON-type normalization field.</p>
         */
        @NameInMap("NormalizationFieldJsonKeys")
        public java.util.List<ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys> normalizationFieldJsonKeys;

        /**
         * <p>The name of the normalization field.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_user</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

        /**
         * <p>Indicates whether the normalization field key is required.</p>
         */
        @NameInMap("NormalizationFieldRequired")
        public Boolean normalizationFieldRequired;

        /**
         * <p>Indicates whether the normalization field is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NormalizationFieldRequirement")
        public Boolean normalizationFieldRequirement;

        /**
         * <p>Indicates whether the normalization field is reserved.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NormalizationFieldReserved")
        public Boolean normalizationFieldReserved;

        /**
         * <p>Indicates whether the normalization field is tokenized.</p>
         */
        @NameInMap("NormalizationFieldTokenize")
        public Boolean normalizationFieldTokenize;

        /**
         * <p>The type of the normalization field. Valid values:</p>
         * <ul>
         * <li>varchar</li>
         * <li>bigint</li>
         * <li>double.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        /**
         * <p>The ID of the normalization schema.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_SESSION_ACTIVITY</p>
         */
        @NameInMap("NormalizationSchemaId")
        public String normalizationSchemaId;

        /**
         * <strong>example:</strong>
         * <p>NETWORK_AND_WEB_SECURITY</p>
         */
        @NameInMap("NormalizationSecurityDomainId")
        public String normalizationSecurityDomainId;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListNormalizationFieldsResponseBodyNormalizationFields build(java.util.Map<String, ?> map) throws Exception {
            ListNormalizationFieldsResponseBodyNormalizationFields self = new ListNormalizationFieldsResponseBodyNormalizationFields();
            return TeaModel.build(map, self);
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
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

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldFrom(String normalizationFieldFrom) {
            this.normalizationFieldFrom = normalizationFieldFrom;
            return this;
        }
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldJsonIndexAll(Boolean normalizationFieldJsonIndexAll) {
            this.normalizationFieldJsonIndexAll = normalizationFieldJsonIndexAll;
            return this;
        }
        public Boolean getNormalizationFieldJsonIndexAll() {
            return this.normalizationFieldJsonIndexAll;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldJsonKeys(java.util.List<ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys> normalizationFieldJsonKeys) {
            this.normalizationFieldJsonKeys = normalizationFieldJsonKeys;
            return this;
        }
        public java.util.List<ListNormalizationFieldsResponseBodyNormalizationFieldsNormalizationFieldJsonKeys> getNormalizationFieldJsonKeys() {
            return this.normalizationFieldJsonKeys;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldRequired(Boolean normalizationFieldRequired) {
            this.normalizationFieldRequired = normalizationFieldRequired;
            return this;
        }
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
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

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationFieldTokenize(Boolean normalizationFieldTokenize) {
            this.normalizationFieldTokenize = normalizationFieldTokenize;
            return this;
        }
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
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

        public ListNormalizationFieldsResponseBodyNormalizationFields setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
            this.normalizationSecurityDomainId = normalizationSecurityDomainId;
            return this;
        }
        public String getNormalizationSecurityDomainId() {
            return this.normalizationSecurityDomainId;
        }

        public ListNormalizationFieldsResponseBodyNormalizationFields setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
