// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumDataForPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRumDataForPageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>StartTime is mandatory for this action.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("Authentication")
        public String authentication;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Completion")
        public String completion;

        @NameInMap("Items")
        public java.util.List<java.util.Map<String, ?>> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public String page;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("Preference")
        public String preference;

        /**
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
