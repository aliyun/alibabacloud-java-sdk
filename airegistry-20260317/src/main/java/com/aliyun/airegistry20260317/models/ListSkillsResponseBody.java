// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListSkillsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListSkillsResponseBodyData data;

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
        @NameInMap("BizTags")
        public String bizTags;

        @NameInMap("Description")
        public String description;

        @NameInMap("DownloadCount")
        public Long downloadCount;

        @NameInMap("EditingVersion")
        public String editingVersion;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("From")
        public String from;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("OnlineCnt")
        public Integer onlineCnt;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ReviewingVersion")
        public String reviewingVersion;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("UpdateTime")
        public Long updateTime;

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
        @NameInMap("PageItems")
        public java.util.List<ListSkillsResponseBodyDataPageItems> pageItems;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PagesAvailable")
        public Integer pagesAvailable;

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
