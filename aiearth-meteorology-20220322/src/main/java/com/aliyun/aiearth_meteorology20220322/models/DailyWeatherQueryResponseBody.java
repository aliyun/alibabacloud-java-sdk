// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20220322.models;

import com.aliyun.tea.*;

public class DailyWeatherQueryResponseBody extends TeaModel {
    // 响应码
    @NameInMap("code")
    public Long code;

    // 响应信息
    @NameInMap("message")
    public String message;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 响应结果
    @NameInMap("result")
    public java.util.List<DailyWeatherQueryResponseBodyResult> result;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    public static DailyWeatherQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DailyWeatherQueryResponseBody self = new DailyWeatherQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public DailyWeatherQueryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DailyWeatherQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DailyWeatherQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DailyWeatherQueryResponseBody setResult(java.util.List<DailyWeatherQueryResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DailyWeatherQueryResponseBodyResult> getResult() {
        return this.result;
    }

    public DailyWeatherQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DailyWeatherQueryResponseBodyResultDataElements extends TeaModel {
        @NameInMap("element")
        public String element;

        @NameInMap("value")
        public String value;

        public static DailyWeatherQueryResponseBodyResultDataElements build(java.util.Map<String, ?> map) throws Exception {
            DailyWeatherQueryResponseBodyResultDataElements self = new DailyWeatherQueryResponseBodyResultDataElements();
            return TeaModel.build(map, self);
        }

        public DailyWeatherQueryResponseBodyResultDataElements setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public DailyWeatherQueryResponseBodyResultDataElements setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DailyWeatherQueryResponseBodyResultData extends TeaModel {
        @NameInMap("elements")
        public java.util.List<DailyWeatherQueryResponseBodyResultDataElements> elements;

        @NameInMap("forecastTimestamp")
        public String forecastTimestamp;

        public static DailyWeatherQueryResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            DailyWeatherQueryResponseBodyResultData self = new DailyWeatherQueryResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public DailyWeatherQueryResponseBodyResultData setElements(java.util.List<DailyWeatherQueryResponseBodyResultDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DailyWeatherQueryResponseBodyResultDataElements> getElements() {
            return this.elements;
        }

        public DailyWeatherQueryResponseBodyResultData setForecastTimestamp(String forecastTimestamp) {
            this.forecastTimestamp = forecastTimestamp;
            return this;
        }
        public String getForecastTimestamp() {
            return this.forecastTimestamp;
        }

    }

    public static class DailyWeatherQueryResponseBodyResultLocation extends TeaModel {
        // 纬度
        @NameInMap("latitude")
        public Double latitude;

        // 经度
        @NameInMap("longitude")
        public Double longitude;

        public static DailyWeatherQueryResponseBodyResultLocation build(java.util.Map<String, ?> map) throws Exception {
            DailyWeatherQueryResponseBodyResultLocation self = new DailyWeatherQueryResponseBodyResultLocation();
            return TeaModel.build(map, self);
        }

        public DailyWeatherQueryResponseBodyResultLocation setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }
        public Double getLatitude() {
            return this.latitude;
        }

        public DailyWeatherQueryResponseBodyResultLocation setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }
        public Double getLongitude() {
            return this.longitude;
        }

    }

    public static class DailyWeatherQueryResponseBodyResult extends TeaModel {
        @NameInMap("data")
        public java.util.List<DailyWeatherQueryResponseBodyResultData> data;

        // 位置
        @NameInMap("location")
        public DailyWeatherQueryResponseBodyResultLocation location;

        public static DailyWeatherQueryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DailyWeatherQueryResponseBodyResult self = new DailyWeatherQueryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DailyWeatherQueryResponseBodyResult setData(java.util.List<DailyWeatherQueryResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DailyWeatherQueryResponseBodyResultData> getData() {
            return this.data;
        }

        public DailyWeatherQueryResponseBodyResult setLocation(DailyWeatherQueryResponseBodyResultLocation location) {
            this.location = location;
            return this;
        }
        public DailyWeatherQueryResponseBodyResultLocation getLocation() {
            return this.location;
        }

    }

}
