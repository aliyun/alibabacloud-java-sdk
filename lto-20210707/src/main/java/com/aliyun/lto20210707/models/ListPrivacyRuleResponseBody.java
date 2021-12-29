// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListPrivacyRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListPrivacyRuleResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPrivacyRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivacyRuleResponseBody self = new ListPrivacyRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivacyRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPrivacyRuleResponseBody setData(ListPrivacyRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPrivacyRuleResponseBodyData getData() {
        return this.data;
    }

    public ListPrivacyRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPrivacyRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrivacyRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivacyRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPrivacyRuleResponseBodyDataPageData extends TeaModel {
        @NameInMap("AlgImpl")
        public String algImpl;

        @NameInMap("AlgType")
        public String algType;

        @NameInMap("CurrentUser")
        public Boolean currentUser;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrivacyRuleId")
        public String privacyRuleId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        public static ListPrivacyRuleResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListPrivacyRuleResponseBodyDataPageData self = new ListPrivacyRuleResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListPrivacyRuleResponseBodyDataPageData setAlgImpl(String algImpl) {
            this.algImpl = algImpl;
            return this;
        }
        public String getAlgImpl() {
            return this.algImpl;
        }

        public ListPrivacyRuleResponseBodyDataPageData setAlgType(String algType) {
            this.algType = algType;
            return this;
        }
        public String getAlgType() {
            return this.algType;
        }

        public ListPrivacyRuleResponseBodyDataPageData setCurrentUser(Boolean currentUser) {
            this.currentUser = currentUser;
            return this;
        }
        public Boolean getCurrentUser() {
            return this.currentUser;
        }

        public ListPrivacyRuleResponseBodyDataPageData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public ListPrivacyRuleResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrivacyRuleResponseBodyDataPageData setPrivacyRuleId(String privacyRuleId) {
            this.privacyRuleId = privacyRuleId;
            return this;
        }
        public String getPrivacyRuleId() {
            return this.privacyRuleId;
        }

        public ListPrivacyRuleResponseBodyDataPageData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListPrivacyRuleResponseBodyDataPageData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListPrivacyRuleResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListPrivacyRuleResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListPrivacyRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPrivacyRuleResponseBodyData self = new ListPrivacyRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPrivacyRuleResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListPrivacyRuleResponseBodyData setPageData(java.util.List<ListPrivacyRuleResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListPrivacyRuleResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListPrivacyRuleResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListPrivacyRuleResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
