// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PageGetHotelRoomDevicesResponseBody extends TeaModel {
    @NameInMap("Extentions")
    public java.util.Map<String, ?> extentions;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public PageGetHotelRoomDevicesResponseBodyPage page;

    /**
     * <strong>example:</strong>
     * <p>4EFBDDF4-B19D-526C-8C3D-CD8AB51974EE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<PageGetHotelRoomDevicesResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Integer statusCode;

    public static PageGetHotelRoomDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageGetHotelRoomDevicesResponseBody self = new PageGetHotelRoomDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public PageGetHotelRoomDevicesResponseBody setExtentions(java.util.Map<String, ?> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    public PageGetHotelRoomDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageGetHotelRoomDevicesResponseBody setPage(PageGetHotelRoomDevicesResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public PageGetHotelRoomDevicesResponseBodyPage getPage() {
        return this.page;
    }

    public PageGetHotelRoomDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageGetHotelRoomDevicesResponseBody setResult(java.util.List<PageGetHotelRoomDevicesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<PageGetHotelRoomDevicesResponseBodyResult> getResult() {
        return this.result;
    }

    public PageGetHotelRoomDevicesResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class PageGetHotelRoomDevicesResponseBodyPage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("End")
        public Integer end;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
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
         * <p>0</p>
         */
        @NameInMap("Start")
        public Integer start;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPage")
        public Integer totalPage;

        public static PageGetHotelRoomDevicesResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            PageGetHotelRoomDevicesResponseBodyPage self = new PageGetHotelRoomDevicesResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public PageGetHotelRoomDevicesResponseBodyPage setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public PageGetHotelRoomDevicesResponseBodyPage setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public PageGetHotelRoomDevicesResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public PageGetHotelRoomDevicesResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public PageGetHotelRoomDevicesResponseBodyPage setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

        public PageGetHotelRoomDevicesResponseBodyPage setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public PageGetHotelRoomDevicesResponseBodyPage setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

    public static class PageGetHotelRoomDevicesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>V21.10.00.313</p>
         */
        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        /**
         * <strong>example:</strong>
         * <p>a7***83</p>
         */
        @NameInMap("HotelId")
        public String hotelId;

        /**
         * <strong>example:</strong>
         * <p>b4:xx:xx:xx:65:2b</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OnlineStatus")
        public Integer onlineStatus;

        /**
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("RoomNo")
        public String roomNo;

        /**
         * <strong>example:</strong>
         * <p>1200xxx048</p>
         */
        @NameInMap("Sn")
        public String sn;

        public static PageGetHotelRoomDevicesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PageGetHotelRoomDevicesResponseBodyResult self = new PageGetHotelRoomDevicesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PageGetHotelRoomDevicesResponseBodyResult setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public PageGetHotelRoomDevicesResponseBodyResult setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public PageGetHotelRoomDevicesResponseBodyResult setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public PageGetHotelRoomDevicesResponseBodyResult setOnlineStatus(Integer onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public Integer getOnlineStatus() {
            return this.onlineStatus;
        }

        public PageGetHotelRoomDevicesResponseBodyResult setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public PageGetHotelRoomDevicesResponseBodyResult setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

}
