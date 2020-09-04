// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPipelineTemplatesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<ListPipelineTemplatesResponseItems> items;

    public static ListPipelineTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTemplatesResponse self = new ListPipelineTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineTemplatesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineTemplatesResponse setItems(java.util.List<ListPipelineTemplatesResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListPipelineTemplatesResponseItems> getItems() {
        return this.items;
    }

    public static class ListPipelineTemplatesResponseItems extends TeaModel {
        @NameInMap("Bid")
        @Validation(required = true)
        public String bid;

        @NameInMap("AppKey")
        @Validation(required = true)
        public String appKey;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("Creator")
        @Validation(required = true)
        public String creator;

        @NameInMap("Modifier")
        @Validation(required = true)
        public String modifier;

        public static ListPipelineTemplatesResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineTemplatesResponseItems self = new ListPipelineTemplatesResponseItems();
            return TeaModel.build(map, self);
        }

        public ListPipelineTemplatesResponseItems setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public ListPipelineTemplatesResponseItems setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListPipelineTemplatesResponseItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPipelineTemplatesResponseItems setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListPipelineTemplatesResponseItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPipelineTemplatesResponseItems setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListPipelineTemplatesResponseItems setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListPipelineTemplatesResponseItems setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

    }

}
