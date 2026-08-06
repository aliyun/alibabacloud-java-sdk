// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListPromptsResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ListPromptsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPromptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPromptsResponseBody self = new ListPromptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPromptsResponseBody setData(ListPromptsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPromptsResponseBodyData getData() {
        return this.data;
    }

    public ListPromptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPromptsResponseBodyDataPageItems extends TeaModel {
        /**
         * <p>The list of business tags.</p>
         */
        @NameInMap("BizTags")
        public java.util.List<String> bizTags;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test prompt</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The version number of the draft version of the prompt. This value is empty if no draft version exists.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("EditingVersion")
        public String editingVersion;

        /**
         * <p>The time when the prompt was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-22 11:51:03</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The mapping between prompt versions and labels.</p>
         */
        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>The latest version number of the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

        /**
         * <p>The number of online versions of the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OnlineCnt")
        public Integer onlineCnt;

        /**
         * <p>The unique identifier of the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("PromptKey")
        public String promptKey;

        /**
         * <p>The version number of the prompt version that is under review. This value is empty if no version is under review.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("ReviewingVersion")
        public String reviewingVersion;

        /**
         * <p>The schema version of the prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SchemaVersion")
        public Integer schemaVersion;

        public static ListPromptsResponseBodyDataPageItems build(java.util.Map<String, ?> map) throws Exception {
            ListPromptsResponseBodyDataPageItems self = new ListPromptsResponseBodyDataPageItems();
            return TeaModel.build(map, self);
        }

        public ListPromptsResponseBodyDataPageItems setBizTags(java.util.List<String> bizTags) {
            this.bizTags = bizTags;
            return this;
        }
        public java.util.List<String> getBizTags() {
            return this.bizTags;
        }

        public ListPromptsResponseBodyDataPageItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPromptsResponseBodyDataPageItems setEditingVersion(String editingVersion) {
            this.editingVersion = editingVersion;
            return this;
        }
        public String getEditingVersion() {
            return this.editingVersion;
        }

        public ListPromptsResponseBodyDataPageItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListPromptsResponseBodyDataPageItems setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListPromptsResponseBodyDataPageItems setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListPromptsResponseBodyDataPageItems setOnlineCnt(Integer onlineCnt) {
            this.onlineCnt = onlineCnt;
            return this;
        }
        public Integer getOnlineCnt() {
            return this.onlineCnt;
        }

        public ListPromptsResponseBodyDataPageItems setPromptKey(String promptKey) {
            this.promptKey = promptKey;
            return this;
        }
        public String getPromptKey() {
            return this.promptKey;
        }

        public ListPromptsResponseBodyDataPageItems setReviewingVersion(String reviewingVersion) {
            this.reviewingVersion = reviewingVersion;
            return this;
        }
        public String getReviewingVersion() {
            return this.reviewingVersion;
        }

        public ListPromptsResponseBodyDataPageItems setSchemaVersion(Integer schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public Integer getSchemaVersion() {
            return this.schemaVersion;
        }

    }

    public static class ListPromptsResponseBodyData extends TeaModel {
        /**
         * <p>The list of prompts.</p>
         */
        @NameInMap("PageItems")
        public java.util.List<ListPromptsResponseBodyDataPageItems> pageItems;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of available pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PagesAvailable")
        public Integer pagesAvailable;

        /**
         * <p>The total number of prompts.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPromptsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPromptsResponseBodyData self = new ListPromptsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPromptsResponseBodyData setPageItems(java.util.List<ListPromptsResponseBodyDataPageItems> pageItems) {
            this.pageItems = pageItems;
            return this;
        }
        public java.util.List<ListPromptsResponseBodyDataPageItems> getPageItems() {
            return this.pageItems;
        }

        public ListPromptsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPromptsResponseBodyData setPagesAvailable(Integer pagesAvailable) {
            this.pagesAvailable = pagesAvailable;
            return this;
        }
        public Integer getPagesAvailable() {
            return this.pagesAvailable;
        }

        public ListPromptsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
