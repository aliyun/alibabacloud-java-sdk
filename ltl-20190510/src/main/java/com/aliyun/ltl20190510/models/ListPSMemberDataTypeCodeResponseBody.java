// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListPSMemberDataTypeCodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListPSMemberDataTypeCodeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPSMemberDataTypeCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPSMemberDataTypeCodeResponseBody self = new ListPSMemberDataTypeCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPSMemberDataTypeCodeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPSMemberDataTypeCodeResponseBody setData(ListPSMemberDataTypeCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPSMemberDataTypeCodeResponseBodyData getData() {
        return this.data;
    }

    public ListPSMemberDataTypeCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPSMemberDataTypeCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPSMemberDataTypeCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPSMemberDataTypeCodeResponseBodyDataPageData extends TeaModel {
        @NameInMap("DataTypeCode")
        public String dataTypeCode;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("MemberUid")
        public String memberUid;

        public static ListPSMemberDataTypeCodeResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListPSMemberDataTypeCodeResponseBodyDataPageData self = new ListPSMemberDataTypeCodeResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListPSMemberDataTypeCodeResponseBodyDataPageData setDataTypeCode(String dataTypeCode) {
            this.dataTypeCode = dataTypeCode;
            return this;
        }
        public String getDataTypeCode() {
            return this.dataTypeCode;
        }

        public ListPSMemberDataTypeCodeResponseBodyDataPageData setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListPSMemberDataTypeCodeResponseBodyDataPageData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public ListPSMemberDataTypeCodeResponseBodyDataPageData setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

    }

    public static class ListPSMemberDataTypeCodeResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListPSMemberDataTypeCodeResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListPSMemberDataTypeCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPSMemberDataTypeCodeResponseBodyData self = new ListPSMemberDataTypeCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPSMemberDataTypeCodeResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListPSMemberDataTypeCodeResponseBodyData setPageData(java.util.List<ListPSMemberDataTypeCodeResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListPSMemberDataTypeCodeResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListPSMemberDataTypeCodeResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListPSMemberDataTypeCodeResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
