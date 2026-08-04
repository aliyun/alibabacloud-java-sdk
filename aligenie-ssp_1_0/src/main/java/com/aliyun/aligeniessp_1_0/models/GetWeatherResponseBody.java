// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetWeatherResponseBody extends TeaModel {
    /**
     * <p>HttpCode</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>error message</p>
     * 
     * <strong>example:</strong>
     * <p>调用成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>F7E2****B7C94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>model data</p>
     */
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
        /**
         * <p>Current temperature value</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("Current")
        public String current;

        /**
         * <p>Description of the current temperature value</p>
         * 
         * <strong>example:</strong>
         * <p>36度</p>
         */
        @NameInMap("CurrentDesc")
        public String currentDesc;

        /**
         * <p>Maximum temperature value</p>
         * 
         * <strong>example:</strong>
         * <p>37</p>
         */
        @NameInMap("High")
        public String high;

        /**
         * <p>Description of the maximum temperature value</p>
         * 
         * <strong>example:</strong>
         * <p>37度</p>
         */
        @NameInMap("HighDesc")
        public String highDesc;

        /**
         * <p>Temperature with logic, as follows:</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("Logical")
        public String logical;

        /**
         * <p>Lowest temperature</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("Low")
        public String low;

        /**
         * <p>Description of the lowest temperature</p>
         * 
         * <strong>example:</strong>
         * <p>28度</p>
         */
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
        /**
         * <p>Weather code: for example, &quot;000,100&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>000</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Weather name description: &quot;Sunny (000), Multicloud (100), Overcast (101), Rain (200), Light rain (201), Light to moderate rain (202), Moderate rain (203), Moderate to heavy rain (204), Heavy rain (205), Heavy to storm rain (206), Storm rain (207), Heavy storm rain (209), Severe storm rain (211), Showers (212), Thunderstorms (213), Freezing rain (214), Snow (300), Sleet (301), Snow showers (302), Light snow (303), Light to moderate snow (304), Moderate snow (305), Heavy snow (307), Blizzard (309), Fog (400), Dust (501), Sand blowing (502), Sandstorm (503), Severe sandstorm (504), Mostly sunny (000), Partly cloudy (100), Light showers (212), Lightning (213), Ice pellets (214), Thunderstorms with hail (215), Light snow showers (302), Freezing fog (400), Haze (500), Dust whirls (502), Localized showers (212), Thunderstorm (213), Ice needles (214), Hail (215), Intense showers (212)&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>晴</p>
         */
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
        /**
         * <p>Temperature</p>
         */
        @NameInMap("Temperature")
        public GetWeatherResponseBodyResultCurrentMeteorologyTemperature temperature;

        /**
         * <p>Daytime weather</p>
         */
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
        /**
         * <p>Current weather</p>
         */
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
