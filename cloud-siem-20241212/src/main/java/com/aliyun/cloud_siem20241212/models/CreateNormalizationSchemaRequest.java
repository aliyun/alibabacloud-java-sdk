// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateNormalizationSchemaRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the normalization classification.</p>
     * 
     * <strong>example:</strong>
     * <p>NETWORK_CATEGORY</p>
     */
    @NameInMap("NormalizationCategoryId")
    public String normalizationCategoryId;

    /**
     * <strong>example:</strong>
     * <p>native</p>
     */
    @NameInMap("NormalizationFieldSource")
    public String normalizationFieldSource;

    /**
     * <p>The normalization fields.</p>
     */
    @NameInMap("NormalizationFields")
    public java.util.List<CreateNormalizationSchemaRequestNormalizationFields> normalizationFields;

    /**
     * <p>The description of the normalization structure.</p>
     * 
     * <strong>example:</strong>
     * <p>ProcessQuery</p>
     */
    @NameInMap("NormalizationSchemaDescription")
    public String normalizationSchemaDescription;

    /**
     * <p>The ID of the normalization structure.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROCESS_QUERY_DNS_ACTIVITY</p>
     */
    @NameInMap("NormalizationSchemaId")
    public String normalizationSchemaId;

    /**
     * <p>The name of the normalization structure.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ProcessQuery</p>
     */
    @NameInMap("NormalizationSchemaName")
    public String normalizationSchemaName;

    /**
     * <p>The type of the normalization structure. Valid values:</p>
     * <ul>
     * <li><p>log: a log</p>
     * </li>
     * <li><p>entity: an entity</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>log</p>
     */
    @NameInMap("NormalizationSchemaType")
    public String normalizationSchemaType;

    /**
     * <strong>example:</strong>
     * <p>NETWORK_AND_WEB_SECURITY</p>
     */
    @NameInMap("NormalizationSecurityDomainId")
    public String normalizationSecurityDomainId;

    /**
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region where the Data Management center for threat analysis is located. Select a region based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: for assets in the Chinese mainland and China (Hong Kong)</p>
     * </li>
     * <li><p>ap-southeast-1: for assets in regions outside China</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. An administrator can use this ID to switch to the member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The Simple Log Service Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-activity</p>
     */
    @NameInMap("TargetLogStore")
    public String targetLogStore;

    /**
     * <strong>example:</strong>
     * <p>alibaba</p>
     */
    @NameInMap("VendorId")
    public String vendorId;

    public static CreateNormalizationSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNormalizationSchemaRequest self = new CreateNormalizationSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreateNormalizationSchemaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateNormalizationSchemaRequest setNormalizationCategoryId(String normalizationCategoryId) {
        this.normalizationCategoryId = normalizationCategoryId;
        return this;
    }
    public String getNormalizationCategoryId() {
        return this.normalizationCategoryId;
    }

    public CreateNormalizationSchemaRequest setNormalizationFieldSource(String normalizationFieldSource) {
        this.normalizationFieldSource = normalizationFieldSource;
        return this;
    }
    public String getNormalizationFieldSource() {
        return this.normalizationFieldSource;
    }

    public CreateNormalizationSchemaRequest setNormalizationFields(java.util.List<CreateNormalizationSchemaRequestNormalizationFields> normalizationFields) {
        this.normalizationFields = normalizationFields;
        return this;
    }
    public java.util.List<CreateNormalizationSchemaRequestNormalizationFields> getNormalizationFields() {
        return this.normalizationFields;
    }

    public CreateNormalizationSchemaRequest setNormalizationSchemaDescription(String normalizationSchemaDescription) {
        this.normalizationSchemaDescription = normalizationSchemaDescription;
        return this;
    }
    public String getNormalizationSchemaDescription() {
        return this.normalizationSchemaDescription;
    }

    public CreateNormalizationSchemaRequest setNormalizationSchemaId(String normalizationSchemaId) {
        this.normalizationSchemaId = normalizationSchemaId;
        return this;
    }
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    public CreateNormalizationSchemaRequest setNormalizationSchemaName(String normalizationSchemaName) {
        this.normalizationSchemaName = normalizationSchemaName;
        return this;
    }
    public String getNormalizationSchemaName() {
        return this.normalizationSchemaName;
    }

    public CreateNormalizationSchemaRequest setNormalizationSchemaType(String normalizationSchemaType) {
        this.normalizationSchemaType = normalizationSchemaType;
        return this;
    }
    public String getNormalizationSchemaType() {
        return this.normalizationSchemaType;
    }

    public CreateNormalizationSchemaRequest setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
        this.normalizationSecurityDomainId = normalizationSecurityDomainId;
        return this;
    }
    public String getNormalizationSecurityDomainId() {
        return this.normalizationSecurityDomainId;
    }

    public CreateNormalizationSchemaRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateNormalizationSchemaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNormalizationSchemaRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public CreateNormalizationSchemaRequest setTargetLogStore(String targetLogStore) {
        this.targetLogStore = targetLogStore;
        return this;
    }
    public String getTargetLogStore() {
        return this.targetLogStore;
    }

    public CreateNormalizationSchemaRequest setVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }
    public String getVendorId() {
        return this.vendorId;
    }

    public static class CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys extends TeaModel {
        /**
         * <p>The description of the key for a normalization field of the json type.</p>
         * 
         * <strong>example:</strong>
         * <p>The alert severity levels are represented by the values 1, 2, 3, and 4.</p>
         */
        @NameInMap("NormalizationFieldDescription")
        public String normalizationFieldDescription;

        /**
         * <p>An example of the key for a normalization field of the json type.</p>
         * 
         * <strong>example:</strong>
         * <p>1, 2, 3, 4</p>
         */
        @NameInMap("NormalizationFieldExample")
        public String normalizationFieldExample;

        /**
         * <p>The source of the key for a normalization field of the json type.</p>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationFieldFrom")
        public String normalizationFieldFrom;

        /**
         * <p>The name of the key for a normalization field of the json type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alert_level</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

        /**
         * <p>Indicates whether the key for a normalization field of the json type is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NormalizationFieldRequired")
        public Boolean normalizationFieldRequired;

        /**
         * <p>Indicates whether to tokenize the key for a normalization field of the json type.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NormalizationFieldTokenize")
        public Boolean normalizationFieldTokenize;

        /**
         * <p>The type of the key for a normalization field of the json type. Supported types: text, long, double, and json.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        public static CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys build(java.util.Map<String, ?> map) throws Exception {
            CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys self = new CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys();
            return TeaModel.build(map, self);
        }

        public CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldDescription(String normalizationFieldDescription) {
            this.normalizationFieldDescription = normalizationFieldDescription;
            return this;
        }
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        public CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldExample(String normalizationFieldExample) {
            this.normalizationFieldExample = normalizationFieldExample;
            return this;
        }
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        public CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldFrom(String normalizationFieldFrom) {
            this.normalizationFieldFrom = normalizationFieldFrom;
            return this;
        }
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        public CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        public CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldRequired(Boolean normalizationFieldRequired) {
            this.normalizationFieldRequired = normalizationFieldRequired;
            return this;
        }
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        public CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldTokenize(Boolean normalizationFieldTokenize) {
            this.normalizationFieldTokenize = normalizationFieldTokenize;
            return this;
        }
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
        }

        public CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldType(String normalizationFieldType) {
            this.normalizationFieldType = normalizationFieldType;
            return this;
        }
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

    }

    public static class CreateNormalizationSchemaRequestNormalizationFields extends TeaModel {
        /**
         * <p>The description of the normalization field.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_user</p>
         */
        @NameInMap("NormalizationFieldDescription")
        public String normalizationFieldDescription;

        /**
         * <p>An example of the normalization field.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        @NameInMap("NormalizationFieldExample")
        public String normalizationFieldExample;

        /**
         * <p>The source of the key for a normalization field of the json type.</p>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationFieldFrom")
        public String normalizationFieldFrom;

        /**
         * <p>Indicates whether to create an index for all keys of a json type normalization field.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NormalizationFieldJsonIndexAll")
        public Boolean normalizationFieldJsonIndexAll;

        /**
         * <p>The list of keys for a normalization field of the json type.</p>
         */
        @NameInMap("NormalizationFieldJsonKeys")
        public java.util.List<CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys> normalizationFieldJsonKeys;

        /**
         * <p>The name of the normalization field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_user</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

        /**
         * <p>Indicates whether the normalization field is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>Indicates whether to tokenize the normalization field.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NormalizationFieldTokenize")
        public Boolean normalizationFieldTokenize;

        /**
         * <p>The type of the normalization field. Supported types: text, long, double, and json.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        public static CreateNormalizationSchemaRequestNormalizationFields build(java.util.Map<String, ?> map) throws Exception {
            CreateNormalizationSchemaRequestNormalizationFields self = new CreateNormalizationSchemaRequestNormalizationFields();
            return TeaModel.build(map, self);
        }

        public CreateNormalizationSchemaRequestNormalizationFields setNormalizationFieldDescription(String normalizationFieldDescription) {
            this.normalizationFieldDescription = normalizationFieldDescription;
            return this;
        }
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        public CreateNormalizationSchemaRequestNormalizationFields setNormalizationFieldExample(String normalizationFieldExample) {
            this.normalizationFieldExample = normalizationFieldExample;
            return this;
        }
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        public CreateNormalizationSchemaRequestNormalizationFields setNormalizationFieldFrom(String normalizationFieldFrom) {
            this.normalizationFieldFrom = normalizationFieldFrom;
            return this;
        }
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        public CreateNormalizationSchemaRequestNormalizationFields setNormalizationFieldJsonIndexAll(Boolean normalizationFieldJsonIndexAll) {
            this.normalizationFieldJsonIndexAll = normalizationFieldJsonIndexAll;
            return this;
        }
        public Boolean getNormalizationFieldJsonIndexAll() {
            return this.normalizationFieldJsonIndexAll;
        }

        public CreateNormalizationSchemaRequestNormalizationFields setNormalizationFieldJsonKeys(java.util.List<CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys> normalizationFieldJsonKeys) {
            this.normalizationFieldJsonKeys = normalizationFieldJsonKeys;
            return this;
        }
        public java.util.List<CreateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys> getNormalizationFieldJsonKeys() {
            return this.normalizationFieldJsonKeys;
        }

        public CreateNormalizationSchemaRequestNormalizationFields setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        public CreateNormalizationSchemaRequestNormalizationFields setNormalizationFieldRequired(Boolean normalizationFieldRequired) {
            this.normalizationFieldRequired = normalizationFieldRequired;
            return this;
        }
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        public CreateNormalizationSchemaRequestNormalizationFields setNormalizationFieldRequirement(Boolean normalizationFieldRequirement) {
            this.normalizationFieldRequirement = normalizationFieldRequirement;
            return this;
        }
        public Boolean getNormalizationFieldRequirement() {
            return this.normalizationFieldRequirement;
        }

        public CreateNormalizationSchemaRequestNormalizationFields setNormalizationFieldReserved(Boolean normalizationFieldReserved) {
            this.normalizationFieldReserved = normalizationFieldReserved;
            return this;
        }
        public Boolean getNormalizationFieldReserved() {
            return this.normalizationFieldReserved;
        }

        public CreateNormalizationSchemaRequestNormalizationFields setNormalizationFieldTokenize(Boolean normalizationFieldTokenize) {
            this.normalizationFieldTokenize = normalizationFieldTokenize;
            return this;
        }
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
        }

        public CreateNormalizationSchemaRequestNormalizationFields setNormalizationFieldType(String normalizationFieldType) {
            this.normalizationFieldType = normalizationFieldType;
            return this;
        }
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

    }

}
