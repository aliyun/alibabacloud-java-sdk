// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllProductKeyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllProductKeyResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllProductKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllProductKeyResponseBody self = new ListAllProductKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllProductKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllProductKeyResponseBody setData(java.util.List<ListAllProductKeyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllProductKeyResponseBodyData> getData() {
        return this.data;
    }

    public ListAllProductKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAllProductKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllProductKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllProductKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllProductKeyResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("ProductKey")
        public String productKey;

        public static ListAllProductKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllProductKeyResponseBodyData self = new ListAllProductKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllProductKeyResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAllProductKeyResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
