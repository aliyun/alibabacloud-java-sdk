// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetBcSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetBcSchemaResponseBodyResult result;

    public static GetBcSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBcSchemaResponseBody self = new GetBcSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBcSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBcSchemaResponseBody setResult(GetBcSchemaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetBcSchemaResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetBcSchemaResponseBodyResultResponsesPropertiesDataSource extends TeaModel {
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

        public static GetBcSchemaResponseBodyResultResponsesPropertiesDataSource build(java.util.Map<String, ?> map) throws Exception {
            GetBcSchemaResponseBodyResultResponsesPropertiesDataSource self = new GetBcSchemaResponseBodyResultResponsesPropertiesDataSource();
            return TeaModel.build(map, self);
        }

        public GetBcSchemaResponseBodyResultResponsesPropertiesDataSource setAllowNull(Integer allowNull) {
            this.allowNull = allowNull;
            return this;
        }
        public Integer getAllowNull() {
            return this.allowNull;
        }

        public GetBcSchemaResponseBodyResultResponsesPropertiesDataSource setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public GetBcSchemaResponseBodyResultResponsesPropertiesDataSource setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetBcSchemaResponseBodyResultResponsesPropertiesDataSource setIndexes(Integer indexes) {
            this.indexes = indexes;
            return this;
        }
        public Integer getIndexes() {
            return this.indexes;
        }

        public GetBcSchemaResponseBodyResultResponsesPropertiesDataSource setKey(Integer key) {
            this.key = key;
            return this;
        }
        public Integer getKey() {
            return this.key;
        }

        public GetBcSchemaResponseBodyResultResponsesPropertiesDataSource setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public GetBcSchemaResponseBodyResultResponsesPropertiesDataSource setReg(String reg) {
            this.reg = reg;
            return this;
        }
        public String getReg() {
            return this.reg;
        }

        public GetBcSchemaResponseBodyResultResponsesPropertiesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetBcSchemaResponseBodyResultResponsesProperties extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("DataSource")
        public java.util.List<GetBcSchemaResponseBodyResultResponsesPropertiesDataSource> dataSource;

        public static GetBcSchemaResponseBodyResultResponsesProperties build(java.util.Map<String, ?> map) throws Exception {
            GetBcSchemaResponseBodyResultResponsesProperties self = new GetBcSchemaResponseBodyResultResponsesProperties();
            return TeaModel.build(map, self);
        }

        public GetBcSchemaResponseBodyResultResponsesProperties setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetBcSchemaResponseBodyResultResponsesProperties setDataSource(java.util.List<GetBcSchemaResponseBodyResultResponsesPropertiesDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<GetBcSchemaResponseBodyResultResponsesPropertiesDataSource> getDataSource() {
            return this.dataSource;
        }

    }

    public static class GetBcSchemaResponseBodyResultResponses extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Properties")
        public GetBcSchemaResponseBodyResultResponsesProperties properties;

        public static GetBcSchemaResponseBodyResultResponses build(java.util.Map<String, ?> map) throws Exception {
            GetBcSchemaResponseBodyResultResponses self = new GetBcSchemaResponseBodyResultResponses();
            return TeaModel.build(map, self);
        }

        public GetBcSchemaResponseBodyResultResponses setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetBcSchemaResponseBodyResultResponses setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetBcSchemaResponseBodyResultResponses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBcSchemaResponseBodyResultResponses setProperties(GetBcSchemaResponseBodyResultResponsesProperties properties) {
            this.properties = properties;
            return this;
        }
        public GetBcSchemaResponseBodyResultResponsesProperties getProperties() {
            return this.properties;
        }

    }

    public static class GetBcSchemaResponseBodyResultSchema extends TeaModel {
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

        public static GetBcSchemaResponseBodyResultSchema build(java.util.Map<String, ?> map) throws Exception {
            GetBcSchemaResponseBodyResultSchema self = new GetBcSchemaResponseBodyResultSchema();
            return TeaModel.build(map, self);
        }

        public GetBcSchemaResponseBodyResultSchema setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetBcSchemaResponseBodyResultSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBcSchemaResponseBodyResultSchema setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBcSchemaResponseBodyResultSchema setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public GetBcSchemaResponseBodyResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBcSchemaResponseBodyResultSchema setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetBcSchemaResponseBodyResultSchema setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class GetBcSchemaResponseBodyResult extends TeaModel {
        @NameInMap("Responses")
        public java.util.List<GetBcSchemaResponseBodyResultResponses> responses;

        @NameInMap("Schema")
        public GetBcSchemaResponseBodyResultSchema schema;

        public static GetBcSchemaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetBcSchemaResponseBodyResult self = new GetBcSchemaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetBcSchemaResponseBodyResult setResponses(java.util.List<GetBcSchemaResponseBodyResultResponses> responses) {
            this.responses = responses;
            return this;
        }
        public java.util.List<GetBcSchemaResponseBodyResultResponses> getResponses() {
            return this.responses;
        }

        public GetBcSchemaResponseBodyResult setSchema(GetBcSchemaResponseBodyResultSchema schema) {
            this.schema = schema;
            return this;
        }
        public GetBcSchemaResponseBodyResultSchema getSchema() {
            return this.schema;
        }

    }

}
