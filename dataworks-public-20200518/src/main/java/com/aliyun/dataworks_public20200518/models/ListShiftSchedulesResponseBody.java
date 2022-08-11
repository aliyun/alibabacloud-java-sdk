// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListShiftSchedulesResponseBody extends TeaModel {
    @NameInMap("Paging")
    public ListShiftSchedulesResponseBodyPaging paging;

    @NameInMap("RequestId")
    public String requestId;

    public static ListShiftSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShiftSchedulesResponseBody self = new ListShiftSchedulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShiftSchedulesResponseBody setPaging(ListShiftSchedulesResponseBodyPaging paging) {
        this.paging = paging;
        return this;
    }
    public ListShiftSchedulesResponseBodyPaging getPaging() {
        return this.paging;
    }

    public ListShiftSchedulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListShiftSchedulesResponseBodyPagingShiftSchedules extends TeaModel {
        @NameInMap("ShiftScheduleIdentifier")
        public String shiftScheduleIdentifier;

        @NameInMap("ShiftScheduleName")
        public String shiftScheduleName;

        public static ListShiftSchedulesResponseBodyPagingShiftSchedules build(java.util.Map<String, ?> map) throws Exception {
            ListShiftSchedulesResponseBodyPagingShiftSchedules self = new ListShiftSchedulesResponseBodyPagingShiftSchedules();
            return TeaModel.build(map, self);
        }

        public ListShiftSchedulesResponseBodyPagingShiftSchedules setShiftScheduleIdentifier(String shiftScheduleIdentifier) {
            this.shiftScheduleIdentifier = shiftScheduleIdentifier;
            return this;
        }
        public String getShiftScheduleIdentifier() {
            return this.shiftScheduleIdentifier;
        }

        public ListShiftSchedulesResponseBodyPagingShiftSchedules setShiftScheduleName(String shiftScheduleName) {
            this.shiftScheduleName = shiftScheduleName;
            return this;
        }
        public String getShiftScheduleName() {
            return this.shiftScheduleName;
        }

    }

    public static class ListShiftSchedulesResponseBodyPaging extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ShiftSchedules")
        public java.util.List<ListShiftSchedulesResponseBodyPagingShiftSchedules> shiftSchedules;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListShiftSchedulesResponseBodyPaging build(java.util.Map<String, ?> map) throws Exception {
            ListShiftSchedulesResponseBodyPaging self = new ListShiftSchedulesResponseBodyPaging();
            return TeaModel.build(map, self);
        }

        public ListShiftSchedulesResponseBodyPaging setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListShiftSchedulesResponseBodyPaging setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListShiftSchedulesResponseBodyPaging setShiftSchedules(java.util.List<ListShiftSchedulesResponseBodyPagingShiftSchedules> shiftSchedules) {
            this.shiftSchedules = shiftSchedules;
            return this;
        }
        public java.util.List<ListShiftSchedulesResponseBodyPagingShiftSchedules> getShiftSchedules() {
            return this.shiftSchedules;
        }

        public ListShiftSchedulesResponseBodyPaging setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
