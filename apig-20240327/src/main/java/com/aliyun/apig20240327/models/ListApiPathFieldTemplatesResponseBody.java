// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListApiPathFieldTemplatesResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListApiPathFieldTemplatesResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListApiPathFieldTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiPathFieldTemplatesResponseBody self = new ListApiPathFieldTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiPathFieldTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApiPathFieldTemplatesResponseBody setData(ListApiPathFieldTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListApiPathFieldTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListApiPathFieldTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApiPathFieldTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApiPathFieldTemplatesResponseBodyDataItems extends TeaModel {
        /**
         * <p>The request path corresponding to the field template.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The API protocol applicable to the field template.</p>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The ID of the field template.</p>
         * 
         * <strong>example:</strong>
         * <p>atpl-ec5df7baf496bfac</p>
         */
        @NameInMap("templateId")
        public String templateId;

        public static ListApiPathFieldTemplatesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListApiPathFieldTemplatesResponseBodyDataItems self = new ListApiPathFieldTemplatesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListApiPathFieldTemplatesResponseBodyDataItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListApiPathFieldTemplatesResponseBodyDataItems setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListApiPathFieldTemplatesResponseBodyDataItems setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class ListApiPathFieldTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>The list of field templates. Each element in the items list is a field template record that contains the templateId, path, and protocol.</p>
         */
        @NameInMap("items")
        public java.util.List<ListApiPathFieldTemplatesResponseBodyDataItems> items;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListApiPathFieldTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApiPathFieldTemplatesResponseBodyData self = new ListApiPathFieldTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApiPathFieldTemplatesResponseBodyData setItems(java.util.List<ListApiPathFieldTemplatesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListApiPathFieldTemplatesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListApiPathFieldTemplatesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListApiPathFieldTemplatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListApiPathFieldTemplatesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
