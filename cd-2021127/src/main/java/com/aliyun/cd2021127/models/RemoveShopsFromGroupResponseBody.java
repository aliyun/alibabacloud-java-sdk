// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class RemoveShopsFromGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<RemoveShopsFromGroupResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

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
