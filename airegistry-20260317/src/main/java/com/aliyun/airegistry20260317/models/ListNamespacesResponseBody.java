// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListNamespacesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListNamespacesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespacesResponseBody self = new ListNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespacesResponseBody setData(ListNamespacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNamespacesResponseBodyData getData() {
        return this.data;
    }

    public ListNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNamespacesResponseBodyDataItems extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("PromptCount")
        public Integer promptCount;

        @NameInMap("SkillCount")
        public Integer skillCount;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceIndex")
        public Integer sourceIndex;

        @NameInMap("Tags")
        public String tags;

        public static ListNamespacesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacesResponseBodyDataItems self = new ListNamespacesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListNamespacesResponseBodyDataItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListNamespacesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNamespacesResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNamespacesResponseBodyDataItems setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListNamespacesResponseBodyDataItems setPromptCount(Integer promptCount) {
            this.promptCount = promptCount;
            return this;
        }
        public Integer getPromptCount() {
            return this.promptCount;
        }

        public ListNamespacesResponseBodyDataItems setSkillCount(Integer skillCount) {
            this.skillCount = skillCount;
            return this;
        }
        public Integer getSkillCount() {
            return this.skillCount;
        }

        public ListNamespacesResponseBodyDataItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListNamespacesResponseBodyDataItems setSourceIndex(Integer sourceIndex) {
            this.sourceIndex = sourceIndex;
            return this;
        }
        public Integer getSourceIndex() {
            return this.sourceIndex;
        }

        public ListNamespacesResponseBodyDataItems setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class ListNamespacesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListNamespacesResponseBodyDataItems> items;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListNamespacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNamespacesResponseBodyData self = new ListNamespacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNamespacesResponseBodyData setItems(java.util.List<ListNamespacesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListNamespacesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListNamespacesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListNamespacesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListNamespacesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
