// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListAgentSpecsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListAgentSpecsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAgentSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSpecsResponseBody self = new ListAgentSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentSpecsResponseBody setData(ListAgentSpecsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAgentSpecsResponseBodyData getData() {
        return this.data;
    }

    public ListAgentSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentSpecsResponseBodyDataPageItemsMcpServers extends TeaModel {
        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>agentspec-example</p>
         */
        @NameInMap("name")
        public String name;

        public static ListAgentSpecsResponseBodyDataPageItemsMcpServers build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSpecsResponseBodyDataPageItemsMcpServers self = new ListAgentSpecsResponseBodyDataPageItemsMcpServers();
            return TeaModel.build(map, self);
        }

        public ListAgentSpecsResponseBodyDataPageItemsMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAgentSpecsResponseBodyDataPageItemsSkills extends TeaModel {
        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>agentspec-example</p>
         */
        @NameInMap("name")
        public String name;

        public static ListAgentSpecsResponseBodyDataPageItemsSkills build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSpecsResponseBodyDataPageItemsSkills self = new ListAgentSpecsResponseBodyDataPageItemsSkills();
            return TeaModel.build(map, self);
        }

        public ListAgentSpecsResponseBodyDataPageItemsSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAgentSpecsResponseBodyDataPageItems extends TeaModel {
        /**
         * <p>The business tags.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample property value</p>
         */
        @NameInMap("bizTags")
        public String bizTags;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The download count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("downloadCount")
        public Long downloadCount;

        /**
         * <p>The version currently being edited.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("editingVersion")
        public String editingVersion;

        /**
         * <p>Indicates whether the AgentSpec is enabled.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>UPLOAD</p>
         */
        @NameInMap("from")
        public String from;

        /**
         * <p>The version labels.</p>
         */
        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>The list of MCP server references.</p>
         */
        @NameInMap("mcpServers")
        public java.util.List<ListAgentSpecsResponseBodyDataPageItemsMcpServers> mcpServers;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>agentspec-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The number of online versions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("onlineCnt")
        public Integer onlineCnt;

        /**
         * <p>The version currently under review.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("reviewingVersion")
        public String reviewingVersion;

        /**
         * <p>The visibility scope.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The list of Skill references.</p>
         */
        @NameInMap("skills")
        public java.util.List<ListAgentSpecsResponseBodyDataPageItemsSkills> skills;

        /**
         * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787671022000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static ListAgentSpecsResponseBodyDataPageItems build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSpecsResponseBodyDataPageItems self = new ListAgentSpecsResponseBodyDataPageItems();
            return TeaModel.build(map, self);
        }

        public ListAgentSpecsResponseBodyDataPageItems setBizTags(String bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public String getBizTags() {
            return this.bizTags;
        }

        public ListAgentSpecsResponseBodyDataPageItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAgentSpecsResponseBodyDataPageItems setDownloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        public ListAgentSpecsResponseBodyDataPageItems setEditingVersion(String editingVersion) {
            this.editingVersion = editingVersion;
            return this;
        }
        public String getEditingVersion() {
            return this.editingVersion;
        }

        public ListAgentSpecsResponseBodyDataPageItems setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListAgentSpecsResponseBodyDataPageItems setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public ListAgentSpecsResponseBodyDataPageItems setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListAgentSpecsResponseBodyDataPageItems setMcpServers(java.util.List<ListAgentSpecsResponseBodyDataPageItemsMcpServers> mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }
        public java.util.List<ListAgentSpecsResponseBodyDataPageItemsMcpServers> getMcpServers() {
            return this.mcpServers;
        }

        public ListAgentSpecsResponseBodyDataPageItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAgentSpecsResponseBodyDataPageItems setOnlineCnt(Integer onlineCnt) {
            this.onlineCnt = onlineCnt;
            return this;
        }
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        public ListAgentSpecsResponseBodyDataPageItems setReviewingVersion(String reviewingVersion) {
            this.reviewingVersion = reviewingVersion;
            return this;
        }
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        public ListAgentSpecsResponseBodyDataPageItems setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListAgentSpecsResponseBodyDataPageItems setSkills(java.util.List<ListAgentSpecsResponseBodyDataPageItemsSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<ListAgentSpecsResponseBodyDataPageItemsSkills> getSkills() {
            return this.skills;
        }

        public ListAgentSpecsResponseBodyDataPageItems setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListAgentSpecsResponseBodyData extends TeaModel {
        /**
         * <p>The data on the current page.</p>
         */
        @NameInMap("pageItems")
        public java.util.List<ListAgentSpecsResponseBodyDataPageItems> pageItems;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("pagesAvailable")
        public Integer pagesAvailable;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListAgentSpecsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentSpecsResponseBodyData self = new ListAgentSpecsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentSpecsResponseBodyData setPageItems(java.util.List<ListAgentSpecsResponseBodyDataPageItems> pageItems) {
            this.pageItems = pageItems;
            return this;
        }
        public java.util.List<ListAgentSpecsResponseBodyDataPageItems> getPageItems() {
            return this.pageItems;
        }

        public ListAgentSpecsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAgentSpecsResponseBodyData setPagesAvailable(Integer pagesAvailable) {
            this.pagesAvailable = pagesAvailable;
            return this;
        }
        public Integer getPagesAvailable() {
            return this.pagesAvailable;
        }

        public ListAgentSpecsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
