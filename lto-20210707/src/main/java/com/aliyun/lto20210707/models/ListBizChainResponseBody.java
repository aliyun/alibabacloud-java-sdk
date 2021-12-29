// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBizChainResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListBizChainResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBizChainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBizChainResponseBody self = new ListBizChainResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBizChainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBizChainResponseBody setData(ListBizChainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBizChainResponseBodyData getData() {
        return this.data;
    }

    public ListBizChainResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBizChainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBizChainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBizChainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBizChainResponseBodyDataPageData extends TeaModel {
        @NameInMap("BizChainId")
        public String bizChainId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Type")
        public String type;

        public static ListBizChainResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListBizChainResponseBodyDataPageData self = new ListBizChainResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListBizChainResponseBodyDataPageData setBizChainId(String bizChainId) {
            this.bizChainId = bizChainId;
            return this;
        }
        public String getBizChainId() {
            return this.bizChainId;
        }

        public ListBizChainResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBizChainResponseBodyDataPageData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListBizChainResponseBodyDataPageData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListBizChainResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListBizChainResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListBizChainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBizChainResponseBodyData self = new ListBizChainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBizChainResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListBizChainResponseBodyData setPageData(java.util.List<ListBizChainResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListBizChainResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListBizChainResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListBizChainResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
