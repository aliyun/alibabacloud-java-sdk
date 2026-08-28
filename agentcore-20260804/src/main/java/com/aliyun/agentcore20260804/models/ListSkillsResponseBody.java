// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSkillsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListSkillsResponseBodyData data;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-page-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsResponseBody self = new ListSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillsResponseBody setData(ListSkillsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSkillsResponseBodyData getData() {
        return this.data;
    }

    public ListSkillsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSkillsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSkillsResponseBodyDataPageItems extends TeaModel {
        /**
         * <p>The business tags as a JSON array string.</p>
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
         * <p>The total number of downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("downloadCount")
        public Long downloadCount;

        /**
         * <p>The version that is being edited.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("editingVersion")
        public String editingVersion;

        /**
         * <p>Indicates whether the Skill is enabled.</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The source tag.</p>
         * 
         * <strong>example:</strong>
         * <p>UPLOAD</p>
         */
        @NameInMap("from")
        public String from;

        /**
         * <p>The label mapping.</p>
         */
        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-example</p>
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
         * <p>The resource owner.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The version that is under review.</p>
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
         * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787671022000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        /**
         * <p>Indicates whether the current user has write permissions.</p>
         */
        @NameInMap("writeable")
        public Boolean writeable;

        public static ListSkillsResponseBodyDataPageItems build(java.util.Map<String, ?> map) throws Exception {
            ListSkillsResponseBodyDataPageItems self = new ListSkillsResponseBodyDataPageItems();
            return TeaModel.build(map, self);
        }

        public ListSkillsResponseBodyDataPageItems setBizTags(String bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public String getBizTags() {
            return this.bizTags;
        }

        public ListSkillsResponseBodyDataPageItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSkillsResponseBodyDataPageItems setDownloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }
        public Long getDownloadCount() {
            return this.downloadCount;
        }

        public ListSkillsResponseBodyDataPageItems setEditingVersion(String editingVersion) {
            this.editingVersion = editingVersion;
            return this;
        }
        public String getEditingVersion() {
            return this.editingVersion;
        }

        public ListSkillsResponseBodyDataPageItems setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListSkillsResponseBodyDataPageItems setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public ListSkillsResponseBodyDataPageItems setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListSkillsResponseBodyDataPageItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSkillsResponseBodyDataPageItems setOnlineCnt(Integer onlineCnt) {
            this.onlineCnt = onlineCnt;
            return this;
        }
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        public ListSkillsResponseBodyDataPageItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListSkillsResponseBodyDataPageItems setReviewingVersion(String reviewingVersion) {
            this.reviewingVersion = reviewingVersion;
            return this;
        }
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        public ListSkillsResponseBodyDataPageItems setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListSkillsResponseBodyDataPageItems setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListSkillsResponseBodyDataPageItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListSkillsResponseBodyDataPageItems setWriteable(Boolean writeable) {
            this.writeable = writeable;
            return this;
        }
        public Boolean getWriteable() {
            return this.writeable;
        }

    }

    public static class ListSkillsResponseBodyData extends TeaModel {
        /**
         * <p>The data on the current page.</p>
         */
        @NameInMap("pageItems")
        public java.util.List<ListSkillsResponseBodyDataPageItems> pageItems;

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

        public static ListSkillsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillsResponseBodyData self = new ListSkillsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSkillsResponseBodyData setPageItems(java.util.List<ListSkillsResponseBodyDataPageItems> pageItems) {
            this.pageItems = pageItems;
            return this;
        }
        public java.util.List<ListSkillsResponseBodyDataPageItems> getPageItems() {
            return this.pageItems;
        }

        public ListSkillsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSkillsResponseBodyData setPagesAvailable(Integer pagesAvailable) {
            this.pagesAvailable = pagesAvailable;
            return this;
        }
        public Integer getPagesAvailable() {
            return this.pagesAvailable;
        }

        public ListSkillsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
