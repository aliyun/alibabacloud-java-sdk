// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListMemberAccessRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListMemberAccessRecordResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListMemberAccessRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemberAccessRecordResponseBody self = new ListMemberAccessRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemberAccessRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMemberAccessRecordResponseBody setData(ListMemberAccessRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMemberAccessRecordResponseBodyData getData() {
        return this.data;
    }

    public ListMemberAccessRecordResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMemberAccessRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMemberAccessRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMemberAccessRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMemberAccessRecordResponseBodyDataPageData extends TeaModel {
        @NameInMap("AccessDate")
        public Long accessDate;

        @NameInMap("AccessStatus")
        public String accessStatus;

        @NameInMap("AdminName")
        public String adminName;

        @NameInMap("AuthorizedCount")
        public Long authorizedCount;

        @NameInMap("Contactor")
        public String contactor;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberResponseDate")
        public Long memberResponseDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        @NameInMap("Telephony")
        public String telephony;

        @NameInMap("Uid")
        public String uid;

        public static ListMemberAccessRecordResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListMemberAccessRecordResponseBodyDataPageData self = new ListMemberAccessRecordResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListMemberAccessRecordResponseBodyDataPageData setAccessDate(Long accessDate) {
            this.accessDate = accessDate;
            return this;
        }
        public Long getAccessDate() {
            return this.accessDate;
        }

        public ListMemberAccessRecordResponseBodyDataPageData setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public ListMemberAccessRecordResponseBodyDataPageData setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }
        public String getAdminName() {
            return this.adminName;
        }

        public ListMemberAccessRecordResponseBodyDataPageData setAuthorizedCount(Long authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public Long getAuthorizedCount() {
            return this.authorizedCount;
        }

        public ListMemberAccessRecordResponseBodyDataPageData setContactor(String contactor) {
            this.contactor = contactor;
            return this;
        }
        public String getContactor() {
            return this.contactor;
        }

        public ListMemberAccessRecordResponseBodyDataPageData setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListMemberAccessRecordResponseBodyDataPageData setMemberResponseDate(Long memberResponseDate) {
            this.memberResponseDate = memberResponseDate;
            return this;
        }
        public Long getMemberResponseDate() {
            return this.memberResponseDate;
        }

        public ListMemberAccessRecordResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMemberAccessRecordResponseBodyDataPageData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListMemberAccessRecordResponseBodyDataPageData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMemberAccessRecordResponseBodyDataPageData setTelephony(String telephony) {
            this.telephony = telephony;
            return this;
        }
        public String getTelephony() {
            return this.telephony;
        }

        public ListMemberAccessRecordResponseBodyDataPageData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListMemberAccessRecordResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListMemberAccessRecordResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListMemberAccessRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMemberAccessRecordResponseBodyData self = new ListMemberAccessRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMemberAccessRecordResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListMemberAccessRecordResponseBodyData setPageData(java.util.List<ListMemberAccessRecordResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListMemberAccessRecordResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListMemberAccessRecordResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListMemberAccessRecordResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
