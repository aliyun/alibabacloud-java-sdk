// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPipelineDefinitionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<ListPipelineDefinitionsResponseItems> items;

    public static ListPipelineDefinitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineDefinitionsResponse self = new ListPipelineDefinitionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineDefinitionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineDefinitionsResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListPipelineDefinitionsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelineDefinitionsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListPipelineDefinitionsResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListPipelineDefinitionsResponse setItems(java.util.List<ListPipelineDefinitionsResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListPipelineDefinitionsResponseItems> getItems() {
        return this.items;
    }

    public static class ListPipelineDefinitionsResponseItems extends TeaModel {
        @NameInMap("Bid")
        @Validation(required = true)
        public String bid;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("AppKey")
        @Validation(required = true)
        public String appKey;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Creator")
        @Validation(required = true)
        public String creator;

        @NameInMap("Modifier")
        @Validation(required = true)
        public String modifier;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        public static ListPipelineDefinitionsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineDefinitionsResponseItems self = new ListPipelineDefinitionsResponseItems();
            return TeaModel.build(map, self);
        }

        public ListPipelineDefinitionsResponseItems setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public ListPipelineDefinitionsResponseItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPipelineDefinitionsResponseItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPipelineDefinitionsResponseItems setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListPipelineDefinitionsResponseItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListPipelineDefinitionsResponseItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPipelineDefinitionsResponseItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListPipelineDefinitionsResponseItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPipelineDefinitionsResponseItems setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListPipelineDefinitionsResponseItems setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListPipelineDefinitionsResponseItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPipelineDefinitionsResponseItems setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
