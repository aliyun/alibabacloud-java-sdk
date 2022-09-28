// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AirportSearchResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public AirportSearchResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static AirportSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AirportSearchResponseBody self = new AirportSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public AirportSearchResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AirportSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AirportSearchResponseBody setModule(AirportSearchResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public AirportSearchResponseBodyModule getModule() {
        return this.module;
    }

    public AirportSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AirportSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AirportSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AirportSearchResponseBodyModuleCities extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("distance")
        public Integer distance;

        @NameInMap("name")
        public String name;

        @NameInMap("travel_name")
        public String travelName;

        public static AirportSearchResponseBodyModuleCities build(java.util.Map<String, ?> map) throws Exception {
            AirportSearchResponseBodyModuleCities self = new AirportSearchResponseBodyModuleCities();
            return TeaModel.build(map, self);
        }

        public AirportSearchResponseBodyModuleCities setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AirportSearchResponseBodyModuleCities setDistance(Integer distance) {
            this.distance = distance;
            return this;
        }
        public Integer getDistance() {
            return this.distance;
        }

        public AirportSearchResponseBodyModuleCities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AirportSearchResponseBodyModuleCities setTravelName(String travelName) {
            this.travelName = travelName;
            return this;
        }
        public String getTravelName() {
            return this.travelName;
        }

    }

    public static class AirportSearchResponseBodyModule extends TeaModel {
        @NameInMap("cities")
        public java.util.List<AirportSearchResponseBodyModuleCities> cities;

        @NameInMap("nearby")
        public Boolean nearby;

        public static AirportSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            AirportSearchResponseBodyModule self = new AirportSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public AirportSearchResponseBodyModule setCities(java.util.List<AirportSearchResponseBodyModuleCities> cities) {
            this.cities = cities;
            return this;
        }
        public java.util.List<AirportSearchResponseBodyModuleCities> getCities() {
            return this.cities;
        }

        public AirportSearchResponseBodyModule setNearby(Boolean nearby) {
            this.nearby = nearby;
            return this;
        }
        public Boolean getNearby() {
            return this.nearby;
        }

    }

}
