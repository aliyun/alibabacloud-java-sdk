// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListBodyDbsResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListBodyDbsResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static ListBodyDbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBodyDbsResponseBody self = new ListBodyDbsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBodyDbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBodyDbsResponseBody setData(ListBodyDbsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBodyDbsResponseBodyData getData() {
        return this.data;
    }

    public ListBodyDbsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBodyDbsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class ListBodyDbsResponseBodyDataDbList extends TeaModel {
        // 数据库ID
        @NameInMap("Id")
        public Long id;

        // 数据库名称
        @NameInMap("Name")
        public String name;

        public static ListBodyDbsResponseBodyDataDbList build(java.util.Map<String, ?> map) throws Exception {
            ListBodyDbsResponseBodyDataDbList self = new ListBodyDbsResponseBodyDataDbList();
            return TeaModel.build(map, self);
        }

        public ListBodyDbsResponseBodyDataDbList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListBodyDbsResponseBodyDataDbList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListBodyDbsResponseBodyData extends TeaModel {
        // 数据库ID
        @NameInMap("Total")
        public Long total;

        @NameInMap("DbList")
        public java.util.List<ListBodyDbsResponseBodyDataDbList> dbList;

        public static ListBodyDbsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBodyDbsResponseBodyData self = new ListBodyDbsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBodyDbsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListBodyDbsResponseBodyData setDbList(java.util.List<ListBodyDbsResponseBodyDataDbList> dbList) {
            this.dbList = dbList;
            return this;
        }
        public java.util.List<ListBodyDbsResponseBodyDataDbList> getDbList() {
            return this.dbList;
        }

    }

}
