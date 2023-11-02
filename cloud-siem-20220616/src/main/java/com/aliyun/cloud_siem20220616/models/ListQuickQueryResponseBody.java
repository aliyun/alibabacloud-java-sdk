// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListQuickQueryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListQuickQueryResponseBodyData data;

    @NameInMap("DyCode")
    public String dyCode;

    @NameInMap("DyMessage")
    public String dyMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListQuickQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuickQueryResponseBody self = new ListQuickQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuickQueryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListQuickQueryResponseBody setData(ListQuickQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQuickQueryResponseBodyData getData() {
        return this.data;
    }

    public ListQuickQueryResponseBody setDyCode(String dyCode) {
        this.dyCode = dyCode;
        return this;
    }
    public String getDyCode() {
        return this.dyCode;
    }

    public ListQuickQueryResponseBody setDyMessage(String dyMessage) {
        this.dyMessage = dyMessage;
        return this;
    }
    public String getDyMessage() {
        return this.dyMessage;
    }

    public ListQuickQueryResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListQuickQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQuickQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQuickQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQuickQueryResponseBodyDataQuickQueryList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Query")
        public String query;

        @NameInMap("SearchName")
        public String searchName;

        public static ListQuickQueryResponseBodyDataQuickQueryList build(java.util.Map<String, ?> map) throws Exception {
            ListQuickQueryResponseBodyDataQuickQueryList self = new ListQuickQueryResponseBodyDataQuickQueryList();
            return TeaModel.build(map, self);
        }

        public ListQuickQueryResponseBodyDataQuickQueryList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListQuickQueryResponseBodyDataQuickQueryList setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public ListQuickQueryResponseBodyDataQuickQueryList setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

    public static class ListQuickQueryResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("QuickQueryList")
        public java.util.List<ListQuickQueryResponseBodyDataQuickQueryList> quickQueryList;

        @NameInMap("Total")
        public Integer total;

        public static ListQuickQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQuickQueryResponseBodyData self = new ListQuickQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQuickQueryResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListQuickQueryResponseBodyData setQuickQueryList(java.util.List<ListQuickQueryResponseBodyDataQuickQueryList> quickQueryList) {
            this.quickQueryList = quickQueryList;
            return this;
        }
        public java.util.List<ListQuickQueryResponseBodyDataQuickQueryList> getQuickQueryList() {
            return this.quickQueryList;
        }

        public ListQuickQueryResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
