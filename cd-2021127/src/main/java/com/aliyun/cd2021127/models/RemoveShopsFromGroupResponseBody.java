// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class RemoveShopsFromGroupResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 业务数据
    @NameInMap("Data")
    public java.util.List<RemoveShopsFromGroupResponseBodyData> data;

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

    public static RemoveShopsFromGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveShopsFromGroupResponseBody self = new RemoveShopsFromGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveShopsFromGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveShopsFromGroupResponseBody setData(java.util.List<RemoveShopsFromGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RemoveShopsFromGroupResponseBodyData> getData() {
        return this.data;
    }

    public RemoveShopsFromGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RemoveShopsFromGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveShopsFromGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveShopsFromGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveShopsFromGroupResponseBodyData extends TeaModel {
        // 错误码
        @NameInMap("Code")
        public String code;

        // 错误信息
        @NameInMap("Message")
        public String message;

        // 门店ID
        @NameInMap("ShopId")
        public String shopId;

        public static RemoveShopsFromGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveShopsFromGroupResponseBodyData self = new RemoveShopsFromGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveShopsFromGroupResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveShopsFromGroupResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveShopsFromGroupResponseBodyData setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

    }

}
