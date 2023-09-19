// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryShareProductNameByProductKeyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryShareProductNameByProductKeyResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryShareProductNameByProductKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryShareProductNameByProductKeyResponseBody self = new QueryShareProductNameByProductKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryShareProductNameByProductKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryShareProductNameByProductKeyResponseBody setData(QueryShareProductNameByProductKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryShareProductNameByProductKeyResponseBodyData getData() {
        return this.data;
    }

    public QueryShareProductNameByProductKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryShareProductNameByProductKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryShareProductNameByProductKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryShareProductNameByProductKeyResponseBodyData extends TeaModel {
        @NameInMap("ProductName")
        public String productName;

        public static QueryShareProductNameByProductKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryShareProductNameByProductKeyResponseBodyData self = new QueryShareProductNameByProductKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryShareProductNameByProductKeyResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

}
