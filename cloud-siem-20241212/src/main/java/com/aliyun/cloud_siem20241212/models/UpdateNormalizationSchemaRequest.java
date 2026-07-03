// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateNormalizationSchemaRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The normalization fields.</p>
     */
    @NameInMap("NormalizationFields")
    public java.util.List<UpdateNormalizationSchemaRequestNormalizationFields> normalizationFields;

    /**
     * <p>The normalization schema description.</p>
     * 
     * <strong>example:</strong>
     * <p>ProcessQuery</p>
     */
    @NameInMap("NormalizationSchemaDescription")
    public String normalizationSchemaDescription;

    /**
     * <p>The normalization schema ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WAF_ALERT_ACTIVITY</p>
     */
    @NameInMap("NormalizationSchemaId")
    public String normalizationSchemaId;

    /**
     * <p>The normalization schema name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ProcessQuery</p>
     */
    @NameInMap("NormalizationSchemaName")
    public String normalizationSchemaName;

    /**
     * <p>The normalization schema type. Valid values:</p>
     * <ul>
     * <li>log: Log.</li>
     * <li>entity: Entity.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>log</p>
     */
    @NameInMap("NormalizationSchemaType")
    public String normalizationSchemaType;

    /**
     * <p>The region where the threat analysis data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static UpdateNormalizationSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNormalizationSchemaRequest self = new UpdateNormalizationSchemaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNormalizationSchemaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateNormalizationSchemaRequest setNormalizationFields(java.util.List<UpdateNormalizationSchemaRequestNormalizationFields> normalizationFields) {
        this.normalizationFields = normalizationFields;
        return this;
    }
    public java.util.List<UpdateNormalizationSchemaRequestNormalizationFields> getNormalizationFields() {
        return this.normalizationFields;
    }

    public UpdateNormalizationSchemaRequest setNormalizationSchemaDescription(String normalizationSchemaDescription) {
        this.normalizationSchemaDescription = normalizationSchemaDescription;
        return this;
    }
    public String getNormalizationSchemaDescription() {
        return this.normalizationSchemaDescription;
    }

    public UpdateNormalizationSchemaRequest setNormalizationSchemaId(String normalizationSchemaId) {
        this.normalizationSchemaId = normalizationSchemaId;
        return this;
    }
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    public UpdateNormalizationSchemaRequest setNormalizationSchemaName(String normalizationSchemaName) {
        this.normalizationSchemaName = normalizationSchemaName;
        return this;
    }
    public String getNormalizationSchemaName() {
        return this.normalizationSchemaName;
    }

    public UpdateNormalizationSchemaRequest setNormalizationSchemaType(String normalizationSchemaType) {
        this.normalizationSchemaType = normalizationSchemaType;
        return this;
    }
    public String getNormalizationSchemaType() {
        return this.normalizationSchemaType;
    }

    public UpdateNormalizationSchemaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateNormalizationSchemaRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static class UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys extends TeaModel {
        /**
         * <p>The key description of the JSON-type normalization field.</p>
         * 
         * <strong>example:</strong>
         * <p>alert level</p>
         */
        @NameInMap("NormalizationFieldDescription")
        public String normalizationFieldDescription;

        /**
         * <p>The key example of the JSON-type normalization field.</p>
         * 
         * <strong>example:</strong>
         * <p>Enum values: 1, 2, 3, 4, 5</p>
         */
        @NameInMap("NormalizationFieldExample")
        public String normalizationFieldExample;

        /**
         * <p>The key source of the JSON-type normalization field.</p>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationFieldFrom")
        public String normalizationFieldFrom;

        /**
         * <p>The key name of the JSON-type normalization field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alert_name</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

        /**
         * <p>Specifies whether the key of the JSON-type normalization field is required.</p>
         */
        @NameInMap("NormalizationFieldRequired")
        public Boolean normalizationFieldRequired;

        /**
         * <p>Specifies whether the key of the JSON-type normalization field is tokenized.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NormalizationFieldTokenize")
        public Boolean normalizationFieldTokenize;

        /**
         * <p>The key type of the JSON-type normalization field. Valid values: text, long, double, and json.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        public static UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys build(java.util.Map<String, ?> map) throws Exception {
            UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys self = new UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys();
            return TeaModel.build(map, self);
        }

        public UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldDescription(String normalizationFieldDescription) {
            this.normalizationFieldDescription = normalizationFieldDescription;
            return this;
        }
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        public UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldExample(String normalizationFieldExample) {
            this.normalizationFieldExample = normalizationFieldExample;
            return this;
        }
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        public UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldFrom(String normalizationFieldFrom) {
            this.normalizationFieldFrom = normalizationFieldFrom;
            return this;
        }
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        public UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        public UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldRequired(Boolean normalizationFieldRequired) {
            this.normalizationFieldRequired = normalizationFieldRequired;
            return this;
        }
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        public UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldTokenize(Boolean normalizationFieldTokenize) {
            this.normalizationFieldTokenize = normalizationFieldTokenize;
            return this;
        }
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
        }

        public UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys setNormalizationFieldType(String normalizationFieldType) {
            this.normalizationFieldType = normalizationFieldType;
            return this;
        }
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

    }

    public static class UpdateNormalizationSchemaRequestNormalizationFields extends TeaModel {
        /**
         * <p>The normalization field description.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_user</p>
         */
        @NameInMap("NormalizationFieldDescription")
        public String normalizationFieldDescription;

        /**
         * <p>The normalization field example.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        @NameInMap("NormalizationFieldExample")
        public String normalizationFieldExample;

        /**
         * <p>The key source of the JSON-type normalization field.</p>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationFieldFrom")
        public String normalizationFieldFrom;

        /**
         * <p>Specifies whether indexes are created for all keys of the JSON-type normalization field.</p>
         */
        @NameInMap("NormalizationFieldJsonIndexAll")
        public Boolean normalizationFieldJsonIndexAll;

        /**
         * <p>The key list of the JSON-type normalization field.</p>
         */
        @NameInMap("NormalizationFieldJsonKeys")
        public java.util.List<UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys> normalizationFieldJsonKeys;

        /**
         * <p>The normalization field name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_user</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

        /**
         * <p>Specifies whether the normalization field is required.</p>
         */
        @NameInMap("NormalizationFieldRequired")
        public Boolean normalizationFieldRequired;

        /**
         * <p>Specifies whether the normalization field is tokenized.</p>
         */
        @NameInMap("NormalizationFieldTokenize")
        public Boolean normalizationFieldTokenize;

        /**
         * <p>The normalization field type. Valid values: text, long, double, and json.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        public static UpdateNormalizationSchemaRequestNormalizationFields build(java.util.Map<String, ?> map) throws Exception {
            UpdateNormalizationSchemaRequestNormalizationFields self = new UpdateNormalizationSchemaRequestNormalizationFields();
            return TeaModel.build(map, self);
        }

        public UpdateNormalizationSchemaRequestNormalizationFields setNormalizationFieldDescription(String normalizationFieldDescription) {
            this.normalizationFieldDescription = normalizationFieldDescription;
            return this;
        }
        public String getNormalizationFieldDescription() {
            return this.normalizationFieldDescription;
        }

        public UpdateNormalizationSchemaRequestNormalizationFields setNormalizationFieldExample(String normalizationFieldExample) {
            this.normalizationFieldExample = normalizationFieldExample;
            return this;
        }
        public String getNormalizationFieldExample() {
            return this.normalizationFieldExample;
        }

        public UpdateNormalizationSchemaRequestNormalizationFields setNormalizationFieldFrom(String normalizationFieldFrom) {
            this.normalizationFieldFrom = normalizationFieldFrom;
            return this;
        }
        public String getNormalizationFieldFrom() {
            return this.normalizationFieldFrom;
        }

        public UpdateNormalizationSchemaRequestNormalizationFields setNormalizationFieldJsonIndexAll(Boolean normalizationFieldJsonIndexAll) {
            this.normalizationFieldJsonIndexAll = normalizationFieldJsonIndexAll;
            return this;
        }
        public Boolean getNormalizationFieldJsonIndexAll() {
            return this.normalizationFieldJsonIndexAll;
        }

        public UpdateNormalizationSchemaRequestNormalizationFields setNormalizationFieldJsonKeys(java.util.List<UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys> normalizationFieldJsonKeys) {
            this.normalizationFieldJsonKeys = normalizationFieldJsonKeys;
            return this;
        }
        public java.util.List<UpdateNormalizationSchemaRequestNormalizationFieldsNormalizationFieldJsonKeys> getNormalizationFieldJsonKeys() {
            return this.normalizationFieldJsonKeys;
        }

        public UpdateNormalizationSchemaRequestNormalizationFields setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        public UpdateNormalizationSchemaRequestNormalizationFields setNormalizationFieldRequired(Boolean normalizationFieldRequired) {
            this.normalizationFieldRequired = normalizationFieldRequired;
            return this;
        }
        public Boolean getNormalizationFieldRequired() {
            return this.normalizationFieldRequired;
        }

        public UpdateNormalizationSchemaRequestNormalizationFields setNormalizationFieldTokenize(Boolean normalizationFieldTokenize) {
            this.normalizationFieldTokenize = normalizationFieldTokenize;
            return this;
        }
        public Boolean getNormalizationFieldTokenize() {
            return this.normalizationFieldTokenize;
        }

        public UpdateNormalizationSchemaRequestNormalizationFields setNormalizationFieldType(String normalizationFieldType) {
            this.normalizationFieldType = normalizationFieldType;
            return this;
        }
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

    }

}
