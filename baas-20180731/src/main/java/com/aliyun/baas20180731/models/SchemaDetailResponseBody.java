// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class SchemaDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public SchemaDetailResponseBodyResult result;

    public static SchemaDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SchemaDetailResponseBody self = new SchemaDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public SchemaDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SchemaDetailResponseBody setResult(SchemaDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SchemaDetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class SchemaDetailResponseBodyResultResponsesPropertiesDataSource extends TeaModel {
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

        public static SchemaDetailResponseBodyResultResponsesPropertiesDataSource build(java.util.Map<String, ?> map) throws Exception {
            SchemaDetailResponseBodyResultResponsesPropertiesDataSource self = new SchemaDetailResponseBodyResultResponsesPropertiesDataSource();
            return TeaModel.build(map, self);
        }

        public SchemaDetailResponseBodyResultResponsesPropertiesDataSource setAllowNull(Integer allowNull) {
            this.allowNull = allowNull;
            return this;
        }
        public Integer getAllowNull() {
            return this.allowNull;
        }

        public SchemaDetailResponseBodyResultResponsesPropertiesDataSource setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public SchemaDetailResponseBodyResultResponsesPropertiesDataSource setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SchemaDetailResponseBodyResultResponsesPropertiesDataSource setIndexes(Integer indexes) {
            this.indexes = indexes;
            return this;
        }
        public Integer getIndexes() {
            return this.indexes;
        }

        public SchemaDetailResponseBodyResultResponsesPropertiesDataSource setKey(Integer key) {
            this.key = key;
            return this;
        }
        public Integer getKey() {
            return this.key;
        }

        public SchemaDetailResponseBodyResultResponsesPropertiesDataSource setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public SchemaDetailResponseBodyResultResponsesPropertiesDataSource setReg(String reg) {
            this.reg = reg;
            return this;
        }
        public String getReg() {
            return this.reg;
        }

        public SchemaDetailResponseBodyResultResponsesPropertiesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SchemaDetailResponseBodyResultResponsesProperties extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("DataSource")
        public java.util.List<SchemaDetailResponseBodyResultResponsesPropertiesDataSource> dataSource;

        public static SchemaDetailResponseBodyResultResponsesProperties build(java.util.Map<String, ?> map) throws Exception {
            SchemaDetailResponseBodyResultResponsesProperties self = new SchemaDetailResponseBodyResultResponsesProperties();
            return TeaModel.build(map, self);
        }

        public SchemaDetailResponseBodyResultResponsesProperties setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public SchemaDetailResponseBodyResultResponsesProperties setDataSource(java.util.List<SchemaDetailResponseBodyResultResponsesPropertiesDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<SchemaDetailResponseBodyResultResponsesPropertiesDataSource> getDataSource() {
            return this.dataSource;
        }

    }

    public static class SchemaDetailResponseBodyResultResponses extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Properties")
        public SchemaDetailResponseBodyResultResponsesProperties properties;

        public static SchemaDetailResponseBodyResultResponses build(java.util.Map<String, ?> map) throws Exception {
            SchemaDetailResponseBodyResultResponses self = new SchemaDetailResponseBodyResultResponses();
            return TeaModel.build(map, self);
        }

        public SchemaDetailResponseBodyResultResponses setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SchemaDetailResponseBodyResultResponses setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public SchemaDetailResponseBodyResultResponses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SchemaDetailResponseBodyResultResponses setProperties(SchemaDetailResponseBodyResultResponsesProperties properties) {
            this.properties = properties;
            return this;
        }
        public SchemaDetailResponseBodyResultResponsesProperties getProperties() {
            return this.properties;
        }

    }

    public static class SchemaDetailResponseBodyResultSchema extends TeaModel {
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

        public static SchemaDetailResponseBodyResultSchema build(java.util.Map<String, ?> map) throws Exception {
            SchemaDetailResponseBodyResultSchema self = new SchemaDetailResponseBodyResultSchema();
            return TeaModel.build(map, self);
        }

        public SchemaDetailResponseBodyResultSchema setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SchemaDetailResponseBodyResultSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SchemaDetailResponseBodyResultSchema setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SchemaDetailResponseBodyResultSchema setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public SchemaDetailResponseBodyResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SchemaDetailResponseBodyResultSchema setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SchemaDetailResponseBodyResultSchema setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class SchemaDetailResponseBodyResult extends TeaModel {
        @NameInMap("Responses")
        public java.util.List<SchemaDetailResponseBodyResultResponses> responses;

        @NameInMap("Schema")
        public SchemaDetailResponseBodyResultSchema schema;

        public static SchemaDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SchemaDetailResponseBodyResult self = new SchemaDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SchemaDetailResponseBodyResult setResponses(java.util.List<SchemaDetailResponseBodyResultResponses> responses) {
            this.responses = responses;
            return this;
        }
        public java.util.List<SchemaDetailResponseBodyResultResponses> getResponses() {
            return this.responses;
        }

        public SchemaDetailResponseBodyResult setSchema(SchemaDetailResponseBodyResultSchema schema) {
            this.schema = schema;
            return this;
        }
        public SchemaDetailResponseBodyResultSchema getSchema() {
            return this.schema;
        }

    }

}
