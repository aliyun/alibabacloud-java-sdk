// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainSchemaTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeBlockchainSchemaTemplatesResponseBodyResult result;

    public static DescribeBlockchainSchemaTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainSchemaTemplatesResponseBody self = new DescribeBlockchainSchemaTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainSchemaTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockchainSchemaTemplatesResponseBody setResult(DescribeBlockchainSchemaTemplatesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeBlockchainSchemaTemplatesResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList extends TeaModel {
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

        public static DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList self = new DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList setIsTemplate(Integer isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Integer getIsTemplate() {
            return this.isTemplate;
        }

        public DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class DescribeBlockchainSchemaTemplatesResponseBodyResult extends TeaModel {
        @NameInMap("SchemaList")
        public java.util.List<DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList> schemaList;

        public static DescribeBlockchainSchemaTemplatesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainSchemaTemplatesResponseBodyResult self = new DescribeBlockchainSchemaTemplatesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainSchemaTemplatesResponseBodyResult setSchemaList(java.util.List<DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList> schemaList) {
            this.schemaList = schemaList;
            return this;
        }
        public java.util.List<DescribeBlockchainSchemaTemplatesResponseBodyResultSchemaList> getSchemaList() {
            return this.schemaList;
        }

    }

}
