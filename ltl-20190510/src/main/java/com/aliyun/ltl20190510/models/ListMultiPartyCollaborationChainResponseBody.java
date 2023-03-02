// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListMultiPartyCollaborationChainResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListMultiPartyCollaborationChainResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListMultiPartyCollaborationChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultiPartyCollaborationChainResponseBody self = new ListMultiPartyCollaborationChainResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultiPartyCollaborationChainResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListMultiPartyCollaborationChainResponseBody setData(ListMultiPartyCollaborationChainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMultiPartyCollaborationChainResponseBodyData getData() {
        return this.data;
    }

    public ListMultiPartyCollaborationChainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMultiPartyCollaborationChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMultiPartyCollaborationChainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMultiPartyCollaborationChainResponseBodyDataPageData extends TeaModel {
        @NameInMap("BizChainId")
        public String bizChainId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RoleType")
        public String roleType;

        public static ListMultiPartyCollaborationChainResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListMultiPartyCollaborationChainResponseBodyDataPageData self = new ListMultiPartyCollaborationChainResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListMultiPartyCollaborationChainResponseBodyDataPageData setBizChainId(String bizChainId) {
            this.bizChainId = bizChainId;
            return this;
        }
        public String getBizChainId() {
            return this.bizChainId;
        }

        public ListMultiPartyCollaborationChainResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMultiPartyCollaborationChainResponseBodyDataPageData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListMultiPartyCollaborationChainResponseBodyDataPageData setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class ListMultiPartyCollaborationChainResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListMultiPartyCollaborationChainResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListMultiPartyCollaborationChainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMultiPartyCollaborationChainResponseBodyData self = new ListMultiPartyCollaborationChainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMultiPartyCollaborationChainResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListMultiPartyCollaborationChainResponseBodyData setPageData(java.util.List<ListMultiPartyCollaborationChainResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListMultiPartyCollaborationChainResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListMultiPartyCollaborationChainResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListMultiPartyCollaborationChainResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
