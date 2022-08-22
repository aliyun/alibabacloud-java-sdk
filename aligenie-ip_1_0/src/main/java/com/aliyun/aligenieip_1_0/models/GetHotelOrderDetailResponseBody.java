// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelOrderDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetHotelOrderDetailResponseBodyResult> result;

    public static GetHotelOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotelOrderDetailResponseBody self = new GetHotelOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotelOrderDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetHotelOrderDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotelOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotelOrderDetailResponseBody setResult(java.util.List<GetHotelOrderDetailResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetHotelOrderDetailResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetHotelOrderDetailResponseBodyResult extends TeaModel {
        @NameInMap("ApplyAmt")
        public Long applyAmt;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("ItemUrl")
        public String itemUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Quantity")
        public Long quantity;

        public static GetHotelOrderDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetHotelOrderDetailResponseBodyResult self = new GetHotelOrderDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetHotelOrderDetailResponseBodyResult setApplyAmt(Long applyAmt) {
            this.applyAmt = applyAmt;
            return this;
        }
        public Long getApplyAmt() {
            return this.applyAmt;
        }

        public GetHotelOrderDetailResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetHotelOrderDetailResponseBodyResult setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public GetHotelOrderDetailResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHotelOrderDetailResponseBodyResult setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

    }

}
