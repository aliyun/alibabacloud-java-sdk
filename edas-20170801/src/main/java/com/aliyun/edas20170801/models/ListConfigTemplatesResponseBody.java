// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConfigTemplatesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListConfigTemplatesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListConfigTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigTemplatesResponseBody self = new ListConfigTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigTemplatesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListConfigTemplatesResponseBody setData(ListConfigTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConfigTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListConfigTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConfigTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConfigTemplatesResponseBodyDataResult extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Description")
        public String description;

        @NameInMap("Format")
        public String format;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListConfigTemplatesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListConfigTemplatesResponseBodyDataResult self = new ListConfigTemplatesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListConfigTemplatesResponseBodyDataResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListConfigTemplatesResponseBodyDataResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConfigTemplatesResponseBodyDataResult setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListConfigTemplatesResponseBodyDataResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListConfigTemplatesResponseBodyDataResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListConfigTemplatesResponseBodyDataResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListConfigTemplatesResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListConfigTemplatesResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListConfigTemplatesResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListConfigTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConfigTemplatesResponseBodyData self = new ListConfigTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConfigTemplatesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListConfigTemplatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConfigTemplatesResponseBodyData setResult(java.util.List<ListConfigTemplatesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListConfigTemplatesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListConfigTemplatesResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
