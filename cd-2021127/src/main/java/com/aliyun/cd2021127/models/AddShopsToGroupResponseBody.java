// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddShopsToGroupResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 业务数据
    @NameInMap("Data")
    public java.util.List<AddShopsToGroupResponseBodyData> data;

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
        // 错误码
        @NameInMap("Code")
        public String code;

        // 错误信息
        @NameInMap("Message")
        public String message;

        // 门店ID
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
