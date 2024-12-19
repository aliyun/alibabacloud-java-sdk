// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieSeatsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>79C01D47-3C44-57D9-BC99-1B33F7ED14B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SeatMap")
    public QueryMovieSeatsResponseBodySeatMap seatMap;

    /**
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Column")
        public Long column;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ExtId")
        public String extId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Flag")
        public Long flag;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LeftPx")
        public Long leftPx;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Row")
        public Long row;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("RowName")
        public String rowName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxCanBuy")
        public Long maxCanBuy;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxColumn")
        public Long maxColumn;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MaxLeftPx")
        public Long maxLeftPx;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxRow")
        public Long maxRow;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MaxTopPx")
        public Long maxTopPx;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("MinColumn")
        public Long minColumn;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MinLeftPx")
        public Long minLeftPx;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("MinRow")
        public Long minRow;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("MinTopPx")
        public Long minTopPx;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Notice")
        public String notice;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Regular")
        public Boolean regular;

        /**
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("SeatCount")
        public Long seatCount;

        @NameInMap("Seats")
        public QueryMovieSeatsResponseBodySeatMapSeats seats;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
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
