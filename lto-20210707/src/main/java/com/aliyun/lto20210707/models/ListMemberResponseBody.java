// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListMemberResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListMemberResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemberResponseBody self = new ListMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMemberResponseBody setData(ListMemberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMemberResponseBodyData getData() {
        return this.data;
    }

    public ListMemberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMemberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMemberResponseBodyDataPageData extends TeaModel {
        @NameInMap("AdminName")
        public String adminName;

        @NameInMap("AuthorizedCount")
        public Long authorizedCount;

        @NameInMap("Contactor")
        public String contactor;

        @NameInMap("MemberId")
        public String memberId;

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

        public static ListMemberResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListMemberResponseBodyDataPageData self = new ListMemberResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListMemberResponseBodyDataPageData setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }
        public String getAdminName() {
            return this.adminName;
        }

        public ListMemberResponseBodyDataPageData setAuthorizedCount(Long authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public Long getAuthorizedCount() {
            return this.authorizedCount;
        }

        public ListMemberResponseBodyDataPageData setContactor(String contactor) {
            this.contactor = contactor;
            return this;
        }
        public String getContactor() {
            return this.contactor;
        }

        public ListMemberResponseBodyDataPageData setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListMemberResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMemberResponseBodyDataPageData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListMemberResponseBodyDataPageData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMemberResponseBodyDataPageData setTelephony(String telephony) {
            this.telephony = telephony;
            return this;
        }
        public String getTelephony() {
            return this.telephony;
        }

        public ListMemberResponseBodyDataPageData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListMemberResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListMemberResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListMemberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMemberResponseBodyData self = new ListMemberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMemberResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListMemberResponseBodyData setPageData(java.util.List<ListMemberResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListMemberResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListMemberResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListMemberResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
