// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListProductPublicationsResponseBody extends TeaModel {
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
    public ListProductPublicationsResponseBodyData data;

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

    public static ListProductPublicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductPublicationsResponseBody self = new ListProductPublicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductPublicationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductPublicationsResponseBody setData(ListProductPublicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductPublicationsResponseBodyData getData() {
        return this.data;
    }

    public ListProductPublicationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProductPublicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProductPublicationsResponseBodyData extends TeaModel {
        /**
         * <p>The list of publication records for the API product. The list element is named productPublication.</p>
         */
        @NameInMap("content")
        public java.util.List<HiMarketProductPublicationDetail> content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListProductPublicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductPublicationsResponseBodyData self = new ListProductPublicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductPublicationsResponseBodyData setContent(java.util.List<HiMarketProductPublicationDetail> content) {
            this.content = content;
            return this;
        }
        public java.util.List<HiMarketProductPublicationDetail> getContent() {
            return this.content;
        }

        public ListProductPublicationsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListProductPublicationsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProductPublicationsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
