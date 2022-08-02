// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListLatestGameArchiveResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<ListLatestGameArchiveResponseBodyDataList> dataList;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLatestGameArchiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLatestGameArchiveResponseBody self = new ListLatestGameArchiveResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLatestGameArchiveResponseBody setDataList(java.util.List<ListLatestGameArchiveResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListLatestGameArchiveResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListLatestGameArchiveResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListLatestGameArchiveResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLatestGameArchiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLatestGameArchiveResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLatestGameArchiveResponseBodyDataList extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("ArchiveId")
        public String archiveId;

        @NameInMap("ArchiveTime")
        public String archiveTime;

        @NameInMap("GameId")
        public String gameId;

        @NameInMap("TagStatus")
        public Long tagStatus;

        public static ListLatestGameArchiveResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLatestGameArchiveResponseBodyDataList self = new ListLatestGameArchiveResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListLatestGameArchiveResponseBodyDataList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListLatestGameArchiveResponseBodyDataList setArchiveId(String archiveId) {
            this.archiveId = archiveId;
            return this;
        }
        public String getArchiveId() {
            return this.archiveId;
        }

        public ListLatestGameArchiveResponseBodyDataList setArchiveTime(String archiveTime) {
            this.archiveTime = archiveTime;
            return this;
        }
        public String getArchiveTime() {
            return this.archiveTime;
        }

        public ListLatestGameArchiveResponseBodyDataList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public ListLatestGameArchiveResponseBodyDataList setTagStatus(Long tagStatus) {
            this.tagStatus = tagStatus;
            return this;
        }
        public Long getTagStatus() {
            return this.tagStatus;
        }

    }

}
