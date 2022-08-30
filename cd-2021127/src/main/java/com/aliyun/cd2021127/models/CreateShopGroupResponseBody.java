// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateShopGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<String> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateShopGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateShopGroupResponseBody self = new CreateShopGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateShopGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateShopGroupResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public CreateShopGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateShopGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateShopGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateShopGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchCreateShopGroupResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("ShopGroupId")
        public String shopGroupId;

        public static BatchCreateShopGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateShopGroupResponseBodyData self = new BatchCreateShopGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchCreateShopGroupResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchCreateShopGroupResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchCreateShopGroupResponseBodyData setShopGroupId(String shopGroupId) {
            this.shopGroupId = shopGroupId;
            return this;
        }
        public String getShopGroupId() {
            return this.shopGroupId;
        }

    }

}
