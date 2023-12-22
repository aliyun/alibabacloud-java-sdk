// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCasesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCasesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCasesResponseBody self = new ListCasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCasesResponseBody setData(ListCasesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCasesResponseBodyData getData() {
        return this.data;
    }

    public ListCasesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCasesResponseBodyDataList extends TeaModel {
        @NameInMap("AbandonPhase")
        public String abandonPhase;

        @NameInMap("AbandonType")
        public String abandonType;

        @NameInMap("AttemptCount")
        public Long attemptCount;

        @NameInMap("CaseId")
        public String caseId;

        @NameInMap("CustomVariables")
        public String customVariables;

        @NameInMap("FailureReason")
        public String failureReason;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("State")
        public String state;

        public static ListCasesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCasesResponseBodyDataList self = new ListCasesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCasesResponseBodyDataList setAbandonPhase(String abandonPhase) {
            this.abandonPhase = abandonPhase;
            return this;
        }
        public String getAbandonPhase() {
            return this.abandonPhase;
        }

        public ListCasesResponseBodyDataList setAbandonType(String abandonType) {
            this.abandonType = abandonType;
            return this;
        }
        public String getAbandonType() {
            return this.abandonType;
        }

        public ListCasesResponseBodyDataList setAttemptCount(Long attemptCount) {
            this.attemptCount = attemptCount;
            return this;
        }
        public Long getAttemptCount() {
            return this.attemptCount;
        }

        public ListCasesResponseBodyDataList setCaseId(String caseId) {
            this.caseId = caseId;
            return this;
        }
        public String getCaseId() {
            return this.caseId;
        }

        public ListCasesResponseBodyDataList setCustomVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }
        public String getCustomVariables() {
            return this.customVariables;
        }

        public ListCasesResponseBodyDataList setFailureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public String getFailureReason() {
            return this.failureReason;
        }

        public ListCasesResponseBodyDataList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListCasesResponseBodyDataList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListCasesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListCasesResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCasesResponseBodyData self = new ListCasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCasesResponseBodyData setList(java.util.List<ListCasesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCasesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListCasesResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListCasesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListCasesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
