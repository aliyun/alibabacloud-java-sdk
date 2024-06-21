// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskMonitorsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetSyntheticTaskMonitorsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>21E85B16-75A6-429A-9F65-8AAC9A54****</p>
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Busy")
        public Long busy;

        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>1100101</p>
         */
        @NameInMap("CityCode")
        public Long cityCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClientType")
        public Long clientType;

        @NameInMap("District")
        public String district;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("NetServiceId")
        public Long netServiceId;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
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
