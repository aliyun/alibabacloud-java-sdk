// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainSchemaDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeBlockchainSchemaDetailResponseBodyResult result;

    public static DescribeBlockchainSchemaDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainSchemaDetailResponseBody self = new DescribeBlockchainSchemaDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainSchemaDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockchainSchemaDetailResponseBody setResult(DescribeBlockchainSchemaDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeBlockchainSchemaDetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource extends TeaModel {
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

        public static DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource self = new DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource setAllowNull(Integer allowNull) {
            this.allowNull = allowNull;
            return this;
        }
        public Integer getAllowNull() {
            return this.allowNull;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }
        public String getAnnotation() {
            return this.annotation;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource setIndexes(Integer indexes) {
            this.indexes = indexes;
            return this;
        }
        public Integer getIndexes() {
            return this.indexes;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource setKey(Integer key) {
            this.key = key;
            return this;
        }
        public Integer getKey() {
            return this.key;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource setReg(String reg) {
            this.reg = reg;
            return this;
        }
        public String getReg() {
            return this.reg;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeBlockchainSchemaDetailResponseBodyResultResponsesProperties extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("DataSource")
        public java.util.List<DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource> dataSource;

        public static DescribeBlockchainSchemaDetailResponseBodyResultResponsesProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaDetailResponseBodyResultResponsesProperties self = new DescribeBlockchainSchemaDetailResponseBodyResultResponsesProperties();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesProperties setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesProperties setDataSource(java.util.List<DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<DescribeBlockchainSchemaDetailResponseBodyResultResponsesPropertiesDataSource> getDataSource() {
            return this.dataSource;
        }

    }

    public static class DescribeBlockchainSchemaDetailResponseBodyResultResponses extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Properties")
        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesProperties properties;

        public static DescribeBlockchainSchemaDetailResponseBodyResultResponses build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaDetailResponseBodyResultResponses self = new DescribeBlockchainSchemaDetailResponseBodyResultResponses();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponses setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponses setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultResponses setProperties(DescribeBlockchainSchemaDetailResponseBodyResultResponsesProperties properties) {
            this.properties = properties;
            return this;
        }
        public DescribeBlockchainSchemaDetailResponseBodyResultResponsesProperties getProperties() {
            return this.properties;
        }

    }

    public static class DescribeBlockchainSchemaDetailResponseBodyResultSchema extends TeaModel {
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

        public static DescribeBlockchainSchemaDetailResponseBodyResultSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaDetailResponseBodyResultSchema self = new DescribeBlockchainSchemaDetailResponseBodyResultSchema();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultSchema setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultSchema setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultSchema setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultSchema setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResultSchema setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class DescribeBlockchainSchemaDetailResponseBodyResult extends TeaModel {
        @NameInMap("Responses")
        public java.util.List<DescribeBlockchainSchemaDetailResponseBodyResultResponses> responses;

        @NameInMap("Schema")
        public DescribeBlockchainSchemaDetailResponseBodyResultSchema schema;

        public static DescribeBlockchainSchemaDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaDetailResponseBodyResult self = new DescribeBlockchainSchemaDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaDetailResponseBodyResult setResponses(java.util.List<DescribeBlockchainSchemaDetailResponseBodyResultResponses> responses) {
            this.responses = responses;
            return this;
        }
        public java.util.List<DescribeBlockchainSchemaDetailResponseBodyResultResponses> getResponses() {
            return this.responses;
        }

        public DescribeBlockchainSchemaDetailResponseBodyResult setSchema(DescribeBlockchainSchemaDetailResponseBodyResultSchema schema) {
            this.schema = schema;
            return this;
        }
        public DescribeBlockchainSchemaDetailResponseBodyResultSchema getSchema() {
            return this.schema;
        }

    }

}
