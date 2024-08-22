// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumDataForPageResponseBody extends TeaModel {
    /**
     * <p>The responses code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the operation.</p>
     */
    @NameInMap("Data")
    public GetRumDataForPageResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>StartTime is mandatory for this action.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetRumDataForPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRumDataForPageResponseBody self = new GetRumDataForPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRumDataForPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRumDataForPageResponseBody setData(GetRumDataForPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRumDataForPageResponseBodyData getData() {
        return this.data;
    }

    public GetRumDataForPageResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRumDataForPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRumDataForPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRumDataForPageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetRumDataForPageResponseBodyData extends TeaModel {
        /**
         * <p>A reserved parameter. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Authentication")
        public String authentication;

        /**
         * <p>Indicates whether the query ends. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Completion")
        public String completion;

        /**
         * <p>The queried data.</p>
         */
        @NameInMap("Items")
        public java.util.List<java.util.Map<String, ?>> items;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public String page;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>A reserved parameter. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Preference")
        public String preference;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Total")
        public String total;

        public static GetRumDataForPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRumDataForPageResponseBodyData self = new GetRumDataForPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRumDataForPageResponseBodyData setAuthentication(String authentication) {
            this.authentication = authentication;
            return this;
        }
        public String getAuthentication() {
            return this.authentication;
        }

        public GetRumDataForPageResponseBodyData setCompletion(String completion) {
            this.completion = completion;
            return this;
        }
        public String getCompletion() {
            return this.completion;
        }

        public GetRumDataForPageResponseBodyData setItems(java.util.List<java.util.Map<String, ?>> items) {
            this.items = items;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

        public GetRumDataForPageResponseBodyData setPage(String page) {
            this.page = page;
            return this;
        }
        public String getPage() {
            return this.page;
        }

        public GetRumDataForPageResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public GetRumDataForPageResponseBodyData setPreference(String preference) {
            this.preference = preference;
            return this;
        }
        public String getPreference() {
            return this.preference;
        }

        public GetRumDataForPageResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
