// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBcSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeBcSchemaResponseBodyResult result;

    public static DescribeBcSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBcSchemaResponseBody self = new DescribeBcSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBcSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBcSchemaResponseBody setResult(DescribeBcSchemaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeBcSchemaResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource extends TeaModel {
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

        public static DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource self = new DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource();
            return TeaModel.build(map, self);
        }

        public DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource setAllowNull(Integer allowNull) {
            this.allowNull = allowNull;
            return this;
        }
        public Integer getAllowNull() {
            return this.allowNull;
        }

        public DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource setIndexes(Integer indexes) {
            this.indexes = indexes;
            return this;
        }
        public Integer getIndexes() {
            return this.indexes;
        }

        public DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource setKey(Integer key) {
            this.key = key;
            return this;
        }
        public Integer getKey() {
            return this.key;
        }

        public DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource setReg(String reg) {
            this.reg = reg;
            return this;
        }
        public String getReg() {
            return this.reg;
        }

        public DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeBcSchemaResponseBodyResultResponsesProperties extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("DataSource")
        public java.util.List<DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource> dataSource;

        public static DescribeBcSchemaResponseBodyResultResponsesProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeBcSchemaResponseBodyResultResponsesProperties self = new DescribeBcSchemaResponseBodyResultResponsesProperties();
            return TeaModel.build(map, self);
        }

        public DescribeBcSchemaResponseBodyResultResponsesProperties setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeBcSchemaResponseBodyResultResponsesProperties setDataSource(java.util.List<DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<DescribeBcSchemaResponseBodyResultResponsesPropertiesDataSource> getDataSource() {
            return this.dataSource;
        }

    }

    public static class DescribeBcSchemaResponseBodyResultResponses extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Properties")
        public DescribeBcSchemaResponseBodyResultResponsesProperties properties;

        public static DescribeBcSchemaResponseBodyResultResponses build(java.util.Map<String, ?> map) throws Exception {
            DescribeBcSchemaResponseBodyResultResponses self = new DescribeBcSchemaResponseBodyResultResponses();
            return TeaModel.build(map, self);
        }

        public DescribeBcSchemaResponseBodyResultResponses setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeBcSchemaResponseBodyResultResponses setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeBcSchemaResponseBodyResultResponses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBcSchemaResponseBodyResultResponses setProperties(DescribeBcSchemaResponseBodyResultResponsesProperties properties) {
            this.properties = properties;
            return this;
        }
        public DescribeBcSchemaResponseBodyResultResponsesProperties getProperties() {
            return this.properties;
        }

    }

    public static class DescribeBcSchemaResponseBodyResultSchema extends TeaModel {
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

        public static DescribeBcSchemaResponseBodyResultSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeBcSchemaResponseBodyResultSchema self = new DescribeBcSchemaResponseBodyResultSchema();
            return TeaModel.build(map, self);
        }

        public DescribeBcSchemaResponseBodyResultSchema setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeBcSchemaResponseBodyResultSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBcSchemaResponseBodyResultSchema setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeBcSchemaResponseBodyResultSchema setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public DescribeBcSchemaResponseBodyResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBcSchemaResponseBodyResultSchema setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeBcSchemaResponseBodyResultSchema setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class DescribeBcSchemaResponseBodyResult extends TeaModel {
        @NameInMap("Responses")
        public java.util.List<DescribeBcSchemaResponseBodyResultResponses> responses;

        @NameInMap("Schema")
        public DescribeBcSchemaResponseBodyResultSchema schema;

        public static DescribeBcSchemaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeBcSchemaResponseBodyResult self = new DescribeBcSchemaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeBcSchemaResponseBodyResult setResponses(java.util.List<DescribeBcSchemaResponseBodyResultResponses> responses) {
            this.responses = responses;
            return this;
        }
        public java.util.List<DescribeBcSchemaResponseBodyResultResponses> getResponses() {
            return this.responses;
        }

        public DescribeBcSchemaResponseBodyResult setSchema(DescribeBcSchemaResponseBodyResultSchema schema) {
            this.schema = schema;
            return this;
        }
        public DescribeBcSchemaResponseBodyResultSchema getSchema() {
            return this.schema;
        }

    }

}
