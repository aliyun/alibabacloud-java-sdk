// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCategoriesByTaskIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetCategoriesByTaskIdResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCategoriesByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCategoriesByTaskIdResponseBody self = new GetCategoriesByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCategoriesByTaskIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCategoriesByTaskIdResponseBody setData(java.util.List<GetCategoriesByTaskIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCategoriesByTaskIdResponseBodyData> getData() {
        return this.data;
    }

    public GetCategoriesByTaskIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCategoriesByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCategoriesByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCategoriesByTaskIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCategoriesByTaskIdResponseBodyDataChildren extends TeaModel {
        @NameInMap("Category")
        public String category;

        public static GetCategoriesByTaskIdResponseBodyDataChildren build(java.util.Map<String, ?> map) throws Exception {
            GetCategoriesByTaskIdResponseBodyDataChildren self = new GetCategoriesByTaskIdResponseBodyDataChildren();
            return TeaModel.build(map, self);
        }

        public GetCategoriesByTaskIdResponseBodyDataChildren setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class GetCategoriesByTaskIdResponseBodyData extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Children")
        public java.util.List<GetCategoriesByTaskIdResponseBodyDataChildren> children;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static GetCategoriesByTaskIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCategoriesByTaskIdResponseBodyData self = new GetCategoriesByTaskIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCategoriesByTaskIdResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetCategoriesByTaskIdResponseBodyData setChildren(java.util.List<GetCategoriesByTaskIdResponseBodyDataChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<GetCategoriesByTaskIdResponseBodyDataChildren> getChildren() {
            return this.children;
        }

        public GetCategoriesByTaskIdResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
