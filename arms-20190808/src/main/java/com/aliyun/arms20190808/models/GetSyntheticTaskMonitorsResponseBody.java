// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskMonitorsResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * <br>
     * <p>*   1001: The request was successful.</p>
     * <p>*   1002: The request failed.</p>
     * <p>*   1003: Parameter errors occurred.</p>
     * <p>*   1004: Authentication failed.</p>
     * <p>*   1006: The task does not exist.</p>
     * <p>*   1099: Internal errors occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the monitoring point.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetSyntheticTaskMonitorsResponseBodyData> data;

    /**
     * <p>The message that is returned when the request failed.</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The task status.</p>
         * <br>
         * <p>*   0: active</p>
         * <p>*   1: busy</p>
         */
        @NameInMap("Busy")
        public Long busy;

        /**
         * <p>The name of the city to which the monitoring point belongs.</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The ID of the city to which the monitoring point belongs.</p>
         */
        @NameInMap("CityCode")
        public Long cityCode;

        /**
         * <p>The client type:</p>
         * <br>
         * <p>*   1: IDC</p>
         * <p>*   2: Last mile</p>
         */
        @NameInMap("ClientType")
        public Long clientType;

        /**
         * <p>The region to which the monitoring point belongs.</p>
         */
        @NameInMap("District")
        public String district;

        /**
         * <p>The ID of the carrier.</p>
         */
        @NameInMap("NetServiceId")
        public Long netServiceId;

        /**
         * <p>The name of the carrier.</p>
         */
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
