// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDutyRostersResponseBody extends TeaModel {
    @NameInMap("Paging")
    public ListDutyRostersResponseBodyPaging paging;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListDutyRostersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDutyRostersResponseBody self = new ListDutyRostersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDutyRostersResponseBody setPaging(ListDutyRostersResponseBodyPaging paging) {
        this.paging = paging;
        return this;
    }
    public ListDutyRostersResponseBodyPaging getPaging() {
        return this.paging;
    }

    public ListDutyRostersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDutyRostersResponseBodyPagingDutyRosters extends TeaModel {
        @NameInMap("DutyRosterIdentifier")
        public String dutyRosterIdentifier;

        @NameInMap("DutyRosterName")
        public String dutyRosterName;

        public static ListDutyRostersResponseBodyPagingDutyRosters build(java.util.Map<String, ?> map) throws Exception {
            ListDutyRostersResponseBodyPagingDutyRosters self = new ListDutyRostersResponseBodyPagingDutyRosters();
            return TeaModel.build(map, self);
        }

        public ListDutyRostersResponseBodyPagingDutyRosters setDutyRosterIdentifier(String dutyRosterIdentifier) {
            this.dutyRosterIdentifier = dutyRosterIdentifier;
            return this;
        }
        public String getDutyRosterIdentifier() {
            return this.dutyRosterIdentifier;
        }

        public ListDutyRostersResponseBodyPagingDutyRosters setDutyRosterName(String dutyRosterName) {
            this.dutyRosterName = dutyRosterName;
            return this;
        }
        public String getDutyRosterName() {
            return this.dutyRosterName;
        }

    }

    public static class ListDutyRostersResponseBodyPaging extends TeaModel {
        @NameInMap("DutyRosters")
        public java.util.List<ListDutyRostersResponseBodyPagingDutyRosters> dutyRosters;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDutyRostersResponseBodyPaging build(java.util.Map<String, ?> map) throws Exception {
            ListDutyRostersResponseBodyPaging self = new ListDutyRostersResponseBodyPaging();
            return TeaModel.build(map, self);
        }

        public ListDutyRostersResponseBodyPaging setDutyRosters(java.util.List<ListDutyRostersResponseBodyPagingDutyRosters> dutyRosters) {
            this.dutyRosters = dutyRosters;
            return this;
        }
        public java.util.List<ListDutyRostersResponseBodyPagingDutyRosters> getDutyRosters() {
            return this.dutyRosters;
        }

        public ListDutyRostersResponseBodyPaging setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDutyRostersResponseBodyPaging setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDutyRostersResponseBodyPaging setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
