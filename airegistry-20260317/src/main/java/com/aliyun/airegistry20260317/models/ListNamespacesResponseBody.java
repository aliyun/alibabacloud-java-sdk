// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListNamespacesResponseBody extends TeaModel {
    /**
     * <p>The namespace query result.</p>
     */
    @NameInMap("Data")
    public ListNamespacesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
     */
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
        /**
         * <p>The time when the namespace was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T09:32:03+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>Default project, auto-created by EMR.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("IpWhitelist")
        public String ipWhitelist;

        /**
         * <p>The namespace name.</p>
         * 
         * <strong>example:</strong>
         * <p>magic:magic-cn-1us4sed5d01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>76d4b6e4-31bf-475a-8710-6217ec049c1f</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The number of prompts in the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PromptCount")
        public Integer promptCount;

        @NameInMap("PublicAccessEnabled")
        public Boolean publicAccessEnabled;

        @NameInMap("PublicDomain")
        public String publicDomain;

        /**
         * <p>The number of skills in the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SkillCount")
        public Integer skillCount;

        /**
         * <p>The source of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>magic:magic-cn-fpi4secsq01</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The source index of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceIndex")
        public Integer sourceIndex;

        /**
         * <p>The tags of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>qa,test</p>
         */
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

        public ListNamespacesResponseBodyDataItems setIpWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public String getIpWhitelist() {
            return this.ipWhitelist;
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

        public ListNamespacesResponseBodyDataItems setPublicAccessEnabled(Boolean publicAccessEnabled) {
            this.publicAccessEnabled = publicAccessEnabled;
            return this;
        }
        public Boolean getPublicAccessEnabled() {
            return this.publicAccessEnabled;
        }

        public ListNamespacesResponseBodyDataItems setPublicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }
        public String getPublicDomain() {
            return this.publicDomain;
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
        /**
         * <p>The returned data entries.</p>
         */
        @NameInMap("Items")
        public java.util.List<ListNamespacesResponseBodyDataItems> items;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
