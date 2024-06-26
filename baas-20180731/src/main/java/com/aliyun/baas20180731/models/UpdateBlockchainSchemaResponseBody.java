// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateBlockchainSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateBlockchainSchemaResponseBodyResult result;

    public static UpdateBlockchainSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlockchainSchemaResponseBody self = new UpdateBlockchainSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBlockchainSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBlockchainSchemaResponseBody setResult(UpdateBlockchainSchemaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateBlockchainSchemaResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource extends TeaModel {
        @NameInMap("AllowNull")
        public Integer allowNull;

        @NameInMap("Annotation")
        public String annotation;

        @NameInMap("Field")
        public String field;

        @NameInMap("Indexes")
        public Integer indexes;

        @NameInMap("Key")
        public Integer key;

        @NameInMap("Length")
        public Integer length;

        @NameInMap("Reg")
        public String reg;

        @NameInMap("Type")
        public String type;

        public static UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource self = new UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource();
            return TeaModel.build(map, self);
        }

        public UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setAllowNull(Integer allowNull) {
            this.allowNull = allowNull;
            return this;
        }
        public Integer getAllowNull() {
            return this.allowNull;
        }

        public UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setIndexes(Integer indexes) {
            this.indexes = indexes;
            return this;
        }
        public Integer getIndexes() {
            return this.indexes;
        }

        public UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setKey(Integer key) {
            this.key = key;
            return this;
        }
        public Integer getKey() {
            return this.key;
        }

        public UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setReg(String reg) {
            this.reg = reg;
            return this;
        }
        public String getReg() {
            return this.reg;
        }

        public UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateBlockchainSchemaResponseBodyResultResponsesProperties extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("DataSource")
        public java.util.List<UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource> dataSource;

        public static UpdateBlockchainSchemaResponseBodyResultResponsesProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateBlockchainSchemaResponseBodyResultResponsesProperties self = new UpdateBlockchainSchemaResponseBodyResultResponsesProperties();
            return TeaModel.build(map, self);
        }

        public UpdateBlockchainSchemaResponseBodyResultResponsesProperties setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public UpdateBlockchainSchemaResponseBodyResultResponsesProperties setDataSource(java.util.List<UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<UpdateBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource> getDataSource() {
            return this.dataSource;
        }

    }

    public static class UpdateBlockchainSchemaResponseBodyResultResponses extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Properties")
        public UpdateBlockchainSchemaResponseBodyResultResponsesProperties properties;

        public static UpdateBlockchainSchemaResponseBodyResultResponses build(java.util.Map<String, ?> map) throws Exception {
            UpdateBlockchainSchemaResponseBodyResultResponses self = new UpdateBlockchainSchemaResponseBodyResultResponses();
            return TeaModel.build(map, self);
        }

        public UpdateBlockchainSchemaResponseBodyResultResponses setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public UpdateBlockchainSchemaResponseBodyResultResponses setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public UpdateBlockchainSchemaResponseBodyResultResponses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateBlockchainSchemaResponseBodyResultResponses setProperties(UpdateBlockchainSchemaResponseBodyResultResponsesProperties properties) {
            this.properties = properties;
            return this;
        }
        public UpdateBlockchainSchemaResponseBodyResultResponsesProperties getProperties() {
            return this.properties;
        }

    }

    public static class UpdateBlockchainSchemaResponseBodyResultSchema extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("Name")
        public String name;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Version")
        public Long version;

        public static UpdateBlockchainSchemaResponseBodyResultSchema build(java.util.Map<String, ?> map) throws Exception {
            UpdateBlockchainSchemaResponseBodyResultSchema self = new UpdateBlockchainSchemaResponseBodyResultSchema();
            return TeaModel.build(map, self);
        }

        public UpdateBlockchainSchemaResponseBodyResultSchema setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateBlockchainSchemaResponseBodyResultSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateBlockchainSchemaResponseBodyResultSchema setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateBlockchainSchemaResponseBodyResultSchema setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public UpdateBlockchainSchemaResponseBodyResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateBlockchainSchemaResponseBodyResultSchema setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public UpdateBlockchainSchemaResponseBodyResultSchema setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class UpdateBlockchainSchemaResponseBodyResult extends TeaModel {
        @NameInMap("Responses")
        public java.util.List<UpdateBlockchainSchemaResponseBodyResultResponses> responses;

        @NameInMap("Schema")
        public UpdateBlockchainSchemaResponseBodyResultSchema schema;

        public static UpdateBlockchainSchemaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateBlockchainSchemaResponseBodyResult self = new UpdateBlockchainSchemaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateBlockchainSchemaResponseBodyResult setResponses(java.util.List<UpdateBlockchainSchemaResponseBodyResultResponses> responses) {
            this.responses = responses;
            return this;
        }
        public java.util.List<UpdateBlockchainSchemaResponseBodyResultResponses> getResponses() {
            return this.responses;
        }

        public UpdateBlockchainSchemaResponseBodyResult setSchema(UpdateBlockchainSchemaResponseBodyResultSchema schema) {
            this.schema = schema;
            return this;
        }
        public UpdateBlockchainSchemaResponseBodyResultSchema getSchema() {
            return this.schema;
        }

    }

}
