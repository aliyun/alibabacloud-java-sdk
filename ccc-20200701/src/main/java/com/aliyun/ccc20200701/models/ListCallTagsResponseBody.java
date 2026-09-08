// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallTagsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public ListCallTagsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCallTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallTagsResponseBody self = new ListCallTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallTagsResponseBody setData(ListCallTagsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCallTagsResponseBodyData getData() {
        return this.data;
    }

    public ListCallTagsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCallTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCallTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCallTagsResponseBodyDataList extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the number tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TagA</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static ListCallTagsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCallTagsResponseBodyDataList self = new ListCallTagsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCallTagsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCallTagsResponseBodyDataList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class ListCallTagsResponseBodyData extends TeaModel {
        /**
         * <p>The list of number tags.</p>
         */
        @NameInMap("List")
        public java.util.List<ListCallTagsResponseBodyDataList> list;

        /**
         * <p>The page number, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCallTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallTagsResponseBodyData self = new ListCallTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallTagsResponseBodyData setList(java.util.List<ListCallTagsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCallTagsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListCallTagsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCallTagsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCallTagsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
