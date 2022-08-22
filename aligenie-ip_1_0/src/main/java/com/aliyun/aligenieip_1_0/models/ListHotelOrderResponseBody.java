// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public ListHotelOrderResponseBodyPage page;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListHotelOrderResponseBodyResult> result;

    public static ListHotelOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotelOrderResponseBody self = new ListHotelOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotelOrderResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListHotelOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotelOrderResponseBody setPage(ListHotelOrderResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public ListHotelOrderResponseBodyPage getPage() {
        return this.page;
    }

    public ListHotelOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotelOrderResponseBody setResult(java.util.List<ListHotelOrderResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListHotelOrderResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListHotelOrderResponseBodyPage extends TeaModel {
        @NameInMap("HasNext")
        public Boolean hasNext;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListHotelOrderResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            ListHotelOrderResponseBodyPage self = new ListHotelOrderResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public ListHotelOrderResponseBodyPage setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListHotelOrderResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHotelOrderResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHotelOrderResponseBodyPage setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListHotelOrderResponseBodyPage setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

    public static class ListHotelOrderResponseBodyResult extends TeaModel {
        @NameInMap("ApplyAmt")
        public Long applyAmt;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("OrderNo")
        public String orderNo;

        @NameInMap("Quantity")
        public Long quantity;

        @NameInMap("RoomNo")
        public String roomNo;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("TypeIconUrl")
        public String typeIconUrl;

        @NameInMap("TypeName")
        public String typeName;

        public static ListHotelOrderResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListHotelOrderResponseBodyResult self = new ListHotelOrderResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListHotelOrderResponseBodyResult setApplyAmt(Long applyAmt) {
            this.applyAmt = applyAmt;
            return this;
        }
        public Long getApplyAmt() {
            return this.applyAmt;
        }

        public ListHotelOrderResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListHotelOrderResponseBodyResult setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }
        public String getOrderNo() {
            return this.orderNo;
        }

        public ListHotelOrderResponseBodyResult setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

        public ListHotelOrderResponseBodyResult setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public ListHotelOrderResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHotelOrderResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHotelOrderResponseBodyResult setTypeIconUrl(String typeIconUrl) {
            this.typeIconUrl = typeIconUrl;
            return this;
        }
        public String getTypeIconUrl() {
            return this.typeIconUrl;
        }

        public ListHotelOrderResponseBodyResult setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
