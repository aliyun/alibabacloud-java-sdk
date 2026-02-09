// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListSslCertsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public ListSslCertsResponseBodyData data;

    /**
     * <p>The response message returned.</p>
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
     * <p>AADF7197-3384-52AF-A2DE-A66696734129</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListSslCertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSslCertsResponseBody self = new ListSslCertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSslCertsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSslCertsResponseBody setData(ListSslCertsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSslCertsResponseBodyData getData() {
        return this.data;
    }

    public ListSslCertsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSslCertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSslCertsResponseBodyData extends TeaModel {
        /**
         * <p>The list of certificate information.</p>
         */
        @NameInMap("items")
        public java.util.List<SslCertMetaInfo> items;

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListSslCertsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSslCertsResponseBodyData self = new ListSslCertsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSslCertsResponseBodyData setItems(java.util.List<SslCertMetaInfo> items) {
            this.items = items;
            return this;
        }
        public java.util.List<SslCertMetaInfo> getItems() {
            return this.items;
        }

        public ListSslCertsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSslCertsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSslCertsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
