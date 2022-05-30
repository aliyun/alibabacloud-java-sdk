// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDutyRosterResponseBody extends TeaModel {
    @NameInMap("Paging")
    public GetDutyRosterResponseBodyPaging paging;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetDutyRosterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDutyRosterResponseBody self = new GetDutyRosterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDutyRosterResponseBody setPaging(GetDutyRosterResponseBodyPaging paging) {
        this.paging = paging;
        return this;
    }
    public GetDutyRosterResponseBodyPaging getPaging() {
        return this.paging;
    }

    public GetDutyRosterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDutyRosterResponseBodyPagingDutyRoster extends TeaModel {
        @NameInMap("EndLong")
        public Long endLong;

        @NameInMap("StartLong")
        public Long startLong;

        @NameInMap("Watchkeeper")
        public String watchkeeper;

        @NameInMap("WatchkeeperName")
        public String watchkeeperName;

        public static GetDutyRosterResponseBodyPagingDutyRoster build(java.util.Map<String, ?> map) throws Exception {
            GetDutyRosterResponseBodyPagingDutyRoster self = new GetDutyRosterResponseBodyPagingDutyRoster();
            return TeaModel.build(map, self);
        }

        public GetDutyRosterResponseBodyPagingDutyRoster setEndLong(Long endLong) {
            this.endLong = endLong;
            return this;
        }
        public Long getEndLong() {
            return this.endLong;
        }

        public GetDutyRosterResponseBodyPagingDutyRoster setStartLong(Long startLong) {
            this.startLong = startLong;
            return this;
        }
        public Long getStartLong() {
            return this.startLong;
        }

        public GetDutyRosterResponseBodyPagingDutyRoster setWatchkeeper(String watchkeeper) {
            this.watchkeeper = watchkeeper;
            return this;
        }
        public String getWatchkeeper() {
            return this.watchkeeper;
        }

        public GetDutyRosterResponseBodyPagingDutyRoster setWatchkeeperName(String watchkeeperName) {
            this.watchkeeperName = watchkeeperName;
            return this;
        }
        public String getWatchkeeperName() {
            return this.watchkeeperName;
        }

    }

    public static class GetDutyRosterResponseBodyPaging extends TeaModel {
        @NameInMap("DutyRoster")
        public java.util.List<GetDutyRosterResponseBodyPagingDutyRoster> dutyRoster;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetDutyRosterResponseBodyPaging build(java.util.Map<String, ?> map) throws Exception {
            GetDutyRosterResponseBodyPaging self = new GetDutyRosterResponseBodyPaging();
            return TeaModel.build(map, self);
        }

        public GetDutyRosterResponseBodyPaging setDutyRoster(java.util.List<GetDutyRosterResponseBodyPagingDutyRoster> dutyRoster) {
            this.dutyRoster = dutyRoster;
            return this;
        }
        public java.util.List<GetDutyRosterResponseBodyPagingDutyRoster> getDutyRoster() {
            return this.dutyRoster;
        }

        public GetDutyRosterResponseBodyPaging setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetDutyRosterResponseBodyPaging setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetDutyRosterResponseBodyPaging setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
