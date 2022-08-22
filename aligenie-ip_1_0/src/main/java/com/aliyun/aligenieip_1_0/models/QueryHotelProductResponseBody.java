// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelProductResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryHotelProductResponseBodyResult result;

    public static QueryHotelProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelProductResponseBody self = new QueryHotelProductResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHotelProductResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryHotelProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHotelProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHotelProductResponseBody setResult(QueryHotelProductResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryHotelProductResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryHotelProductResponseBodyResult extends TeaModel {
        @NameInMap("HotelId")
        public String hotelId;

        @NameInMap("HotelName")
        public String hotelName;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        public static QueryHotelProductResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryHotelProductResponseBodyResult self = new QueryHotelProductResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryHotelProductResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public QueryHotelProductResponseBodyResult setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public QueryHotelProductResponseBodyResult setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryHotelProductResponseBodyResult setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

}
