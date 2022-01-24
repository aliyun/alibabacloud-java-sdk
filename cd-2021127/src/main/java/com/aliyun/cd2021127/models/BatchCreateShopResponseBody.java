// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchCreateShopResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 业务数据
    @NameInMap("Data")
    public java.util.List<BatchCreateShopResponseBodyData> data;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 说明
    @NameInMap("Message")
    public String message;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    public static BatchCreateShopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateShopResponseBody self = new BatchCreateShopResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateShopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCreateShopResponseBody setData(java.util.List<BatchCreateShopResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchCreateShopResponseBodyData> getData() {
        return this.data;
    }

    public BatchCreateShopResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchCreateShopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCreateShopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateShopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchCreateShopResponseBodyData extends TeaModel {
        // 错误码
        @NameInMap("Code")
        public String code;

        // 错误信息
        @NameInMap("Message")
        public String message;

        // 门店ID
        @NameInMap("ShopId")
        public String shopId;

        public static BatchCreateShopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateShopResponseBodyData self = new BatchCreateShopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchCreateShopResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchCreateShopResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchCreateShopResponseBodyData setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

    }

}
