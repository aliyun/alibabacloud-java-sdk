// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public ListHotelOrderResponseBodyPage page;

    /**
     * <strong>example:</strong>
     * <p>07F61FDA-606F-10A0-8ED0-C6CE62710A48</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>21.5</p>
         */
        @NameInMap("ApplyAmt")
        public Long applyAmt;

        /**
         * <strong>example:</strong>
         * <p>1659952892000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>20220808180132000114508555527711</p>
         */
        @NameInMap("OrderNo")
        public String orderNo;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Quantity")
        public Long quantity;

        /**
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("RoomNo")
        public String roomNo;

        /**
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>REPAIR</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingfenlei/shebeiweixiu.png">https://ailabsaicloudservice.alicdn.com/hotel/icon/changjingfenlei/shebeiweixiu.png</a></p>
         */
        @NameInMap("TypeIconUrl")
        public String typeIconUrl;

        /**
         * <strong>example:</strong>
         * <p>设备维修</p>
         */
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
