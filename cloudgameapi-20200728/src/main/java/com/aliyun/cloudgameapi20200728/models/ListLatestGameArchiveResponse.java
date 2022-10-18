// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListLatestGameArchiveResponse extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("DataList")
    @Validation(required = true)
    public java.util.List<ListLatestGameArchiveResponseDataList> dataList;

    public static ListLatestGameArchiveResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLatestGameArchiveResponse self = new ListLatestGameArchiveResponse();
        return TeaModel.build(map, self);
    }

    public ListLatestGameArchiveResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListLatestGameArchiveResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLatestGameArchiveResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLatestGameArchiveResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListLatestGameArchiveResponse setDataList(java.util.List<ListLatestGameArchiveResponseDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListLatestGameArchiveResponseDataList> getDataList() {
        return this.dataList;
    }

    public static class ListLatestGameArchiveResponseDataList extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("ArchiveId")
        @Validation(required = true)
        public String archiveId;

        @NameInMap("ArchiveTime")
        @Validation(required = true)
        public String archiveTime;

        @NameInMap("GameId")
        @Validation(required = true)
        public String gameId;

        @NameInMap("TagStatus")
        @Validation(required = true)
        public Long tagStatus;

        public static ListLatestGameArchiveResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLatestGameArchiveResponseDataList self = new ListLatestGameArchiveResponseDataList();
            return TeaModel.build(map, self);
        }

        public ListLatestGameArchiveResponseDataList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListLatestGameArchiveResponseDataList setArchiveId(String archiveId) {
            this.archiveId = archiveId;
            return this;
        }
        public String getArchiveId() {
            return this.archiveId;
        }

        public ListLatestGameArchiveResponseDataList setArchiveTime(String archiveTime) {
            this.archiveTime = archiveTime;
            return this;
        }
        public String getArchiveTime() {
            return this.archiveTime;
        }

        public ListLatestGameArchiveResponseDataList setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public ListLatestGameArchiveResponseDataList setTagStatus(Long tagStatus) {
            this.tagStatus = tagStatus;
            return this;
        }
        public Long getTagStatus() {
            return this.tagStatus;
        }

    }

}
