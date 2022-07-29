// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskMonitorsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetSyntheticTaskMonitorsResponseBodyData> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSyntheticTaskMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticTaskMonitorsResponseBody self = new GetSyntheticTaskMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSyntheticTaskMonitorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSyntheticTaskMonitorsResponseBody setData(java.util.List<GetSyntheticTaskMonitorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSyntheticTaskMonitorsResponseBodyData> getData() {
        return this.data;
    }

    public GetSyntheticTaskMonitorsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetSyntheticTaskMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSyntheticTaskMonitorsResponseBodyData extends TeaModel {
        @NameInMap("Busy")
        public Long busy;

        @NameInMap("City")
        public String city;

        @NameInMap("CityCode")
        public Long cityCode;

        @NameInMap("ClientType")
        public Long clientType;

        @NameInMap("District")
        public String district;

        @NameInMap("NetServiceId")
        public Long netServiceId;

        @NameInMap("NetServiceName")
        public String netServiceName;

        public static GetSyntheticTaskMonitorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticTaskMonitorsResponseBodyData self = new GetSyntheticTaskMonitorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSyntheticTaskMonitorsResponseBodyData setBusy(Long busy) {
            this.busy = busy;
            return this;
        }
        public Long getBusy() {
            return this.busy;
        }

        public GetSyntheticTaskMonitorsResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetSyntheticTaskMonitorsResponseBodyData setCityCode(Long cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public Long getCityCode() {
            return this.cityCode;
        }

        public GetSyntheticTaskMonitorsResponseBodyData setClientType(Long clientType) {
            this.clientType = clientType;
            return this;
        }
        public Long getClientType() {
            return this.clientType;
        }

        public GetSyntheticTaskMonitorsResponseBodyData setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public GetSyntheticTaskMonitorsResponseBodyData setNetServiceId(Long netServiceId) {
            this.netServiceId = netServiceId;
            return this;
        }
        public Long getNetServiceId() {
            return this.netServiceId;
        }

        public GetSyntheticTaskMonitorsResponseBodyData setNetServiceName(String netServiceName) {
            this.netServiceName = netServiceName;
            return this;
        }
        public String getNetServiceName() {
            return this.netServiceName;
        }

    }

}
