// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateSchemaResponseBodyResult result;

    public static UpdateSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemaResponseBody self = new UpdateSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSchemaResponseBody setResult(UpdateSchemaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateSchemaResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateSchemaResponseBodyResultResponsesPropertiesDataSource extends TeaModel {
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

        public static UpdateSchemaResponseBodyResultResponsesPropertiesDataSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateSchemaResponseBodyResultResponsesPropertiesDataSource self = new UpdateSchemaResponseBodyResultResponsesPropertiesDataSource();
            return TeaModel.build(map, self);
        }

        public UpdateSchemaResponseBodyResultResponsesPropertiesDataSource setAllowNull(Integer allowNull) {
            this.allowNull = allowNull;
            return this;
        }
        public Integer getAllowNull() {
            return this.allowNull;
        }

        public UpdateSchemaResponseBodyResultResponsesPropertiesDataSource setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public UpdateSchemaResponseBodyResultResponsesPropertiesDataSource setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public UpdateSchemaResponseBodyResultResponsesPropertiesDataSource setIndexes(Integer indexes) {
            this.indexes = indexes;
            return this;
        }
        public Integer getIndexes() {
            return this.indexes;
        }

        public UpdateSchemaResponseBodyResultResponsesPropertiesDataSource setKey(Integer key) {
            this.key = key;
            return this;
        }
        public Integer getKey() {
            return this.key;
        }

        public UpdateSchemaResponseBodyResultResponsesPropertiesDataSource setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public UpdateSchemaResponseBodyResultResponsesPropertiesDataSource setReg(String reg) {
            this.reg = reg;
            return this;
        }
        public String getReg() {
            return this.reg;
        }

        public UpdateSchemaResponseBodyResultResponsesPropertiesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateSchemaResponseBodyResultResponsesProperties extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("DataSource")
        public java.util.List<UpdateSchemaResponseBodyResultResponsesPropertiesDataSource> dataSource;

        public static UpdateSchemaResponseBodyResultResponsesProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateSchemaResponseBodyResultResponsesProperties self = new UpdateSchemaResponseBodyResultResponsesProperties();
            return TeaModel.build(map, self);
        }

        public UpdateSchemaResponseBodyResultResponsesProperties setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public UpdateSchemaResponseBodyResultResponsesProperties setDataSource(java.util.List<UpdateSchemaResponseBodyResultResponsesPropertiesDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<UpdateSchemaResponseBodyResultResponsesPropertiesDataSource> getDataSource() {
            return this.dataSource;
        }

    }

    public static class UpdateSchemaResponseBodyResultResponses extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Properties")
        public UpdateSchemaResponseBodyResultResponsesProperties properties;

        public static UpdateSchemaResponseBodyResultResponses build(java.util.Map<String, ?> map) throws Exception {
            UpdateSchemaResponseBodyResultResponses self = new UpdateSchemaResponseBodyResultResponses();
            return TeaModel.build(map, self);
        }

        public UpdateSchemaResponseBodyResultResponses setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public UpdateSchemaResponseBodyResultResponses setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public UpdateSchemaResponseBodyResultResponses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateSchemaResponseBodyResultResponses setProperties(UpdateSchemaResponseBodyResultResponsesProperties properties) {
            this.properties = properties;
            return this;
        }
        public UpdateSchemaResponseBodyResultResponsesProperties getProperties() {
            return this.properties;
        }

    }

    public static class UpdateSchemaResponseBodyResultSchema extends TeaModel {
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

        public static UpdateSchemaResponseBodyResultSchema build(java.util.Map<String, ?> map) throws Exception {
            UpdateSchemaResponseBodyResultSchema self = new UpdateSchemaResponseBodyResultSchema();
            return TeaModel.build(map, self);
        }

        public UpdateSchemaResponseBodyResultSchema setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateSchemaResponseBodyResultSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateSchemaResponseBodyResultSchema setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateSchemaResponseBodyResultSchema setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public UpdateSchemaResponseBodyResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSchemaResponseBodyResultSchema setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public UpdateSchemaResponseBodyResultSchema setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class UpdateSchemaResponseBodyResult extends TeaModel {
        @NameInMap("Responses")
        public java.util.List<UpdateSchemaResponseBodyResultResponses> responses;

        @NameInMap("Schema")
        public UpdateSchemaResponseBodyResultSchema schema;

        public static UpdateSchemaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateSchemaResponseBodyResult self = new UpdateSchemaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateSchemaResponseBodyResult setResponses(java.util.List<UpdateSchemaResponseBodyResultResponses> responses) {
            this.responses = responses;
            return this;
        }
        public java.util.List<UpdateSchemaResponseBodyResultResponses> getResponses() {
            return this.responses;
        }

        public UpdateSchemaResponseBodyResult setSchema(UpdateSchemaResponseBodyResultSchema schema) {
            this.schema = schema;
            return this;
        }
        public UpdateSchemaResponseBodyResultSchema getSchema() {
            return this.schema;
        }

    }

}
