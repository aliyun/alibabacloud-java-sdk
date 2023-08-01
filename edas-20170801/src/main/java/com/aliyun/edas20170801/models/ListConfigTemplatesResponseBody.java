// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConfigTemplatesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Data")
    public ListConfigTemplatesResponseBodyData data;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The content of the configuration template.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The description of the configuration template.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The data format of the configuration template.</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The time when the configuration template was created.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the configuration template was updated.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the configuration template.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the configuration template.</p>
         */
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
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The configuration templates.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListConfigTemplatesResponseBodyDataResult> result;

        /**
         * <p>The total number of configuration templates.</p>
         */
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
