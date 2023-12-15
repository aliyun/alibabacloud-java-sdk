// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetRegionListResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("Regions")
    public java.util.List<TaobaoFilmGetRegionListResponseBodyRegions> regions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    public static TaobaoFilmGetRegionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetRegionListResponseBody self = new TaobaoFilmGetRegionListResponseBody();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetRegionListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaobaoFilmGetRegionListResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public TaobaoFilmGetRegionListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TaobaoFilmGetRegionListResponseBody setRegions(java.util.List<TaobaoFilmGetRegionListResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<TaobaoFilmGetRegionListResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public TaobaoFilmGetRegionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaobaoFilmGetRegionListResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public TaobaoFilmGetRegionListResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public static class TaobaoFilmGetRegionListResponseBodyRegions extends TeaModel {
        @NameInMap("CityCode")
        public Long cityCode;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("PinYin")
        public String pinYin;

        @NameInMap("RegionName")
        public String regionName;

        public static TaobaoFilmGetRegionListResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            TaobaoFilmGetRegionListResponseBodyRegions self = new TaobaoFilmGetRegionListResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public TaobaoFilmGetRegionListResponseBodyRegions setCityCode(Long cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public Long getCityCode() {
            return this.cityCode;
        }

        public TaobaoFilmGetRegionListResponseBodyRegions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TaobaoFilmGetRegionListResponseBodyRegions setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public TaobaoFilmGetRegionListResponseBodyRegions setPinYin(String pinYin) {
            this.pinYin = pinYin;
            return this;
        }
        public String getPinYin() {
            return this.pinYin;
        }

        public TaobaoFilmGetRegionListResponseBodyRegions setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
