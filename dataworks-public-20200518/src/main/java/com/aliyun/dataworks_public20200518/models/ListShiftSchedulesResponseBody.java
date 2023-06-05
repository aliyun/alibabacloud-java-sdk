// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListShiftSchedulesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page. Minimum value:1. Maximum value: 100.</p>
     */
    @NameInMap("Paging")
    public ListShiftSchedulesResponseBodyPaging paging;

    /**
     * <p>The pagination data.</p>
     */
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
        /**
         * <p>The name of the shift schedule.</p>
         */
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
        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The unique identifier of the shift schedule. You can use the identifier to query the on-duty engineers in the shift schedule.</p>
         */
        @NameInMap("ShiftSchedules")
        public java.util.List<ListShiftSchedulesResponseBodyPagingShiftSchedules> shiftSchedules;

        /**
         * <p>The shift schedules.</p>
         */
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
