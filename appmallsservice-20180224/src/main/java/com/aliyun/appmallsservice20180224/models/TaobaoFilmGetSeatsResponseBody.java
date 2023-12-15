// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetSeatsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SeatMap")
    public TaobaoFilmGetSeatsResponseBodySeatMap seatMap;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    public static TaobaoFilmGetSeatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetSeatsResponseBody self = new TaobaoFilmGetSeatsResponseBody();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetSeatsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaobaoFilmGetSeatsResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public TaobaoFilmGetSeatsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TaobaoFilmGetSeatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaobaoFilmGetSeatsResponseBody setSeatMap(TaobaoFilmGetSeatsResponseBodySeatMap seatMap) {
        this.seatMap = seatMap;
        return this;
    }
    public TaobaoFilmGetSeatsResponseBodySeatMap getSeatMap() {
        return this.seatMap;
    }

    public TaobaoFilmGetSeatsResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public TaobaoFilmGetSeatsResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public static class TaobaoFilmGetSeatsResponseBodySeatMapSeats extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("Column")
        public Long column;

        @NameInMap("ExtId")
        public String extId;

        @NameInMap("Flag")
        public Long flag;

        @NameInMap("LeftPx")
        public Long leftPx;

        @NameInMap("Name")
        public String name;

        @NameInMap("Row")
        public Long row;

        @NameInMap("RowName")
        public String rowName;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TopPx")
        public Long topPx;

        public static TaobaoFilmGetSeatsResponseBodySeatMapSeats build(java.util.Map<String, ?> map) throws Exception {
            TaobaoFilmGetSeatsResponseBodySeatMapSeats self = new TaobaoFilmGetSeatsResponseBodySeatMapSeats();
            return TeaModel.build(map, self);
        }

        public TaobaoFilmGetSeatsResponseBodySeatMapSeats setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMapSeats setColumn(Long column) {
            this.column = column;
            return this;
        }
        public Long getColumn() {
            return this.column;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMapSeats setExtId(String extId) {
            this.extId = extId;
            return this;
        }
        public String getExtId() {
            return this.extId;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMapSeats setFlag(Long flag) {
            this.flag = flag;
            return this;
        }
        public Long getFlag() {
            return this.flag;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMapSeats setLeftPx(Long leftPx) {
            this.leftPx = leftPx;
            return this;
        }
        public Long getLeftPx() {
            return this.leftPx;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMapSeats setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMapSeats setRow(Long row) {
            this.row = row;
            return this;
        }
        public Long getRow() {
            return this.row;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMapSeats setRowName(String rowName) {
            this.rowName = rowName;
            return this;
        }
        public String getRowName() {
            return this.rowName;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMapSeats setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMapSeats setTopPx(Long topPx) {
            this.topPx = topPx;
            return this;
        }
        public Long getTopPx() {
            return this.topPx;
        }

    }

    public static class TaobaoFilmGetSeatsResponseBodySeatMap extends TeaModel {
        @NameInMap("MaxCanBuy")
        public Long maxCanBuy;

        @NameInMap("MaxColumn")
        public Long maxColumn;

        @NameInMap("MaxLeftPx")
        public Long maxLeftPx;

        @NameInMap("MaxRow")
        public Long maxRow;

        @NameInMap("MaxTopPx")
        public Long maxTopPx;

        @NameInMap("MinColumn")
        public Long minColumn;

        @NameInMap("MinLeftPx")
        public Long minLeftPx;

        @NameInMap("MinRow")
        public Long minRow;

        @NameInMap("MinTopPx")
        public Long minTopPx;

        @NameInMap("Notice")
        public String notice;

        @NameInMap("Regular")
        public Boolean regular;

        @NameInMap("SeatCount")
        public Long seatCount;

        @NameInMap("Seats")
        public java.util.List<TaobaoFilmGetSeatsResponseBodySeatMapSeats> seats;

        @NameInMap("SoldCount")
        public Long soldCount;

        @NameInMap("TipMessage")
        public String tipMessage;

        public static TaobaoFilmGetSeatsResponseBodySeatMap build(java.util.Map<String, ?> map) throws Exception {
            TaobaoFilmGetSeatsResponseBodySeatMap self = new TaobaoFilmGetSeatsResponseBodySeatMap();
            return TeaModel.build(map, self);
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setMaxCanBuy(Long maxCanBuy) {
            this.maxCanBuy = maxCanBuy;
            return this;
        }
        public Long getMaxCanBuy() {
            return this.maxCanBuy;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setMaxColumn(Long maxColumn) {
            this.maxColumn = maxColumn;
            return this;
        }
        public Long getMaxColumn() {
            return this.maxColumn;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setMaxLeftPx(Long maxLeftPx) {
            this.maxLeftPx = maxLeftPx;
            return this;
        }
        public Long getMaxLeftPx() {
            return this.maxLeftPx;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setMaxRow(Long maxRow) {
            this.maxRow = maxRow;
            return this;
        }
        public Long getMaxRow() {
            return this.maxRow;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setMaxTopPx(Long maxTopPx) {
            this.maxTopPx = maxTopPx;
            return this;
        }
        public Long getMaxTopPx() {
            return this.maxTopPx;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setMinColumn(Long minColumn) {
            this.minColumn = minColumn;
            return this;
        }
        public Long getMinColumn() {
            return this.minColumn;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setMinLeftPx(Long minLeftPx) {
            this.minLeftPx = minLeftPx;
            return this;
        }
        public Long getMinLeftPx() {
            return this.minLeftPx;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setMinRow(Long minRow) {
            this.minRow = minRow;
            return this;
        }
        public Long getMinRow() {
            return this.minRow;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setMinTopPx(Long minTopPx) {
            this.minTopPx = minTopPx;
            return this;
        }
        public Long getMinTopPx() {
            return this.minTopPx;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setRegular(Boolean regular) {
            this.regular = regular;
            return this;
        }
        public Boolean getRegular() {
            return this.regular;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setSeatCount(Long seatCount) {
            this.seatCount = seatCount;
            return this;
        }
        public Long getSeatCount() {
            return this.seatCount;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setSeats(java.util.List<TaobaoFilmGetSeatsResponseBodySeatMapSeats> seats) {
            this.seats = seats;
            return this;
        }
        public java.util.List<TaobaoFilmGetSeatsResponseBodySeatMapSeats> getSeats() {
            return this.seats;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setSoldCount(Long soldCount) {
            this.soldCount = soldCount;
            return this;
        }
        public Long getSoldCount() {
            return this.soldCount;
        }

        public TaobaoFilmGetSeatsResponseBodySeatMap setTipMessage(String tipMessage) {
            this.tipMessage = tipMessage;
            return this;
        }
        public String getTipMessage() {
            return this.tipMessage;
        }

    }

}
