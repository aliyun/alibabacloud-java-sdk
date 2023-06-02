// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetWeatherResponseBody extends TeaModel {
    /**
     * <p>HttpCode</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetWeatherResponseBodyResult result;

    public static GetWeatherResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWeatherResponseBody self = new GetWeatherResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWeatherResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetWeatherResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWeatherResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWeatherResponseBody setResult(GetWeatherResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetWeatherResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetWeatherResponseBodyResultCurrentMeteorologyTemperature extends TeaModel {
        @NameInMap("Current")
        public String current;

        @NameInMap("CurrentDesc")
        public String currentDesc;

        @NameInMap("High")
        public String high;

        @NameInMap("HighDesc")
        public String highDesc;

        @NameInMap("Logical")
        public String logical;

        @NameInMap("Low")
        public String low;

        @NameInMap("LowDesc")
        public String lowDesc;

        public static GetWeatherResponseBodyResultCurrentMeteorologyTemperature build(java.util.Map<String, ?> map) throws Exception {
            GetWeatherResponseBodyResultCurrentMeteorologyTemperature self = new GetWeatherResponseBodyResultCurrentMeteorologyTemperature();
            return TeaModel.build(map, self);
        }

        public GetWeatherResponseBodyResultCurrentMeteorologyTemperature setCurrent(String current) {
            this.current = current;
            return this;
        }
        public String getCurrent() {
            return this.current;
        }

        public GetWeatherResponseBodyResultCurrentMeteorologyTemperature setCurrentDesc(String currentDesc) {
            this.currentDesc = currentDesc;
            return this;
        }
        public String getCurrentDesc() {
            return this.currentDesc;
        }

        public GetWeatherResponseBodyResultCurrentMeteorologyTemperature setHigh(String high) {
            this.high = high;
            return this;
        }
        public String getHigh() {
            return this.high;
        }

        public GetWeatherResponseBodyResultCurrentMeteorologyTemperature setHighDesc(String highDesc) {
            this.highDesc = highDesc;
            return this;
        }
        public String getHighDesc() {
            return this.highDesc;
        }

        public GetWeatherResponseBodyResultCurrentMeteorologyTemperature setLogical(String logical) {
            this.logical = logical;
            return this;
        }
        public String getLogical() {
            return this.logical;
        }

        public GetWeatherResponseBodyResultCurrentMeteorologyTemperature setLow(String low) {
            this.low = low;
            return this;
        }
        public String getLow() {
            return this.low;
        }

        public GetWeatherResponseBodyResultCurrentMeteorologyTemperature setLowDesc(String lowDesc) {
            this.lowDesc = lowDesc;
            return this;
        }
        public String getLowDesc() {
            return this.lowDesc;
        }

    }

    public static class GetWeatherResponseBodyResultCurrentMeteorologyWeather extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static GetWeatherResponseBodyResultCurrentMeteorologyWeather build(java.util.Map<String, ?> map) throws Exception {
            GetWeatherResponseBodyResultCurrentMeteorologyWeather self = new GetWeatherResponseBodyResultCurrentMeteorologyWeather();
            return TeaModel.build(map, self);
        }

        public GetWeatherResponseBodyResultCurrentMeteorologyWeather setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetWeatherResponseBodyResultCurrentMeteorologyWeather setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetWeatherResponseBodyResultCurrentMeteorology extends TeaModel {
        @NameInMap("Temperature")
        public GetWeatherResponseBodyResultCurrentMeteorologyTemperature temperature;

        @NameInMap("Weather")
        public GetWeatherResponseBodyResultCurrentMeteorologyWeather weather;

        public static GetWeatherResponseBodyResultCurrentMeteorology build(java.util.Map<String, ?> map) throws Exception {
            GetWeatherResponseBodyResultCurrentMeteorology self = new GetWeatherResponseBodyResultCurrentMeteorology();
            return TeaModel.build(map, self);
        }

        public GetWeatherResponseBodyResultCurrentMeteorology setTemperature(GetWeatherResponseBodyResultCurrentMeteorologyTemperature temperature) {
            this.temperature = temperature;
            return this;
        }
        public GetWeatherResponseBodyResultCurrentMeteorologyTemperature getTemperature() {
            return this.temperature;
        }

        public GetWeatherResponseBodyResultCurrentMeteorology setWeather(GetWeatherResponseBodyResultCurrentMeteorologyWeather weather) {
            this.weather = weather;
            return this;
        }
        public GetWeatherResponseBodyResultCurrentMeteorologyWeather getWeather() {
            return this.weather;
        }

    }

    public static class GetWeatherResponseBodyResult extends TeaModel {
        @NameInMap("CurrentMeteorology")
        public GetWeatherResponseBodyResultCurrentMeteorology currentMeteorology;

        public static GetWeatherResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetWeatherResponseBodyResult self = new GetWeatherResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetWeatherResponseBodyResult setCurrentMeteorology(GetWeatherResponseBodyResultCurrentMeteorology currentMeteorology) {
            this.currentMeteorology = currentMeteorology;
            return this;
        }
        public GetWeatherResponseBodyResultCurrentMeteorology getCurrentMeteorology() {
            return this.currentMeteorology;
        }

    }

}
