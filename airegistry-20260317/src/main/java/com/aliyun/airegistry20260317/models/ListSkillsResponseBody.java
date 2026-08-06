// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListSkillsResponseBody extends TeaModel {
    /**
     * <p>The list of rule information returned when the call succeeds. For more information, see <strong>RuleInfo</strong>.</p>
     * <blockquote>
     * <p>The returned rule information is sorted by rule creation time in descending order.</p>
     * </blockquote>
     */
    @NameInMap("Data")
    public ListSkillsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>195BF118-9AEF-5F3F-9A58-D88A77EB07DE</p>
     */
    @NameInMap("RequestId")
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
         * <p>test</p>
         */
        @NameInMap("BizTags")
        public String bizTags;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>secret for bbtadmin</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The total number of downloads.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DownloadCount")
        public Long downloadCount;

        /**
         * <p>The version being edited.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.3</p>
         */
        @NameInMap("EditingVersion")
        public String editingVersion;

        /**
         * <p>Indicates whether the skill is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The source tag.</p>
         * 
         * <strong>example:</strong>
         * <p>aqs</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <p>The label mapping.</p>
         */
        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>OCR品牌</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the group or workspace to which the repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou:creatulize-test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The number of online versions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OnlineCnt")
        public Integer onlineCnt;

        /**
         * <p>The account ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The version under review.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.2</p>
         */
        @NameInMap("ReviewingVersion")
        public String reviewingVersion;

        /**
         * <p>The visibility scope.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-yORclL</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-05T19:24:43.798</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>Indicates whether the skill can be edited.</p>
         */
        @NameInMap("Writeable")
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

        public ListSkillsResponseBodyDataPageItems setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
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
         * <p>The MCP server information.</p>
         */
        @NameInMap("PageItems")
        public java.util.List<ListSkillsResponseBodyDataPageItems> pageItems;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>pagesAvailable.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PagesAvailable")
        public Integer pagesAvailable;

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
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
