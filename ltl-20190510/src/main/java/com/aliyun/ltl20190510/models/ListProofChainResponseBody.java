// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListProofChainResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListProofChainResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListProofChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProofChainResponseBody self = new ListProofChainResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProofChainResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListProofChainResponseBody setData(ListProofChainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProofChainResponseBodyData getData() {
        return this.data;
    }

    public ListProofChainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProofChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProofChainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProofChainResponseBodyDataPageData extends TeaModel {
        @NameInMap("BizChainCode")
        public String bizChainCode;

        @NameInMap("BizChainId")
        public String bizChainId;

        @NameInMap("DataTypeCode")
        public String dataTypeCode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RoleType")
        public String roleType;

        public static ListProofChainResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListProofChainResponseBodyDataPageData self = new ListProofChainResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListProofChainResponseBodyDataPageData setBizChainCode(String bizChainCode) {
            this.bizChainCode = bizChainCode;
            return this;
        }
        public String getBizChainCode() {
            return this.bizChainCode;
        }

        public ListProofChainResponseBodyDataPageData setBizChainId(String bizChainId) {
            this.bizChainId = bizChainId;
            return this;
        }
        public String getBizChainId() {
            return this.bizChainId;
        }

        public ListProofChainResponseBodyDataPageData setDataTypeCode(String dataTypeCode) {
            this.dataTypeCode = dataTypeCode;
            return this;
        }
        public String getDataTypeCode() {
            return this.dataTypeCode;
        }

        public ListProofChainResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProofChainResponseBodyDataPageData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListProofChainResponseBodyDataPageData setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class ListProofChainResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListProofChainResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListProofChainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProofChainResponseBodyData self = new ListProofChainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProofChainResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListProofChainResponseBodyData setPageData(java.util.List<ListProofChainResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListProofChainResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListProofChainResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListProofChainResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
