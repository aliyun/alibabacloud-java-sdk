// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListShiftPersonnelsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page. Minimum value: 1. Maximum value: 100. Default value: 1.</p>
     */
    @NameInMap("Paging")
    public ListShiftPersonnelsResponseBodyPaging paging;

    /**
     * <p>The pagination data.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListShiftPersonnelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShiftPersonnelsResponseBody self = new ListShiftPersonnelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShiftPersonnelsResponseBody setPaging(ListShiftPersonnelsResponseBodyPaging paging) {
        this.paging = paging;
        return this;
    }
    public ListShiftPersonnelsResponseBodyPaging getPaging() {
        return this.paging;
    }

    public ListShiftPersonnelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListShiftPersonnelsResponseBodyPagingShiftPersons extends TeaModel {
        /**
         * <p>The time when the on-duty engineer ends the shift.</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The time when the on-duty engineer starts the shift.</p>
         */
        @NameInMap("ShiftPersonName")
        public String shiftPersonName;

        /**
         * <p>The name of the on-duty engineer.</p>
         */
        @NameInMap("ShiftPersonUID")
        public String shiftPersonUID;

        public static ListShiftPersonnelsResponseBodyPagingShiftPersons build(java.util.Map<String, ?> map) throws Exception {
            ListShiftPersonnelsResponseBodyPagingShiftPersons self = new ListShiftPersonnelsResponseBodyPagingShiftPersons();
            return TeaModel.build(map, self);
        }

        public ListShiftPersonnelsResponseBodyPagingShiftPersons setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public ListShiftPersonnelsResponseBodyPagingShiftPersons setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListShiftPersonnelsResponseBodyPagingShiftPersons setShiftPersonName(String shiftPersonName) {
            this.shiftPersonName = shiftPersonName;
            return this;
        }
        public String getShiftPersonName() {
            return this.shiftPersonName;
        }

        public ListShiftPersonnelsResponseBodyPagingShiftPersons setShiftPersonUID(String shiftPersonUID) {
            this.shiftPersonUID = shiftPersonUID;
            return this;
        }
        public String getShiftPersonUID() {
            return this.shiftPersonUID;
        }

    }

    public static class ListShiftPersonnelsResponseBodyPaging extends TeaModel {
        /**
         * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The UID of the on-duty engineer.</p>
         */
        @NameInMap("ShiftPersons")
        public java.util.List<ListShiftPersonnelsResponseBodyPagingShiftPersons> shiftPersons;

        /**
         * <p>The on-duty engineers in the shift schedule.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListShiftPersonnelsResponseBodyPaging build(java.util.Map<String, ?> map) throws Exception {
            ListShiftPersonnelsResponseBodyPaging self = new ListShiftPersonnelsResponseBodyPaging();
            return TeaModel.build(map, self);
        }

        public ListShiftPersonnelsResponseBodyPaging setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListShiftPersonnelsResponseBodyPaging setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListShiftPersonnelsResponseBodyPaging setShiftPersons(java.util.List<ListShiftPersonnelsResponseBodyPagingShiftPersons> shiftPersons) {
            this.shiftPersons = shiftPersons;
            return this;
        }
        public java.util.List<ListShiftPersonnelsResponseBodyPagingShiftPersons> getShiftPersons() {
            return this.shiftPersons;
        }

        public ListShiftPersonnelsResponseBodyPaging setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
