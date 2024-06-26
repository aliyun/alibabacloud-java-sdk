// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeBlockchainSchemaResponseBodyResult result;

    public static DescribeBlockchainSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainSchemaResponseBody self = new DescribeBlockchainSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockchainSchemaResponseBody setResult(DescribeBlockchainSchemaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeBlockchainSchemaResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource extends TeaModel {
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

        public static DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource self = new DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setAllowNull(Integer allowNull) {
            this.allowNull = allowNull;
            return this;
        }
        public Integer getAllowNull() {
            return this.allowNull;
        }

        public DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setIndexes(Integer indexes) {
            this.indexes = indexes;
            return this;
        }
        public Integer getIndexes() {
            return this.indexes;
        }

        public DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setKey(Integer key) {
            this.key = key;
            return this;
        }
        public Integer getKey() {
            return this.key;
        }

        public DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setReg(String reg) {
            this.reg = reg;
            return this;
        }
        public String getReg() {
            return this.reg;
        }

        public DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeBlockchainSchemaResponseBodyResultResponsesProperties extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("DataSource")
        public java.util.List<DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource> dataSource;

        public static DescribeBlockchainSchemaResponseBodyResultResponsesProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaResponseBodyResultResponsesProperties self = new DescribeBlockchainSchemaResponseBodyResultResponsesProperties();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaResponseBodyResultResponsesProperties setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeBlockchainSchemaResponseBodyResultResponsesProperties setDataSource(java.util.List<DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<DescribeBlockchainSchemaResponseBodyResultResponsesPropertiesDataSource> getDataSource() {
            return this.dataSource;
        }

    }

    public static class DescribeBlockchainSchemaResponseBodyResultResponses extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Properties")
        public DescribeBlockchainSchemaResponseBodyResultResponsesProperties properties;

        public static DescribeBlockchainSchemaResponseBodyResultResponses build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaResponseBodyResultResponses self = new DescribeBlockchainSchemaResponseBodyResultResponses();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaResponseBodyResultResponses setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeBlockchainSchemaResponseBodyResultResponses setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeBlockchainSchemaResponseBodyResultResponses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBlockchainSchemaResponseBodyResultResponses setProperties(DescribeBlockchainSchemaResponseBodyResultResponsesProperties properties) {
            this.properties = properties;
            return this;
        }
        public DescribeBlockchainSchemaResponseBodyResultResponsesProperties getProperties() {
            return this.properties;
        }

    }

    public static class DescribeBlockchainSchemaResponseBodyResultSchema extends TeaModel {
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

        public static DescribeBlockchainSchemaResponseBodyResultSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaResponseBodyResultSchema self = new DescribeBlockchainSchemaResponseBodyResultSchema();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaResponseBodyResultSchema setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeBlockchainSchemaResponseBodyResultSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBlockchainSchemaResponseBodyResultSchema setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeBlockchainSchemaResponseBodyResultSchema setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public DescribeBlockchainSchemaResponseBodyResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBlockchainSchemaResponseBodyResultSchema setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeBlockchainSchemaResponseBodyResultSchema setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class DescribeBlockchainSchemaResponseBodyResult extends TeaModel {
        @NameInMap("Responses")
        public java.util.List<DescribeBlockchainSchemaResponseBodyResultResponses> responses;

        @NameInMap("Schema")
        public DescribeBlockchainSchemaResponseBodyResultSchema schema;

        public static DescribeBlockchainSchemaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaResponseBodyResult self = new DescribeBlockchainSchemaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaResponseBodyResult setResponses(java.util.List<DescribeBlockchainSchemaResponseBodyResultResponses> responses) {
            this.responses = responses;
            return this;
        }
        public java.util.List<DescribeBlockchainSchemaResponseBodyResultResponses> getResponses() {
            return this.responses;
        }

        public DescribeBlockchainSchemaResponseBodyResult setSchema(DescribeBlockchainSchemaResponseBodyResultSchema schema) {
            this.schema = schema;
            return this;
        }
        public DescribeBlockchainSchemaResponseBodyResultSchema getSchema() {
            return this.schema;
        }

    }

}
