// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieSeatsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("SeatMap")
    @Validation(required = true)
    public QueryMovieSeatsResponseSeatMap seatMap;

    public static QueryMovieSeatsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieSeatsResponse self = new QueryMovieSeatsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMovieSeatsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMovieSeatsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMovieSeatsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMovieSeatsResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMovieSeatsResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMovieSeatsResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMovieSeatsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMovieSeatsResponse setSeatMap(QueryMovieSeatsResponseSeatMap seatMap) {
        this.seatMap = seatMap;
        return this;
    }
    public QueryMovieSeatsResponseSeatMap getSeatMap() {
        return this.seatMap;
    }

    public static class QueryMovieSeatsResponseSeatMapSeatsSeat extends TeaModel {
        @NameInMap("Area")
        @Validation(required = true)
        public String area;

        @NameInMap("Column")
        @Validation(required = true)
        public Long column;

        @NameInMap("ExtId")
        @Validation(required = true)
        public String extId;

        @NameInMap("Flag")
        @Validation(required = true)
        public Long flag;

        @NameInMap("LeftPx")
        @Validation(required = true)
        public Long leftPx;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Row")
        @Validation(required = true)
        public Long row;

        @NameInMap("RowName")
        @Validation(required = true)
        public String rowName;

        @NameInMap("Status")
        @Validation(required = true)
        public Long status;

        @NameInMap("TopPx")
        @Validation(required = true)
        public Long topPx;

        public static QueryMovieSeatsResponseSeatMapSeatsSeat build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieSeatsResponseSeatMapSeatsSeat self = new QueryMovieSeatsResponseSeatMapSeatsSeat();
            return TeaModel.build(map, self);
        }

        public QueryMovieSeatsResponseSeatMapSeatsSeat setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public QueryMovieSeatsResponseSeatMapSeatsSeat setColumn(Long column) {
            this.column = column;
            return this;
        }
        public Long getColumn() {
            return this.column;
        }

        public QueryMovieSeatsResponseSeatMapSeatsSeat setExtId(String extId) {
            this.extId = extId;
            return this;
        }
        public String getExtId() {
            return this.extId;
        }

        public QueryMovieSeatsResponseSeatMapSeatsSeat setFlag(Long flag) {
            this.flag = flag;
            return this;
        }
        public Long getFlag() {
            return this.flag;
        }

        public QueryMovieSeatsResponseSeatMapSeatsSeat setLeftPx(Long leftPx) {
            this.leftPx = leftPx;
            return this;
        }
        public Long getLeftPx() {
            return this.leftPx;
        }

        public QueryMovieSeatsResponseSeatMapSeatsSeat setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMovieSeatsResponseSeatMapSeatsSeat setRow(Long row) {
            this.row = row;
            return this;
        }
        public Long getRow() {
            return this.row;
        }

        public QueryMovieSeatsResponseSeatMapSeatsSeat setRowName(String rowName) {
            this.rowName = rowName;
            return this;
        }
        public String getRowName() {
            return this.rowName;
        }

        public QueryMovieSeatsResponseSeatMapSeatsSeat setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryMovieSeatsResponseSeatMapSeatsSeat setTopPx(Long topPx) {
            this.topPx = topPx;
            return this;
        }
        public Long getTopPx() {
            return this.topPx;
        }

    }

    public static class QueryMovieSeatsResponseSeatMapSeats extends TeaModel {
        @NameInMap("Seat")
        @Validation(required = true)
        public java.util.List<QueryMovieSeatsResponseSeatMapSeatsSeat> seat;

        public static QueryMovieSeatsResponseSeatMapSeats build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieSeatsResponseSeatMapSeats self = new QueryMovieSeatsResponseSeatMapSeats();
            return TeaModel.build(map, self);
        }

        public QueryMovieSeatsResponseSeatMapSeats setSeat(java.util.List<QueryMovieSeatsResponseSeatMapSeatsSeat> seat) {
            this.seat = seat;
            return this;
        }
        public java.util.List<QueryMovieSeatsResponseSeatMapSeatsSeat> getSeat() {
            return this.seat;
        }

    }

    public static class QueryMovieSeatsResponseSeatMap extends TeaModel {
        @NameInMap("MaxCanBuy")
        @Validation(required = true)
        public Long maxCanBuy;

        @NameInMap("MaxColumn")
        @Validation(required = true)
        public Long maxColumn;

        @NameInMap("MaxLeftPx")
        @Validation(required = true)
        public Long maxLeftPx;

        @NameInMap("MaxRow")
        @Validation(required = true)
        public Long maxRow;

        @NameInMap("MaxTopPx")
        @Validation(required = true)
        public Long maxTopPx;

        @NameInMap("MinColumn")
        @Validation(required = true)
        public Long minColumn;

        @NameInMap("MinLeftPx")
        @Validation(required = true)
        public Long minLeftPx;

        @NameInMap("MinRow")
        @Validation(required = true)
        public Long minRow;

        @NameInMap("MinTopPx")
        @Validation(required = true)
        public Long minTopPx;

        @NameInMap("Notice")
        @Validation(required = true)
        public String notice;

        @NameInMap("Regular")
        @Validation(required = true)
        public Boolean regular;

        @NameInMap("SeatCount")
        @Validation(required = true)
        public Long seatCount;

        @NameInMap("SoldCount")
        @Validation(required = true)
        public Long soldCount;

        @NameInMap("TipMessage")
        @Validation(required = true)
        public String tipMessage;

        @NameInMap("Seats")
        @Validation(required = true)
        public QueryMovieSeatsResponseSeatMapSeats seats;

        public static QueryMovieSeatsResponseSeatMap build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieSeatsResponseSeatMap self = new QueryMovieSeatsResponseSeatMap();
            return TeaModel.build(map, self);
        }

        public QueryMovieSeatsResponseSeatMap setMaxCanBuy(Long maxCanBuy) {
            this.maxCanBuy = maxCanBuy;
            return this;
        }
        public Long getMaxCanBuy() {
            return this.maxCanBuy;
        }

        public QueryMovieSeatsResponseSeatMap setMaxColumn(Long maxColumn) {
            this.maxColumn = maxColumn;
            return this;
        }
        public Long getMaxColumn() {
            return this.maxColumn;
        }

        public QueryMovieSeatsResponseSeatMap setMaxLeftPx(Long maxLeftPx) {
            this.maxLeftPx = maxLeftPx;
            return this;
        }
        public Long getMaxLeftPx() {
            return this.maxLeftPx;
        }

        public QueryMovieSeatsResponseSeatMap setMaxRow(Long maxRow) {
            this.maxRow = maxRow;
            return this;
        }
        public Long getMaxRow() {
            return this.maxRow;
        }

        public QueryMovieSeatsResponseSeatMap setMaxTopPx(Long maxTopPx) {
            this.maxTopPx = maxTopPx;
            return this;
        }
        public Long getMaxTopPx() {
            return this.maxTopPx;
        }

        public QueryMovieSeatsResponseSeatMap setMinColumn(Long minColumn) {
            this.minColumn = minColumn;
            return this;
        }
        public Long getMinColumn() {
            return this.minColumn;
        }

        public QueryMovieSeatsResponseSeatMap setMinLeftPx(Long minLeftPx) {
            this.minLeftPx = minLeftPx;
            return this;
        }
        public Long getMinLeftPx() {
            return this.minLeftPx;
        }

        public QueryMovieSeatsResponseSeatMap setMinRow(Long minRow) {
            this.minRow = minRow;
            return this;
        }
        public Long getMinRow() {
            return this.minRow;
        }

        public QueryMovieSeatsResponseSeatMap setMinTopPx(Long minTopPx) {
            this.minTopPx = minTopPx;
            return this;
        }
        public Long getMinTopPx() {
            return this.minTopPx;
        }

        public QueryMovieSeatsResponseSeatMap setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public QueryMovieSeatsResponseSeatMap setRegular(Boolean regular) {
            this.regular = regular;
            return this;
        }
        public Boolean getRegular() {
            return this.regular;
        }

        public QueryMovieSeatsResponseSeatMap setSeatCount(Long seatCount) {
            this.seatCount = seatCount;
            return this;
        }
        public Long getSeatCount() {
            return this.seatCount;
        }

        public QueryMovieSeatsResponseSeatMap setSoldCount(Long soldCount) {
            this.soldCount = soldCount;
            return this;
        }
        public Long getSoldCount() {
            return this.soldCount;
        }

        public QueryMovieSeatsResponseSeatMap setTipMessage(String tipMessage) {
            this.tipMessage = tipMessage;
            return this;
        }
        public String getTipMessage() {
            return this.tipMessage;
        }

        public QueryMovieSeatsResponseSeatMap setSeats(QueryMovieSeatsResponseSeatMapSeats seats) {
            this.seats = seats;
            return this;
        }
        public QueryMovieSeatsResponseSeatMapSeats getSeats() {
            return this.seats;
        }

    }

}
