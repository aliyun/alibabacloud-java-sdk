// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchCreateShopGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<BatchCreateShopGroupResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchCreateShopGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateShopGroupResponseBody self = new BatchCreateShopGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateShopGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCreateShopGroupResponseBody setData(java.util.List<BatchCreateShopGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BatchCreateShopGroupResponseBodyData> getData() {
        return this.data;
    }

    public BatchCreateShopGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchCreateShopGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCreateShopGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateShopGroupResponseBody setSuccess(Boolean success) {
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
