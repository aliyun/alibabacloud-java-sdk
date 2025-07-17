// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryCommercialUsageResponseBody extends TeaModel {
    /**
     * <p>The response status. Valid values: 2XX: The request is successful. 3XX: A redirection message is returned. 4XX: The request is invalid. 5XX: A server error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public QueryCommercialUsageResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>99A663CB-8D7B-4B0D-A006-03C8EE38E7BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryCommercialUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCommercialUsageResponseBody self = new QueryCommercialUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCommercialUsageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryCommercialUsageResponseBody setData(QueryCommercialUsageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCommercialUsageResponseBodyData getData() {
        return this.data;
    }

    public QueryCommercialUsageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryCommercialUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCommercialUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCommercialUsageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCommercialUsageResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether a multi-region query is complete. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Complete")
        public Boolean complete;

        /**
         * <p>The returned struct.</p>
         */
        @NameInMap("Items")
        public java.util.List<java.util.Map<String, ?>> items;

        public static QueryCommercialUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCommercialUsageResponseBodyData self = new QueryCommercialUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCommercialUsageResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public QueryCommercialUsageResponseBodyData setItems(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

    }

}
