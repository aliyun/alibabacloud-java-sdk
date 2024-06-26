// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeTemplatesResponseBodyResult result;

    public static DescribeTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesResponseBody self = new DescribeTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplatesResponseBody setResult(DescribeTemplatesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeTemplatesResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeTemplatesResponseBodyResultSchemaList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsTemplate")
        public Integer isTemplate;

        @NameInMap("Name")
        public String name;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Version")
        public Long version;

        public static DescribeTemplatesResponseBodyResultSchemaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyResultSchemaList self = new DescribeTemplatesResponseBodyResultSchemaList();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyResultSchemaList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeTemplatesResponseBodyResultSchemaList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTemplatesResponseBodyResultSchemaList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeTemplatesResponseBodyResultSchemaList setIsTemplate(Integer isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Integer getIsTemplate() {
            return this.isTemplate;
        }

        public DescribeTemplatesResponseBodyResultSchemaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTemplatesResponseBodyResultSchemaList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeTemplatesResponseBodyResultSchemaList setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class DescribeTemplatesResponseBodyResult extends TeaModel {
        @NameInMap("SchemaList")
        public java.util.List<DescribeTemplatesResponseBodyResultSchemaList> schemaList;

        public static DescribeTemplatesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplatesResponseBodyResult self = new DescribeTemplatesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeTemplatesResponseBodyResult setSchemaList(java.util.List<DescribeTemplatesResponseBodyResultSchemaList> schemaList) {
            this.schemaList = schemaList;
            return this;
        }
        public java.util.List<DescribeTemplatesResponseBodyResultSchemaList> getSchemaList() {
            return this.schemaList;
        }

    }

}
