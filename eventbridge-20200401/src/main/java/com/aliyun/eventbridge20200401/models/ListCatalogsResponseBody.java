// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListCatalogsResponseBody extends TeaModel {
    /**
     * <p>Response code, 200 indicates success</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Response data</p>
     */
    @NameInMap("Data")
    public ListCatalogsResponseBodyData data;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the operation was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCatalogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsResponseBody self = new ListCatalogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCatalogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCatalogsResponseBody setData(ListCatalogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCatalogsResponseBodyData getData() {
        return this.data;
    }

    public ListCatalogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCatalogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCatalogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCatalogsResponseBodyData extends TeaModel {
        /**
         * <p>Catalog list</p>
         */
        @NameInMap("Catalogs")
        public java.util.List<Catalog> catalogs;

        /**
         * <p>Next page token</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListCatalogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCatalogsResponseBodyData self = new ListCatalogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCatalogsResponseBodyData setCatalogs(java.util.List<Catalog> catalogs) {
            this.catalogs = catalogs;
            return this;
        }
        public java.util.List<Catalog> getCatalogs() {
            return this.catalogs;
        }

        public ListCatalogsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListCatalogsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
