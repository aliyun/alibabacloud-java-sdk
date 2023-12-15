// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetCinemasResponseBody extends TeaModel {
    @NameInMap("Cinemas")
    public java.util.List<TaobaoFilmGetCinemasResponseBodyCinemas> cinemas;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static TaobaoFilmGetCinemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetCinemasResponseBody self = new TaobaoFilmGetCinemasResponseBody();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetCinemasResponseBody setCinemas(java.util.List<TaobaoFilmGetCinemasResponseBodyCinemas> cinemas) {
        this.cinemas = cinemas;
        return this;
    }
    public java.util.List<TaobaoFilmGetCinemasResponseBodyCinemas> getCinemas() {
        return this.cinemas;
    }

    public TaobaoFilmGetCinemasResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaobaoFilmGetCinemasResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public TaobaoFilmGetCinemasResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TaobaoFilmGetCinemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaobaoFilmGetCinemasResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public TaobaoFilmGetCinemasResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public TaobaoFilmGetCinemasResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class TaobaoFilmGetCinemasResponseBodyCinemas extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("CinemaName")
        public String cinemaName;

        @NameInMap("CityId")
        public Long cityId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Latitude")
        public String latitude;

        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("ScheduleCloseTime")
        public Long scheduleCloseTime;

        @NameInMap("StandardId")
        public String standardId;

        public static TaobaoFilmGetCinemasResponseBodyCinemas build(java.util.Map<String, ?> map) throws Exception {
            TaobaoFilmGetCinemasResponseBodyCinemas self = new TaobaoFilmGetCinemasResponseBodyCinemas();
            return TeaModel.build(map, self);
        }

        public TaobaoFilmGetCinemasResponseBodyCinemas setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public TaobaoFilmGetCinemasResponseBodyCinemas setCinemaName(String cinemaName) {
            this.cinemaName = cinemaName;
            return this;
        }
        public String getCinemaName() {
            return this.cinemaName;
        }

        public TaobaoFilmGetCinemasResponseBodyCinemas setCityId(Long cityId) {
            this.cityId = cityId;
            return this;
        }
        public Long getCityId() {
            return this.cityId;
        }

        public TaobaoFilmGetCinemasResponseBodyCinemas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TaobaoFilmGetCinemasResponseBodyCinemas setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public TaobaoFilmGetCinemasResponseBodyCinemas setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public TaobaoFilmGetCinemasResponseBodyCinemas setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public TaobaoFilmGetCinemasResponseBodyCinemas setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public TaobaoFilmGetCinemasResponseBodyCinemas setScheduleCloseTime(Long scheduleCloseTime) {
            this.scheduleCloseTime = scheduleCloseTime;
            return this;
        }
        public Long getScheduleCloseTime() {
            return this.scheduleCloseTime;
        }

        public TaobaoFilmGetCinemasResponseBodyCinemas setStandardId(String standardId) {
            this.standardId = standardId;
            return this;
        }
        public String getStandardId() {
            return this.standardId;
        }

    }

}
