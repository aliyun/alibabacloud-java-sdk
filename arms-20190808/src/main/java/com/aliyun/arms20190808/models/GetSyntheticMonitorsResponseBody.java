// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticMonitorsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The list of monitoring points.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetSyntheticMonitorsResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSyntheticMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticMonitorsResponseBody self = new GetSyntheticMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSyntheticMonitorsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetSyntheticMonitorsResponseBody setData(java.util.List<GetSyntheticMonitorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSyntheticMonitorsResponseBodyData> getData() {
        return this.data;
    }

    public GetSyntheticMonitorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSyntheticMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSyntheticMonitorsResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the monitoring point is available. Valid values: true and false.</p>
         */
        @NameInMap("Available")
        public String available;

        /**
         * <p>Indicates whether the monitoring point is selected. Valid values: true and false.</p>
         */
        @NameInMap("CanBeSelected")
        public Boolean canBeSelected;

        /**
         * <p>The city.</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The city code.</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The client type of the monitoring point. Valid values: 1: data center. 2: Internet. 3: mobile device. 4: ECS instance.</p>
         */
        @NameInMap("ClientType")
        public Integer clientType;

        /**
         * <p>The country.</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>Indicates whether IPv6 is supported. Valid values: 0: IPv6 is not supported. 1: IPv6 is supported.</p>
         */
        @NameInMap("Ipv6")
        public Integer ipv6;

        /**
         * <p>The carrier.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The carrier code.</p>
         */
        @NameInMap("OperatorCode")
        public String operatorCode;

        /**
         * <p>The region.</p>
         */
        @NameInMap("Region")
        public String region;

        public static GetSyntheticMonitorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSyntheticMonitorsResponseBodyData self = new GetSyntheticMonitorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSyntheticMonitorsResponseBodyData setAvailable(String available) {
            this.available = available;
            return this;
        }
        public String getAvailable() {
            return this.available;
        }

        public GetSyntheticMonitorsResponseBodyData setCanBeSelected(Boolean canBeSelected) {
            this.canBeSelected = canBeSelected;
            return this;
        }
        public Boolean getCanBeSelected() {
            return this.canBeSelected;
        }

        public GetSyntheticMonitorsResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetSyntheticMonitorsResponseBodyData setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public GetSyntheticMonitorsResponseBodyData setClientType(Integer clientType) {
            this.clientType = clientType;
            return this;
        }
        public Integer getClientType() {
            return this.clientType;
        }

        public GetSyntheticMonitorsResponseBodyData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public GetSyntheticMonitorsResponseBodyData setIpv6(Integer ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        public Integer getIpv6() {
            return this.ipv6;
        }

        public GetSyntheticMonitorsResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetSyntheticMonitorsResponseBodyData setOperatorCode(String operatorCode) {
            this.operatorCode = operatorCode;
            return this;
        }
        public String getOperatorCode() {
            return this.operatorCode;
        }

        public GetSyntheticMonitorsResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
