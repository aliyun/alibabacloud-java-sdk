// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSchemaDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeSchemaDetailResponseBodyResult result;

    public static DescribeSchemaDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSchemaDetailResponseBody self = new DescribeSchemaDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSchemaDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSchemaDetailResponseBody setResult(DescribeSchemaDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeSchemaDetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource extends TeaModel {
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

        public static DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource self = new DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource();
            return TeaModel.build(map, self);
        }

        public DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource setAllowNull(Integer allowNull) {
            this.allowNull = allowNull;
            return this;
        }
        public Integer getAllowNull() {
            return this.allowNull;
        }

        public DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource setIndexes(Integer indexes) {
            this.indexes = indexes;
            return this;
        }
        public Integer getIndexes() {
            return this.indexes;
        }

        public DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource setKey(Integer key) {
            this.key = key;
            return this;
        }
        public Integer getKey() {
            return this.key;
        }

        public DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource setReg(String reg) {
            this.reg = reg;
            return this;
        }
        public String getReg() {
            return this.reg;
        }

        public DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSchemaDetailResponseBodyResultResponsesProperties extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("DataSource")
        public java.util.List<DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource> dataSource;

        public static DescribeSchemaDetailResponseBodyResultResponsesProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchemaDetailResponseBodyResultResponsesProperties self = new DescribeSchemaDetailResponseBodyResultResponsesProperties();
            return TeaModel.build(map, self);
        }

        public DescribeSchemaDetailResponseBodyResultResponsesProperties setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSchemaDetailResponseBodyResultResponsesProperties setDataSource(java.util.List<DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<DescribeSchemaDetailResponseBodyResultResponsesPropertiesDataSource> getDataSource() {
            return this.dataSource;
        }

    }

    public static class DescribeSchemaDetailResponseBodyResultResponses extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Properties")
        public DescribeSchemaDetailResponseBodyResultResponsesProperties properties;

        public static DescribeSchemaDetailResponseBodyResultResponses build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchemaDetailResponseBodyResultResponses self = new DescribeSchemaDetailResponseBodyResultResponses();
            return TeaModel.build(map, self);
        }

        public DescribeSchemaDetailResponseBodyResultResponses setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeSchemaDetailResponseBodyResultResponses setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeSchemaDetailResponseBodyResultResponses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSchemaDetailResponseBodyResultResponses setProperties(DescribeSchemaDetailResponseBodyResultResponsesProperties properties) {
            this.properties = properties;
            return this;
        }
        public DescribeSchemaDetailResponseBodyResultResponsesProperties getProperties() {
            return this.properties;
        }

    }

    public static class DescribeSchemaDetailResponseBodyResultSchema extends TeaModel {
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

        public static DescribeSchemaDetailResponseBodyResultSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchemaDetailResponseBodyResultSchema self = new DescribeSchemaDetailResponseBodyResultSchema();
            return TeaModel.build(map, self);
        }

        public DescribeSchemaDetailResponseBodyResultSchema setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSchemaDetailResponseBodyResultSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSchemaDetailResponseBodyResultSchema setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSchemaDetailResponseBodyResultSchema setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public DescribeSchemaDetailResponseBodyResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSchemaDetailResponseBodyResultSchema setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSchemaDetailResponseBodyResultSchema setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class DescribeSchemaDetailResponseBodyResult extends TeaModel {
        @NameInMap("Responses")
        public java.util.List<DescribeSchemaDetailResponseBodyResultResponses> responses;

        @NameInMap("Schema")
        public DescribeSchemaDetailResponseBodyResultSchema schema;

        public static DescribeSchemaDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSchemaDetailResponseBodyResult self = new DescribeSchemaDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSchemaDetailResponseBodyResult setResponses(java.util.List<DescribeSchemaDetailResponseBodyResultResponses> responses) {
            this.responses = responses;
            return this;
        }
        public java.util.List<DescribeSchemaDetailResponseBodyResultResponses> getResponses() {
            return this.responses;
        }

        public DescribeSchemaDetailResponseBodyResult setSchema(DescribeSchemaDetailResponseBodyResultSchema schema) {
            this.schema = schema;
            return this;
        }
        public DescribeSchemaDetailResponseBodyResultSchema getSchema() {
            return this.schema;
        }

    }

}
