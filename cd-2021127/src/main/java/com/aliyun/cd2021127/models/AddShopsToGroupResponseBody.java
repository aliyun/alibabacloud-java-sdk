// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddShopsToGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<AddShopsToGroupResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddShopsToGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddShopsToGroupResponseBody self = new AddShopsToGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddShopsToGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddShopsToGroupResponseBody setData(java.util.List<AddShopsToGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddShopsToGroupResponseBodyData> getData() {
        return this.data;
    }

    public AddShopsToGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddShopsToGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddShopsToGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddShopsToGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddShopsToGroupResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("ShopId")
        public String shopId;

        public static AddShopsToGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddShopsToGroupResponseBodyData self = new AddShopsToGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddShopsToGroupResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AddShopsToGroupResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AddShopsToGroupResponseBodyData setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

    }

}
