// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieSeatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SeatMap")
    public QueryMovieSeatsResponseBodySeatMap seatMap;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMovieSeatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieSeatsResponseBody self = new QueryMovieSeatsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMovieSeatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMovieSeatsResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMovieSeatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMovieSeatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMovieSeatsResponseBody setSeatMap(QueryMovieSeatsResponseBodySeatMap seatMap) {
        this.seatMap = seatMap;
        return this;
    }
    public QueryMovieSeatsResponseBodySeatMap getSeatMap() {
        return this.seatMap;
    }

    public QueryMovieSeatsResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMovieSeatsResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMovieSeatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMovieSeatsResponseBodySeatMapSeatsSeat extends TeaModel {
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

        public static QueryMovieSeatsResponseBodySeatMapSeatsSeat build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieSeatsResponseBodySeatMapSeatsSeat self = new QueryMovieSeatsResponseBodySeatMapSeatsSeat();
            return TeaModel.build(map, self);
        }

        public QueryMovieSeatsResponseBodySeatMapSeatsSeat setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public QueryMovieSeatsResponseBodySeatMapSeatsSeat setColumn(Long column) {
            this.column = column;
            return this;
        }
        public Long getColumn() {
            return this.column;
        }

        public QueryMovieSeatsResponseBodySeatMapSeatsSeat setExtId(String extId) {
            this.extId = extId;
            return this;
        }
        public String getExtId() {
            return this.extId;
        }

        public QueryMovieSeatsResponseBodySeatMapSeatsSeat setFlag(Long flag) {
            this.flag = flag;
            return this;
        }
        public Long getFlag() {
            return this.flag;
        }

        public QueryMovieSeatsResponseBodySeatMapSeatsSeat setLeftPx(Long leftPx) {
            this.leftPx = leftPx;
            return this;
        }
        public Long getLeftPx() {
            return this.leftPx;
        }

        public QueryMovieSeatsResponseBodySeatMapSeatsSeat setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMovieSeatsResponseBodySeatMapSeatsSeat setRow(Long row) {
            this.row = row;
            return this;
        }
        public Long getRow() {
            return this.row;
        }

        public QueryMovieSeatsResponseBodySeatMapSeatsSeat setRowName(String rowName) {
            this.rowName = rowName;
            return this;
        }
        public String getRowName() {
            return this.rowName;
        }

        public QueryMovieSeatsResponseBodySeatMapSeatsSeat setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryMovieSeatsResponseBodySeatMapSeatsSeat setTopPx(Long topPx) {
            this.topPx = topPx;
            return this;
        }
        public Long getTopPx() {
            return this.topPx;
        }

    }

    public static class QueryMovieSeatsResponseBodySeatMapSeats extends TeaModel {
        @NameInMap("Seat")
        public java.util.List<QueryMovieSeatsResponseBodySeatMapSeatsSeat> seat;

        public static QueryMovieSeatsResponseBodySeatMapSeats build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieSeatsResponseBodySeatMapSeats self = new QueryMovieSeatsResponseBodySeatMapSeats();
            return TeaModel.build(map, self);
        }

        public QueryMovieSeatsResponseBodySeatMapSeats setSeat(java.util.List<QueryMovieSeatsResponseBodySeatMapSeatsSeat> seat) {
            this.seat = seat;
            return this;
        }
        public java.util.List<QueryMovieSeatsResponseBodySeatMapSeatsSeat> getSeat() {
            return this.seat;
        }

    }

    public static class QueryMovieSeatsResponseBodySeatMap extends TeaModel {
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
        public QueryMovieSeatsResponseBodySeatMapSeats seats;

        @NameInMap("SoldCount")
        public Long soldCount;

        @NameInMap("TipMessage")
        public String tipMessage;

        public static QueryMovieSeatsResponseBodySeatMap build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieSeatsResponseBodySeatMap self = new QueryMovieSeatsResponseBodySeatMap();
            return TeaModel.build(map, self);
        }

        public QueryMovieSeatsResponseBodySeatMap setMaxCanBuy(Long maxCanBuy) {
            this.maxCanBuy = maxCanBuy;
            return this;
        }
        public Long getMaxCanBuy() {
            return this.maxCanBuy;
        }

        public QueryMovieSeatsResponseBodySeatMap setMaxColumn(Long maxColumn) {
            this.maxColumn = maxColumn;
            return this;
        }
        public Long getMaxColumn() {
            return this.maxColumn;
        }

        public QueryMovieSeatsResponseBodySeatMap setMaxLeftPx(Long maxLeftPx) {
            this.maxLeftPx = maxLeftPx;
            return this;
        }
        public Long getMaxLeftPx() {
            return this.maxLeftPx;
        }

        public QueryMovieSeatsResponseBodySeatMap setMaxRow(Long maxRow) {
            this.maxRow = maxRow;
            return this;
        }
        public Long getMaxRow() {
            return this.maxRow;
        }

        public QueryMovieSeatsResponseBodySeatMap setMaxTopPx(Long maxTopPx) {
            this.maxTopPx = maxTopPx;
            return this;
        }
        public Long getMaxTopPx() {
            return this.maxTopPx;
        }

        public QueryMovieSeatsResponseBodySeatMap setMinColumn(Long minColumn) {
            this.minColumn = minColumn;
            return this;
        }
        public Long getMinColumn() {
            return this.minColumn;
        }

        public QueryMovieSeatsResponseBodySeatMap setMinLeftPx(Long minLeftPx) {
            this.minLeftPx = minLeftPx;
            return this;
        }
        public Long getMinLeftPx() {
            return this.minLeftPx;
        }

        public QueryMovieSeatsResponseBodySeatMap setMinRow(Long minRow) {
            this.minRow = minRow;
            return this;
        }
        public Long getMinRow() {
            return this.minRow;
        }

        public QueryMovieSeatsResponseBodySeatMap setMinTopPx(Long minTopPx) {
            this.minTopPx = minTopPx;
            return this;
        }
        public Long getMinTopPx() {
            return this.minTopPx;
        }

        public QueryMovieSeatsResponseBodySeatMap setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public QueryMovieSeatsResponseBodySeatMap setRegular(Boolean regular) {
            this.regular = regular;
            return this;
        }
        public Boolean getRegular() {
            return this.regular;
        }

        public QueryMovieSeatsResponseBodySeatMap setSeatCount(Long seatCount) {
            this.seatCount = seatCount;
            return this;
        }
        public Long getSeatCount() {
            return this.seatCount;
        }

        public QueryMovieSeatsResponseBodySeatMap setSeats(QueryMovieSeatsResponseBodySeatMapSeats seats) {
            this.seats = seats;
            return this;
        }
        public QueryMovieSeatsResponseBodySeatMapSeats getSeats() {
            return this.seats;
        }

        public QueryMovieSeatsResponseBodySeatMap setSoldCount(Long soldCount) {
            this.soldCount = soldCount;
            return this;
        }
        public Long getSoldCount() {
            return this.soldCount;
        }

        public QueryMovieSeatsResponseBodySeatMap setTipMessage(String tipMessage) {
            this.tipMessage = tipMessage;
            return this;
        }
        public String getTipMessage() {
            return this.tipMessage;
        }

    }

}
