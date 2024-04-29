// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class PageListLabReservationsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LabReservations")
    public java.util.List<PageListLabReservationsResponseBodyLabReservations> labReservations;

    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("MemberCount")
        public Long memberCount;

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
