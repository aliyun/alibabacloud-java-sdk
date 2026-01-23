// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("QualityTemplateInfo")
    public GetQualityTemplateResponseBodyQualityTemplateInfo qualityTemplateInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetQualityTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityTemplateResponseBody self = new GetQualityTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityTemplateResponseBody setQualityTemplateInfo(GetQualityTemplateResponseBodyQualityTemplateInfo qualityTemplateInfo) {
        this.qualityTemplateInfo = qualityTemplateInfo;
        return this;
    }
    public GetQualityTemplateResponseBodyQualityTemplateInfo getQualityTemplateInfo() {
        return this.qualityTemplateInfo;
    }

    public GetQualityTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>expression</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <strong>example:</strong>
         * <p>col</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList self = new GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList();
            return TeaModel.build(map, self);
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetQualityTemplateResponseBodyQualityTemplateInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONSISTENT</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <strong>example:</strong>
         * <p>一致性</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("FormPropertyList")
        public java.util.List<GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList> formPropertyList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IsSystemTemplate")
        public Boolean isSystemTemplate;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ModifierName")
        public String modifierName;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("SupportAllDataSourceType")
        public Boolean supportAllDataSourceType;

        @NameInMap("SupportDataSourceTypeList")
        public java.util.List<String> supportDataSourceTypeList;

        /**
         * <strong>example:</strong>
         * <p>FIELD_NULL_VALUE_VALIDATE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>字段空值校验</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        public static GetQualityTemplateResponseBodyQualityTemplateInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityTemplateResponseBodyQualityTemplateInfo self = new GetQualityTemplateResponseBodyQualityTemplateInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setFormPropertyList(java.util.List<GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList> formPropertyList) {
            this.formPropertyList = formPropertyList;
            return this;
        }
        public java.util.List<GetQualityTemplateResponseBodyQualityTemplateInfoFormPropertyList> getFormPropertyList() {
            return this.formPropertyList;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setIsSystemTemplate(Boolean isSystemTemplate) {
            this.isSystemTemplate = isSystemTemplate;
            return this;
        }
        public Boolean getIsSystemTemplate() {
            return this.isSystemTemplate;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setSupportAllDataSourceType(Boolean supportAllDataSourceType) {
            this.supportAllDataSourceType = supportAllDataSourceType;
            return this;
        }
        public Boolean getSupportAllDataSourceType() {
            return this.supportAllDataSourceType;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setSupportDataSourceTypeList(java.util.List<String> supportDataSourceTypeList) {
            this.supportDataSourceTypeList = supportDataSourceTypeList;
            return this;
        }
        public java.util.List<String> getSupportDataSourceTypeList() {
            return this.supportDataSourceTypeList;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQualityTemplateResponseBodyQualityTemplateInfo setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
