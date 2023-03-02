// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListMemberResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListMemberResponseBodyData data;

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

    public ListMemberResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListMemberResponseBody setData(ListMemberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMemberResponseBodyData getData() {
        return this.data;
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
        @NameInMap("MemberContact")
        public String memberContact;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("MemberPhone")
        public String memberPhone;

        @NameInMap("MemberUid")
        public String memberUid;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        public static ListMemberResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListMemberResponseBodyDataPageData self = new ListMemberResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListMemberResponseBodyDataPageData setMemberContact(String memberContact) {
            this.memberContact = memberContact;
            return this;
        }
        public String getMemberContact() {
            return this.memberContact;
        }

        public ListMemberResponseBodyDataPageData setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListMemberResponseBodyDataPageData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public ListMemberResponseBodyDataPageData setMemberPhone(String memberPhone) {
            this.memberPhone = memberPhone;
            return this;
        }
        public String getMemberPhone() {
            return this.memberPhone;
        }

        public ListMemberResponseBodyDataPageData setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
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
