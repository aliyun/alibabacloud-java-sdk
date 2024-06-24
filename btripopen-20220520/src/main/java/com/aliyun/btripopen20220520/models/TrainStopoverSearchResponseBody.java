// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainStopoverSearchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public java.util.List<TrainStopoverSearchResponseBodyModule> module;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainStopoverSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainStopoverSearchResponseBody self = new TrainStopoverSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainStopoverSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainStopoverSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainStopoverSearchResponseBody setModule(java.util.List<TrainStopoverSearchResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<TrainStopoverSearchResponseBodyModule> getModule() {
        return this.module;
    }

    public TrainStopoverSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainStopoverSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainStopoverSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainStopoverSearchResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("station_name")
        public String stationName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("station_no")
        public String stationNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("station_type")
        public String stationType;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("stop_over_time")
        public String stopOverTime;

        public static TrainStopoverSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainStopoverSearchResponseBodyModule self = new TrainStopoverSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainStopoverSearchResponseBodyModule setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainStopoverSearchResponseBodyModule setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainStopoverSearchResponseBodyModule setStationName(String stationName) {
            this.stationName = stationName;
            return this;
        }
        public String getStationName() {
            return this.stationName;
        }

        public TrainStopoverSearchResponseBodyModule setStationNo(String stationNo) {
            this.stationNo = stationNo;
            return this;
        }
        public String getStationNo() {
            return this.stationNo;
        }

        public TrainStopoverSearchResponseBodyModule setStationType(String stationType) {
            this.stationType = stationType;
            return this;
        }
        public String getStationType() {
            return this.stationType;
        }

        public TrainStopoverSearchResponseBodyModule setStopOverTime(String stopOverTime) {
            this.stopOverTime = stopOverTime;
            return this;
        }
        public String getStopOverTime() {
            return this.stopOverTime;
        }

    }

}
