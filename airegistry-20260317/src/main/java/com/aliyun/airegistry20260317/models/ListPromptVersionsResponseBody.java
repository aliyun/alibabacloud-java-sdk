// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListPromptVersionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListPromptVersionsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPromptVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPromptVersionsResponseBody self = new ListPromptVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPromptVersionsResponseBody setData(ListPromptVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPromptVersionsResponseBodyData getData() {
        return this.data;
    }

    public ListPromptVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPromptVersionsResponseBodyDataPageItems extends TeaModel {
        @NameInMap("CommitMsg")
        public String commitMsg;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("PromptKey")
        public String promptKey;

        @NameInMap("SrcUser")
        public String srcUser;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        public static ListPromptVersionsResponseBodyDataPageItems build(java.util.Map<String, ?> map) throws Exception {
            ListPromptVersionsResponseBodyDataPageItems self = new ListPromptVersionsResponseBodyDataPageItems();
            return TeaModel.build(map, self);
        }

        public ListPromptVersionsResponseBodyDataPageItems setCommitMsg(String commitMsg) {
            this.commitMsg = commitMsg;
            return this;
        }
        public String getCommitMsg() {
            return this.commitMsg;
        }

        public ListPromptVersionsResponseBodyDataPageItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListPromptVersionsResponseBodyDataPageItems setPromptKey(String promptKey) {
            this.promptKey = promptKey;
            return this;
        }
        public String getPromptKey() {
            return this.promptKey;
        }

        public ListPromptVersionsResponseBodyDataPageItems setSrcUser(String srcUser) {
            this.srcUser = srcUser;
            return this;
        }
        public String getSrcUser() {
            return this.srcUser;
        }

        public ListPromptVersionsResponseBodyDataPageItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPromptVersionsResponseBodyDataPageItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListPromptVersionsResponseBodyData extends TeaModel {
        @NameInMap("PageItems")
        public java.util.List<ListPromptVersionsResponseBodyDataPageItems> pageItems;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PagesAvailable")
        public Integer pagesAvailable;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPromptVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPromptVersionsResponseBodyData self = new ListPromptVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPromptVersionsResponseBodyData setPageItems(java.util.List<ListPromptVersionsResponseBodyDataPageItems> pageItems) {
            this.pageItems = pageItems;
            return this;
        }
        public java.util.List<ListPromptVersionsResponseBodyDataPageItems> getPageItems() {
            return this.pageItems;
        }

        public ListPromptVersionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPromptVersionsResponseBodyData setPagesAvailable(Integer pagesAvailable) {
            this.pagesAvailable = pagesAvailable;
            return this;
        }
        public Integer getPagesAvailable() {
            return this.pagesAvailable;
        }

        public ListPromptVersionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
