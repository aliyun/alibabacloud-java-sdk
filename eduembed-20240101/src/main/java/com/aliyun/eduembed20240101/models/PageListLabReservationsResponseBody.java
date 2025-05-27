// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class PageListLabReservationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LabReservations")
    public java.util.List<PageListLabReservationsResponseBodyLabReservations> labReservations;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>9ADC729B-...</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static PageListLabReservationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageListLabReservationsResponseBody self = new PageListLabReservationsResponseBody();
        return TeaModel.build(map, self);
    }

    public PageListLabReservationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageListLabReservationsResponseBody setLabReservations(java.util.List<PageListLabReservationsResponseBodyLabReservations> labReservations) {
        this.labReservations = labReservations;
        return this;
    }
    public java.util.List<PageListLabReservationsResponseBodyLabReservations> getLabReservations() {
        return this.labReservations;
    }

    public PageListLabReservationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageListLabReservationsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PageListLabReservationsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PageListLabReservationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageListLabReservationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PageListLabReservationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class PageListLabReservationsResponseBodyLabReservations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <strong>example:</strong>
         * <p>2023-05-04 09:25:41</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>552</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MemberCount")
        public Long memberCount;

        /**
         * <strong>example:</strong>
         * <p>2023-05-04 07:25:41</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static PageListLabReservationsResponseBodyLabReservations build(java.util.Map<String, ?> map) throws Exception {
            PageListLabReservationsResponseBodyLabReservations self = new PageListLabReservationsResponseBodyLabReservations();
            return TeaModel.build(map, self);
        }

        public PageListLabReservationsResponseBodyLabReservations setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public PageListLabReservationsResponseBodyLabReservations setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public PageListLabReservationsResponseBodyLabReservations setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PageListLabReservationsResponseBodyLabReservations setMemberCount(Long memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Long getMemberCount() {
            return this.memberCount;
        }

        public PageListLabReservationsResponseBodyLabReservations setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
