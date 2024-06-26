// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetTemplatesResponseBodyResult result;

    public static GetTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplatesResponseBody self = new GetTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplatesResponseBody setResult(GetTemplatesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetTemplatesResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetTemplatesResponseBodyResultSchemaList extends TeaModel {
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

        public static GetTemplatesResponseBodyResultSchemaList build(java.util.Map<String, ?> map) throws Exception {
            GetTemplatesResponseBodyResultSchemaList self = new GetTemplatesResponseBodyResultSchemaList();
            return TeaModel.build(map, self);
        }

        public GetTemplatesResponseBodyResultSchemaList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTemplatesResponseBodyResultSchemaList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTemplatesResponseBodyResultSchemaList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTemplatesResponseBodyResultSchemaList setIsTemplate(Integer isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Integer getIsTemplate() {
            return this.isTemplate;
        }

        public GetTemplatesResponseBodyResultSchemaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTemplatesResponseBodyResultSchemaList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetTemplatesResponseBodyResultSchemaList setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class GetTemplatesResponseBodyResult extends TeaModel {
        @NameInMap("SchemaList")
        public java.util.List<GetTemplatesResponseBodyResultSchemaList> schemaList;

        public static GetTemplatesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetTemplatesResponseBodyResult self = new GetTemplatesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetTemplatesResponseBodyResult setSchemaList(java.util.List<GetTemplatesResponseBodyResultSchemaList> schemaList) {
            this.schemaList = schemaList;
            return this;
        }
        public java.util.List<GetTemplatesResponseBodyResultSchemaList> getSchemaList() {
            return this.schemaList;
        }

    }

}
