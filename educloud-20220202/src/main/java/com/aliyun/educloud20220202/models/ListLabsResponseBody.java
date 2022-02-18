// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class ListLabsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListLabsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLabsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLabsResponseBody self = new ListLabsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLabsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListLabsResponseBody setData(ListLabsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLabsResponseBodyData getData() {
        return this.data;
    }

    public ListLabsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLabsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLabsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLabsResponseBodyDataList extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Description")
        public String description;

        @NameInMap("LabId")
        public String labId;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Time")
        public String time;

        @NameInMap("Title")
        public String title;

        public static ListLabsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLabsResponseBodyDataList self = new ListLabsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListLabsResponseBodyDataList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListLabsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLabsResponseBodyDataList setLabId(String labId) {
            this.labId = labId;
            return this;
        }
        public String getLabId() {
            return this.labId;
        }

        public ListLabsResponseBodyDataList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListLabsResponseBodyDataList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListLabsResponseBodyDataList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListLabsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListLabsResponseBodyDataList> list;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListLabsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLabsResponseBodyData self = new ListLabsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLabsResponseBodyData setList(java.util.List<ListLabsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListLabsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListLabsResponseBodyData setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListLabsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListLabsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
